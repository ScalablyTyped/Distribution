package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldMessages extends js.Object {
  var newMessages: Double = js.native
  var oldMessages: Double = js.native
}

object OldMessages {
  @scala.inline
  def apply(newMessages: Double, oldMessages: Double): OldMessages = {
    val __obj = js.Dynamic.literal(newMessages = newMessages.asInstanceOf[js.Any], oldMessages = oldMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldMessages]
  }
  @scala.inline
  implicit class OldMessagesOps[Self <: OldMessages] (val x: Self) extends AnyVal {
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
    def setNewMessages(value: Double): Self = this.set("newMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldMessages(value: Double): Self = this.set("oldMessages", value.asInstanceOf[js.Any])
  }
  
}

