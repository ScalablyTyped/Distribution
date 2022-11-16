package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAreaParametersAttributeParameterValue extends StObject {
  
  /**
    * The name of the restriction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#AttributeParameterValue)
    */
  var attributeName: String
  
  /**
    * The name of the parameter associated with the restriction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#AttributeParameterValue)
    */
  var parameterName: String
  
  /**
    * The value for `parameterName`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#AttributeParameterValue)
    */
  var value: String | Double
}
object ServiceAreaParametersAttributeParameterValue {
  
  inline def apply(attributeName: String, parameterName: String, value: String | Double): ServiceAreaParametersAttributeParameterValue = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAreaParametersAttributeParameterValue]
  }
  
  extension [Self <: ServiceAreaParametersAttributeParameterValue](x: Self) {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
