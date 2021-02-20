package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVoiceConnectorEmergencyCallingConfigurationRequest extends StObject {
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object DeleteVoiceConnectorEmergencyCallingConfigurationRequest {
  
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): DeleteVoiceConnectorEmergencyCallingConfigurationRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceConnectorEmergencyCallingConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteVoiceConnectorEmergencyCallingConfigurationRequestMutableBuilder[Self <: DeleteVoiceConnectorEmergencyCallingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
