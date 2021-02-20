package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceConnectorEmergencyCallingConfigurationRequest extends StObject {
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object GetVoiceConnectorEmergencyCallingConfigurationRequest {
  
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): GetVoiceConnectorEmergencyCallingConfigurationRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorEmergencyCallingConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorEmergencyCallingConfigurationRequestMutableBuilder[Self <: GetVoiceConnectorEmergencyCallingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
