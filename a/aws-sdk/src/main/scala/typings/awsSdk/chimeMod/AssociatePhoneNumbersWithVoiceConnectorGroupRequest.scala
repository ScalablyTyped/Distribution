package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatePhoneNumbersWithVoiceConnectorGroupRequest extends StObject {
  
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: E164PhoneNumberList
  
  /**
    * If true, associates the provided phone numbers with the provided Amazon Chime Voice Connector Group and removes any previously existing associations. If false, does not associate any phone numbers that have previously existing associations.
    */
  var ForceAssociate: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString
}
object AssociatePhoneNumbersWithVoiceConnectorGroupRequest {
  
  @scala.inline
  def apply(E164PhoneNumbers: E164PhoneNumberList, VoiceConnectorGroupId: NonEmptyString): AssociatePhoneNumbersWithVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(E164PhoneNumbers = E164PhoneNumbers.asInstanceOf[js.Any], VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorGroupRequest]
  }
  
  @scala.inline
  implicit class AssociatePhoneNumbersWithVoiceConnectorGroupRequestMutableBuilder[Self <: AssociatePhoneNumbersWithVoiceConnectorGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE164PhoneNumbers(value: E164PhoneNumberList): Self = StObject.set(x, "E164PhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE164PhoneNumbersVarargs(value: E164PhoneNumber*): Self = StObject.set(x, "E164PhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setForceAssociate(value: NullableBoolean): Self = StObject.set(x, "ForceAssociate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceAssociateUndefined: Self = StObject.set(x, "ForceAssociate", js.undefined)
    
    @scala.inline
    def setVoiceConnectorGroupId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorGroupId", value.asInstanceOf[js.Any])
  }
}
