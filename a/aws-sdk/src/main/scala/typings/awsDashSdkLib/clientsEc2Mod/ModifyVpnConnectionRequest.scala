package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpnConnectionRequest extends js.Object {
  var DryRun: js.UndefOr[Boolean] = js.undefined
  var TransitGatewayId: js.UndefOr[String] = js.undefined
  var VpnConnectionId: String
  var VpnGatewayId: js.UndefOr[String] = js.undefined
}

object ModifyVpnConnectionRequest {
  @scala.inline
  def apply(
    VpnConnectionId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    TransitGatewayId: String = null,
    VpnGatewayId: String = null
  ): ModifyVpnConnectionRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId)
    if (VpnGatewayId != null) __obj.updateDynamic("VpnGatewayId")(VpnGatewayId)
    __obj.asInstanceOf[ModifyVpnConnectionRequest]
  }
}

