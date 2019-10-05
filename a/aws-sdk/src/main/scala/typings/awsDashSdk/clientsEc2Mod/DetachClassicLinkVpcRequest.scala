package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachClassicLinkVpcRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the instance to unlink from the VPC.
    */
  var InstanceId: String
  /**
    * The ID of the VPC to which the instance is linked.
    */
  var VpcId: String
}

object DetachClassicLinkVpcRequest {
  @scala.inline
  def apply(InstanceId: String, VpcId: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DetachClassicLinkVpcRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, VpcId = VpcId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DetachClassicLinkVpcRequest]
  }
}

