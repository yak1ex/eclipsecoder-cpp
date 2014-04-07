package net.fornwall.eclipsecoder.ccsupport;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class CCSupportPlugin extends AbstractUIPlugin {
    public static final String CODE_TEMPLATE_PREFERENCE = "codeTemplatePreference";
    public static final String TOOLCHAIN_PREFERENCE = "toolchainPreference";
    public static final String CONFIG_PROJECT_PREFERENCE = "configProjectPreference";

    private static CCSupportPlugin instance;

    public static CCSupportPlugin getInstance() {
        return instance;
    }

    public CCSupportPlugin() {
        super();
        instance = this;
    }

    public String getCodeTemplate() {
        return getPreferenceStore().getString(CODE_TEMPLATE_PREFERENCE);
    }

    public String getToolchain() {
        return getPreferenceStore().getString(TOOLCHAIN_PREFERENCE);
    }

    public String getConfigProject() {
        return getPreferenceStore().getString(CONFIG_PROJECT_PREFERENCE);
    }

}
