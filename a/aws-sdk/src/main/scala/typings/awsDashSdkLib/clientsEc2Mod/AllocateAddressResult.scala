package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateAddressResult extends js.Object {
  /**
    * [EC2-VPC] The ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
    */
  var AllocationId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (standard) or instances in a VPC (vpc).
    */
  var Domain: js.UndefOr[DomainType] = js.undefined
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
  /**
    * The ID of an address pool.
    */
  var PublicIpv4Pool: js.UndefOr[String] = js.undefined
}

object AllocateAddressResult {
  @scala.inline
  def apply(
    AllocationId: String = null,
    Domain: DomainType = null,
    PublicIp: String = null,
    PublicIpv4Pool: String = null
  ): AllocateAddressResult = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId)
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp)
    if (PublicIpv4Pool != null) __obj.updateDynamic("PublicIpv4Pool")(PublicIpv4Pool)
    __obj.asInstanceOf[AllocateAddressResult]
  }
}

