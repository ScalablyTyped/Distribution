package typings.amphtmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResult extends js.Object {
  var errors: js.Array[ValidationError]
  var status: ValidationResultStatus
}

object ValidationResult {
  @scala.inline
  def apply(errors: js.Array[ValidationError], status: ValidationResultStatus): ValidationResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidationResult]
  }
}

