package typings.appBuilderLib.nsisOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.always
import typings.appBuilderLib.commonWindowsInstallerConfigurationMod.CommonWindowsInstallerConfiguration
import typings.appBuilderLib.coreMod.Publish
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NsisOptions
  extends CommonNsisOptions
     with CommonWindowsInstallerConfiguration
     with TargetSpecificOptions {
  /**
    * *assisted installer only.* Allow requesting for elevation. If false, user will have to restart installer with elevated permissions.
    * @default true
    */
  val allowElevation: js.UndefOr[Boolean] = js.undefined
  /**
    * *assisted installer only.* Whether to allow user to change installation directory.
    * @default false
    */
  val allowToChangeInstallationDirectory: js.UndefOr[Boolean] = js.undefined
  /**
    * *one-click installer only.* Whether to delete app data on uninstall.
    * @default false
    */
  val deleteAppDataOnUninstall: js.UndefOr[Boolean] = js.undefined
  /**
    * @private
    */
  var differentialPackage: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to display a language selection dialog. Not recommended (by default will be detected using OS language).
    * @default false
    */
  val displayLanguageSelector: js.UndefOr[Boolean] = js.undefined
  /**
    * The path to NSIS include script to customize installer. Defaults to `build/installer.nsh`. See [Custom NSIS script](#custom-nsis-script).
    */
  val include: js.UndefOr[String | Null] = js.undefined
  /**
    * *assisted installer only.* `MUI_HEADERIMAGE`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * @default build/installerHeader.bmp
    */
  val installerHeader: js.UndefOr[String | Null] = js.undefined
  /**
    * *one-click installer only.* The path to header icon (above the progress bar), relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/installerHeaderIcon.ico` or application icon.
    */
  val installerHeaderIcon: js.UndefOr[String | Null] = js.undefined
  /**
    * The path to installer icon, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/installerIcon.ico` or application icon.
    */
  val installerIcon: js.UndefOr[String | Null] = js.undefined
  /**
    * The installer languages (e.g. `en_US`, `de_DE`). Change only if you understand what do you do and for what.
    */
  val installerLanguages: js.UndefOr[js.Array[String] | String | Null] = js.undefined
  /**
    * *assisted installer only.* `MUI_WELCOMEFINISHPAGE_BITMAP`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/installerSidebar.bmp` or `${NSISDIR}\\Contrib\\Graphics\\Wizard\\nsis3-metro.bmp`. Image size 164 × 314 pixels.
    */
  val installerSidebar: js.UndefOr[String | Null] = js.undefined
  /**
    * [LCID Dec](https://msdn.microsoft.com/en-au/goglobal/bb964664.aspx), defaults to `1033`(`English - United States`).
    */
  val language: js.UndefOr[String | Null] = js.undefined
  /**
    * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). In addition to `txt, `rtf` and `html` supported (don't forget to use `target="_blank"` for links).
    *
    * Multiple license files in different languages are supported — use lang postfix (e.g. `_de`, `_ru`)). For example, create files `license_de.txt` and `license_en.txt` in the build resources.
    * If OS language is german, `license_de.txt` will be displayed. See map of [language code to name](https://github.com/meikidd/iso-639-1/blob/master/src/data.js).
    *
    * Appropriate license file will be selected by user OS language.
    */
  val license: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether to create multi-language installer. Defaults to `unicode` option value.
    */
  val multiLanguageInstaller: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to pack the elevate executable (required for electron-updater if per-machine installer used or can be used in the future). Ignored if `perMachine` is set to `true`.
    * @default true
    */
  val packElevateHelper: js.UndefOr[Boolean] = js.undefined
  /**
    * The file extension of files that will be not compressed. Applicable only for `extraResources` and `extraFiles` files.
    * @default [".avi", ".mov", ".m4v", ".mp4", ".m4p", ".qt", ".mkv", ".webm", ".vmdk"]
    */
  val preCompressedFileExtensions: js.UndefOr[js.Array[String] | String | Null] = js.undefined
  /**
    * The path to NSIS script to customize installer. Defaults to `build/installer.nsi`. See [Custom NSIS script](#custom-nsis-script).
    */
  val script: js.UndefOr[String | Null] = js.undefined
  /**
    * The uninstaller display name in the control panel.
    * @default ${productName} ${version}
    */
  val uninstallDisplayName: js.UndefOr[String] = js.undefined
  /**
    * The path to uninstaller icon, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/uninstallerIcon.ico` or application icon.
    */
  val uninstallerIcon: js.UndefOr[String | Null] = js.undefined
  /**
    * *assisted installer only.* `MUI_UNWELCOMEFINISHPAGE_BITMAP`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `installerSidebar` option or `build/uninstallerSidebar.bmp` or `build/installerSidebar.bmp` or `${NSISDIR}\\Contrib\\Graphics\\Wizard\\nsis3-metro.bmp`
    */
  val uninstallerSidebar: js.UndefOr[String | Null] = js.undefined
}

object NsisOptions {
  @scala.inline
  def apply(
    allowElevation: js.UndefOr[Boolean] = js.undefined,
    allowToChangeInstallationDirectory: js.UndefOr[Boolean] = js.undefined,
    artifactName: String = null,
    createDesktopShortcut: Boolean | always = null,
    createStartMenuShortcut: js.UndefOr[Boolean] = js.undefined,
    deleteAppDataOnUninstall: js.UndefOr[Boolean] = js.undefined,
    differentialPackage: js.UndefOr[Boolean] = js.undefined,
    displayLanguageSelector: js.UndefOr[Boolean] = js.undefined,
    guid: String = null,
    include: String = null,
    installerHeader: String = null,
    installerHeaderIcon: String = null,
    installerIcon: String = null,
    installerLanguages: js.Array[String] | String = null,
    installerSidebar: String = null,
    language: String = null,
    license: String = null,
    menuCategory: Boolean | String = null,
    multiLanguageInstaller: js.UndefOr[Boolean] = js.undefined,
    oneClick: js.UndefOr[Boolean] = js.undefined,
    packElevateHelper: js.UndefOr[Boolean] = js.undefined,
    perMachine: js.UndefOr[Boolean] = js.undefined,
    preCompressedFileExtensions: js.Array[String] | String = null,
    publish: Publish = null,
    runAfterFinish: js.UndefOr[Boolean] = js.undefined,
    script: String = null,
    shortcutName: String = null,
    unicode: js.UndefOr[Boolean] = js.undefined,
    uninstallDisplayName: String = null,
    uninstallerIcon: String = null,
    uninstallerSidebar: String = null,
    useZip: js.UndefOr[Boolean] = js.undefined,
    warningsAsErrors: js.UndefOr[Boolean] = js.undefined
  ): NsisOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowElevation)) __obj.updateDynamic("allowElevation")(allowElevation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowToChangeInstallationDirectory)) __obj.updateDynamic("allowToChangeInstallationDirectory")(allowToChangeInstallationDirectory.asInstanceOf[js.Any])
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (createDesktopShortcut != null) __obj.updateDynamic("createDesktopShortcut")(createDesktopShortcut.asInstanceOf[js.Any])
    if (!js.isUndefined(createStartMenuShortcut)) __obj.updateDynamic("createStartMenuShortcut")(createStartMenuShortcut.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteAppDataOnUninstall)) __obj.updateDynamic("deleteAppDataOnUninstall")(deleteAppDataOnUninstall.asInstanceOf[js.Any])
    if (!js.isUndefined(differentialPackage)) __obj.updateDynamic("differentialPackage")(differentialPackage.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLanguageSelector)) __obj.updateDynamic("displayLanguageSelector")(displayLanguageSelector.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (installerHeader != null) __obj.updateDynamic("installerHeader")(installerHeader.asInstanceOf[js.Any])
    if (installerHeaderIcon != null) __obj.updateDynamic("installerHeaderIcon")(installerHeaderIcon.asInstanceOf[js.Any])
    if (installerIcon != null) __obj.updateDynamic("installerIcon")(installerIcon.asInstanceOf[js.Any])
    if (installerLanguages != null) __obj.updateDynamic("installerLanguages")(installerLanguages.asInstanceOf[js.Any])
    if (installerSidebar != null) __obj.updateDynamic("installerSidebar")(installerSidebar.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (menuCategory != null) __obj.updateDynamic("menuCategory")(menuCategory.asInstanceOf[js.Any])
    if (!js.isUndefined(multiLanguageInstaller)) __obj.updateDynamic("multiLanguageInstaller")(multiLanguageInstaller.asInstanceOf[js.Any])
    if (!js.isUndefined(oneClick)) __obj.updateDynamic("oneClick")(oneClick.asInstanceOf[js.Any])
    if (!js.isUndefined(packElevateHelper)) __obj.updateDynamic("packElevateHelper")(packElevateHelper.asInstanceOf[js.Any])
    if (!js.isUndefined(perMachine)) __obj.updateDynamic("perMachine")(perMachine.asInstanceOf[js.Any])
    if (preCompressedFileExtensions != null) __obj.updateDynamic("preCompressedFileExtensions")(preCompressedFileExtensions.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(runAfterFinish)) __obj.updateDynamic("runAfterFinish")(runAfterFinish.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (shortcutName != null) __obj.updateDynamic("shortcutName")(shortcutName.asInstanceOf[js.Any])
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode.asInstanceOf[js.Any])
    if (uninstallDisplayName != null) __obj.updateDynamic("uninstallDisplayName")(uninstallDisplayName.asInstanceOf[js.Any])
    if (uninstallerIcon != null) __obj.updateDynamic("uninstallerIcon")(uninstallerIcon.asInstanceOf[js.Any])
    if (uninstallerSidebar != null) __obj.updateDynamic("uninstallerSidebar")(uninstallerSidebar.asInstanceOf[js.Any])
    if (!js.isUndefined(useZip)) __obj.updateDynamic("useZip")(useZip.asInstanceOf[js.Any])
    if (!js.isUndefined(warningsAsErrors)) __obj.updateDynamic("warningsAsErrors")(warningsAsErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[NsisOptions]
  }
}

