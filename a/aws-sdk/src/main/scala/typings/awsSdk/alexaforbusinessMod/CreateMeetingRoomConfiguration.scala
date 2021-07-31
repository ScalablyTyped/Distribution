package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMeetingRoomConfiguration extends StObject {
  
  var EndOfMeetingReminder: js.UndefOr[CreateEndOfMeetingReminder] = js.undefined
  
  /**
    * Settings to automatically book a room for a configured duration if it's free when joining a meeting with Alexa.
    */
  var InstantBooking: js.UndefOr[CreateInstantBooking] = js.undefined
  
  /**
    * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not checked into to make the room available for others. Users can check in by joining the meeting with Alexa or an AVS device, or by saying “Alexa, check in.”
    */
  var RequireCheckIn: js.UndefOr[CreateRequireCheckIn] = js.undefined
  
  /**
    * Whether room utilization metrics are enabled or not.
    */
  var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.undefined
}
object CreateMeetingRoomConfiguration {
  
  @scala.inline
  def apply(): CreateMeetingRoomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMeetingRoomConfiguration]
  }
  
  @scala.inline
  implicit class CreateMeetingRoomConfigurationMutableBuilder[Self <: CreateMeetingRoomConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndOfMeetingReminder(value: CreateEndOfMeetingReminder): Self = StObject.set(x, "EndOfMeetingReminder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOfMeetingReminderUndefined: Self = StObject.set(x, "EndOfMeetingReminder", js.undefined)
    
    @scala.inline
    def setInstantBooking(value: CreateInstantBooking): Self = StObject.set(x, "InstantBooking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstantBookingUndefined: Self = StObject.set(x, "InstantBooking", js.undefined)
    
    @scala.inline
    def setRequireCheckIn(value: CreateRequireCheckIn): Self = StObject.set(x, "RequireCheckIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireCheckInUndefined: Self = StObject.set(x, "RequireCheckIn", js.undefined)
    
    @scala.inline
    def setRoomUtilizationMetricsEnabled(value: Boolean): Self = StObject.set(x, "RoomUtilizationMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomUtilizationMetricsEnabledUndefined: Self = StObject.set(x, "RoomUtilizationMetricsEnabled", js.undefined)
  }
}
