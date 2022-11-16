package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueValuesResult extends StObject {
  
  /**
    * An array of objects, each containing a unique value/type/category present in the field specified in the [uniqueValues()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues) query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#UniqueValuesResult)
    */
  var uniqueValueInfos: js.Array[UniqueValuesResultUniqueValueInfos]
}
object UniqueValuesResult {
  
  inline def apply(uniqueValueInfos: js.Array[UniqueValuesResultUniqueValueInfos]): UniqueValuesResult = {
    val __obj = js.Dynamic.literal(uniqueValueInfos = uniqueValueInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueValuesResult]
  }
  
  extension [Self <: UniqueValuesResult](x: Self) {
    
    inline def setUniqueValueInfos(value: js.Array[UniqueValuesResultUniqueValueInfos]): Self = StObject.set(x, "uniqueValueInfos", value.asInstanceOf[js.Any])
    
    inline def setUniqueValueInfosVarargs(value: UniqueValuesResultUniqueValueInfos*): Self = StObject.set(x, "uniqueValueInfos", js.Array(value*))
  }
}
