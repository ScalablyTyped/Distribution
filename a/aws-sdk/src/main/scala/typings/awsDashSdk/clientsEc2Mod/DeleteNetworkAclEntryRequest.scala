package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNetworkAclEntryRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the rule is an egress rule.
    */
  var Egress: Boolean = js.native
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: typings.awsDashSdk.clientsEc2Mod.NetworkAclId = js.native
  /**
    * The rule number of the entry to delete.
    */
  var RuleNumber: Integer = js.native
}

object DeleteNetworkAclEntryRequest {
  @scala.inline
  def apply(
    Egress: Boolean,
    NetworkAclId: NetworkAclId,
    RuleNumber: Integer,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteNetworkAclEntryRequest = {
    val __obj = js.Dynamic.literal(Egress = Egress.asInstanceOf[js.Any], NetworkAclId = NetworkAclId.asInstanceOf[js.Any], RuleNumber = RuleNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkAclEntryRequest]
  }
}

