package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subnet extends StObject {
  
  /**
    * Indicates whether a network interface created in this subnet (including a network interface created by RunInstances) receives an IPv6 address.
    */
  var AssignIpv6AddressOnCreation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Availability Zone of the subnet.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The AZ ID of the subnet.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of unused private IPv4 addresses in the subnet. The IPv4 addresses for any stopped instances are considered unavailable.
    */
  var AvailableIpAddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IPv4 CIDR block assigned to the subnet.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The customer-owned IPv4 address pool associated with the subnet.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[CoipPoolId] = js.undefined
  
  /**
    * Indicates whether this is the default subnet for the Availability Zone.
    */
  var DefaultForAz: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return synthetic IPv6 addresses for IPv4-only destinations.
    */
  var EnableDns64: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Indicates the device position for local network interfaces in this subnet. For example, 1 indicates local network interfaces in this subnet are the secondary network interface (eth1). 
    */
  var EnableLniAtDeviceIndex: js.UndefOr[Integer] = js.undefined
  
  /**
    * Information about the IPv6 CIDR blocks associated with the subnet.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[SubnetIpv6CidrBlockAssociationSet] = js.undefined
  
  /**
    * Indicates whether this is an IPv6 only subnet.
    */
  var Ipv6Native: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a network interface created in this subnet (including a network interface created by RunInstances) receives a customer-owned IPv4 address.
    */
  var MapCustomerOwnedIpOnLaunch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether instances launched in this subnet receive a public IPv4 address.
    */
  var MapPublicIpOnLaunch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the subnet.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of hostnames to assign to instances in the subnet at launch. An instance hostname is based on the IPv4 address or ID of the instance.
    */
  var PrivateDnsNameOptionsOnLaunch: js.UndefOr[typings.awsSdk.clientsEc2Mod.PrivateDnsNameOptionsOnLaunch] = js.undefined
  
  /**
    * The current state of the subnet.
    */
  var State: js.UndefOr[SubnetState] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the subnet.
    */
  var SubnetArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the subnet.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the VPC the subnet is in.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object Subnet {
  
  inline def apply(): Subnet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subnet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subnet] (val x: Self) extends AnyVal {
    
    inline def setAssignIpv6AddressOnCreation(value: Boolean): Self = StObject.set(x, "AssignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
    
    inline def setAssignIpv6AddressOnCreationUndefined: Self = StObject.set(x, "AssignIpv6AddressOnCreation", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneId(value: String): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setAvailableIpAddressCount(value: Integer): Self = StObject.set(x, "AvailableIpAddressCount", value.asInstanceOf[js.Any])
    
    inline def setAvailableIpAddressCountUndefined: Self = StObject.set(x, "AvailableIpAddressCount", js.undefined)
    
    inline def setCidrBlock(value: String): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    inline def setCustomerOwnedIpv4Pool(value: CoipPoolId): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    inline def setDefaultForAz(value: Boolean): Self = StObject.set(x, "DefaultForAz", value.asInstanceOf[js.Any])
    
    inline def setDefaultForAzUndefined: Self = StObject.set(x, "DefaultForAz", js.undefined)
    
    inline def setEnableDns64(value: Boolean): Self = StObject.set(x, "EnableDns64", value.asInstanceOf[js.Any])
    
    inline def setEnableDns64Undefined: Self = StObject.set(x, "EnableDns64", js.undefined)
    
    inline def setEnableLniAtDeviceIndex(value: Integer): Self = StObject.set(x, "EnableLniAtDeviceIndex", value.asInstanceOf[js.Any])
    
    inline def setEnableLniAtDeviceIndexUndefined: Self = StObject.set(x, "EnableLniAtDeviceIndex", js.undefined)
    
    inline def setIpv6CidrBlockAssociationSet(value: SubnetIpv6CidrBlockAssociationSet): Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockAssociationSetUndefined: Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", js.undefined)
    
    inline def setIpv6CidrBlockAssociationSetVarargs(value: SubnetIpv6CidrBlockAssociation*): Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", js.Array(value*))
    
    inline def setIpv6Native(value: Boolean): Self = StObject.set(x, "Ipv6Native", value.asInstanceOf[js.Any])
    
    inline def setIpv6NativeUndefined: Self = StObject.set(x, "Ipv6Native", js.undefined)
    
    inline def setMapCustomerOwnedIpOnLaunch(value: Boolean): Self = StObject.set(x, "MapCustomerOwnedIpOnLaunch", value.asInstanceOf[js.Any])
    
    inline def setMapCustomerOwnedIpOnLaunchUndefined: Self = StObject.set(x, "MapCustomerOwnedIpOnLaunch", js.undefined)
    
    inline def setMapPublicIpOnLaunch(value: Boolean): Self = StObject.set(x, "MapPublicIpOnLaunch", value.asInstanceOf[js.Any])
    
    inline def setMapPublicIpOnLaunchUndefined: Self = StObject.set(x, "MapPublicIpOnLaunch", js.undefined)
    
    inline def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPrivateDnsNameOptionsOnLaunch(value: PrivateDnsNameOptionsOnLaunch): Self = StObject.set(x, "PrivateDnsNameOptionsOnLaunch", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameOptionsOnLaunchUndefined: Self = StObject.set(x, "PrivateDnsNameOptionsOnLaunch", js.undefined)
    
    inline def setState(value: SubnetState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubnetArn(value: String): Self = StObject.set(x, "SubnetArn", value.asInstanceOf[js.Any])
    
    inline def setSubnetArnUndefined: Self = StObject.set(x, "SubnetArn", js.undefined)
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
