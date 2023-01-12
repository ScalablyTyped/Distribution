package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorEmergencyCallingConfigurationRequest extends StObject {
  
  /**
    * The emergency calling configuration details.
    */
  var EmergencyCallingConfiguration: typings.awsSdk.clientsChimeMod.EmergencyCallingConfiguration
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object PutVoiceConnectorEmergencyCallingConfigurationRequest {
  
  inline def apply(EmergencyCallingConfiguration: EmergencyCallingConfiguration, VoiceConnectorId: NonEmptyString): PutVoiceConnectorEmergencyCallingConfigurationRequest = {
    val __obj = js.Dynamic.literal(EmergencyCallingConfiguration = EmergencyCallingConfiguration.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorEmergencyCallingConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutVoiceConnectorEmergencyCallingConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setEmergencyCallingConfiguration(value: EmergencyCallingConfiguration): Self = StObject.set(x, "EmergencyCallingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
