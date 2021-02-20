package typings.ajv.mod

import typings.ajv.ajvBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AjvErrors {
  
  @js.native
  trait MissingRefError extends Error {
    
    var missingRef: String = js.native
    
    var missingSchema: String = js.native
  }
  object MissingRefError {
    
    @scala.inline
    def apply(message: String, missingRef: String, missingSchema: String, name: String): typings.ajv.mod.AjvErrors.MissingRefError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], missingRef = missingRef.asInstanceOf[js.Any], missingSchema = missingSchema.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ajv.mod.AjvErrors.MissingRefError]
    }
    
    @scala.inline
    implicit class MissingRefErrorMutableBuilder[Self <: typings.ajv.mod.AjvErrors.MissingRefError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMissingRef(value: String): Self = StObject.set(x, "missingRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingSchema(value: String): Self = StObject.set(x, "missingSchema", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidationError extends Error {
    
    var ajv: `true` = js.native
    
    var errors: js.Array[ErrorObject] = js.native
    
    var validation: `true` = js.native
  }
  object ValidationError {
    
    @scala.inline
    def apply(ajv: `true`, errors: js.Array[ErrorObject], message: String, name: String, validation: `true`): typings.ajv.mod.AjvErrors.ValidationError = {
      val __obj = js.Dynamic.literal(ajv = ajv.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ajv.mod.AjvErrors.ValidationError]
    }
    
    @scala.inline
    implicit class ValidationErrorMutableBuilder[Self <: typings.ajv.mod.AjvErrors.ValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjv(value: `true`): Self = StObject.set(x, "ajv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Array[ErrorObject]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: ErrorObject*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setValidation(value: `true`): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    }
  }
}
