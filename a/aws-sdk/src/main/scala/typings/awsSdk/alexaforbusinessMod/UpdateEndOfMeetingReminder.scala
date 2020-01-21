package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndOfMeetingReminder extends js.Object {
  /**
    * Whether an end of meeting reminder is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * Updates settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending. 
    */
  var ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList] = js.native
  /**
    * The type of sound that users hear during the end of meeting reminder. 
    */
  var ReminderType: js.UndefOr[EndOfMeetingReminderType] = js.native
}

object UpdateEndOfMeetingReminder {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    ReminderAtMinutes: EndOfMeetingReminderMinutesList = null,
    ReminderType: EndOfMeetingReminderType = null
  ): UpdateEndOfMeetingReminder = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (ReminderAtMinutes != null) __obj.updateDynamic("ReminderAtMinutes")(ReminderAtMinutes.asInstanceOf[js.Any])
    if (ReminderType != null) __obj.updateDynamic("ReminderType")(ReminderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndOfMeetingReminder]
  }
}

