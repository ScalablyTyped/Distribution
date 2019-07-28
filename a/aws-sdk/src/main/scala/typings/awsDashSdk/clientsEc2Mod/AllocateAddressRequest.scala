package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateAddressRequest extends js.Object {
  /**
    * [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an address pool.
    */
  var Address: js.UndefOr[String] = js.undefined
  /**
    * Set to vpc to allocate the address for use with instances in a VPC. Default: The address is for use with instances in EC2-Classic.
    */
  var Domain: js.UndefOr[DomainType] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the address pool. To specify a specific address from the address pool, use the Address parameter instead.
    */
  var PublicIpv4Pool: js.UndefOr[String] = js.undefined
}

object AllocateAddressRequest {
  @scala.inline
  def apply(
    Address: String = null,
    Domain: DomainType = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    PublicIpv4Pool: String = null
  ): AllocateAddressRequest = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address)
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (PublicIpv4Pool != null) __obj.updateDynamic("PublicIpv4Pool")(PublicIpv4Pool)
    __obj.asInstanceOf[AllocateAddressRequest]
  }
}

