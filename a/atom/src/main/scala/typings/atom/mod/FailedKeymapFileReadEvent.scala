package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedKeymapFileReadEvent extends js.Object {
  /** The error message. */
  var message: String = js.native
  /** The error stack trace. */
  var stack: String = js.native
}

object FailedKeymapFileReadEvent {
  @scala.inline
  def apply(message: String, stack: String): FailedKeymapFileReadEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedKeymapFileReadEvent]
  }
  @scala.inline
  implicit class FailedKeymapFileReadEventOps[Self <: FailedKeymapFileReadEvent] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
  }
  
}

