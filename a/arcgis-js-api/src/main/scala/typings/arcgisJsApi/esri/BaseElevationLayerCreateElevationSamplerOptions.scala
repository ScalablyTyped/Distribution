package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseElevationLayerCreateElevationSamplerOptions extends StObject {
  
  /**
  		 * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`).
  		 *
  		 * @default auto
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#createElevationSampler)
  		 */
  var demResolution: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * The value to use when there is no data available.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#createElevationSampler)
  		 */
  var noDataValue: js.UndefOr[Double] = js.undefined
}
object BaseElevationLayerCreateElevationSamplerOptions {
  
  inline def apply(): BaseElevationLayerCreateElevationSamplerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseElevationLayerCreateElevationSamplerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseElevationLayerCreateElevationSamplerOptions] (val x: Self) extends AnyVal {
    
    inline def setDemResolution(value: Double | String): Self = StObject.set(x, "demResolution", value.asInstanceOf[js.Any])
    
    inline def setDemResolutionUndefined: Self = StObject.set(x, "demResolution", js.undefined)
    
    inline def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    inline def setNoDataValueUndefined: Self = StObject.set(x, "noDataValue", js.undefined)
  }
}
