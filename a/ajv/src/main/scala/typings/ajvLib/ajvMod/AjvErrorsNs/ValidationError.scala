package typings
package ajvLib.ajvMod.AjvErrorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError
  extends stdLib.Error {
  var ajv: ajvLib.ajvLibNumbers.`true`
  var errors: js.Array[ajvLib.ajvMod.ajvNs.ErrorObject]
  var validation: ajvLib.ajvLibNumbers.`true`
}

object ValidationError {
  @scala.inline
  def apply(
    ajv: ajvLib.ajvLibNumbers.`true`,
    errors: js.Array[ajvLib.ajvMod.ajvNs.ErrorObject],
    message: java.lang.String,
    name: java.lang.String,
    validation: ajvLib.ajvLibNumbers.`true`,
    stack: java.lang.String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(ajv = ajv, errors = errors, message = message, name = name, validation = validation)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ValidationError]
  }
}

