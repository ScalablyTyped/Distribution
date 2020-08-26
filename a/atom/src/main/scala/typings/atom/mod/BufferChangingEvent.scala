package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferChangingEvent extends js.Object {
  /** Range of the old text. */
  var oldRange: Range = js.native
}

object BufferChangingEvent {
  @scala.inline
  def apply(oldRange: Range): BufferChangingEvent = {
    val __obj = js.Dynamic.literal(oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferChangingEvent]
  }
  @scala.inline
  implicit class BufferChangingEventOps[Self <: BufferChangingEvent] (val x: Self) extends AnyVal {
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
    def setOldRange(value: Range): Self = this.set("oldRange", value.asInstanceOf[js.Any])
  }
  
}

