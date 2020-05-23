package typings.appBuilderLib.nsisOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.always
import typings.appBuilderLib.coreMod.Publish
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
    appPackageUrl: js.UndefOr[Null | String] = js.undefined,
    artifactName: js.UndefOr[Null | String] = js.undefined,
    createDesktopShortcut: Boolean | always = null,
    createStartMenuShortcut: js.UndefOr[Boolean] = js.undefined,
    deleteAppDataOnUninstall: js.UndefOr[Boolean] = js.undefined,
    differentialPackage: js.UndefOr[Boolean] = js.undefined,
    displayLanguageSelector: js.UndefOr[Boolean] = js.undefined,
    guid: js.UndefOr[Null | String] = js.undefined,
    include: js.UndefOr[Null | String] = js.undefined,
    installerHeader: js.UndefOr[Null | String] = js.undefined,
    installerHeaderIcon: js.UndefOr[Null | String] = js.undefined,
    installerIcon: js.UndefOr[Null | String] = js.undefined,
    installerLanguages: js.UndefOr[Null | js.Array[String] | String] = js.undefined,
    installerSidebar: js.UndefOr[Null | String] = js.undefined,
    language: js.UndefOr[Null | String] = js.undefined,
    license: js.UndefOr[Null | String] = js.undefined,
    menuCategory: Boolean | String = null,
    multiLanguageInstaller: js.UndefOr[Boolean] = js.undefined,
    oneClick: js.UndefOr[Boolean] = js.undefined,
    packElevateHelper: js.UndefOr[Boolean] = js.undefined,
    perMachine: js.UndefOr[Boolean] = js.undefined,
    preCompressedFileExtensions: js.UndefOr[Null | js.Array[String] | String] = js.undefined,
    publish: js.UndefOr[Null | Publish] = js.undefined,
    runAfterFinish: js.UndefOr[Boolean] = js.undefined,
    script: js.UndefOr[Null | String] = js.undefined,
    shortcutName: js.UndefOr[Null | String] = js.undefined,
    unicode: js.UndefOr[Boolean] = js.undefined,
    uninstallDisplayName: String = null,
    uninstallerIcon: js.UndefOr[Null | String] = js.undefined,
    uninstallerSidebar: js.UndefOr[Null | String] = js.undefined,
    useZip: js.UndefOr[Boolean] = js.undefined,
    warningsAsErrors: js.UndefOr[Boolean] = js.undefined
  ): NsisWebOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowElevation)) __obj.updateDynamic("allowElevation")(allowElevation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowToChangeInstallationDirectory)) __obj.updateDynamic("allowToChangeInstallationDirectory")(allowToChangeInstallationDirectory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appPackageUrl)) __obj.updateDynamic("appPackageUrl")(appPackageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(artifactName)) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (createDesktopShortcut != null) __obj.updateDynamic("createDesktopShortcut")(createDesktopShortcut.asInstanceOf[js.Any])
    if (!js.isUndefined(createStartMenuShortcut)) __obj.updateDynamic("createStartMenuShortcut")(createStartMenuShortcut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteAppDataOnUninstall)) __obj.updateDynamic("deleteAppDataOnUninstall")(deleteAppDataOnUninstall.get.asInstanceOf[js.Any])
    if (!js.isUndefined(differentialPackage)) __obj.updateDynamic("differentialPackage")(differentialPackage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLanguageSelector)) __obj.updateDynamic("displayLanguageSelector")(displayLanguageSelector.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guid)) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (!js.isUndefined(include)) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(installerHeader)) __obj.updateDynamic("installerHeader")(installerHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(installerHeaderIcon)) __obj.updateDynamic("installerHeaderIcon")(installerHeaderIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(installerIcon)) __obj.updateDynamic("installerIcon")(installerIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(installerLanguages)) __obj.updateDynamic("installerLanguages")(installerLanguages.asInstanceOf[js.Any])
    if (!js.isUndefined(installerSidebar)) __obj.updateDynamic("installerSidebar")(installerSidebar.asInstanceOf[js.Any])
    if (!js.isUndefined(language)) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(license)) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (menuCategory != null) __obj.updateDynamic("menuCategory")(menuCategory.asInstanceOf[js.Any])
    if (!js.isUndefined(multiLanguageInstaller)) __obj.updateDynamic("multiLanguageInstaller")(multiLanguageInstaller.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oneClick)) __obj.updateDynamic("oneClick")(oneClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(packElevateHelper)) __obj.updateDynamic("packElevateHelper")(packElevateHelper.get.asInstanceOf[js.Any])
    if (!js.isUndefined(perMachine)) __obj.updateDynamic("perMachine")(perMachine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preCompressedFileExtensions)) __obj.updateDynamic("preCompressedFileExtensions")(preCompressedFileExtensions.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(runAfterFinish)) __obj.updateDynamic("runAfterFinish")(runAfterFinish.get.asInstanceOf[js.Any])
    if (!js.isUndefined(script)) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (!js.isUndefined(shortcutName)) __obj.updateDynamic("shortcutName")(shortcutName.asInstanceOf[js.Any])
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode.get.asInstanceOf[js.Any])
    if (uninstallDisplayName != null) __obj.updateDynamic("uninstallDisplayName")(uninstallDisplayName.asInstanceOf[js.Any])
    if (!js.isUndefined(uninstallerIcon)) __obj.updateDynamic("uninstallerIcon")(uninstallerIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(uninstallerSidebar)) __obj.updateDynamic("uninstallerSidebar")(uninstallerSidebar.asInstanceOf[js.Any])
    if (!js.isUndefined(useZip)) __obj.updateDynamic("useZip")(useZip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warningsAsErrors)) __obj.updateDynamic("warningsAsErrors")(warningsAsErrors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NsisWebOptions]
  }
}

