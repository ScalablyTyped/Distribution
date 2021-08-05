package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroundQueryElevationOptions
  extends StObject
     with Object {
  
  /**
    * The value that appears in the resulting geometry when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#queryElevation)
    */
  var noDataValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether to return additional sample information for each sampled coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#queryElevation)
    */
  var returnSampleInfo: js.UndefOr[Boolean] = js.undefined
}
object GroundQueryElevationOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GroundQueryElevationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GroundQueryElevationOptions]
  }
  
  extension [Self <: GroundQueryElevationOptions](x: Self) {
    
    inline def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    inline def setNoDataValueUndefined: Self = StObject.set(x, "noDataValue", js.undefined)
    
    inline def setReturnSampleInfo(value: Boolean): Self = StObject.set(x, "returnSampleInfo", value.asInstanceOf[js.Any])
    
    inline def setReturnSampleInfoUndefined: Self = StObject.set(x, "returnSampleInfo", js.undefined)
  }
}
