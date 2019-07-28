package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientVpnRouteStatus extends js.Object {
  /**
    * The state of the Client VPN endpoint route.
    */
  var Code: js.UndefOr[ClientVpnRouteStatusCode] = js.undefined
  /**
    * A message about the status of the Client VPN endpoint route, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object ClientVpnRouteStatus {
  @scala.inline
  def apply(Code: ClientVpnRouteStatusCode = null, Message: String = null): ClientVpnRouteStatus = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[ClientVpnRouteStatus]
  }
}

