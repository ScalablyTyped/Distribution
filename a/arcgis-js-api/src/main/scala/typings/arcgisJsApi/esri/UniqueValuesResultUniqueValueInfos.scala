package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueValuesResultUniqueValueInfos extends StObject {
  
  /**
  		 * The number of features assigned the given `value` (or belonging to the given category).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#UniqueValuesResult)
  		 */
  var count: Double
  
  /**
  		 * A unique value representing a type or category of features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#UniqueValuesResult)
  		 */
  var value: String | Double
}
object UniqueValuesResultUniqueValueInfos {
  
  inline def apply(count: Double, value: String | Double): UniqueValuesResultUniqueValueInfos = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueValuesResultUniqueValueInfos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniqueValuesResultUniqueValueInfos] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
