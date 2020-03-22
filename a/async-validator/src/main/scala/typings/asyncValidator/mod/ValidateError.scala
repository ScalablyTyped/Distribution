package typings.asyncValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateError extends js.Object {
  var field: String
  var message: String
}

object ValidateError {
  @scala.inline
  def apply(field: String, message: String): ValidateError = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidateError]
  }
}

