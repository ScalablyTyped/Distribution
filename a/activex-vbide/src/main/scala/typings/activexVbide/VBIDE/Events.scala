package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  @JSName("VBIDE.Events_typekey")
  var VBIDEDotEvents_typekey: Events = js.native
  def CommandBarEvents(CommandBarControl: js.Any): typings.activexVbide.VBIDE.CommandBarEvents = js.native
  def ReferencesEvents(VBProject: VBProject): typings.activexVbide.VBIDE.ReferencesEvents = js.native
}

object Events {
  @scala.inline
  def apply(
    CommandBarEvents: js.Any => CommandBarEvents,
    ReferencesEvents: VBProject => ReferencesEvents,
    VBIDEDotEvents_typekey: Events
  ): Events = {
    val __obj = js.Dynamic.literal(CommandBarEvents = js.Any.fromFunction1(CommandBarEvents), ReferencesEvents = js.Any.fromFunction1(ReferencesEvents))
    __obj.updateDynamic("VBIDE.Events_typekey")(VBIDEDotEvents_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
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
    def setCommandBarEvents(value: js.Any => CommandBarEvents): Self = this.set("CommandBarEvents", js.Any.fromFunction1(value))
    @scala.inline
    def setReferencesEvents(value: VBProject => ReferencesEvents): Self = this.set("ReferencesEvents", js.Any.fromFunction1(value))
    @scala.inline
    def setVBIDEDotEvents_typekey(value: Events): Self = this.set("VBIDE.Events_typekey", value.asInstanceOf[js.Any])
  }
  
}

