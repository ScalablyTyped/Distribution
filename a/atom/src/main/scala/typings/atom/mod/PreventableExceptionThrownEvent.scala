package typings.atom.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreventableExceptionThrownEvent extends ExceptionThrownEvent {
  def preventDefault(): Unit
}

object PreventableExceptionThrownEvent {
  @scala.inline
  def apply(
    column: Double,
    line: Double,
    message: String,
    originalError: Error,
    preventDefault: () => Unit,
    url: String
  ): PreventableExceptionThrownEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventableExceptionThrownEvent]
  }
}

