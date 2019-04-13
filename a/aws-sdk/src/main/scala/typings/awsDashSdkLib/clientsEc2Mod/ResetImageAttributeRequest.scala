package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetImageAttributeRequest extends js.Object {
  /**
    * The attribute to reset (currently you can only reset the launch permission attribute).
    */
  var Attribute: ResetImageAttributeName
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the AMI.
    */
  var ImageId: String
}

object ResetImageAttributeRequest {
  @scala.inline
  def apply(Attribute: ResetImageAttributeName, ImageId: String, DryRun: js.UndefOr[Boolean] = js.undefined): ResetImageAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], ImageId = ImageId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ResetImageAttributeRequest]
  }
}

