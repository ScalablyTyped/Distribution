package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV100RangeSetAxis extends StObject {
  
  /**
  		 * Range axis label.
  		 *
  		 * [Read more...](global.html)
  		 */
  var label: String
  
  /**
  		 * Range axis name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
  		 */
  var name: String
  
  /**
  		 * Range axis values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
  		 */
  var values: js.Array[String]
}
object CoverageDescriptionV100RangeSetAxis {
  
  inline def apply(label: String, name: String, values: js.Array[String]): CoverageDescriptionV100RangeSetAxis = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV100RangeSetAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV100RangeSetAxis] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
