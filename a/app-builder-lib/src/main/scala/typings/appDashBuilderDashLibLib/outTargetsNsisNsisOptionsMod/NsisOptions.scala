package typings
package appDashBuilderDashLibLib.outTargetsNsisNsisOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait NsisOptions
  extends CommonNsisOptions
     with appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions {
  /**
    * *assisted installer only.* Allow requesting for elevation. If false, user will have to restart installer with elevated permissions.
    * @default true
    */
  val allowElevation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * *assisted installer only.* Whether to allow user to change installation directory.
    * @default false
    */
  val allowToChangeInstallationDirectory: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * *one-click installer only.* Whether to delete app data on uninstall.
    * @default false
    */
  val deleteAppDataOnUninstall: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defaults to `true` for web installer (`nsis-web`)
    */
  var differentialPackage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to display a language selection dialog. Not recommended (by default will be detected using OS language).
    * @default false
    */
  val displayLanguageSelector: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The path to NSIS include script to customize installer. Defaults to `build/installer.nsh`. See [Custom NSIS script](#custom-nsis-script).
    */
  val include: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * *assisted installer only.* `MUI_HEADERIMAGE`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * @default build/installerHeader.bmp
    */
  val installerHeader: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * *one-click installer only.* The path to header icon (above the progress bar), relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/installerHeaderIcon.ico` or application icon.
    */
  val installerHeaderIcon: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The path to installer icon, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/installerIcon.ico` or application icon.
    */
  val installerIcon: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The installer languages (e.g. `en_US`, `de_DE`). Change only if you understand what do you do and for what.
    */
  val installerLanguages: js.UndefOr[js.Array[java.lang.String] | java.lang.String | scala.Null] = js.undefined
  /**
    * *assisted installer only.* `MUI_WELCOMEFINISHPAGE_BITMAP`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/installerSidebar.bmp` or `${NSISDIR}\\Contrib\\Graphics\\Wizard\\nsis3-metro.bmp`. Image size 164 × 314 pixels.
    */
  val installerSidebar: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * [LCID Dec](https://msdn.microsoft.com/en-au/goglobal/bb964664.aspx), defaults to `1033`(`English - United States`).
    */
  val language: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). In addition to `txt, `rtf` and `html` supported (don't forget to use `target="_blank"` for links).
    *
    * Multiple license files in different languages are supported — use lang postfix (e.g. `_de`, `_ru`)). For example, create files `license_de.txt` and `license_en.txt` in the build resources.
    * If OS language is german, `license_de.txt` will be displayed. See map of [language code to name](https://github.com/meikidd/iso-639-1/blob/master/src/data.js).
    *
    * Appropriate license file will be selected by user OS language.
    */
  val license: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Whether to create multi-language installer. Defaults to `unicode` option value.
    */
  val multiLanguageInstaller: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to create one-click installer or assisted.
    * @default true
    */
  val oneClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to pack the elevate executable (required for electron-updater if per-machine installer used or can be used in the future). Ignored if `perMachine` is set to `true`.
    * @default true
    */
  val packElevateHelper: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show install mode installer page (choice per-machine or per-user) for assisted installer. Or whether installation always per all users (per-machine).
    *
    * If `oneClick` is `true` (default): Whether to install per all users (per-machine).
    *
    * If `oneClick` is `false` and `perMachine` is `true`: no install mode installer page, always install per-machine.
    *
    * If `oneClick` is `false` and `perMachine` is `false` (default): install mode installer page.
    * @default false
    */
  val perMachine: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The file extension of files that will be not compressed. Applicable only for `extraResources` and `extraFiles` files.
    * @default [".avi", ".mov", ".m4v", ".mp4", ".m4p", ".qt", ".mkv", ".webm", ".vmdk"]
    */
  val preCompressedFileExtensions: js.UndefOr[js.Array[java.lang.String] | java.lang.String | scala.Null] = js.undefined
  /**
    * The path to NSIS script to customize installer. Defaults to `build/installer.nsi`. See [Custom NSIS script](#custom-nsis-script).
    */
  val script: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The uninstaller display name in the control panel.
    * @default ${productName} ${version}
    */
  val uninstallDisplayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The path to uninstaller icon, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/uninstallerIcon.ico` or application icon.
    */
  val uninstallerIcon: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * *assisted installer only.* `MUI_UNWELCOMEFINISHPAGE_BITMAP`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `installerSidebar` option or `build/uninstallerSidebar.bmp` or `build/installerSidebar.bmp` or `${NSISDIR}\\Contrib\\Graphics\\Wizard\\nsis3-metro.bmp`
    */
  val uninstallerSidebar: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object NsisOptions {
  @scala.inline
  def apply(
    allowElevation: js.UndefOr[scala.Boolean] = js.undefined,
    allowToChangeInstallationDirectory: js.UndefOr[scala.Boolean] = js.undefined,
    artifactName: java.lang.String = null,
    deleteAppDataOnUninstall: js.UndefOr[scala.Boolean] = js.undefined,
    differentialPackage: js.UndefOr[scala.Boolean] = js.undefined,
    displayLanguageSelector: js.UndefOr[scala.Boolean] = js.undefined,
    guid: java.lang.String = null,
    include: java.lang.String = null,
    installerHeader: java.lang.String = null,
    installerHeaderIcon: java.lang.String = null,
    installerIcon: java.lang.String = null,
    installerLanguages: js.Array[java.lang.String] | java.lang.String = null,
    installerSidebar: java.lang.String = null,
    language: java.lang.String = null,
    license: java.lang.String = null,
    multiLanguageInstaller: js.UndefOr[scala.Boolean] = js.undefined,
    oneClick: js.UndefOr[scala.Boolean] = js.undefined,
    packElevateHelper: js.UndefOr[scala.Boolean] = js.undefined,
    perMachine: js.UndefOr[scala.Boolean] = js.undefined,
    preCompressedFileExtensions: js.Array[java.lang.String] | java.lang.String = null,
    publish: builderDashUtilDashRuntimeLib.outPublishOptionsMod.Publish = null,
    script: java.lang.String = null,
    unicode: js.UndefOr[scala.Boolean] = js.undefined,
    uninstallDisplayName: java.lang.String = null,
    uninstallerIcon: java.lang.String = null,
    uninstallerSidebar: java.lang.String = null,
    useZip: js.UndefOr[scala.Boolean] = js.undefined,
    warningsAsErrors: js.UndefOr[scala.Boolean] = js.undefined
  ): NsisOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowElevation)) __obj.updateDynamic("allowElevation")(allowElevation)
    if (!js.isUndefined(allowToChangeInstallationDirectory)) __obj.updateDynamic("allowToChangeInstallationDirectory")(allowToChangeInstallationDirectory)
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (!js.isUndefined(deleteAppDataOnUninstall)) __obj.updateDynamic("deleteAppDataOnUninstall")(deleteAppDataOnUninstall)
    if (!js.isUndefined(differentialPackage)) __obj.updateDynamic("differentialPackage")(differentialPackage)
    if (!js.isUndefined(displayLanguageSelector)) __obj.updateDynamic("displayLanguageSelector")(displayLanguageSelector)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (include != null) __obj.updateDynamic("include")(include)
    if (installerHeader != null) __obj.updateDynamic("installerHeader")(installerHeader)
    if (installerHeaderIcon != null) __obj.updateDynamic("installerHeaderIcon")(installerHeaderIcon)
    if (installerIcon != null) __obj.updateDynamic("installerIcon")(installerIcon)
    if (installerLanguages != null) __obj.updateDynamic("installerLanguages")(installerLanguages.asInstanceOf[js.Any])
    if (installerSidebar != null) __obj.updateDynamic("installerSidebar")(installerSidebar)
    if (language != null) __obj.updateDynamic("language")(language)
    if (license != null) __obj.updateDynamic("license")(license)
    if (!js.isUndefined(multiLanguageInstaller)) __obj.updateDynamic("multiLanguageInstaller")(multiLanguageInstaller)
    if (!js.isUndefined(oneClick)) __obj.updateDynamic("oneClick")(oneClick)
    if (!js.isUndefined(packElevateHelper)) __obj.updateDynamic("packElevateHelper")(packElevateHelper)
    if (!js.isUndefined(perMachine)) __obj.updateDynamic("perMachine")(perMachine)
    if (preCompressedFileExtensions != null) __obj.updateDynamic("preCompressedFileExtensions")(preCompressedFileExtensions.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script)
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode)
    if (uninstallDisplayName != null) __obj.updateDynamic("uninstallDisplayName")(uninstallDisplayName)
    if (uninstallerIcon != null) __obj.updateDynamic("uninstallerIcon")(uninstallerIcon)
    if (uninstallerSidebar != null) __obj.updateDynamic("uninstallerSidebar")(uninstallerSidebar)
    if (!js.isUndefined(useZip)) __obj.updateDynamic("useZip")(useZip)
    if (!js.isUndefined(warningsAsErrors)) __obj.updateDynamic("warningsAsErrors")(warningsAsErrors)
    __obj.asInstanceOf[NsisOptions]
  }
}

