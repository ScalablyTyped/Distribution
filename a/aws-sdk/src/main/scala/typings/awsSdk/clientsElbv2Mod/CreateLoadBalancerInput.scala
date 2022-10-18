package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLoadBalancerInput extends StObject {
  
  /**
    * [Application Load Balancers on Outposts] The ID of the customer-owned address pool (CoIP pool).
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[typings.awsSdk.clientsElbv2Mod.CustomerOwnedIpv4Pool] = js.undefined
  
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses). 
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.clientsElbv2Mod.IpAddressType] = js.undefined
  
  /**
    * The name of the load balancer. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not begin with "internal-".
    */
  var Name: LoadBalancerName
  
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load balancers can route requests from clients over the internet. The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can route requests only from clients with access to the VPC for the load balancer. The default is an Internet-facing load balancer. You cannot specify a scheme for a Gateway Load Balancer.
    */
  var Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.undefined
  
  /**
    * [Application Load Balancers] The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.clientsElbv2Mod.SecurityGroups] = js.undefined
  
  /**
    * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings, but not both. [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot specify Elastic IP addresses for your subnets. [Application Load Balancers on Outposts] You must specify one Outpost subnet. [Application Load Balancers on Local Zones] You can specify subnets from one or more Local Zones. [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one Elastic IP address per subnet if you need static IP addresses for your internet-facing load balancer. For internal load balancers, you can specify one private IP address per subnet from the IPv4 range of the subnet. For internet-facing load balancer, you can specify one IPv6 address per subnet. [Gateway Load Balancers] You can specify subnets from one or more Availability Zones. You cannot specify Elastic IP addresses for your subnets.
    */
  var SubnetMappings: js.UndefOr[typings.awsSdk.clientsElbv2Mod.SubnetMappings] = js.undefined
  
  /**
    * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings, but not both. To specify an Elastic IP address, specify subnet mappings instead of subnets. [Application Load Balancers] You must specify subnets from at least two Availability Zones. [Application Load Balancers on Outposts] You must specify one Outpost subnet. [Application Load Balancers on Local Zones] You can specify subnets from one or more Local Zones. [Network Load Balancers] You can specify subnets from one or more Availability Zones. [Gateway Load Balancers] You can specify subnets from one or more Availability Zones.
    */
  var Subnets: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Subnets] = js.undefined
  
  /**
    * The tags to assign to the load balancer.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of load balancer. The default is application.
    */
  var Type: js.UndefOr[LoadBalancerTypeEnum] = js.undefined
}
object CreateLoadBalancerInput {
  
  inline def apply(Name: LoadBalancerName): CreateLoadBalancerInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerInput]
  }
  
  extension [Self <: CreateLoadBalancerInput](x: Self) {
    
    inline def setCustomerOwnedIpv4Pool(value: CustomerOwnedIpv4Pool): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    inline def setName(value: LoadBalancerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: LoadBalancerSchemeEnum): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "Scheme", js.undefined)
    
    inline def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSubnetMappings(value: SubnetMappings): Self = StObject.set(x, "SubnetMappings", value.asInstanceOf[js.Any])
    
    inline def setSubnetMappingsUndefined: Self = StObject.set(x, "SubnetMappings", js.undefined)
    
    inline def setSubnetMappingsVarargs(value: SubnetMapping*): Self = StObject.set(x, "SubnetMappings", js.Array(value*))
    
    inline def setSubnets(value: Subnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: SubnetId*): Self = StObject.set(x, "Subnets", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: LoadBalancerTypeEnum): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
