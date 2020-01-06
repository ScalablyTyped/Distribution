package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateClientVpnTargetNetworkRequest extends js.Object {
  /**
    * The ID of the target network association.
    */
  var AssociationId: String = js.native
  /**
    * The ID of the Client VPN endpoint from which to disassociate the target network.
    */
  var ClientVpnEndpointId: typings.awsDashSdk.clientsEc2Mod.ClientVpnEndpointId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object DisassociateClientVpnTargetNetworkRequest {
  @scala.inline
  def apply(
    AssociationId: String,
    ClientVpnEndpointId: ClientVpnEndpointId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DisassociateClientVpnTargetNetworkRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateClientVpnTargetNetworkRequest]
  }
}

