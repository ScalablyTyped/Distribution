package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorStreamingConfigurationResponse extends js.Object {
  /**
    * The updated streaming configuration details.
    */
  var StreamingConfiguration: js.UndefOr[typings.awsSdk.chimeMod.StreamingConfiguration] = js.native
}

object PutVoiceConnectorStreamingConfigurationResponse {
  @scala.inline
  def apply(StreamingConfiguration: StreamingConfiguration = null): PutVoiceConnectorStreamingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (StreamingConfiguration != null) __obj.updateDynamic("StreamingConfiguration")(StreamingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorStreamingConfigurationResponse]
  }
}

