package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateClientVpnTargetNetworkRequest extends js.Object {
  /**
    * The ID of the target network association.
    */
  var AssociationId: String
  /**
    * The ID of the Client VPN endpoint from which to disassociate the target network.
    */
  var ClientVpnEndpointId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object DisassociateClientVpnTargetNetworkRequest {
  @scala.inline
  def apply(AssociationId: String, ClientVpnEndpointId: String, DryRun: js.UndefOr[Boolean] = js.undefined): DisassociateClientVpnTargetNetworkRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId, ClientVpnEndpointId = ClientVpnEndpointId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DisassociateClientVpnTargetNetworkRequest]
  }
}

