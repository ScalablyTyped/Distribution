package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateDhcpOptionsRequest extends js.Object {
  /**
    * The ID of the DHCP options set, or default to associate no DHCP options with the VPC.
    */
  var DhcpOptionsId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: String
}

object AssociateDhcpOptionsRequest {
  @scala.inline
  def apply(DhcpOptionsId: String, VpcId: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): AssociateDhcpOptionsRequest = {
    val __obj = js.Dynamic.literal(DhcpOptionsId = DhcpOptionsId, VpcId = VpcId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[AssociateDhcpOptionsRequest]
  }
}

