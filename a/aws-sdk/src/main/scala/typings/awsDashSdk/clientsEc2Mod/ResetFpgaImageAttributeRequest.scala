package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetFpgaImageAttributeRequest extends js.Object {
  /**
    * The attribute.
    */
  var Attribute: js.UndefOr[ResetFpgaImageAttributeName] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: String
}

object ResetFpgaImageAttributeRequest {
  @scala.inline
  def apply(
    FpgaImageId: String,
    Attribute: ResetFpgaImageAttributeName = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ResetFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(FpgaImageId = FpgaImageId)
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ResetFpgaImageAttributeRequest]
  }
}

