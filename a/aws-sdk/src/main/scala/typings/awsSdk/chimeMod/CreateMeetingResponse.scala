package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMeetingResponse extends js.Object {
  
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
  implicit class CreateMeetingResponseOps[Self <: CreateMeetingResponse] (val x: Self) extends AnyVal {
    
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
    def setMeeting(value: Meeting): Self = this.set("Meeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeeting: Self = this.set("Meeting", js.undefined)
  }
}
