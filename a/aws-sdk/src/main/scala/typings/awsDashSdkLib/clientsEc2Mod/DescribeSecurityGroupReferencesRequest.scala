package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSecurityGroupReferencesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of the security groups in your account.
    */
  var GroupId: GroupIds
}

object DescribeSecurityGroupReferencesRequest {
  @scala.inline
  def apply(GroupId: GroupIds, DryRun: js.UndefOr[Boolean] = js.undefined): DescribeSecurityGroupReferencesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DescribeSecurityGroupReferencesRequest]
  }
}

