package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVoiceConnectorGroupRequest extends js.Object {
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString = js.native
}

object DeleteVoiceConnectorGroupRequest {
  @scala.inline
  def apply(VoiceConnectorGroupId: NonEmptyString): DeleteVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteVoiceConnectorGroupRequest]
  }
}

