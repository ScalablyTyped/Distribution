package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVoiceConnectorStreamingConfigurationRequest extends StObject {
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object DeleteVoiceConnectorStreamingConfigurationRequest {
  
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): DeleteVoiceConnectorStreamingConfigurationRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceConnectorStreamingConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteVoiceConnectorStreamingConfigurationRequestMutableBuilder[Self <: DeleteVoiceConnectorStreamingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
