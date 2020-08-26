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
  @scala.inline
  implicit class GetProxySessionRequestOps[Self <: GetProxySessionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProxySessionId(value: NonEmptyString128): Self = this.set("ProxySessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString128): Self = this.set("VoiceConnectorId", value.asInstanceOf[js.Any])
  }
  
}

