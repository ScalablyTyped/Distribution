package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMeetingRoomConfiguration extends StObject {
  
  /**
    * Settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending. 
    */
  var EndOfMeetingReminder: js.UndefOr[UpdateEndOfMeetingReminder] = js.undefined
  
  /**
    * Settings to automatically book an available room available for a configured duration when joining a meeting with Alexa.
    */
  var InstantBooking: js.UndefOr[UpdateInstantBooking] = js.undefined
  
  /**
    * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not checked into to make the room available for others. Users can check in by joining the meeting with Alexa or an AVS device, or by saying “Alexa, check in.” 
    */
  var RequireCheckIn: js.UndefOr[UpdateRequireCheckIn] = js.undefined
  
  /**
    * Whether room utilization metrics are enabled or not.
    */
  var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.undefined
}
object UpdateMeetingRoomConfiguration {
  
  @scala.inline
  def apply(): UpdateMeetingRoomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMeetingRoomConfiguration]
  }
  
  @scala.inline
  implicit class UpdateMeetingRoomConfigurationMutableBuilder[Self <: UpdateMeetingRoomConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndOfMeetingReminder(value: UpdateEndOfMeetingReminder): Self = StObject.set(x, "EndOfMeetingReminder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOfMeetingReminderUndefined: Self = StObject.set(x, "EndOfMeetingReminder", js.undefined)
    
    @scala.inline
    def setInstantBooking(value: UpdateInstantBooking): Self = StObject.set(x, "InstantBooking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstantBookingUndefined: Self = StObject.set(x, "InstantBooking", js.undefined)
    
    @scala.inline
    def setRequireCheckIn(value: UpdateRequireCheckIn): Self = StObject.set(x, "RequireCheckIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireCheckInUndefined: Self = StObject.set(x, "RequireCheckIn", js.undefined)
    
    @scala.inline
    def setRoomUtilizationMetricsEnabled(value: Boolean): Self = StObject.set(x, "RoomUtilizationMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomUtilizationMetricsEnabledUndefined: Self = StObject.set(x, "RoomUtilizationMetricsEnabled", js.undefined)
  }
}
