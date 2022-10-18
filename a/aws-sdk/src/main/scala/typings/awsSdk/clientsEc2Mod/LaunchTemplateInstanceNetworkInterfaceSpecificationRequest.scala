package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateInstanceNetworkInterfaceSpecificationRequest extends StObject {
  
  /**
    * Associates a Carrier IP address with eth0 for a new network interface. Use this option when you launch an instance in a Wavelength Zone and want to associate a Carrier IP address with the network interface. For more information about Carrier IP addresses, see Carrier IP addresses in the Wavelength Developer Guide.
    */
  var AssociateCarrierIpAddress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Associates a public IPv4 address with eth0 for a new network interface.
    */
  var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A description for the network interface.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The device index for the network interface attachment.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IDs of one or more security groups.
    */
  var Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  
  /**
    * The type of network interface. To create an Elastic Fabric Adapter (EFA), specify efa. For more information, see Elastic Fabric Adapter in the Amazon Elastic Compute Cloud User Guide. If you are not creating an EFA, specify interface or omit this parameter. Valid values: interface | efa 
    */
  var InterfaceType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of IPv4 prefixes to be automatically assigned to the network interface. You cannot use this option if you use the Ipv4Prefix option.
    */
  var Ipv4PrefixCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * One or more IPv4 prefixes to be assigned to the network interface. You cannot use this option if you use the Ipv4PrefixCount option.
    */
  var Ipv4Prefixes: js.UndefOr[Ipv4PrefixList] = js.undefined
  
  /**
    * The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if you're specifying a number of IPv6 addresses.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressListRequest] = js.undefined
  
  /**
    * The number of IPv6 prefixes to be automatically assigned to the network interface. You cannot use this option if you use the Ipv6Prefix option.
    */
  var Ipv6PrefixCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * One or more IPv6 prefixes to be assigned to the network interface. You cannot use this option if you use the Ipv6PrefixCount option.
    */
  var Ipv6Prefixes: js.UndefOr[Ipv6PrefixList] = js.undefined
  
  /**
    * The index of the network card. Some instance types support multiple network cards. The primary network interface must be assigned to network card index 0. The default is network card index 0.
    */
  var NetworkCardIndex: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInterfaceId] = js.undefined
  
  /**
    * The primary private IPv4 address of the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * One or more private IPv4 addresses.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.undefined
  
  /**
    * The number of secondary private IPv4 addresses to assign to a network interface.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the subnet for the network interface.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.clientsEc2Mod.SubnetId] = js.undefined
}
object LaunchTemplateInstanceNetworkInterfaceSpecificationRequest {
  
  inline def apply(): LaunchTemplateInstanceNetworkInterfaceSpecificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceNetworkInterfaceSpecificationRequest]
  }
  
  extension [Self <: LaunchTemplateInstanceNetworkInterfaceSpecificationRequest](x: Self) {
    
    inline def setAssociateCarrierIpAddress(value: Boolean): Self = StObject.set(x, "AssociateCarrierIpAddress", value.asInstanceOf[js.Any])
    
    inline def setAssociateCarrierIpAddressUndefined: Self = StObject.set(x, "AssociateCarrierIpAddress", js.undefined)
    
    inline def setAssociatePublicIpAddress(value: Boolean): Self = StObject.set(x, "AssociatePublicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "AssociatePublicIpAddress", js.undefined)
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceIndex(value: Integer): Self = StObject.set(x, "DeviceIndex", value.asInstanceOf[js.Any])
    
    inline def setDeviceIndexUndefined: Self = StObject.set(x, "DeviceIndex", js.undefined)
    
    inline def setGroups(value: SecurityGroupIdStringList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setInterfaceType(value: String): Self = StObject.set(x, "InterfaceType", value.asInstanceOf[js.Any])
    
    inline def setInterfaceTypeUndefined: Self = StObject.set(x, "InterfaceType", js.undefined)
    
    inline def setIpv4PrefixCount(value: Integer): Self = StObject.set(x, "Ipv4PrefixCount", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixCountUndefined: Self = StObject.set(x, "Ipv4PrefixCount", js.undefined)
    
    inline def setIpv4Prefixes(value: Ipv4PrefixList): Self = StObject.set(x, "Ipv4Prefixes", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixesUndefined: Self = StObject.set(x, "Ipv4Prefixes", js.undefined)
    
    inline def setIpv4PrefixesVarargs(value: Ipv4PrefixSpecificationRequest*): Self = StObject.set(x, "Ipv4Prefixes", js.Array(value*))
    
    inline def setIpv6AddressCount(value: Integer): Self = StObject.set(x, "Ipv6AddressCount", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressCountUndefined: Self = StObject.set(x, "Ipv6AddressCount", js.undefined)
    
    inline def setIpv6Addresses(value: InstanceIpv6AddressListRequest): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
    
    inline def setIpv6AddressesVarargs(value: InstanceIpv6AddressRequest*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value*))
    
    inline def setIpv6PrefixCount(value: Integer): Self = StObject.set(x, "Ipv6PrefixCount", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixCountUndefined: Self = StObject.set(x, "Ipv6PrefixCount", js.undefined)
    
    inline def setIpv6Prefixes(value: Ipv6PrefixList): Self = StObject.set(x, "Ipv6Prefixes", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixesUndefined: Self = StObject.set(x, "Ipv6Prefixes", js.undefined)
    
    inline def setIpv6PrefixesVarargs(value: Ipv6PrefixSpecificationRequest*): Self = StObject.set(x, "Ipv6Prefixes", js.Array(value*))
    
    inline def setNetworkCardIndex(value: Integer): Self = StObject.set(x, "NetworkCardIndex", value.asInstanceOf[js.Any])
    
    inline def setNetworkCardIndexUndefined: Self = StObject.set(x, "NetworkCardIndex", js.undefined)
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    inline def setPrivateIpAddresses(value: PrivateIpAddressSpecificationList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    inline def setPrivateIpAddressesVarargs(value: PrivateIpAddressSpecification*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value*))
    
    inline def setSecondaryPrivateIpAddressCount(value: Integer): Self = StObject.set(x, "SecondaryPrivateIpAddressCount", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPrivateIpAddressCountUndefined: Self = StObject.set(x, "SecondaryPrivateIpAddressCount", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
