package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVoiceConnectorProxyRequest extends js.Object {
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString128 = js.native
}

object DeleteVoiceConnectorProxyRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString128): DeleteVoiceConnectorProxyRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceConnectorProxyRequest]
  }
}

