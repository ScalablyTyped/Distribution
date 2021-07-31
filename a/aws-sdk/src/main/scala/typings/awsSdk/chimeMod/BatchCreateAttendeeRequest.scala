package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateAttendeeRequest extends StObject {
  
  /**
    * The request containing the attendees to create.
    */
  var Attendees: CreateAttendeeRequestItemList
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString
}
object BatchCreateAttendeeRequest {
  
  @scala.inline
  def apply(Attendees: CreateAttendeeRequestItemList, MeetingId: GuidString): BatchCreateAttendeeRequest = {
    val __obj = js.Dynamic.literal(Attendees = Attendees.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateAttendeeRequest]
  }
  
  @scala.inline
  implicit class BatchCreateAttendeeRequestMutableBuilder[Self <: BatchCreateAttendeeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttendees(value: CreateAttendeeRequestItemList): Self = StObject.set(x, "Attendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeesVarargs(value: CreateAttendeeRequestItem*): Self = StObject.set(x, "Attendees", js.Array(value :_*))
    
    @scala.inline
    def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
  }
}
