package typings.ajv.mod.AjvErrors

import typings.ajv.ajvBooleans.`true`
import typings.ajv.mod.ErrorObject
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationError extends Error {
  
  var ajv: `true` = js.native
  
  var errors: js.Array[ErrorObject] = js.native
  
  var validation: `true` = js.native
}
object ValidationError {
  
  @scala.inline
  def apply(ajv: `true`, errors: js.Array[ErrorObject], message: String, name: String, validation: `true`): ValidationError = {
    val __obj = js.Dynamic.literal(ajv = ajv.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  
  @scala.inline
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAjv(value: `true`): Self = this.set("ajv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: ErrorObject*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[ErrorObject]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidation(value: `true`): Self = this.set("validation", value.asInstanceOf[js.Any])
  }
}
