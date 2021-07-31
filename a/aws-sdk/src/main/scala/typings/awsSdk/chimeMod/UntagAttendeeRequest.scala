package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagAttendeeRequest extends StObject {
  
  /**
    * The Amazon Chime SDK attendee ID.
    */
  var AttendeeId: GuidString
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString
  
  /**
    * The tag keys.
    */
  var TagKeys: AttendeeTagKeyList
}
object UntagAttendeeRequest {
  
  @scala.inline
  def apply(AttendeeId: GuidString, MeetingId: GuidString, TagKeys: AttendeeTagKeyList): UntagAttendeeRequest = {
    val __obj = js.Dynamic.literal(AttendeeId = AttendeeId.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagAttendeeRequest]
  }
  
  @scala.inline
  implicit class UntagAttendeeRequestMutableBuilder[Self <: UntagAttendeeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttendeeId(value: GuidString): Self = StObject.set(x, "AttendeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: AttendeeTagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
