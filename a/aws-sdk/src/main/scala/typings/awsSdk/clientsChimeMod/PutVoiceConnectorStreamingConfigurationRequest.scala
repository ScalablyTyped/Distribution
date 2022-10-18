package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorStreamingConfigurationRequest extends StObject {
  
  /**
    * The streaming configuration details to add.
    */
  var StreamingConfiguration: typings.awsSdk.clientsChimeMod.StreamingConfiguration
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object PutVoiceConnectorStreamingConfigurationRequest {
  
  inline def apply(StreamingConfiguration: StreamingConfiguration, VoiceConnectorId: NonEmptyString): PutVoiceConnectorStreamingConfigurationRequest = {
    val __obj = js.Dynamic.literal(StreamingConfiguration = StreamingConfiguration.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorStreamingConfigurationRequest]
  }
  
  extension [Self <: PutVoiceConnectorStreamingConfigurationRequest](x: Self) {
    
    inline def setStreamingConfiguration(value: StreamingConfiguration): Self = StObject.set(x, "StreamingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
