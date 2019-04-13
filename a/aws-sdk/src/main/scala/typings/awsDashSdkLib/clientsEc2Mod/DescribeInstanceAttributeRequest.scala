package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstanceAttributeRequest extends js.Object {
  /**
    * The instance attribute. Note: The enaSupport attribute is not supported at this time.
    */
  var Attribute: InstanceAttributeName
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: String
}

object DescribeInstanceAttributeRequest {
  @scala.inline
  def apply(Attribute: InstanceAttributeName, InstanceId: String, DryRun: js.UndefOr[Boolean] = js.undefined): DescribeInstanceAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], InstanceId = InstanceId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DescribeInstanceAttributeRequest]
  }
}

