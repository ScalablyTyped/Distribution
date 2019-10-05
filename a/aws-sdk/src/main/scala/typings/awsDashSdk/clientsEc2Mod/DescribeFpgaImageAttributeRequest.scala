package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFpgaImageAttributeRequest extends js.Object {
  /**
    * The AFI attribute.
    */
  var Attribute: FpgaImageAttributeName
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: String
}

object DescribeFpgaImageAttributeRequest {
  @scala.inline
  def apply(
    Attribute: FpgaImageAttributeName,
    FpgaImageId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DescribeFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], FpgaImageId = FpgaImageId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DescribeFpgaImageAttributeRequest]
  }
}

