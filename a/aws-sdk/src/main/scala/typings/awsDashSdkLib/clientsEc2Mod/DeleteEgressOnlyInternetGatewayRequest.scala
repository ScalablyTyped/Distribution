package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEgressOnlyInternetGatewayRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: awsDashSdkLib.clientsEc2Mod.EgressOnlyInternetGatewayId
}

object DeleteEgressOnlyInternetGatewayRequest {
  @scala.inline
  def apply(
    EgressOnlyInternetGatewayId: EgressOnlyInternetGatewayId,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): DeleteEgressOnlyInternetGatewayRequest = {
    val __obj = js.Dynamic.literal(EgressOnlyInternetGatewayId = EgressOnlyInternetGatewayId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteEgressOnlyInternetGatewayRequest]
  }
}

