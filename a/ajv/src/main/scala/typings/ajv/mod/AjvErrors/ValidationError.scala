package typings.ajv.mod.AjvErrors

import typings.ajv.ajvBooleans.`true`
import typings.ajv.mod.ErrorObject
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends Error {
  var ajv: `true`
  var errors: js.Array[ErrorObject]
  var validation: `true`
}

object ValidationError {
  @scala.inline
  def apply(
    ajv: `true`,
    errors: js.Array[ErrorObject],
    message: String,
    name: String,
    validation: `true`,
    stack: String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(ajv = ajv.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

