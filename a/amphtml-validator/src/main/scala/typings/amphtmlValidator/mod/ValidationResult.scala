package typings.amphtmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationResult extends js.Object {
  var errors: js.Array[ValidationError] = js.native
  var status: ValidationResultStatus = js.native
}

object ValidationResult {
  @scala.inline
  def apply(errors: js.Array[ValidationError], status: ValidationResultStatus): ValidationResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResult]
  }
  @scala.inline
  implicit class ValidationResultOps[Self <: ValidationResult] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: ValidationError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[ValidationError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ValidationResultStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

