package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProxySessionRequest extends js.Object {
  var ProxySessionId: NonEmptyString128 = js.native
  var VoiceConnectorId: NonEmptyString128 = js.native
}

object DeleteProxySessionRequest {
  @scala.inline
  def apply(ProxySessionId: NonEmptyString128, VoiceConnectorId: NonEmptyString128): DeleteProxySessionRequest = {
    val __obj = js.Dynamic.literal(ProxySessionId = ProxySessionId.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteProxySessionRequest]
  }
}

