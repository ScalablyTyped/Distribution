package typings.ajv.ajvMod.AjvErrorsNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingRefError extends Error {
  var missingRef: String
  var missingSchema: String
}

object MissingRefError {
  @scala.inline
  def apply(message: String, missingRef: String, missingSchema: String, name: String, stack: String = null): MissingRefError = {
    val __obj = js.Dynamic.literal(message = message, missingRef = missingRef, missingSchema = missingSchema, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MissingRefError]
  }
}

