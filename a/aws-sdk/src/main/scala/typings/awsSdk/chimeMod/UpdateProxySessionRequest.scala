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
    VoiceConnectorId: NonEmptyString128,
    ExpiryMinutes: Int | Double = null
  ): UpdateProxySessionRequest = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], ProxySessionId = ProxySessionId.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    if (ExpiryMinutes != null) __obj.updateDynamic("ExpiryMinutes")(ExpiryMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProxySessionRequest]
  }
}

