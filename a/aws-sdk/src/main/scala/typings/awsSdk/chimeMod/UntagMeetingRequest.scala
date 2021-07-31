package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagMeetingRequest extends StObject {
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString
  
  /**
    * The tag keys.
    */
  var TagKeys: MeetingTagKeyList
}
object UntagMeetingRequest {
  
  @scala.inline
  def apply(MeetingId: GuidString, TagKeys: MeetingTagKeyList): UntagMeetingRequest = {
    val __obj = js.Dynamic.literal(MeetingId = MeetingId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagMeetingRequest]
  }
  
  @scala.inline
  implicit class UntagMeetingRequestMutableBuilder[Self <: UntagMeetingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: MeetingTagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
