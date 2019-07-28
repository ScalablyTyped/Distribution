package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcRequest extends js.Object {
  /**
    * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or the size of the CIDR block.
    */
  var AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean] = js.undefined
  /**
    * The IPv4 network range for the VPC, in CIDR notation. For example, 10.0.0.0/16.
    */
  var CidrBlock: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The tenancy options for instances launched into the VPC. For default, instances are launched with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For dedicated, instances are launched as dedicated tenancy instances by default. You can only launch instances with a tenancy of dedicated or host into a dedicated tenancy VPC.   Important: The host value cannot be used with this parameter. Use the default or dedicated values only. Default: default 
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.undefined
}

object CreateVpcRequest {
  @scala.inline
  def apply(
    CidrBlock: String,
    AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean] = js.undefined,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    InstanceTenancy: Tenancy = null
  ): CreateVpcRequest = {
    val __obj = js.Dynamic.literal(CidrBlock = CidrBlock)
    if (!js.isUndefined(AmazonProvidedIpv6CidrBlock)) __obj.updateDynamic("AmazonProvidedIpv6CidrBlock")(AmazonProvidedIpv6CidrBlock)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (InstanceTenancy != null) __obj.updateDynamic("InstanceTenancy")(InstanceTenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcRequest]
  }
}

