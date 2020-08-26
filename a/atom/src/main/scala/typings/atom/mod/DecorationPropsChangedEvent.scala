package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorationPropsChangedEvent extends js.Object {
  /** Object the new parameters the decoration now has */
  var newProperties: DecorationOptions = js.native
  /** Object the old parameters the decoration used to have. */
  var oldProperties: DecorationOptions = js.native
}

object DecorationPropsChangedEvent {
  @scala.inline
  def apply(newProperties: DecorationOptions, oldProperties: DecorationOptions): DecorationPropsChangedEvent = {
    val __obj = js.Dynamic.literal(newProperties = newProperties.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationPropsChangedEvent]
  }
  @scala.inline
  implicit class DecorationPropsChangedEventOps[Self <: DecorationPropsChangedEvent] (val x: Self) extends AnyVal {
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
    def setNewProperties(value: DecorationOptions): Self = this.set("newProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldProperties(value: DecorationOptions): Self = this.set("oldProperties", value.asInstanceOf[js.Any])
  }
  
}

