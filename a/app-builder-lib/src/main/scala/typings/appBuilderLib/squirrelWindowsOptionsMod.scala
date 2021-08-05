package typings.appBuilderLib

import typings.appBuilderLib.coreMod.TargetSpecificOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object squirrelWindowsOptionsMod {
  
  trait SquirrelWindowsOptions
    extends StObject
       with TargetSpecificOptions {
    
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
    
    inline def apply(): SquirrelWindowsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SquirrelWindowsOptions]
    }
    
    extension [Self <: SquirrelWindowsOptions](x: Self) {
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlNull: Self = StObject.set(x, "iconUrl", null)
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setLoadingGif(value: String): Self = StObject.set(x, "loadingGif", value.asInstanceOf[js.Any])
      
      inline def setLoadingGifNull: Self = StObject.set(x, "loadingGif", null)
      
      inline def setLoadingGifUndefined: Self = StObject.set(x, "loadingGif", js.undefined)
      
      inline def setMsi(value: Boolean): Self = StObject.set(x, "msi", value.asInstanceOf[js.Any])
      
      inline def setMsiUndefined: Self = StObject.set(x, "msi", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRemoteReleases(value: String | Boolean): Self = StObject.set(x, "remoteReleases", value.asInstanceOf[js.Any])
      
      inline def setRemoteReleasesNull: Self = StObject.set(x, "remoteReleases", null)
      
      inline def setRemoteReleasesUndefined: Self = StObject.set(x, "remoteReleases", js.undefined)
      
      inline def setRemoteToken(value: String): Self = StObject.set(x, "remoteToken", value.asInstanceOf[js.Any])
      
      inline def setRemoteTokenNull: Self = StObject.set(x, "remoteToken", null)
      
      inline def setRemoteTokenUndefined: Self = StObject.set(x, "remoteToken", js.undefined)
      
      inline def setUseAppIdAsId(value: Boolean): Self = StObject.set(x, "useAppIdAsId", value.asInstanceOf[js.Any])
      
      inline def setUseAppIdAsIdUndefined: Self = StObject.set(x, "useAppIdAsId", js.undefined)
    }
  }
}
