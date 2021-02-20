package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutVoiceConnectorEmergencyCallingConfigurationRequest extends StObject {
  
  /**
    * The emergency calling configuration details.
    */
  var EmergencyCallingConfiguration: typings.awsSdk.chimeMod.EmergencyCallingConfiguration = js.native
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object PutVoiceConnectorEmergencyCallingConfigurationRequest {
  
  @scala.inline
  def apply(EmergencyCallingConfiguration: EmergencyCallingConfiguration, VoiceConnectorId: NonEmptyString): PutVoiceConnectorEmergencyCallingConfigurationRequest = {
    val __obj = js.Dynamic.literal(EmergencyCallingConfiguration = EmergencyCallingConfiguration.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorEmergencyCallingConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorEmergencyCallingConfigurationRequestMutableBuilder[Self <: PutVoiceConnectorEmergencyCallingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmergencyCallingConfiguration(value: EmergencyCallingConfiguration): Self = StObject.set(x, "EmergencyCallingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
