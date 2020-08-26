package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewContactEvent extends js.Object {
  /** The ID of the viewed contact. */
  var contactId: String = js.native
}

object ViewContactEvent {
  @scala.inline
  def apply(contactId: String): ViewContactEvent = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewContactEvent]
  }
  @scala.inline
  implicit class ViewContactEventOps[Self <: ViewContactEvent] (val x: Self) extends AnyVal {
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
    def setContactId(value: String): Self = this.set("contactId", value.asInstanceOf[js.Any])
  }
  
}

