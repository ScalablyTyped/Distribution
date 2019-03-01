package typings
package appDashBuilderDashLibLib.outOptionsSquirrelWindowsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SquirrelWindowsOptions
  extends appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions {
  /**
    * A URL to an ICO file to use as the application icon (displayed in Control Panel > Programs and Features). Defaults to the Electron icon.
    *
    * Please note — [local icon file url is not accepted](https://github.com/atom/grunt-electron-installer/issues/73), must be https/http.
    *
    * If you don't plan to build windows installer, you can omit it.
    * If your project repository is public on GitHub, it will be `https://github.com/${u}/${p}/blob/master/build/icon.ico?raw=true` by default.
    */
  val iconUrl: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The path to a .gif file to display during install. `build/install-spinner.gif` will be used if exists (it is a recommended way to set)
    * (otherwise [default](https://github.com/electron/windows-installer/blob/master/resources/install-spinner.gif)).
    */
  val loadingGif: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Whether to create an MSI installer. Defaults to `false` (MSI is not created).
    */
  val msi: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * https://github.com/electron-userland/electron-builder/issues/1743
    * @private
    */
  val name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A URL to your existing updates. Or `true` to automatically set to your GitHub repository. If given, these will be downloaded to create delta updates.
    */
  val remoteReleases: js.UndefOr[java.lang.String | scala.Boolean | scala.Null] = js.undefined
  /**
    * Authentication token for remote updates
    */
  val remoteToken: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Use `appId` to identify package instead of `name`.
    */
  val useAppIdAsId: js.UndefOr[scala.Boolean] = js.undefined
}

object SquirrelWindowsOptions {
  @scala.inline
  def apply(
    artifactName: java.lang.String = null,
    iconUrl: java.lang.String = null,
    loadingGif: java.lang.String = null,
    msi: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    publish: builderDashUtilDashRuntimeLib.outPublishOptionsMod.Publish = null,
    remoteReleases: java.lang.String | scala.Boolean = null,
    remoteToken: java.lang.String = null,
    useAppIdAsId: js.UndefOr[scala.Boolean] = js.undefined
  ): SquirrelWindowsOptions = {
    val __obj = js.Dynamic.literal()
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (loadingGif != null) __obj.updateDynamic("loadingGif")(loadingGif)
    if (!js.isUndefined(msi)) __obj.updateDynamic("msi")(msi)
    if (name != null) __obj.updateDynamic("name")(name)
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (remoteReleases != null) __obj.updateDynamic("remoteReleases")(remoteReleases.asInstanceOf[js.Any])
    if (remoteToken != null) __obj.updateDynamic("remoteToken")(remoteToken)
    if (!js.isUndefined(useAppIdAsId)) __obj.updateDynamic("useAppIdAsId")(useAppIdAsId)
    __obj.asInstanceOf[SquirrelWindowsOptions]
  }
}

