package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorTerminationCredentialsRequest extends StObject {
  
  /**
    * The termination credentials being updated.
    */
  var Credentials: js.UndefOr[CredentialList] = js.undefined
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object PutVoiceConnectorTerminationCredentialsRequest {
  
  inline def apply(VoiceConnectorId: NonEmptyString): PutVoiceConnectorTerminationCredentialsRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorTerminationCredentialsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutVoiceConnectorTerminationCredentialsRequest] (val x: Self) extends AnyVal {
    
    inline def setCredentials(value: CredentialList): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setCredentialsVarargs(value: Credential*): Self = StObject.set(x, "Credentials", js.Array(value*))
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
