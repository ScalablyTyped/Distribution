package typings
package assertLib.assertMod.assertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionError
  extends stdLib.Error {
  var actual: js.Any
  var expected: js.Any
  var generatedMessage: scala.Boolean
  var operator: java.lang.String
}

object AssertionError {
  @scala.inline
  def apply(
    actual: js.Any,
    expected: js.Any,
    generatedMessage: scala.Boolean,
    message: java.lang.String,
    name: java.lang.String,
    operator: java.lang.String,
    stack: java.lang.String = null
  ): AssertionError = {
    val __obj = js.Dynamic.literal(actual = actual, expected = expected, generatedMessage = generatedMessage, message = message, name = name, operator = operator)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AssertionError]
  }
}

