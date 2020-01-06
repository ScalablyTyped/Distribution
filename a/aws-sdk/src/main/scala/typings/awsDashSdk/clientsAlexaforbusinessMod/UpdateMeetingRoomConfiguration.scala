package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMeetingRoomConfiguration extends js.Object {
  /**
    * Settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending. 
    */
  var EndOfMeetingReminder: js.UndefOr[UpdateEndOfMeetingReminder] = js.native
  /**
    * Settings to automatically book an available room available for a configured duration when joining a meeting with Alexa.
    */
  var InstantBooking: js.UndefOr[UpdateInstantBooking] = js.native
  /**
    * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not checked into to make the room available for others. Users can check in by joining the meeting with Alexa or an AVS device, or by saying “Alexa, check in.” 
    */
  var RequireCheckIn: js.UndefOr[UpdateRequireCheckIn] = js.native
  /**
    * Whether room utilization metrics are enabled or not.
    */
  var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.native
}

object UpdateMeetingRoomConfiguration {
  @scala.inline
  def apply(
    EndOfMeetingReminder: UpdateEndOfMeetingReminder = null,
    InstantBooking: UpdateInstantBooking = null,
    RequireCheckIn: UpdateRequireCheckIn = null,
    RoomUtilizationMetricsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateMeetingRoomConfiguration = {
    val __obj = js.Dynamic.literal()
    if (EndOfMeetingReminder != null) __obj.updateDynamic("EndOfMeetingReminder")(EndOfMeetingReminder.asInstanceOf[js.Any])
    if (InstantBooking != null) __obj.updateDynamic("InstantBooking")(InstantBooking.asInstanceOf[js.Any])
    if (RequireCheckIn != null) __obj.updateDynamic("RequireCheckIn")(RequireCheckIn.asInstanceOf[js.Any])
    if (!js.isUndefined(RoomUtilizationMetricsEnabled)) __obj.updateDynamic("RoomUtilizationMetricsEnabled")(RoomUtilizationMetricsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMeetingRoomConfiguration]
  }
}

