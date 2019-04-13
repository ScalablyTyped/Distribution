package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceNetworkAclAssociationRequest extends js.Object {
  /**
    * The ID of the current association between the original network ACL and the subnet.
    */
  var AssociationId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the new network ACL to associate with the subnet.
    */
  var NetworkAclId: String
}

object ReplaceNetworkAclAssociationRequest {
  @scala.inline
  def apply(AssociationId: String, NetworkAclId: String, DryRun: js.UndefOr[Boolean] = js.undefined): ReplaceNetworkAclAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId, NetworkAclId = NetworkAclId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ReplaceNetworkAclAssociationRequest]
  }
}

