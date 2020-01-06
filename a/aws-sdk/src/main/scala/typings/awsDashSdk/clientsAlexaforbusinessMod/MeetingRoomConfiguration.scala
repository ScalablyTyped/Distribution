package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeetingRoomConfiguration extends js.Object {
  /**
    * Settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending. 
    */
  var EndOfMeetingReminder: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.EndOfMeetingReminder] = js.native
  /**
    * Settings to automatically book the room if available for a configured duration when joining a meeting with Alexa. 
    */
  var InstantBooking: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.InstantBooking] = js.native
  /**
    * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not checked into. This makes the room available for others. Users can check in by joining the meeting with Alexa or an AVS device, or by saying “Alexa, check in.” 
    */
  var RequireCheckIn: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.RequireCheckIn] = js.native
  /**
    * Whether room utilization metrics are enabled or not.
    */
  var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.native
}

object MeetingRoomConfiguration {
  @scala.inline
  def apply(
    EndOfMeetingReminder: EndOfMeetingReminder = null,
    InstantBooking: InstantBooking = null,
    RequireCheckIn: RequireCheckIn = null,
    RoomUtilizationMetricsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): MeetingRoomConfiguration = {
    val __obj = js.Dynamic.literal()
    if (EndOfMeetingReminder != null) __obj.updateDynamic("EndOfMeetingReminder")(EndOfMeetingReminder.asInstanceOf[js.Any])
    if (InstantBooking != null) __obj.updateDynamic("InstantBooking")(InstantBooking.asInstanceOf[js.Any])
    if (RequireCheckIn != null) __obj.updateDynamic("RequireCheckIn")(RequireCheckIn.asInstanceOf[js.Any])
    if (!js.isUndefined(RoomUtilizationMetricsEnabled)) __obj.updateDynamic("RoomUtilizationMetricsEnabled")(RoomUtilizationMetricsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeetingRoomConfiguration]
  }
}

