package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProxySessionRequest extends js.Object {
  /**
    * The proxy session ID.
    */
  var ProxySessionId: NonEmptyString128 = js.native
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128 = js.native
}

object GetProxySessionRequest {
  @scala.inline
  def apply(ProxySessionId: NonEmptyString128, VoiceConnectorId: NonEmptyString128): GetProxySessionRequest = {
    val __obj = js.Dynamic.literal(ProxySessionId = ProxySessionId.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProxySessionRequest]
  }
}

