package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  /**
    * The ID representing the allocation of the address for use with EC2-VPC.
    */
  var AllocationId: js.UndefOr[String] = js.native
  /**
    * The ID representing the association of the address with an instance in a VPC.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The customer-owned IP address.
    */
  var CustomerOwnedIp: js.UndefOr[String] = js.native
  /**
    * The ID of the customer-owned address pool.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[String] = js.native
  /**
    * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (standard) or instances in a VPC (vpc).
    */
  var Domain: js.UndefOr[DomainType] = js.native
  /**
    * The ID of the instance that the address is associated with (if any).
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The name of the location from which the IP address is advertised.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the network interface.
    */
  var NetworkInterfaceOwnerId: js.UndefOr[String] = js.native
  /**
    * The private IP address associated with the Elastic IP address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * The ID of an address pool.
    */
  var PublicIpv4Pool: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the Elastic IP address.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Address {
  @scala.inline
  def apply(
    AllocationId: String = null,
    AssociationId: String = null,
    CustomerOwnedIp: String = null,
    CustomerOwnedIpv4Pool: String = null,
    Domain: DomainType = null,
    InstanceId: String = null,
    NetworkBorderGroup: String = null,
    NetworkInterfaceId: String = null,
    NetworkInterfaceOwnerId: String = null,
    PrivateIpAddress: String = null,
    PublicIp: String = null,
    PublicIpv4Pool: String = null,
    Tags: TagList = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId.asInstanceOf[js.Any])
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (CustomerOwnedIp != null) __obj.updateDynamic("CustomerOwnedIp")(CustomerOwnedIp.asInstanceOf[js.Any])
    if (CustomerOwnedIpv4Pool != null) __obj.updateDynamic("CustomerOwnedIpv4Pool")(CustomerOwnedIpv4Pool.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (NetworkBorderGroup != null) __obj.updateDynamic("NetworkBorderGroup")(NetworkBorderGroup.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (NetworkInterfaceOwnerId != null) __obj.updateDynamic("NetworkInterfaceOwnerId")(NetworkInterfaceOwnerId.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    if (PublicIpv4Pool != null) __obj.updateDynamic("PublicIpv4Pool")(PublicIpv4Pool.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

