package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSecurityGroupRuleDescriptionsIngressRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the security group. You must specify either the security group ID or the security group name in the request. For security groups in a nondefault VPC, you must specify the security group ID.
    */
  var GroupId: js.UndefOr[String] = js.native
  /**
    * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the security group name in the request.
    */
  var GroupName: js.UndefOr[String] = js.native
  /**
    * The IP permissions for the security group rule. 
    */
  var IpPermissions: IpPermissionList = js.native
}

object UpdateSecurityGroupRuleDescriptionsIngressRequest {
  @scala.inline
  def apply(
    IpPermissions: IpPermissionList,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    GroupId: String = null,
    GroupName: String = null
  ): UpdateSecurityGroupRuleDescriptionsIngressRequest = {
    val __obj = js.Dynamic.literal(IpPermissions = IpPermissions.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecurityGroupRuleDescriptionsIngressRequest]
  }
}

