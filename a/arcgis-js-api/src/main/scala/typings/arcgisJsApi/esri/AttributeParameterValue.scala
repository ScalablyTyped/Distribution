package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeParameterValue extends StObject {
  
  /**
  		 * The name of the restriction.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#AttributeParameterValue)
  		 */
  var attributeName: String
  
  /**
  		 * The name of the parameter associated with the restriction.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#AttributeParameterValue)
  		 */
  var parameterName: String
  
  /**
  		 * The value for `parameterName`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#AttributeParameterValue)
  		 */
  var value: String | Double
}
object AttributeParameterValue {
  
  inline def apply(attributeName: String, parameterName: String, value: String | Double): AttributeParameterValue = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeParameterValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeParameterValue] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
