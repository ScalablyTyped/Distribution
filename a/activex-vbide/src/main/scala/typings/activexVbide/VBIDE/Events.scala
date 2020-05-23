package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  @JSName("VBIDE.Events_typekey")
  var VBIDEDotEvents_typekey: Events
  def CommandBarEvents(CommandBarControl: js.Any): typings.activexVbide.VBIDE.CommandBarEvents
  def ReferencesEvents(VBProject: VBProject): typings.activexVbide.VBIDE.ReferencesEvents
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
}

