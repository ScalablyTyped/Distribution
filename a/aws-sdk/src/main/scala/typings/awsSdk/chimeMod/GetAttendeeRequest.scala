package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAttendeeRequest extends StObject {
  
  /**
    * The Amazon Chime SDK attendee ID.
    */
  var AttendeeId: GuidString = js.native
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
}
object GetAttendeeRequest {
  
  @scala.inline
  def apply(AttendeeId: GuidString, MeetingId: GuidString): GetAttendeeRequest = {
    val __obj = js.Dynamic.literal(AttendeeId = AttendeeId.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttendeeRequest]
  }
  
  @scala.inline
  implicit class GetAttendeeRequestMutableBuilder[Self <: GetAttendeeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttendeeId(value: GuidString): Self = StObject.set(x, "AttendeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
  }
}
