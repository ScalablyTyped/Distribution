package typings
package ajvLib.ajvMod.AjvErrorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingRefError
  extends stdLib.Error {
  var missingRef: java.lang.String
  var missingSchema: java.lang.String
}

object MissingRefError {
  @scala.inline
  def apply(
    message: java.lang.String,
    missingRef: java.lang.String,
    missingSchema: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): MissingRefError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("missingRef")(missingRef)
    __obj.updateDynamic("missingSchema")(missingSchema)
    __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MissingRefError]
  }
}

