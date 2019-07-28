package typings.appDashBuilderDashLib.outTargetsNsisNsisOptionsMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.always
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.Publish
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
    if (!js.isUndefined(allowElevation)) __obj.updateDynamic("allowElevation")(allowElevation)
    if (!js.isUndefined(allowToChangeInstallationDirectory)) __obj.updateDynamic("allowToChangeInstallationDirectory")(allowToChangeInstallationDirectory)
    if (appPackageUrl != null) __obj.updateDynamic("appPackageUrl")(appPackageUrl)
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (createDesktopShortcut != null) __obj.updateDynamic("createDesktopShortcut")(createDesktopShortcut.asInstanceOf[js.Any])
    if (!js.isUndefined(createStartMenuShortcut)) __obj.updateDynamic("createStartMenuShortcut")(createStartMenuShortcut)
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
    if (menuCategory != null) __obj.updateDynamic("menuCategory")(menuCategory.asInstanceOf[js.Any])
    if (!js.isUndefined(multiLanguageInstaller)) __obj.updateDynamic("multiLanguageInstaller")(multiLanguageInstaller)
    if (!js.isUndefined(oneClick)) __obj.updateDynamic("oneClick")(oneClick)
    if (!js.isUndefined(packElevateHelper)) __obj.updateDynamic("packElevateHelper")(packElevateHelper)
    if (!js.isUndefined(perMachine)) __obj.updateDynamic("perMachine")(perMachine)
    if (preCompressedFileExtensions != null) __obj.updateDynamic("preCompressedFileExtensions")(preCompressedFileExtensions.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(runAfterFinish)) __obj.updateDynamic("runAfterFinish")(runAfterFinish)
    if (script != null) __obj.updateDynamic("script")(script)
    if (shortcutName != null) __obj.updateDynamic("shortcutName")(shortcutName)
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode)
    if (uninstallDisplayName != null) __obj.updateDynamic("uninstallDisplayName")(uninstallDisplayName)
    if (uninstallerIcon != null) __obj.updateDynamic("uninstallerIcon")(uninstallerIcon)
    if (uninstallerSidebar != null) __obj.updateDynamic("uninstallerSidebar")(uninstallerSidebar)
    if (!js.isUndefined(useZip)) __obj.updateDynamic("useZip")(useZip)
    if (!js.isUndefined(warningsAsErrors)) __obj.updateDynamic("warningsAsErrors")(warningsAsErrors)
    __obj.asInstanceOf[NsisWebOptions]
  }
}

