package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebTileLayerFetchTileOptions extends StObject {
  
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#fetchTile)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object WebTileLayerFetchTileOptions {
  
  inline def apply(): WebTileLayerFetchTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebTileLayerFetchTileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebTileLayerFetchTileOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
