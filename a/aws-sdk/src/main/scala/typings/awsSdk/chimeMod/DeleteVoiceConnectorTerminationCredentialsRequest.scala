package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVoiceConnectorTerminationCredentialsRequest extends StObject {
  
  /**
    * The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
    */
  var Usernames: SensitiveStringList
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object DeleteVoiceConnectorTerminationCredentialsRequest {
  
  inline def apply(Usernames: SensitiveStringList, VoiceConnectorId: NonEmptyString): DeleteVoiceConnectorTerminationCredentialsRequest = {
    val __obj = js.Dynamic.literal(Usernames = Usernames.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceConnectorTerminationCredentialsRequest]
  }
  
  extension [Self <: DeleteVoiceConnectorTerminationCredentialsRequest](x: Self) {
    
    inline def setUsernames(value: SensitiveStringList): Self = StObject.set(x, "Usernames", value.asInstanceOf[js.Any])
    
    inline def setUsernamesVarargs(value: SensitiveString*): Self = StObject.set(x, "Usernames", js.Array(value*))
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
