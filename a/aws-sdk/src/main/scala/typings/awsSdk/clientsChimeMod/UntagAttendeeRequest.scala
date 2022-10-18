package typings.awsSdk.clientsChimeMod

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
  
  inline def apply(AttendeeId: GuidString, MeetingId: GuidString, TagKeys: AttendeeTagKeyList): UntagAttendeeRequest = {
    val __obj = js.Dynamic.literal(AttendeeId = AttendeeId.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagAttendeeRequest]
  }
  
  extension [Self <: UntagAttendeeRequest](x: Self) {
    
    inline def setAttendeeId(value: GuidString): Self = StObject.set(x, "AttendeeId", value.asInstanceOf[js.Any])
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: AttendeeTagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
