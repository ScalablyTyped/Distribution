package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVoiceConnectorResponse extends js.Object {
  /**
    * The updated Amazon Chime Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[typings.awsDashSdk.clientsChimeMod.VoiceConnector] = js.native
}

object UpdateVoiceConnectorResponse {
  @scala.inline
  def apply(VoiceConnector: VoiceConnector = null): UpdateVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    if (VoiceConnector != null) __obj.updateDynamic("VoiceConnector")(VoiceConnector.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceConnectorResponse]
  }
}

