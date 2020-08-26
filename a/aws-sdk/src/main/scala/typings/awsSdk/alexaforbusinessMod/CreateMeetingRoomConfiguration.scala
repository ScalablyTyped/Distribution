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
  def apply(): CreateMeetingRoomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMeetingRoomConfiguration]
  }
  @scala.inline
  implicit class CreateMeetingRoomConfigurationOps[Self <: CreateMeetingRoomConfiguration] (val x: Self) extends AnyVal {
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
    def setEndOfMeetingReminder(value: CreateEndOfMeetingReminder): Self = this.set("EndOfMeetingReminder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOfMeetingReminder: Self = this.set("EndOfMeetingReminder", js.undefined)
    @scala.inline
    def setInstantBooking(value: CreateInstantBooking): Self = this.set("InstantBooking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstantBooking: Self = this.set("InstantBooking", js.undefined)
    @scala.inline
    def setRequireCheckIn(value: CreateRequireCheckIn): Self = this.set("RequireCheckIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireCheckIn: Self = this.set("RequireCheckIn", js.undefined)
    @scala.inline
    def setRoomUtilizationMetricsEnabled(value: Boolean): Self = this.set("RoomUtilizationMetricsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomUtilizationMetricsEnabled: Self = this.set("RoomUtilizationMetricsEnabled", js.undefined)
  }
  
}

