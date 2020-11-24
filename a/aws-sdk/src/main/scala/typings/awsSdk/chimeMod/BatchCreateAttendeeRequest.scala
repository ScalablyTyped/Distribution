package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateAttendeeRequest extends js.Object {
  
  /**
    * The request containing the attendees to create.
    */
  var Attendees: CreateAttendeeRequestItemList = js.native
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
}
object BatchCreateAttendeeRequest {
  
  @scala.inline
  def apply(Attendees: CreateAttendeeRequestItemList, MeetingId: GuidString): BatchCreateAttendeeRequest = {
    val __obj = js.Dynamic.literal(Attendees = Attendees.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateAttendeeRequest]
  }
  
  @scala.inline
  implicit class BatchCreateAttendeeRequestOps[Self <: BatchCreateAttendeeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttendeesVarargs(value: CreateAttendeeRequestItem*): Self = this.set("Attendees", js.Array(value :_*))
    
    @scala.inline
    def setAttendees(value: CreateAttendeeRequestItemList): Self = this.set("Attendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingId(value: GuidString): Self = this.set("MeetingId", value.asInstanceOf[js.Any])
  }
}
