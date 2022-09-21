package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAttendeeRequest extends StObject {
  
  /**
    * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a builder application.
    */
  var ExternalUserId: ExternalUserIdType
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString
  
  /**
    * The tag key-value pairs.
    */
  var Tags: js.UndefOr[AttendeeTagList] = js.undefined
}
object CreateAttendeeRequest {
  
  inline def apply(ExternalUserId: ExternalUserIdType, MeetingId: GuidString): CreateAttendeeRequest = {
    val __obj = js.Dynamic.literal(ExternalUserId = ExternalUserId.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAttendeeRequest]
  }
  
  extension [Self <: CreateAttendeeRequest](x: Self) {
    
    inline def setExternalUserId(value: ExternalUserIdType): Self = StObject.set(x, "ExternalUserId", value.asInstanceOf[js.Any])
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: AttendeeTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
