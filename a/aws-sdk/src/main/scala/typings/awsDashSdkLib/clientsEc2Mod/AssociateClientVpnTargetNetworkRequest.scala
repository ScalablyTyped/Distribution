package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateClientVpnTargetNetworkRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the subnet to associate with the Client VPN endpoint.
    */
  var SubnetId: String
}

object AssociateClientVpnTargetNetworkRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: String,
    SubnetId: String,
    ClientToken: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): AssociateClientVpnTargetNetworkRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId, SubnetId = SubnetId)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[AssociateClientVpnTargetNetworkRequest]
  }
}

