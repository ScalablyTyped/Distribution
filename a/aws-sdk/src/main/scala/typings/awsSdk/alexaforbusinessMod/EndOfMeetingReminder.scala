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
  def apply(
    Enabled: js.UndefOr[Boolean] = js.undefined,
    ReminderAtMinutes: EndOfMeetingReminderMinutesList = null,
    ReminderType: EndOfMeetingReminderType = null
  ): EndOfMeetingReminder = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (ReminderAtMinutes != null) __obj.updateDynamic("ReminderAtMinutes")(ReminderAtMinutes.asInstanceOf[js.Any])
    if (ReminderType != null) __obj.updateDynamic("ReminderType")(ReminderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndOfMeetingReminder]
  }
}

