package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEgressOnlyInternetGatewayRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the VPC for which to create the egress-only internet gateway.
    */
  var VpcId: String
}

object CreateEgressOnlyInternetGatewayRequest {
  @scala.inline
  def apply(VpcId: String, ClientToken: String = null, DryRun: js.UndefOr[scala.Boolean] = js.undefined): CreateEgressOnlyInternetGatewayRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CreateEgressOnlyInternetGatewayRequest]
  }
}

