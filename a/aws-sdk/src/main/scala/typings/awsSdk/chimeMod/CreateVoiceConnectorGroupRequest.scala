package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVoiceConnectorGroupRequest extends js.Object {
  /**
    * The name of the Amazon Chime Voice Connector group.
    */
  var Name: VoiceConnectorGroupName = js.native
  /**
    * The Amazon Chime Voice Connectors to route inbound calls to.
    */
  var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList] = js.native
}

object CreateVoiceConnectorGroupRequest {
  @scala.inline
  def apply(Name: VoiceConnectorGroupName, VoiceConnectorItems: VoiceConnectorItemList = null): CreateVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (VoiceConnectorItems != null) __obj.updateDynamic("VoiceConnectorItems")(VoiceConnectorItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceConnectorGroupRequest]
  }
}

