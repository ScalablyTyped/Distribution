package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueValuesResult
  extends StObject
     with Object {
  
  /**
    * An array of objects, each containing a unique value/type/category present in the field specified in the [uniqueValues()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues) query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#UniqueValuesResult)
    */
  var uniqueValueInfos: js.Array[UniqueValuesResultUniqueValueInfos]
}
object UniqueValuesResult {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    uniqueValueInfos: js.Array[UniqueValuesResultUniqueValueInfos]
  ): UniqueValuesResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), uniqueValueInfos = uniqueValueInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueValuesResult]
  }
  
  @scala.inline
  implicit class UniqueValuesResultMutableBuilder[Self <: UniqueValuesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUniqueValueInfos(value: js.Array[UniqueValuesResultUniqueValueInfos]): Self = StObject.set(x, "uniqueValueInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueValueInfosVarargs(value: UniqueValuesResultUniqueValueInfos*): Self = StObject.set(x, "uniqueValueInfos", js.Array(value :_*))
  }
}
