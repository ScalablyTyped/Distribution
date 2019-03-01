package typings
package asanaLib.asanaMod.asanaNs.errorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsanaError
  extends stdLib.Error {
  var code: scala.Double
  var value: js.Any
}

object AsanaError {
  @scala.inline
  def apply(
    code: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    value: js.Any,
    stack: java.lang.String = null
  ): AsanaError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AsanaError]
  }
}

