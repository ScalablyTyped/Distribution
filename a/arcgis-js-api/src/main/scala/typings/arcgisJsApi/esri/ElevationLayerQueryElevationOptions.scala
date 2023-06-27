package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationLayerQueryElevationOptions extends StObject {
  
  /**
  		 * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`).
  		 *
  		 * @default auto
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
  		 */
  var demResolution: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * The value to use when there is no data available.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
  		 */
  var noDataValue: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether to return additional sample information for each coordinate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
  		 */
  var returnSampleInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object ElevationLayerQueryElevationOptions {
  
  inline def apply(): ElevationLayerQueryElevationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElevationLayerQueryElevationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationLayerQueryElevationOptions] (val x: Self) extends AnyVal {
    
    inline def setDemResolution(value: Double | String): Self = StObject.set(x, "demResolution", value.asInstanceOf[js.Any])
    
    inline def setDemResolutionUndefined: Self = StObject.set(x, "demResolution", js.undefined)
    
    inline def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    inline def setNoDataValueUndefined: Self = StObject.set(x, "noDataValue", js.undefined)
    
    inline def setReturnSampleInfo(value: Boolean): Self = StObject.set(x, "returnSampleInfo", value.asInstanceOf[js.Any])
    
    inline def setReturnSampleInfoUndefined: Self = StObject.set(x, "returnSampleInfo", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
