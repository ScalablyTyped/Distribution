package typings.awsDashSdk.clientsAlexaforbusinessMod

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
}

