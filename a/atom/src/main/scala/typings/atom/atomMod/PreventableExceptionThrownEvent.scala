package typings.atom.atomMod

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
    val __obj = js.Dynamic.literal(column = column, line = line, message = message, originalError = originalError, preventDefault = js.Any.fromFunction0(preventDefault), url = url)
  
    __obj.asInstanceOf[PreventableExceptionThrownEvent]
  }
}

