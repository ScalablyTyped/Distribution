package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNetworkAclEntryRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the rule is an egress rule.
    */
  var Egress: Boolean
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: String
  /**
    * The rule number of the entry to delete.
    */
  var RuleNumber: Integer
}

object DeleteNetworkAclEntryRequest {
  @scala.inline
  def apply(
    Egress: Boolean,
    NetworkAclId: String,
    RuleNumber: Integer,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): DeleteNetworkAclEntryRequest = {
    val __obj = js.Dynamic.literal(Egress = Egress, NetworkAclId = NetworkAclId, RuleNumber = RuleNumber)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteNetworkAclEntryRequest]
  }
}

