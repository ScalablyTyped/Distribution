package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcAttributeRequest extends js.Object {
  /**
    * The VPC attribute.
    */
  var Attribute: VpcAttributeName
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: String
}

object DescribeVpcAttributeRequest {
  @scala.inline
  def apply(Attribute: VpcAttributeName, VpcId: String, DryRun: js.UndefOr[Boolean] = js.undefined): DescribeVpcAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], VpcId = VpcId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DescribeVpcAttributeRequest]
  }
}

