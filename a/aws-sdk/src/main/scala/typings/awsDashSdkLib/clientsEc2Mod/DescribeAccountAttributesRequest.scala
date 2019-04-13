package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountAttributesRequest extends js.Object {
  /**
    * One or more account attribute names.
    */
  var AttributeNames: js.UndefOr[AccountAttributeNameStringList] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object DescribeAccountAttributesRequest {
  @scala.inline
  def apply(AttributeNames: AccountAttributeNameStringList = null, DryRun: js.UndefOr[Boolean] = js.undefined): DescribeAccountAttributesRequest = {
    val __obj = js.Dynamic.literal()
    if (AttributeNames != null) __obj.updateDynamic("AttributeNames")(AttributeNames)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DescribeAccountAttributesRequest]
  }
}

