package typings.atom.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreventableExceptionThrownEvent extends ExceptionThrownEvent {
  def preventDefault(): Unit = js.native
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
  @scala.inline
  implicit class PreventableExceptionThrownEventOps[Self <: PreventableExceptionThrownEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
  }
  
}

