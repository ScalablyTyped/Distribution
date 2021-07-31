package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMeetingTagsRequest extends StObject {
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString
}
object ListMeetingTagsRequest {
  
  @scala.inline
  def apply(MeetingId: GuidString): ListMeetingTagsRequest = {
    val __obj = js.Dynamic.literal(MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMeetingTagsRequest]
  }
  
  @scala.inline
  implicit class ListMeetingTagsRequestMutableBuilder[Self <: ListMeetingTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
  }
}
