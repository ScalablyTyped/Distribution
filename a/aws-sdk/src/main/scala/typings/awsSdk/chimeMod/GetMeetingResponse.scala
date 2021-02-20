package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMeetingResponse extends StObject {
  
  /**
    * The Amazon Chime SDK meeting information.
    */
  var Meeting: js.UndefOr[typings.awsSdk.chimeMod.Meeting] = js.native
}
object GetMeetingResponse {
  
  @scala.inline
  def apply(): GetMeetingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMeetingResponse]
  }
  
  @scala.inline
  implicit class GetMeetingResponseMutableBuilder[Self <: GetMeetingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeeting(value: Meeting): Self = StObject.set(x, "Meeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingUndefined: Self = StObject.set(x, "Meeting", js.undefined)
  }
}
