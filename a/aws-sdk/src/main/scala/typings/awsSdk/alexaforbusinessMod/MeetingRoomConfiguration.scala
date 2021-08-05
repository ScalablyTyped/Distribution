package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingRoomConfiguration extends StObject {
  
  /**
    * Settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending. 
    */
  var EndOfMeetingReminder: js.UndefOr[typings.awsSdk.alexaforbusinessMod.EndOfMeetingReminder] = js.undefined
  
  /**
    * Settings to automatically book the room if available for a configured duration when joining a meeting with Alexa. 
    */
  var InstantBooking: js.UndefOr[typings.awsSdk.alexaforbusinessMod.InstantBooking] = js.undefined
  
  /**
    * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not checked into. This makes the room available for others. Users can check in by joining the meeting with Alexa or an AVS device, or by saying “Alexa, check in.” 
    */
  var RequireCheckIn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.RequireCheckIn] = js.undefined
  
  /**
    * Whether room utilization metrics are enabled or not.
    */
  var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.undefined
}
object MeetingRoomConfiguration {
  
  inline def apply(): MeetingRoomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingRoomConfiguration]
  }
  
  extension [Self <: MeetingRoomConfiguration](x: Self) {
    
    inline def setEndOfMeetingReminder(value: EndOfMeetingReminder): Self = StObject.set(x, "EndOfMeetingReminder", value.asInstanceOf[js.Any])
    
    inline def setEndOfMeetingReminderUndefined: Self = StObject.set(x, "EndOfMeetingReminder", js.undefined)
    
    inline def setInstantBooking(value: InstantBooking): Self = StObject.set(x, "InstantBooking", value.asInstanceOf[js.Any])
    
    inline def setInstantBookingUndefined: Self = StObject.set(x, "InstantBooking", js.undefined)
    
    inline def setRequireCheckIn(value: RequireCheckIn): Self = StObject.set(x, "RequireCheckIn", value.asInstanceOf[js.Any])
    
    inline def setRequireCheckInUndefined: Self = StObject.set(x, "RequireCheckIn", js.undefined)
    
    inline def setRoomUtilizationMetricsEnabled(value: Boolean): Self = StObject.set(x, "RoomUtilizationMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setRoomUtilizationMetricsEnabledUndefined: Self = StObject.set(x, "RoomUtilizationMetricsEnabled", js.undefined)
  }
}
