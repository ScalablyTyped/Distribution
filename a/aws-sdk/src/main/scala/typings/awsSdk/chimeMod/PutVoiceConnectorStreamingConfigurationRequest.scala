package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutVoiceConnectorStreamingConfigurationRequest extends StObject {
  
  /**
    * The streaming configuration details to add.
    */
  var StreamingConfiguration: typings.awsSdk.chimeMod.StreamingConfiguration = js.native
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}
object PutVoiceConnectorStreamingConfigurationRequest {
  
  @scala.inline
  def apply(StreamingConfiguration: StreamingConfiguration, VoiceConnectorId: NonEmptyString): PutVoiceConnectorStreamingConfigurationRequest = {
    val __obj = js.Dynamic.literal(StreamingConfiguration = StreamingConfiguration.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorStreamingConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorStreamingConfigurationRequestMutableBuilder[Self <: PutVoiceConnectorStreamingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamingConfiguration(value: StreamingConfiguration): Self = StObject.set(x, "StreamingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
