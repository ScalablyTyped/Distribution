package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachClassicLinkVpcRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of one or more of the VPC's security groups. You cannot specify security groups from a different VPC.
    */
  var Groups: GroupIdStringList
  /**
    * The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
    */
  var InstanceId: String
  /**
    * The ID of a ClassicLink-enabled VPC.
    */
  var VpcId: String
}

object AttachClassicLinkVpcRequest {
  @scala.inline
  def apply(
    Groups: GroupIdStringList,
    InstanceId: String,
    VpcId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): AttachClassicLinkVpcRequest = {
    val __obj = js.Dynamic.literal(Groups = Groups, InstanceId = InstanceId, VpcId = VpcId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[AttachClassicLinkVpcRequest]
  }
}

