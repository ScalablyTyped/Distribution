package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionByoipCidrRequest extends js.Object {
  /**
    * The public IPv4 address range, in CIDR notation. The most specific prefix that you can specify is /24. The address range cannot overlap with another address range that you've brought to this or another Region.
    */
  var Cidr: String
  /**
    * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP.
    */
  var CidrAuthorizationContext: js.UndefOr[CidrAuthorizationContext] = js.undefined
  /**
    * A description for the address range and the address pool.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object ProvisionByoipCidrRequest {
  @scala.inline
  def apply(
    Cidr: String,
    CidrAuthorizationContext: CidrAuthorizationContext = null,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ProvisionByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr)
    if (CidrAuthorizationContext != null) __obj.updateDynamic("CidrAuthorizationContext")(CidrAuthorizationContext)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ProvisionByoipCidrRequest]
  }
}

