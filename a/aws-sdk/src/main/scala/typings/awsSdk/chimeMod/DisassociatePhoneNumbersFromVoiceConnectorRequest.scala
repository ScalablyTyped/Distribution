package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociatePhoneNumbersFromVoiceConnectorRequest extends StObject {
  
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: E164PhoneNumberList
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object DisassociatePhoneNumbersFromVoiceConnectorRequest {
  
  @scala.inline
  def apply(E164PhoneNumbers: E164PhoneNumberList, VoiceConnectorId: NonEmptyString): DisassociatePhoneNumbersFromVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(E164PhoneNumbers = E164PhoneNumbers.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorRequest]
  }
  
  @scala.inline
  implicit class DisassociatePhoneNumbersFromVoiceConnectorRequestMutableBuilder[Self <: DisassociatePhoneNumbersFromVoiceConnectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE164PhoneNumbers(value: E164PhoneNumberList): Self = StObject.set(x, "E164PhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE164PhoneNumbersVarargs(value: E164PhoneNumber*): Self = StObject.set(x, "E164PhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
