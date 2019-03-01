package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreventableExceptionThrownEvent extends ExceptionThrownEvent {
  def preventDefault(): scala.Unit
}

object PreventableExceptionThrownEvent {
  @scala.inline
  def apply(
    column: scala.Double,
    line: scala.Double,
    message: java.lang.String,
    originalError: nodeLib.Error,
    preventDefault: js.Function0[scala.Unit],
    url: java.lang.String
  ): PreventableExceptionThrownEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("originalError")(originalError)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PreventableExceptionThrownEvent]
  }
}

