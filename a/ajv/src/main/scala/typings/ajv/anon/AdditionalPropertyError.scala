package typings.ajv.anon

import typings.ajv.distVocabulariesJtdPropertiesMod.PropError.Additional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalPropertyError extends StObject {
  
  var additionalProperty: String
  
  var error: Additional
}
object AdditionalPropertyError {
  
  inline def apply(additionalProperty: String, error: Additional): AdditionalPropertyError = {
    val __obj = js.Dynamic.literal(additionalProperty = additionalProperty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalPropertyError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalPropertyError] (val x: Self) extends AnyVal {
    
    inline def setAdditionalProperty(value: String): Self = StObject.set(x, "additionalProperty", value.asInstanceOf[js.Any])
    
    inline def setError(value: Additional): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
