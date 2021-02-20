package typings.appBuilderLib

import typings.appBuilderLib.coreMod.TargetSpecificOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object squirrelWindowsOptionsMod {
  
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
    implicit class SquirrelWindowsOptionsMutableBuilder[Self <: SquirrelWindowsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlNull: Self = StObject.set(x, "iconUrl", null)
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      @scala.inline
      def setLoadingGif(value: String): Self = StObject.set(x, "loadingGif", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingGifNull: Self = StObject.set(x, "loadingGif", null)
      
      @scala.inline
      def setLoadingGifUndefined: Self = StObject.set(x, "loadingGif", js.undefined)
      
      @scala.inline
      def setMsi(value: Boolean): Self = StObject.set(x, "msi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsiUndefined: Self = StObject.set(x, "msi", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRemoteReleases(value: String | Boolean): Self = StObject.set(x, "remoteReleases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteReleasesNull: Self = StObject.set(x, "remoteReleases", null)
      
      @scala.inline
      def setRemoteReleasesUndefined: Self = StObject.set(x, "remoteReleases", js.undefined)
      
      @scala.inline
      def setRemoteToken(value: String): Self = StObject.set(x, "remoteToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteTokenNull: Self = StObject.set(x, "remoteToken", null)
      
      @scala.inline
      def setRemoteTokenUndefined: Self = StObject.set(x, "remoteToken", js.undefined)
      
      @scala.inline
      def setUseAppIdAsId(value: Boolean): Self = StObject.set(x, "useAppIdAsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAppIdAsIdUndefined: Self = StObject.set(x, "useAppIdAsId", js.undefined)
    }
  }
}
