package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkInterfaceRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the network interface.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of one or more security groups.
    */
  var Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  
  /**
    * The type of network interface. The default is interface. The only supported values are efa and trunk.
    */
  var InterfaceType: js.UndefOr[NetworkInterfaceCreationType] = js.undefined
  
  /**
    * The number of IPv4 prefixes that Amazon Web Services automatically assigns to the network interface. You can't specify a count of IPv4 prefixes if you've specified one of the following: specific IPv4 prefixes, specific private IPv4 addresses, or a count of private IPv4 addresses.
    */
  var Ipv4PrefixCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IPv4 prefixes assigned to the network interface. You can't specify IPv4 prefixes if you've specified one of the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private IPv4 addresses.
    */
  var Ipv4Prefixes: js.UndefOr[Ipv4PrefixList] = js.undefined
  
  /**
    * The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You can't specify a count of IPv6 addresses using this parameter if you've specified one of the following: specific IPv6 addresses, specific IPv6 prefixes, or a count of IPv6 prefixes. If your subnet has the AssignIpv6AddressOnCreation attribute set, you can override that setting by specifying 0 as the IPv6 address count.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't specify IPv6 addresses using this parameter if you've specified one of the following: a count of IPv6 addresses, specific IPv6 prefixes, or a count of IPv6 prefixes.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined
  
  /**
    * The number of IPv6 prefixes that Amazon Web Services automatically assigns to the network interface. You can't specify a count of IPv6 prefixes if you've specified one of the following: specific IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
    */
  var Ipv6PrefixCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IPv6 prefixes assigned to the network interface. You can't specify IPv6 prefixes if you've specified one of the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
    */
  var Ipv6Prefixes: js.UndefOr[Ipv6PrefixList] = js.undefined
  
  /**
    * The primary private IPv4 address of the network interface. If you don't specify an IPv4 address, Amazon EC2 selects one for you from the subnet's IPv4 CIDR range. If you specify an IP address, you cannot indicate any IP addresses specified in privateIpAddresses as primary (only one IP address can be designated as primary).
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The private IPv4 addresses. You can't specify private IPv4 addresses if you've specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or a count of IPv4 prefixes.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.undefined
  
  /**
    * The number of secondary private IPv4 addresses to assign to a network interface. When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one private IP address using privateIpAddresses. You can't specify a count of private IPv4 addresses if you've specified one of the following: specific private IPv4 addresses, specific IPv4 prefixes, or a count of IPv4 prefixes.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the subnet to associate with the network interface.
    */
  var SubnetId: typings.awsSdk.clientsEc2Mod.SubnetId
  
  /**
    * The tags to apply to the new network interface.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateNetworkInterfaceRequest {
  
  inline def apply(SubnetId: SubnetId): CreateNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInterfaceRequest]
  }
  
  extension [Self <: CreateNetworkInterfaceRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGroups(value: SecurityGroupIdStringList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setInterfaceType(value: NetworkInterfaceCreationType): Self = StObject.set(x, "InterfaceType", value.asInstanceOf[js.Any])
    
    inline def setInterfaceTypeUndefined: Self = StObject.set(x, "InterfaceType", js.undefined)
    
    inline def setIpv4PrefixCount(value: Integer): Self = StObject.set(x, "Ipv4PrefixCount", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixCountUndefined: Self = StObject.set(x, "Ipv4PrefixCount", js.undefined)
    
    inline def setIpv4Prefixes(value: Ipv4PrefixList): Self = StObject.set(x, "Ipv4Prefixes", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixesUndefined: Self = StObject.set(x, "Ipv4Prefixes", js.undefined)
    
    inline def setIpv4PrefixesVarargs(value: Ipv4PrefixSpecificationRequest*): Self = StObject.set(x, "Ipv4Prefixes", js.Array(value*))
    
    inline def setIpv6AddressCount(value: Integer): Self = StObject.set(x, "Ipv6AddressCount", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressCountUndefined: Self = StObject.set(x, "Ipv6AddressCount", js.undefined)
    
    inline def setIpv6Addresses(value: InstanceIpv6AddressList): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
    
    inline def setIpv6AddressesVarargs(value: InstanceIpv6Address*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value*))
    
    inline def setIpv6PrefixCount(value: Integer): Self = StObject.set(x, "Ipv6PrefixCount", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixCountUndefined: Self = StObject.set(x, "Ipv6PrefixCount", js.undefined)
    
    inline def setIpv6Prefixes(value: Ipv6PrefixList): Self = StObject.set(x, "Ipv6Prefixes", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixesUndefined: Self = StObject.set(x, "Ipv6Prefixes", js.undefined)
    
    inline def setIpv6PrefixesVarargs(value: Ipv6PrefixSpecificationRequest*): Self = StObject.set(x, "Ipv6Prefixes", js.Array(value*))
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    inline def setPrivateIpAddresses(value: PrivateIpAddressSpecificationList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    inline def setPrivateIpAddressesVarargs(value: PrivateIpAddressSpecification*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value*))
    
    inline def setSecondaryPrivateIpAddressCount(value: Integer): Self = StObject.set(x, "SecondaryPrivateIpAddressCount", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPrivateIpAddressCountUndefined: Self = StObject.set(x, "SecondaryPrivateIpAddressCount", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
