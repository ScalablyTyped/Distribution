package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseElevationLayerQueryElevationOptions extends StObject {
  
  /**
  		 * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`).
  		 *
  		 * @default auto
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#queryElevation)
  		 */
  var demResolution: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * The value to use when there is no data available.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#queryElevation)
  		 */
  var noDataValue: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether to return additional sample information for each coordinate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#queryElevation)
  		 */
  var returnSampleInfo: js.UndefOr[Boolean] = js.undefined
}
object BaseElevationLayerQueryElevationOptions {
  
  inline def apply(): BaseElevationLayerQueryElevationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseElevationLayerQueryElevationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseElevationLayerQueryElevationOptions] (val x: Self) extends AnyVal {
    
    inline def setDemResolution(value: Double | String): Self = StObject.set(x, "demResolution", value.asInstanceOf[js.Any])
    
    inline def setDemResolutionUndefined: Self = StObject.set(x, "demResolution", js.undefined)
    
    inline def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    inline def setNoDataValueUndefined: Self = StObject.set(x, "noDataValue", js.undefined)
    
    inline def setReturnSampleInfo(value: Boolean): Self = StObject.set(x, "returnSampleInfo", value.asInstanceOf[js.Any])
    
    inline def setReturnSampleInfoUndefined: Self = StObject.set(x, "returnSampleInfo", js.undefined)
  }
}
