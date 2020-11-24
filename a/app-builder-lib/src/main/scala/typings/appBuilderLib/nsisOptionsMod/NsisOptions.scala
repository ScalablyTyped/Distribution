package typings.appBuilderLib.nsisOptionsMod

import typings.appBuilderLib.commonWindowsInstallerConfigurationMod.CommonWindowsInstallerConfiguration
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NsisOptions
  extends CommonNsisOptions
     with CommonWindowsInstallerConfiguration
     with TargetSpecificOptions {
  
  /**
    * *assisted installer only.* Allow requesting for elevation. If false, user will have to restart installer with elevated permissions.
    * @default true
    */
  val allowElevation: js.UndefOr[Boolean] = js.native
  
  /**
    * *assisted installer only.* Whether to allow user to change installation directory.
    * @default false
    */
  val allowToChangeInstallationDirectory: js.UndefOr[Boolean] = js.native
  
  /**
    * *one-click installer only.* Whether to delete app data on uninstall.
    * @default false
    */
  val deleteAppDataOnUninstall: js.UndefOr[Boolean] = js.native
  
  /**
    * @private
    */
  var differentialPackage: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display a language selection dialog. Not recommended (by default will be detected using OS language).
    * @default false
    */
  val displayLanguageSelector: js.UndefOr[Boolean] = js.native
  
  /**
    * The path to NSIS include script to customize installer. Defaults to `build/installer.nsh`. See [Custom NSIS script](#custom-nsis-script).
    */
  val include: js.UndefOr[String | Null] = js.native
  
  /**
    * *assisted installer only.* `MUI_HEADERIMAGE`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * @default build/installerHeader.bmp
    */
  val installerHeader: js.UndefOr[String | Null] = js.native
  
  /**
    * *one-click installer only.* The path to header icon (above the progress bar), relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/installerHeaderIcon.ico` or application icon.
    */
  val installerHeaderIcon: js.UndefOr[String | Null] = js.native
  
  /**
    * The path to installer icon, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/installerIcon.ico` or application icon.
    */
  val installerIcon: js.UndefOr[String | Null] = js.native
  
  /**
    * The installer languages (e.g. `en_US`, `de_DE`). Change only if you understand what do you do and for what.
    */
  val installerLanguages: js.UndefOr[js.Array[String] | String | Null] = js.native
  
  /**
    * *assisted installer only.* `MUI_WELCOMEFINISHPAGE_BITMAP`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/installerSidebar.bmp` or `${NSISDIR}\\Contrib\\Graphics\\Wizard\\nsis3-metro.bmp`. Image size 164 × 314 pixels.
    */
  val installerSidebar: js.UndefOr[String | Null] = js.native
  
  /**
    * [LCID Dec](https://msdn.microsoft.com/en-au/goglobal/bb964664.aspx), defaults to `1033`(`English - United States`).
    */
  val language: js.UndefOr[String | Null] = js.native
  
  /**
    * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). In addition to `txt, `rtf` and `html` supported (don't forget to use `target="_blank"` for links).
    *
    * Multiple license files in different languages are supported — use lang postfix (e.g. `_de`, `_ru`)). For example, create files `license_de.txt` and `license_en.txt` in the build resources.
    * If OS language is german, `license_de.txt` will be displayed. See map of [language code to name](https://github.com/meikidd/iso-639-1/blob/master/src/data.js).
    *
    * Appropriate license file will be selected by user OS language.
    */
  val license: js.UndefOr[String | Null] = js.native
  
  /**
    * Whether to create multi-language installer. Defaults to `unicode` option value.
    */
  val multiLanguageInstaller: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to pack the elevate executable (required for electron-updater if per-machine installer used or can be used in the future). Ignored if `perMachine` is set to `true`.
    * @default true
    */
  val packElevateHelper: js.UndefOr[Boolean] = js.native
  
  /**
    * The file extension of files that will be not compressed. Applicable only for `extraResources` and `extraFiles` files.
    * @default [".avi", ".mov", ".m4v", ".mp4", ".m4p", ".qt", ".mkv", ".webm", ".vmdk"]
    */
  val preCompressedFileExtensions: js.UndefOr[js.Array[String] | String | Null] = js.native
  
  /**
    * The path to NSIS script to customize installer. Defaults to `build/installer.nsi`. See [Custom NSIS script](#custom-nsis-script).
    */
  val script: js.UndefOr[String | Null] = js.native
  
  /**
    * The uninstaller display name in the control panel.
    * @default ${productName} ${version}
    */
  val uninstallDisplayName: js.UndefOr[String] = js.native
  
  /**
    * The path to uninstaller icon, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/uninstallerIcon.ico` or application icon.
    */
  val uninstallerIcon: js.UndefOr[String | Null] = js.native
  
  /**
    * *assisted installer only.* `MUI_UNWELCOMEFINISHPAGE_BITMAP`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `installerSidebar` option or `build/uninstallerSidebar.bmp` or `build/installerSidebar.bmp` or `${NSISDIR}\\Contrib\\Graphics\\Wizard\\nsis3-metro.bmp`
    */
  val uninstallerSidebar: js.UndefOr[String | Null] = js.native
}
object NsisOptions {
  
  @scala.inline
  def apply(): NsisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NsisOptions]
  }
  
  @scala.inline
  implicit class NsisOptionsOps[Self <: NsisOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowElevation(value: Boolean): Self = this.set("allowElevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowElevation: Self = this.set("allowElevation", js.undefined)
    
    @scala.inline
    def setAllowToChangeInstallationDirectory(value: Boolean): Self = this.set("allowToChangeInstallationDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowToChangeInstallationDirectory: Self = this.set("allowToChangeInstallationDirectory", js.undefined)
    
    @scala.inline
    def setDeleteAppDataOnUninstall(value: Boolean): Self = this.set("deleteAppDataOnUninstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteAppDataOnUninstall: Self = this.set("deleteAppDataOnUninstall", js.undefined)
    
    @scala.inline
    def setDifferentialPackage(value: Boolean): Self = this.set("differentialPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDifferentialPackage: Self = this.set("differentialPackage", js.undefined)
    
    @scala.inline
    def setDisplayLanguageSelector(value: Boolean): Self = this.set("displayLanguageSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLanguageSelector: Self = this.set("displayLanguageSelector", js.undefined)
    
    @scala.inline
    def setInclude(value: String): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setIncludeNull: Self = this.set("include", null)
    
    @scala.inline
    def setInstallerHeader(value: String): Self = this.set("installerHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallerHeader: Self = this.set("installerHeader", js.undefined)
    
    @scala.inline
    def setInstallerHeaderNull: Self = this.set("installerHeader", null)
    
    @scala.inline
    def setInstallerHeaderIcon(value: String): Self = this.set("installerHeaderIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallerHeaderIcon: Self = this.set("installerHeaderIcon", js.undefined)
    
    @scala.inline
    def setInstallerHeaderIconNull: Self = this.set("installerHeaderIcon", null)
    
    @scala.inline
    def setInstallerIcon(value: String): Self = this.set("installerIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallerIcon: Self = this.set("installerIcon", js.undefined)
    
    @scala.inline
    def setInstallerIconNull: Self = this.set("installerIcon", null)
    
    @scala.inline
    def setInstallerLanguagesVarargs(value: String*): Self = this.set("installerLanguages", js.Array(value :_*))
    
    @scala.inline
    def setInstallerLanguages(value: js.Array[String] | String): Self = this.set("installerLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallerLanguages: Self = this.set("installerLanguages", js.undefined)
    
    @scala.inline
    def setInstallerLanguagesNull: Self = this.set("installerLanguages", null)
    
    @scala.inline
    def setInstallerSidebar(value: String): Self = this.set("installerSidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallerSidebar: Self = this.set("installerSidebar", js.undefined)
    
    @scala.inline
    def setInstallerSidebarNull: Self = this.set("installerSidebar", null)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLanguageNull: Self = this.set("language", null)
    
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    
    @scala.inline
    def setLicenseNull: Self = this.set("license", null)
    
    @scala.inline
    def setMultiLanguageInstaller(value: Boolean): Self = this.set("multiLanguageInstaller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiLanguageInstaller: Self = this.set("multiLanguageInstaller", js.undefined)
    
    @scala.inline
    def setPackElevateHelper(value: Boolean): Self = this.set("packElevateHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackElevateHelper: Self = this.set("packElevateHelper", js.undefined)
    
    @scala.inline
    def setPreCompressedFileExtensionsVarargs(value: String*): Self = this.set("preCompressedFileExtensions", js.Array(value :_*))
    
    @scala.inline
    def setPreCompressedFileExtensions(value: js.Array[String] | String): Self = this.set("preCompressedFileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreCompressedFileExtensions: Self = this.set("preCompressedFileExtensions", js.undefined)
    
    @scala.inline
    def setPreCompressedFileExtensionsNull: Self = this.set("preCompressedFileExtensions", null)
    
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    
    @scala.inline
    def setScriptNull: Self = this.set("script", null)
    
    @scala.inline
    def setUninstallDisplayName(value: String): Self = this.set("uninstallDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUninstallDisplayName: Self = this.set("uninstallDisplayName", js.undefined)
    
    @scala.inline
    def setUninstallerIcon(value: String): Self = this.set("uninstallerIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUninstallerIcon: Self = this.set("uninstallerIcon", js.undefined)
    
    @scala.inline
    def setUninstallerIconNull: Self = this.set("uninstallerIcon", null)
    
    @scala.inline
    def setUninstallerSidebar(value: String): Self = this.set("uninstallerSidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUninstallerSidebar: Self = this.set("uninstallerSidebar", js.undefined)
    
    @scala.inline
    def setUninstallerSidebarNull: Self = this.set("uninstallerSidebar", null)
  }
}
