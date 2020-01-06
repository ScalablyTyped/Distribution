package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorStreamingConfigurationResponse extends js.Object {
  /**
    * The streaming configuration details.
    */
  var StreamingConfiguration: js.UndefOr[typings.awsDashSdk.clientsChimeMod.StreamingConfiguration] = js.native
}

object GetVoiceConnectorStreamingConfigurationResponse {
  @scala.inline
  def apply(StreamingConfiguration: StreamingConfiguration = null): GetVoiceConnectorStreamingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (StreamingConfiguration != null) __obj.updateDynamic("StreamingConfiguration")(StreamingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorStreamingConfigurationResponse]
  }
}

