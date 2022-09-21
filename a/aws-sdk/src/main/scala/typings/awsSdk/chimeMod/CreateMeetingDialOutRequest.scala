package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMeetingDialOutRequest extends StObject {
  
  /**
    * Phone number used as the caller ID when the remote party receives a call.
    */
  var FromPhoneNumber: E164PhoneNumber
  
  /**
    * Token used by the Amazon Chime SDK attendee. Call the CreateAttendee action to get a join token.
    */
  var JoinToken: JoinTokenString
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString
  
  /**
    * Phone number called when inviting someone to a meeting.
    */
  var ToPhoneNumber: E164PhoneNumber
}
object CreateMeetingDialOutRequest {
  
  inline def apply(
    FromPhoneNumber: E164PhoneNumber,
    JoinToken: JoinTokenString,
    MeetingId: GuidString,
    ToPhoneNumber: E164PhoneNumber
  ): CreateMeetingDialOutRequest = {
    val __obj = js.Dynamic.literal(FromPhoneNumber = FromPhoneNumber.asInstanceOf[js.Any], JoinToken = JoinToken.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any], ToPhoneNumber = ToPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingDialOutRequest]
  }
  
  extension [Self <: CreateMeetingDialOutRequest](x: Self) {
    
    inline def setFromPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "FromPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setJoinToken(value: JoinTokenString): Self = StObject.set(x, "JoinToken", value.asInstanceOf[js.Any])
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
    
    inline def setToPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "ToPhoneNumber", value.asInstanceOf[js.Any])
  }
}
