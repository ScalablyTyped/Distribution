package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterMultidimensionalInfo
  extends StObject
     with Object {
  
  /**
    * The multi dimensional variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var variables: js.Array[RasterMultidimensionalInfoVariables]
}
object RasterMultidimensionalInfo {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    variables: js.Array[RasterMultidimensionalInfoVariables]
  ): RasterMultidimensionalInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterMultidimensionalInfo]
  }
  
  extension [Self <: RasterMultidimensionalInfo](x: Self) {
    
    inline def setVariables(value: js.Array[RasterMultidimensionalInfoVariables]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: RasterMultidimensionalInfoVariables*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
