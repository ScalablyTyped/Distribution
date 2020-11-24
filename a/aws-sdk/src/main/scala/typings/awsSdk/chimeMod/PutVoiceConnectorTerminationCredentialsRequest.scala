package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutVoiceConnectorTerminationCredentialsRequest extends js.Object {
  
  /**
    * The termination SIP credentials.
    */
  var Credentials: js.UndefOr[CredentialList] = js.native
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object PutVoiceConnectorTerminationCredentialsRequest {
  
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): PutVoiceConnectorTerminationCredentialsRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorTerminationCredentialsRequest]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorTerminationCredentialsRequestOps[Self <: PutVoiceConnectorTerminationCredentialsRequest] (val x: Self) extends AnyVal {
    
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
    def setVoiceConnectorId(value: NonEmptyString): Self = this.set("VoiceConnectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsVarargs(value: Credential*): Self = this.set("Credentials", js.Array(value :_*))
    
    @scala.inline
    def setCredentials(value: CredentialList): Self = this.set("Credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("Credentials", js.undefined)
  }
}
