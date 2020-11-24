package typings.appBuilderLib.squirrelWindowsOptionsMod

import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SquirrelWindowsOptions extends TargetSpecificOptions {
  
  /**
    * A URL to an ICO file to use as the application icon (displayed in Control Panel > Programs and Features). Defaults to the Electron icon.
    *
    * Please note — [local icon file url is not accepted](https://github.com/atom/grunt-electron-installer/issues/73), must be https/http.
    *
    * If you don't plan to build windows installer, you can omit it.
    * If your project repository is public on GitHub, it will be `https://github.com/${u}/${p}/blob/master/build/icon.ico?raw=true` by default.
    */
  val iconUrl: js.UndefOr[String | Null] = js.native
  
  /**
    * The path to a .gif file to display during install. `build/install-spinner.gif` will be used if exists (it is a recommended way to set)
    * (otherwise [default](https://github.com/electron/windows-installer/blob/master/resources/install-spinner.gif)).
    */
  val loadingGif: js.UndefOr[String | Null] = js.native
  
  /**
    * Whether to create an MSI installer. Defaults to `false` (MSI is not created).
    */
  val msi: js.UndefOr[Boolean] = js.native
  
  /**
    * https://github.com/electron-userland/electron-builder/issues/1743
    * @private
    */
  val name: js.UndefOr[String] = js.native
  
  /**
    * A URL to your existing updates. Or `true` to automatically set to your GitHub repository. If given, these will be downloaded to create delta updates.
    */
  val remoteReleases: js.UndefOr[String | Boolean | Null] = js.native
  
  /**
    * Authentication token for remote updates
    */
  val remoteToken: js.UndefOr[String | Null] = js.native
  
  /**
    * Use `appId` to identify package instead of `name`.
    */
  val useAppIdAsId: js.UndefOr[Boolean] = js.native
}
object SquirrelWindowsOptions {
  
  @scala.inline
  def apply(): SquirrelWindowsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SquirrelWindowsOptions]
  }
  
  @scala.inline
  implicit class SquirrelWindowsOptionsOps[Self <: SquirrelWindowsOptions] (val x: Self) extends AnyVal {
    
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
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setIconUrlNull: Self = this.set("iconUrl", null)
    
    @scala.inline
    def setLoadingGif(value: String): Self = this.set("loadingGif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingGif: Self = this.set("loadingGif", js.undefined)
    
    @scala.inline
    def setLoadingGifNull: Self = this.set("loadingGif", null)
    
    @scala.inline
    def setMsi(value: Boolean): Self = this.set("msi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsi: Self = this.set("msi", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRemoteReleases(value: String | Boolean): Self = this.set("remoteReleases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteReleases: Self = this.set("remoteReleases", js.undefined)
    
    @scala.inline
    def setRemoteReleasesNull: Self = this.set("remoteReleases", null)
    
    @scala.inline
    def setRemoteToken(value: String): Self = this.set("remoteToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteToken: Self = this.set("remoteToken", js.undefined)
    
    @scala.inline
    def setRemoteTokenNull: Self = this.set("remoteToken", null)
    
    @scala.inline
    def setUseAppIdAsId(value: Boolean): Self = this.set("useAppIdAsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAppIdAsId: Self = this.set("useAppIdAsId", js.undefined)
  }
}
