package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSecurityGroupRuleDescriptionsIngressRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the security group. You must specify either the security group ID or the security group name in the request. For security groups in a nondefault VPC, you must specify the security group ID.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  /**
    * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the security group name in the request.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  /**
    * The IP permissions for the security group rule. 
    */
  var IpPermissions: IpPermissionList
}

object UpdateSecurityGroupRuleDescriptionsIngressRequest {
  @scala.inline
  def apply(
    IpPermissions: IpPermissionList,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    GroupId: String = null,
    GroupName: String = null
  ): UpdateSecurityGroupRuleDescriptionsIngressRequest = {
    val __obj = js.Dynamic.literal(IpPermissions = IpPermissions)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    __obj.asInstanceOf[UpdateSecurityGroupRuleDescriptionsIngressRequest]
  }
}

