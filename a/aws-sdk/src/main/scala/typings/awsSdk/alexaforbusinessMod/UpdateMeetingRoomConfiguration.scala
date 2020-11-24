package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): UpdateMeetingRoomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMeetingRoomConfiguration]
  }
  
  @scala.inline
  implicit class UpdateMeetingRoomConfigurationOps[Self <: UpdateMeetingRoomConfiguration] (val x: Self) extends AnyVal {
    
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
    def setEndOfMeetingReminder(value: UpdateEndOfMeetingReminder): Self = this.set("EndOfMeetingReminder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOfMeetingReminder: Self = this.set("EndOfMeetingReminder", js.undefined)
    
    @scala.inline
    def setInstantBooking(value: UpdateInstantBooking): Self = this.set("InstantBooking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstantBooking: Self = this.set("InstantBooking", js.undefined)
    
    @scala.inline
    def setRequireCheckIn(value: UpdateRequireCheckIn): Self = this.set("RequireCheckIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireCheckIn: Self = this.set("RequireCheckIn", js.undefined)
    
    @scala.inline
    def setRoomUtilizationMetricsEnabled(value: Boolean): Self = this.set("RoomUtilizationMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomUtilizationMetricsEnabled: Self = this.set("RoomUtilizationMetricsEnabled", js.undefined)
  }
}
