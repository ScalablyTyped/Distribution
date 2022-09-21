package typings.awsSdk.chimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateAttendeeCapabilitiesExceptRequest extends StObject {
  
  /**
    * The capabilities (audio, video, or content) that you want to update.
    */
  var Capabilities: AttendeeCapabilities
  
  /**
    * The AttendeeIDs that you want to exclude from one or more capabilities.
    */
  var ExcludedAttendeeIds: AttendeeIdsList
  
  /**
    * The ID of the meeting associated with the update request.
    */
  var MeetingId: GuidString
}
object BatchUpdateAttendeeCapabilitiesExceptRequest {
  
  inline def apply(Capabilities: AttendeeCapabilities, ExcludedAttendeeIds: AttendeeIdsList, MeetingId: GuidString): BatchUpdateAttendeeCapabilitiesExceptRequest = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], ExcludedAttendeeIds = ExcludedAttendeeIds.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateAttendeeCapabilitiesExceptRequest]
  }
  
  extension [Self <: BatchUpdateAttendeeCapabilitiesExceptRequest](x: Self) {
    
    inline def setCapabilities(value: AttendeeCapabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setExcludedAttendeeIds(value: AttendeeIdsList): Self = StObject.set(x, "ExcludedAttendeeIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedAttendeeIdsVarargs(value: AttendeeIdItem*): Self = StObject.set(x, "ExcludedAttendeeIds", js.Array(value*))
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
  }
}
