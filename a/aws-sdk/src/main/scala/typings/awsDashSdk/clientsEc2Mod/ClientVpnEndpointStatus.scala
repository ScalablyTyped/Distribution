package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnEndpointStatus extends js.Object {
  /**
    * The state of the Client VPN endpoint. Possible states include:    pending-associate - The Client VPN endpoint has been created but no target networks have been associated. The Client VPN endpoint cannot accept connections.    available - The Client VPN endpoint has been created and a target network has been associated. The Client VPN endpoint can accept connections.    deleting - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept connections.    deleted - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept connections.  
    */
  var Code: js.UndefOr[ClientVpnEndpointStatusCode] = js.native
  /**
    * A message about the status of the Client VPN endpoint.
    */
  var Message: js.UndefOr[String] = js.native
}

object ClientVpnEndpointStatus {
  @scala.inline
  def apply(Code: ClientVpnEndpointStatusCode = null, Message: String = null): ClientVpnEndpointStatus = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientVpnEndpointStatus]
  }
}

