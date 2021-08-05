package typings.ajv.mod

import typings.ajv.ajvBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AjvErrors {
  
  trait MissingRefError
    extends StObject
       with Error {
    
    var missingRef: String
    
    var missingSchema: String
  }
  object MissingRefError {
    
    inline def apply(message: String, missingRef: String, missingSchema: String, name: String): typings.ajv.mod.AjvErrors.MissingRefError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], missingRef = missingRef.asInstanceOf[js.Any], missingSchema = missingSchema.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ajv.mod.AjvErrors.MissingRefError]
    }
    
    extension [Self <: typings.ajv.mod.AjvErrors.MissingRefError](x: Self) {
      
      inline def setMissingRef(value: String): Self = StObject.set(x, "missingRef", value.asInstanceOf[js.Any])
      
      inline def setMissingSchema(value: String): Self = StObject.set(x, "missingSchema", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationError
    extends StObject
       with Error {
    
    var ajv: `true`
    
    var errors: js.Array[ErrorObject]
    
    var validation: `true`
  }
  object ValidationError {
    
    inline def apply(errors: js.Array[ErrorObject], message: String, name: String): typings.ajv.mod.AjvErrors.ValidationError = {
      val __obj = js.Dynamic.literal(ajv = true, errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], validation = true)
      __obj.asInstanceOf[typings.ajv.mod.AjvErrors.ValidationError]
    }
    
    extension [Self <: typings.ajv.mod.AjvErrors.ValidationError](x: Self) {
      
      inline def setAjv(value: `true`): Self = StObject.set(x, "ajv", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[ErrorObject]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ErrorObject*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setValidation(value: `true`): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    }
  }
}
