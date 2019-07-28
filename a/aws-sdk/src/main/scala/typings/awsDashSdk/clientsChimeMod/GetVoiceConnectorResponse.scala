package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVoiceConnectorResponse extends js.Object {
  /**
    * The Amazon Chime Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[typings.awsDashSdk.clientsChimeMod.VoiceConnector] = js.undefined
}

object GetVoiceConnectorResponse {
  @scala.inline
  def apply(VoiceConnector: VoiceConnector = null): GetVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    if (VoiceConnector != null) __obj.updateDynamic("VoiceConnector")(VoiceConnector)
    __obj.asInstanceOf[GetVoiceConnectorResponse]
  }
}

