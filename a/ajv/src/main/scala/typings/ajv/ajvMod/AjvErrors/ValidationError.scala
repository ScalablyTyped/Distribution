package typings.ajv.ajvMod.AjvErrors

import typings.ajv.ajvMod.ErrorObject
import typings.ajv.ajvNumbers.`true`
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
    val __obj = js.Dynamic.literal(ajv = ajv, errors = errors, message = message, name = name, validation = validation)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ValidationError]
  }
}

