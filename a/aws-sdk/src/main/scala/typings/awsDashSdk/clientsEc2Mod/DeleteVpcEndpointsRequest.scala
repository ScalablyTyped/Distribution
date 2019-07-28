package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVpcEndpointsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more VPC endpoint IDs.
    */
  var VpcEndpointIds: ValueStringList
}

object DeleteVpcEndpointsRequest {
  @scala.inline
  def apply(VpcEndpointIds: ValueStringList, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteVpcEndpointsRequest = {
    val __obj = js.Dynamic.literal(VpcEndpointIds = VpcEndpointIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteVpcEndpointsRequest]
  }
}

