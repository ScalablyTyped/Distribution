package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVoiceConnectorResponse extends js.Object {
  /**
    * The Amazon Chime Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
}

object UpdateVoiceConnectorResponse {
  @scala.inline
  def apply(VoiceConnector: VoiceConnector = null): UpdateVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    if (VoiceConnector != null) __obj.updateDynamic("VoiceConnector")(VoiceConnector)
    __obj.asInstanceOf[UpdateVoiceConnectorResponse]
  }
}

