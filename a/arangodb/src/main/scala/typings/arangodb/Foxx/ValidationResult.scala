package typings.arangodb.Foxx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationResult[T] extends StObject {
  
  var error: js.UndefOr[js.Any] = js.undefined
  
  var errors: js.UndefOr[js.Any] = js.undefined
  
  var value: T
}
object ValidationResult {
  
  @scala.inline
  def apply[T](value: T): ValidationResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResult[T]]
  }
  
  @scala.inline
  implicit class ValidationResultMutableBuilder[Self <: ValidationResult[?], T] (val x: Self & ValidationResult[T]) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
