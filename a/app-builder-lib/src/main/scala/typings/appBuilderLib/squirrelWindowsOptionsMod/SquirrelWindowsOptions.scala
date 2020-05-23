package typings.appBuilderLib.squirrelWindowsOptionsMod

import typings.appBuilderLib.coreMod.Publish
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SquirrelWindowsOptions extends TargetSpecificOptions {
  /**
    * A URL to an ICO file to use as the application icon (displayed in Control Panel > Programs and Features). Defaults to the Electron icon.
    *
    * Please note — [local icon file url is not accepted](https://github.com/atom/grunt-electron-installer/issues/73), must be https/http.
    *
    * If you don't plan to build windows installer, you can omit it.
    * If your project repository is public on GitHub, it will be `https://github.com/${u}/${p}/blob/master/build/icon.ico?raw=true` by default.
    */
  val iconUrl: js.UndefOr[String | Null] = js.undefined
  /**
    * The path to a .gif file to display during install. `build/install-spinner.gif` will be used if exists (it is a recommended way to set)
    * (otherwise [default](https://github.com/electron/windows-installer/blob/master/resources/install-spinner.gif)).
    */
  val loadingGif: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether to create an MSI installer. Defaults to `false` (MSI is not created).
    */
  val msi: js.UndefOr[Boolean] = js.undefined
  /**
    * https://github.com/electron-userland/electron-builder/issues/1743
    * @private
    */
  val name: js.UndefOr[String] = js.undefined
  /**
    * A URL to your existing updates. Or `true` to automatically set to your GitHub repository. If given, these will be downloaded to create delta updates.
    */
  val remoteReleases: js.UndefOr[String | Boolean | Null] = js.undefined
  /**
    * Authentication token for remote updates
    */
  val remoteToken: js.UndefOr[String | Null] = js.undefined
  /**
    * Use `appId` to identify package instead of `name`.
    */
  val useAppIdAsId: js.UndefOr[Boolean] = js.undefined
}

object SquirrelWindowsOptions {
  @scala.inline
  def apply(
    artifactName: js.UndefOr[Null | String] = js.undefined,
    iconUrl: js.UndefOr[Null | String] = js.undefined,
    loadingGif: js.UndefOr[Null | String] = js.undefined,
    msi: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    publish: js.UndefOr[Null | Publish] = js.undefined,
    remoteReleases: js.UndefOr[Null | String | Boolean] = js.undefined,
    remoteToken: js.UndefOr[Null | String] = js.undefined,
    useAppIdAsId: js.UndefOr[Boolean] = js.undefined
  ): SquirrelWindowsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(artifactName)) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (!js.isUndefined(iconUrl)) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(loadingGif)) __obj.updateDynamic("loadingGif")(loadingGif.asInstanceOf[js.Any])
    if (!js.isUndefined(msi)) __obj.updateDynamic("msi")(msi.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteReleases)) __obj.updateDynamic("remoteReleases")(remoteReleases.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteToken)) __obj.updateDynamic("remoteToken")(remoteToken.asInstanceOf[js.Any])
    if (!js.isUndefined(useAppIdAsId)) __obj.updateDynamic("useAppIdAsId")(useAppIdAsId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SquirrelWindowsOptions]
  }
}

