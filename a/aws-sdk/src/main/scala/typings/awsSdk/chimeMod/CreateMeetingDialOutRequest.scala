package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMeetingDialOutRequest extends js.Object {
  
  /**
    * Phone number used as the caller ID when the remote party receives a call.
    */
  var FromPhoneNumber: E164PhoneNumber = js.native
  
  /**
    * Token used by the Amazon Chime SDK attendee. Call the  CreateAttendee API to get a join token. 
    */
  var JoinToken: JoinTokenString = js.native
  
  /**
    * The Amazon Chime SDK meeting ID. Type: String Pattern: [a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12} Required: No
    */
  var MeetingId: GuidString = js.native
  
  /**
    * Phone number called when inviting someone to a meeting.
    */
  var ToPhoneNumber: E164PhoneNumber = js.native
}
object CreateMeetingDialOutRequest {
  
  @scala.inline
  def apply(
    FromPhoneNumber: E164PhoneNumber,
    JoinToken: JoinTokenString,
    MeetingId: GuidString,
    ToPhoneNumber: E164PhoneNumber
  ): CreateMeetingDialOutRequest = {
    val __obj = js.Dynamic.literal(FromPhoneNumber = FromPhoneNumber.asInstanceOf[js.Any], JoinToken = JoinToken.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any], ToPhoneNumber = ToPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingDialOutRequest]
  }
  
  @scala.inline
  implicit class CreateMeetingDialOutRequestOps[Self <: CreateMeetingDialOutRequest] (val x: Self) extends AnyVal {
    
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
    def setFromPhoneNumber(value: E164PhoneNumber): Self = this.set("FromPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinToken(value: JoinTokenString): Self = this.set("JoinToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingId(value: GuidString): Self = this.set("MeetingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPhoneNumber(value: E164PhoneNumber): Self = this.set("ToPhoneNumber", value.asInstanceOf[js.Any])
  }
}
