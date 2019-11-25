package typings.appDashBuilderDashLib.outTargetsNsisNsisOptionsMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.always
import typings.appDashBuilderDashLib.outCoreMod.Publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NsisWebOptions extends NsisOptions {
  /**
    * The application package download URL. Optional — by default computed using publish configuration.
    *
    * URL like `https://example.com/download/latest` allows web installer to be version independent (installer will download latest application package).
    * Please note — it is [full URL](https://github.com/electron-userland/electron-builder/issues/1810#issuecomment-317650878).
    *
    * Custom `X-Arch` http header is set to `32` or `64`.
    */
  val appPackageUrl: js.UndefOr[String | Null] = js.undefined
}

object NsisWebOptions {
  @scala.inline
  def apply(
    allowElevation: js.UndefOr[Boolean] = js.undefined,
    allowToChangeInstallationDirectory: js.UndefOr[Boolean] = js.undefined,
    appPackageUrl: String = null,
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
  ): NsisWebOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowElevation)) __obj.updateDynamic("allowElevation")(allowElevation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowToChangeInstallationDirectory)) __obj.updateDynamic("allowToChangeInstallationDirectory")(allowToChangeInstallationDirectory.asInstanceOf[js.Any])
    if (appPackageUrl != null) __obj.updateDynamic("appPackageUrl")(appPackageUrl.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[NsisWebOptions]
  }
}

