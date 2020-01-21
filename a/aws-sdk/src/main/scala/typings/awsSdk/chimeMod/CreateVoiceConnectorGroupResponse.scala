package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVoiceConnectorGroupResponse extends js.Object {
  /**
    * The Amazon Chime Voice Connector group details.
    */
  var VoiceConnectorGroup: js.UndefOr[typings.awsSdk.chimeMod.VoiceConnectorGroup] = js.native
}

object CreateVoiceConnectorGroupResponse {
  @scala.inline
  def apply(VoiceConnectorGroup: VoiceConnectorGroup = null): CreateVoiceConnectorGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (VoiceConnectorGroup != null) __obj.updateDynamic("VoiceConnectorGroup")(VoiceConnectorGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceConnectorGroupResponse]
  }
}

