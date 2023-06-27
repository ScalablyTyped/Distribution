package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseElevationLayerFetchTileOptions extends StObject {
  
  /**
  		 * The value representing pixels in the tile that don't contain an elevation value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#fetchTile)
  		 */
  var noDataValue: js.UndefOr[Double] = js.undefined
  
  /**
  		 * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#fetchTile)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object BaseElevationLayerFetchTileOptions {
  
  inline def apply(): BaseElevationLayerFetchTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseElevationLayerFetchTileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseElevationLayerFetchTileOptions] (val x: Self) extends AnyVal {
    
    inline def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    inline def setNoDataValueUndefined: Self = StObject.set(x, "noDataValue", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
