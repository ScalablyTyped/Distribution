package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndOfMeetingReminder extends js.Object {
  /**
    * Whether an end of meeting reminder is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * A range of 3 to 15 minutes that determines when the reminder begins.
    */
  var ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList] = js.native
  /**
    * The type of sound that users hear during the end of meeting reminder. 
    */
  var ReminderType: js.UndefOr[EndOfMeetingReminderType] = js.native
}

object EndOfMeetingReminder {
  @scala.inline
  def apply(): EndOfMeetingReminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndOfMeetingReminder]
  }
  @scala.inline
  implicit class EndOfMeetingReminderOps[Self <: EndOfMeetingReminder] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setReminderAtMinutesVarargs(value: Minutes*): Self = this.set("ReminderAtMinutes", js.Array(value :_*))
    @scala.inline
    def setReminderAtMinutes(value: EndOfMeetingReminderMinutesList): Self = this.set("ReminderAtMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReminderAtMinutes: Self = this.set("ReminderAtMinutes", js.undefined)
    @scala.inline
    def setReminderType(value: EndOfMeetingReminderType): Self = this.set("ReminderType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReminderType: Self = this.set("ReminderType", js.undefined)
  }
  
}

