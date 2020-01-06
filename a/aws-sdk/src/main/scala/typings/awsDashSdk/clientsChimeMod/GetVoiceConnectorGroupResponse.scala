package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorGroupResponse extends js.Object {
  /**
    * The Amazon Chime Voice Connector group details.
    */
  var VoiceConnectorGroup: js.UndefOr[typings.awsDashSdk.clientsChimeMod.VoiceConnectorGroup] = js.native
}

object GetVoiceConnectorGroupResponse {
  @scala.inline
  def apply(VoiceConnectorGroup: VoiceConnectorGroup = null): GetVoiceConnectorGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (VoiceConnectorGroup != null) __obj.updateDynamic("VoiceConnectorGroup")(VoiceConnectorGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorGroupResponse]
  }
}

