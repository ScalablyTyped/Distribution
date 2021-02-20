package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMeetingResponse extends StObject {
  
  /**
    * The meeting information, including the meeting ID and MediaPlacement.
    */
  var Meeting: js.UndefOr[typings.awsSdk.chimeMod.Meeting] = js.native
}
object CreateMeetingResponse {
  
  @scala.inline
  def apply(): CreateMeetingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMeetingResponse]
  }
  
  @scala.inline
  implicit class CreateMeetingResponseMutableBuilder[Self <: CreateMeetingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeeting(value: Meeting): Self = StObject.set(x, "Meeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingUndefined: Self = StObject.set(x, "Meeting", js.undefined)
  }
}
