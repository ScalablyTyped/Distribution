package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorResponse extends js.Object {
  /**
    * The Amazon Chime Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[typings.awsSdk.chimeMod.VoiceConnector] = js.native
}

object GetVoiceConnectorResponse {
  @scala.inline
  def apply(VoiceConnector: VoiceConnector = null): GetVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    if (VoiceConnector != null) __obj.updateDynamic("VoiceConnector")(VoiceConnector.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorResponse]
  }
}

