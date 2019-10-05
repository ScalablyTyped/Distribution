package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVpcRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: String
}

object DeleteVpcRequest {
  @scala.inline
  def apply(VpcId: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteVpcRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteVpcRequest]
  }
}

