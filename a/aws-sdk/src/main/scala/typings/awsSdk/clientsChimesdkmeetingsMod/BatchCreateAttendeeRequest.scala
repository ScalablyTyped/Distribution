package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateAttendeeRequest extends StObject {
  
  /**
    * The attendee information, including attendees' IDs and join tokens.
    */
  var Attendees: CreateAttendeeRequestItemList
  
  /**
    * The Amazon Chime SDK ID of the meeting to which you're adding attendees.
    */
  var MeetingId: GuidString
}
object BatchCreateAttendeeRequest {
  
  inline def apply(Attendees: CreateAttendeeRequestItemList, MeetingId: GuidString): BatchCreateAttendeeRequest = {
    val __obj = js.Dynamic.literal(Attendees = Attendees.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateAttendeeRequest]
  }
  
  extension [Self <: BatchCreateAttendeeRequest](x: Self) {
    
    inline def setAttendees(value: CreateAttendeeRequestItemList): Self = StObject.set(x, "Attendees", value.asInstanceOf[js.Any])
    
    inline def setAttendeesVarargs(value: CreateAttendeeRequestItem*): Self = StObject.set(x, "Attendees", js.Array(value*))
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
  }
}
