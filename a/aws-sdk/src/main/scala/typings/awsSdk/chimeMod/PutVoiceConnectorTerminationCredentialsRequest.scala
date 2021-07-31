package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorTerminationCredentialsRequest extends StObject {
  
  /**
    * The termination SIP credentials.
    */
  var Credentials: js.UndefOr[CredentialList] = js.undefined
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object PutVoiceConnectorTerminationCredentialsRequest {
  
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): PutVoiceConnectorTerminationCredentialsRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorTerminationCredentialsRequest]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorTerminationCredentialsRequestMutableBuilder[Self <: PutVoiceConnectorTerminationCredentialsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: CredentialList): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    @scala.inline
    def setCredentialsVarargs(value: Credential*): Self = StObject.set(x, "Credentials", js.Array(value :_*))
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
