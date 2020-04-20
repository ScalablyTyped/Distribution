package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorProxyRequest extends js.Object {
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128 = js.native
}

object GetVoiceConnectorProxyRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString128): GetVoiceConnectorProxyRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorProxyRequest]
  }
}

