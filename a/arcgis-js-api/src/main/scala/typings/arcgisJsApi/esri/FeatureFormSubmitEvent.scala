package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureFormSubmitEvent extends StObject {
  
  var invalid: js.Array[String]
  
  var valid: js.Array[String]
  
  var values: js.Any
}
object FeatureFormSubmitEvent {
  
  inline def apply(invalid: js.Array[String], valid: js.Array[String], values: js.Any): FeatureFormSubmitEvent = {
    val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFormSubmitEvent]
  }
  
  extension [Self <: FeatureFormSubmitEvent](x: Self) {
    
    inline def setInvalid(value: js.Array[String]): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidVarargs(value: String*): Self = StObject.set(x, "invalid", js.Array(value :_*))
    
    inline def setValid(value: js.Array[String]): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidVarargs(value: String*): Self = StObject.set(x, "valid", js.Array(value :_*))
    
    inline def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
