package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalFetchBasemapsOptions extends StObject {
  
  /**
  		 * When `true` the basemaps based on [basemapGalleryGroupQuery3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery3D) are also fetched, if no `basemapGalleryGroupQuery` is passed as an argument.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps)
  		 */
  var include3d: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Signal object that can be used to abort the asynchronous task.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object PortalFetchBasemapsOptions {
  
  inline def apply(): PortalFetchBasemapsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalFetchBasemapsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortalFetchBasemapsOptions] (val x: Self) extends AnyVal {
    
    inline def setInclude3d(value: Boolean): Self = StObject.set(x, "include3d", value.asInstanceOf[js.Any])
    
    inline def setInclude3dUndefined: Self = StObject.set(x, "include3d", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
