package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSecurityGroupRequest extends js.Object {
  /**
    * A description for the security group. This is informational only. Constraints: Up to 255 characters in length Constraints for EC2-Classic: ASCII characters Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
    */
  var Description: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the security group. Constraints: Up to 255 characters in length. Cannot start with sg-. Constraints for EC2-Classic: ASCII characters Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
    */
  var GroupName: String
  /**
    * [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object CreateSecurityGroupRequest {
  @scala.inline
  def apply(
    Description: String,
    GroupName: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    VpcId: String = null
  ): CreateSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(Description = Description, GroupName = GroupName)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[CreateSecurityGroupRequest]
  }
}

