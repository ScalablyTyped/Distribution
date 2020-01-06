package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorGroupRequest extends js.Object {
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString = js.native
}

object GetVoiceConnectorGroupRequest {
  @scala.inline
  def apply(VoiceConnectorGroupId: NonEmptyString): GetVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetVoiceConnectorGroupRequest]
  }
}

