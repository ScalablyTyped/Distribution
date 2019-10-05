package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiseByoipCidrRequest extends js.Object {
  /**
    * The IPv4 address range, in CIDR notation. This must be the exact range that you provisioned. You can't advertise only a portion of the provisioned range.
    */
  var Cidr: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object AdvertiseByoipCidrRequest {
  @scala.inline
  def apply(Cidr: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): AdvertiseByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[AdvertiseByoipCidrRequest]
  }
}

