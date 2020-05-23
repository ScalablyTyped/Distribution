package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMeetingRoomConfiguration extends js.Object {
  var EndOfMeetingReminder: js.UndefOr[CreateEndOfMeetingReminder] = js.native
  /**
    * Settings to automatically book a room for a configured duration if it's free when joining a meeting with Alexa.
    */
  var InstantBooking: js.UndefOr[CreateInstantBooking] = js.native
  /**
    * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not checked into to make the room available for others. Users can check in by joining the meeting with Alexa or an AVS device, or by saying “Alexa, check in.”
    */
  var RequireCheckIn: js.UndefOr[CreateRequireCheckIn] = js.native
  /**
    * Whether room utilization metrics are enabled or not.
    */
  var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.native
}

object CreateMeetingRoomConfiguration {
  @scala.inline
  def apply(
    EndOfMeetingReminder: CreateEndOfMeetingReminder = null,
    InstantBooking: CreateInstantBooking = null,
    RequireCheckIn: CreateRequireCheckIn = null,
    RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.undefined
  ): CreateMeetingRoomConfiguration = {
    val __obj = js.Dynamic.literal()
    if (EndOfMeetingReminder != null) __obj.updateDynamic("EndOfMeetingReminder")(EndOfMeetingReminder.asInstanceOf[js.Any])
    if (InstantBooking != null) __obj.updateDynamic("InstantBooking")(InstantBooking.asInstanceOf[js.Any])
    if (RequireCheckIn != null) __obj.updateDynamic("RequireCheckIn")(RequireCheckIn.asInstanceOf[js.Any])
    if (!js.isUndefined(RoomUtilizationMetricsEnabled)) __obj.updateDynamic("RoomUtilizationMetricsEnabled")(RoomUtilizationMetricsEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingRoomConfiguration]
  }
}

