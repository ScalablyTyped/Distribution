package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorStreamingConfigurationRequest extends js.Object {
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
}

