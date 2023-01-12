package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAttendeeCapabilitiesRequest extends StObject {
  
  /**
    * The ID of the attendee associated with the update request.
    */
  var AttendeeId: GuidString
  
  /**
    * The capabilties that you want to update.
    */
  var Capabilities: AttendeeCapabilities
  
  /**
    * The ID of the meeting associated with the update request.
    */
  var MeetingId: GuidString
}
object UpdateAttendeeCapabilitiesRequest {
  
  inline def apply(AttendeeId: GuidString, Capabilities: AttendeeCapabilities, MeetingId: GuidString): UpdateAttendeeCapabilitiesRequest = {
    val __obj = js.Dynamic.literal(AttendeeId = AttendeeId.asInstanceOf[js.Any], Capabilities = Capabilities.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAttendeeCapabilitiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAttendeeCapabilitiesRequest] (val x: Self) extends AnyVal {
    
    inline def setAttendeeId(value: GuidString): Self = StObject.set(x, "AttendeeId", value.asInstanceOf[js.Any])
    
    inline def setCapabilities(value: AttendeeCapabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
  }
}
