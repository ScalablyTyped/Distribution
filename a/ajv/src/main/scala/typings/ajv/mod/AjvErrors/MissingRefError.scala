package typings.ajv.mod.AjvErrors

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
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], missingRef = missingRef.asInstanceOf[js.Any], missingSchema = missingSchema.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingRefError]
  }
}

