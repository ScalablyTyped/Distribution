package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseElevationLayerQueryElevationOptions extends Object {
  
  /**
    * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#queryElevation)
    */
  var demResolution: js.UndefOr[Double | String] = js.native
  
  /**
    * The value to use when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#queryElevation)
    */
  var noDataValue: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether to return additional sample information for each coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#queryElevation)
    */
  var returnSampleInfo: js.UndefOr[Boolean] = js.native
}
object BaseElevationLayerQueryElevationOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BaseElevationLayerQueryElevationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BaseElevationLayerQueryElevationOptions]
  }
  
  @scala.inline
  implicit class BaseElevationLayerQueryElevationOptionsMutableBuilder[Self <: BaseElevationLayerQueryElevationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDemResolution(value: Double | String): Self = StObject.set(x, "demResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemResolutionUndefined: Self = StObject.set(x, "demResolution", js.undefined)
    
    @scala.inline
    def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataValueUndefined: Self = StObject.set(x, "noDataValue", js.undefined)
    
    @scala.inline
    def setReturnSampleInfo(value: Boolean): Self = StObject.set(x, "returnSampleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnSampleInfoUndefined: Self = StObject.set(x, "returnSampleInfo", js.undefined)
  }
}
