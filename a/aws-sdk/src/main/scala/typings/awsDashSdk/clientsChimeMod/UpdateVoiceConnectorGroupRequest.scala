package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVoiceConnectorGroupRequest extends js.Object {
  /**
    * The name of the Amazon Chime Voice Connector group.
    */
  var Name: VoiceConnectorGroupName = js.native
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString = js.native
  /**
    * The VoiceConnectorItems to associate with the group.
    */
  var VoiceConnectorItems: VoiceConnectorItemList = js.native
}

object UpdateVoiceConnectorGroupRequest {
  @scala.inline
  def apply(
    Name: VoiceConnectorGroupName,
    VoiceConnectorGroupId: NonEmptyString,
    VoiceConnectorItems: VoiceConnectorItemList
  ): UpdateVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any], VoiceConnectorItems = VoiceConnectorItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateVoiceConnectorGroupRequest]
  }
}

