package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorEmergencyCallingConfigurationRequest extends StObject {
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object GetVoiceConnectorEmergencyCallingConfigurationRequest {
  
  inline def apply(VoiceConnectorId: NonEmptyString): GetVoiceConnectorEmergencyCallingConfigurationRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorEmergencyCallingConfigurationRequest]
  }
  
  extension [Self <: GetVoiceConnectorEmergencyCallingConfigurationRequest](x: Self) {
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
