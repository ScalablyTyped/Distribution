package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TravelModeAttributeParameterValues extends StObject {
  
  /**
  		 * The name of the attribute.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#attributeParameterValues)
  		 */
  var attributeName: String
  
  /**
  		 * The parameter name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#attributeParameterValues)
  		 */
  var parameterName: String
  
  /**
  		 * The parameter value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#attributeParameterValues)
  		 */
  var value: String
}
object TravelModeAttributeParameterValues {
  
  inline def apply(attributeName: String, parameterName: String, value: String): TravelModeAttributeParameterValues = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TravelModeAttributeParameterValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TravelModeAttributeParameterValues] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
