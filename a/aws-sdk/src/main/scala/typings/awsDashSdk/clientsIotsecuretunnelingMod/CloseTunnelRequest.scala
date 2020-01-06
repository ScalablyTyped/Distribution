package typings.awsDashSdk.clientsIotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseTunnelRequest extends js.Object {
  /**
    * When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
    */
  var delete: js.UndefOr[DeleteFlag] = js.native
  /**
    * The ID of the tunnel to close.
    */
  var tunnelId: TunnelId = js.native
}

object CloseTunnelRequest {
  @scala.inline
  def apply(tunnelId: TunnelId, delete: js.UndefOr[Boolean] = js.undefined): CloseTunnelRequest = {
    val __obj = js.Dynamic.literal(tunnelId = tunnelId.asInstanceOf[js.Any])
    if (!js.isUndefined(delete)) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseTunnelRequest]
  }
}

