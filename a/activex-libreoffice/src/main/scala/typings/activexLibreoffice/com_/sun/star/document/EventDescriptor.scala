package typings.activexLibreoffice.com_.sun.star.document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an event binding for a document or a document content
  * @see Events
  * @see XEventsSupplier
  */
@js.native
trait EventDescriptor extends js.Object {
  /**
    * specifies the type of the event handler
    *
    * Usually this is one of the following: "None""StarBasic""JavaScript""Presentation" This list is extensible.
    */
  var EventType: String = js.native
  /** specifies the script source code */
  var Script: String = js.native
}

object EventDescriptor {
  @scala.inline
  def apply(EventType: String, Script: String): EventDescriptor = {
    val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], Script = Script.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDescriptor]
  }
  @scala.inline
  implicit class EventDescriptorOps[Self <: EventDescriptor] (val x: Self) extends AnyVal {
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
    def setEventType(value: String): Self = this.set("EventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: String): Self = this.set("Script", value.asInstanceOf[js.Any])
  }
  
}

