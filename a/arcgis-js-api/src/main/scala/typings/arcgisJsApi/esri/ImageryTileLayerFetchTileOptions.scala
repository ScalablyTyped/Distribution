package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageryTileLayerFetchTileOptions extends StObject {
  
  /**
  		 * Signal object that can be used to abort the asynchronous task.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#fetchTile)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object ImageryTileLayerFetchTileOptions {
  
  inline def apply(): ImageryTileLayerFetchTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageryTileLayerFetchTileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageryTileLayerFetchTileOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
