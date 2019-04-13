package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSubnetRequest extends js.Object {
  /**
    * The Availability Zone for the subnet. Default: AWS selects one for you. If you create more than one subnet in your VPC, we may not necessarily select a different zone for each subnet.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The AZ ID of the subnet.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.undefined
  /**
    * The IPv4 network range for the subnet, in CIDR notation. For example, 10.0.0.0/24.
    */
  var CidrBlock: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The IPv6 network range for the subnet, in CIDR notation. The subnet size must use a /64 prefix length.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: String
}

object CreateSubnetRequest {
  @scala.inline
  def apply(
    CidrBlock: String,
    VpcId: String,
    AvailabilityZone: String = null,
    AvailabilityZoneId: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Ipv6CidrBlock: String = null
  ): CreateSubnetRequest = {
    val __obj = js.Dynamic.literal(CidrBlock = CidrBlock, VpcId = VpcId)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (AvailabilityZoneId != null) __obj.updateDynamic("AvailabilityZoneId")(AvailabilityZoneId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Ipv6CidrBlock != null) __obj.updateDynamic("Ipv6CidrBlock")(Ipv6CidrBlock)
    __obj.asInstanceOf[CreateSubnetRequest]
  }
}

