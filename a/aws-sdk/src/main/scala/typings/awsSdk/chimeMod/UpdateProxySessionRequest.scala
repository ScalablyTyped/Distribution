package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProxySessionRequest extends js.Object {
  /**
    * The proxy session capabilities.
    */
  var Capabilities: CapabilityList = js.native
  /**
    * The number of minutes allowed for the proxy session.
    */
  var ExpiryMinutes: js.UndefOr[PositiveInteger] = js.native
  /**
    * The proxy session ID.
    */
  var ProxySessionId: NonEmptyString128 = js.native
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128 = js.native
}

object UpdateProxySessionRequest {
  @scala.inline
  def apply(
    Capabilities: CapabilityList,
    ProxySessionId: NonEmptyString128,
    VoiceConnectorId: NonEmptyString128
  ): UpdateProxySessionRequest = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], ProxySessionId = ProxySessionId.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProxySessionRequest]
  }
  @scala.inline
  implicit class UpdateProxySessionRequestOps[Self <: UpdateProxySessionRequest] (val x: Self) extends AnyVal {
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
    def setCapabilitiesVarargs(value: Capability*): Self = this.set("Capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: CapabilityList): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxySessionId(value: NonEmptyString128): Self = this.set("ProxySessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString128): Self = this.set("VoiceConnectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiryMinutes(value: PositiveInteger): Self = this.set("ExpiryMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiryMinutes: Self = this.set("ExpiryMinutes", js.undefined)
  }
  
}

