package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeetingRoomConfiguration extends js.Object {
  /**
    * Settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending. 
    */
  var EndOfMeetingReminder: js.UndefOr[typings.awsSdk.alexaforbusinessMod.EndOfMeetingReminder] = js.native
  /**
    * Settings to automatically book the room if available for a configured duration when joining a meeting with Alexa. 
    */
  var InstantBooking: js.UndefOr[typings.awsSdk.alexaforbusinessMod.InstantBooking] = js.native
  /**
    * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not checked into. This makes the room available for others. Users can check in by joining the meeting with Alexa or an AVS device, or by saying “Alexa, check in.” 
    */
  var RequireCheckIn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.RequireCheckIn] = js.native
  /**
    * Whether room utilization metrics are enabled or not.
    */
  var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.native
}

object MeetingRoomConfiguration {
  @scala.inline
  def apply(): MeetingRoomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingRoomConfiguration]
  }
  @scala.inline
  implicit class MeetingRoomConfigurationOps[Self <: MeetingRoomConfiguration] (val x: Self) extends AnyVal {
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
    def setEndOfMeetingReminder(value: EndOfMeetingReminder): Self = this.set("EndOfMeetingReminder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOfMeetingReminder: Self = this.set("EndOfMeetingReminder", js.undefined)
    @scala.inline
    def setInstantBooking(value: InstantBooking): Self = this.set("InstantBooking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstantBooking: Self = this.set("InstantBooking", js.undefined)
    @scala.inline
    def setRequireCheckIn(value: RequireCheckIn): Self = this.set("RequireCheckIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireCheckIn: Self = this.set("RequireCheckIn", js.undefined)
    @scala.inline
    def setRoomUtilizationMetricsEnabled(value: Boolean): Self = this.set("RoomUtilizationMetricsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomUtilizationMetricsEnabled: Self = this.set("RoomUtilizationMetricsEnabled", js.undefined)
  }
  
}

