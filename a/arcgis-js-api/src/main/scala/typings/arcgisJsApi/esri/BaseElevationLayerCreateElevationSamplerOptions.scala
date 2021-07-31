package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseElevationLayerCreateElevationSamplerOptions
  extends StObject
     with Object {
  
  /**
    * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`).
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
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BaseElevationLayerCreateElevationSamplerOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BaseElevationLayerCreateElevationSamplerOptions]
  }
  
  @scala.inline
  implicit class BaseElevationLayerCreateElevationSamplerOptionsMutableBuilder[Self <: BaseElevationLayerCreateElevationSamplerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDemResolution(value: Double | String): Self = StObject.set(x, "demResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemResolutionUndefined: Self = StObject.set(x, "demResolution", js.undefined)
    
    @scala.inline
    def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataValueUndefined: Self = StObject.set(x, "noDataValue", js.undefined)
  }
}
