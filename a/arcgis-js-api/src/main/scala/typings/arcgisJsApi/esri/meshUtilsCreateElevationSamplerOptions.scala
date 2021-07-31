package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait meshUtilsCreateElevationSamplerOptions
  extends StObject
     with Object {
  
  /**
    * The value to use when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createElevationSampler)
    */
  var noDataValue: js.UndefOr[Double] = js.undefined
}
object meshUtilsCreateElevationSamplerOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): meshUtilsCreateElevationSamplerOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[meshUtilsCreateElevationSamplerOptions]
  }
  
  @scala.inline
  implicit class meshUtilsCreateElevationSamplerOptionsMutableBuilder[Self <: meshUtilsCreateElevationSamplerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataValueUndefined: Self = StObject.set(x, "noDataValue", js.undefined)
  }
}
