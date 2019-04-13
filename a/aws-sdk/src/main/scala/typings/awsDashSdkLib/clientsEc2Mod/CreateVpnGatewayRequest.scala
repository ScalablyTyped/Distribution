package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpnGatewayRequest extends js.Object {
  /**
    * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. If you're using a 16-bit ASN, it must be in the 64512 to 65534 range. If you're using a 32-bit ASN, it must be in the 4200000000 to 4294967294 range. Default: 64512
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.undefined
  /**
    * The Availability Zone for the virtual private gateway.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of VPN connection this virtual private gateway supports.
    */
  var Type: GatewayType
}

object CreateVpnGatewayRequest {
  @scala.inline
  def apply(
    Type: GatewayType,
    AmazonSideAsn: js.UndefOr[Long] = js.undefined,
    AvailabilityZone: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): CreateVpnGatewayRequest = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (!js.isUndefined(AmazonSideAsn)) __obj.updateDynamic("AmazonSideAsn")(AmazonSideAsn)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CreateVpnGatewayRequest]
  }
}

