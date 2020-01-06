package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCustomerGatewayRequest extends js.Object {
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: typings.awsDashSdk.clientsEc2Mod.CustomerGatewayId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object DeleteCustomerGatewayRequest {
  @scala.inline
  def apply(CustomerGatewayId: CustomerGatewayId, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayId = CustomerGatewayId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomerGatewayRequest]
  }
}

