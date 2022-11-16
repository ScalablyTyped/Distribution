package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayerFetchTileOptions extends StObject {
  
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#fetchTile)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object TileLayerFetchTileOptions {
  
  inline def apply(): TileLayerFetchTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerFetchTileOptions]
  }
  
  extension [Self <: TileLayerFetchTileOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
