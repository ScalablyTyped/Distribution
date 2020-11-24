package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatePhoneNumbersWithVoiceConnectorRequest extends js.Object {
  
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: E164PhoneNumberList = js.native
  
  /**
    * If true, associates the provided phone numbers with the provided Amazon Chime Voice Connector and removes any previously existing associations. If false, does not associate any phone numbers that have previously existing associations.
    */
  var ForceAssociate: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object AssociatePhoneNumbersWithVoiceConnectorRequest {
  
  @scala.inline
  def apply(E164PhoneNumbers: E164PhoneNumberList, VoiceConnectorId: NonEmptyString): AssociatePhoneNumbersWithVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(E164PhoneNumbers = E164PhoneNumbers.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorRequest]
  }
  
  @scala.inline
  implicit class AssociatePhoneNumbersWithVoiceConnectorRequestOps[Self <: AssociatePhoneNumbersWithVoiceConnectorRequest] (val x: Self) extends AnyVal {
    
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
    def setE164PhoneNumbersVarargs(value: E164PhoneNumber*): Self = this.set("E164PhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setE164PhoneNumbers(value: E164PhoneNumberList): Self = this.set("E164PhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = this.set("VoiceConnectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceAssociate(value: NullableBoolean): Self = this.set("ForceAssociate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceAssociate: Self = this.set("ForceAssociate", js.undefined)
  }
}
