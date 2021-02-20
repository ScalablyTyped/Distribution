package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceConnectorStreamingConfigurationRequest extends StObject {
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object GetVoiceConnectorStreamingConfigurationRequest {
  
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): GetVoiceConnectorStreamingConfigurationRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorStreamingConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorStreamingConfigurationRequestMutableBuilder[Self <: GetVoiceConnectorStreamingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
