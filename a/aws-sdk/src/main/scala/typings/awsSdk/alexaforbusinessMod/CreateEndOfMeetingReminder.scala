package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndOfMeetingReminder extends js.Object {
  /**
    * Whether an end of meeting reminder is enabled or not.
    */
  var Enabled: Boolean = js.native
  /**
    *  A range of 3 to 15 minutes that determines when the reminder begins.
    */
  var ReminderAtMinutes: EndOfMeetingReminderMinutesList = js.native
  /**
    * The type of sound that users hear during the end of meeting reminder. 
    */
  var ReminderType: EndOfMeetingReminderType = js.native
}

object CreateEndOfMeetingReminder {
  @scala.inline
  def apply(
    Enabled: Boolean,
    ReminderAtMinutes: EndOfMeetingReminderMinutesList,
    ReminderType: EndOfMeetingReminderType
  ): CreateEndOfMeetingReminder = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ReminderAtMinutes = ReminderAtMinutes.asInstanceOf[js.Any], ReminderType = ReminderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndOfMeetingReminder]
  }
  @scala.inline
  implicit class CreateEndOfMeetingReminderOps[Self <: CreateEndOfMeetingReminder] (val x: Self) extends AnyVal {
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
    def setReminderAtMinutesVarargs(value: Minutes*): Self = this.set("ReminderAtMinutes", js.Array(value :_*))
    @scala.inline
    def setReminderAtMinutes(value: EndOfMeetingReminderMinutesList): Self = this.set("ReminderAtMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setReminderType(value: EndOfMeetingReminderType): Self = this.set("ReminderType", value.asInstanceOf[js.Any])
  }
  
}

