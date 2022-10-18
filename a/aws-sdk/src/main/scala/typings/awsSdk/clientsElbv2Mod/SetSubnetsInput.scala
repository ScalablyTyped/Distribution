package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSubnetsInput extends StObject {
  
  /**
    * [Network Load Balancers] The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses). You can’t specify dualstack for a load balancer with a UDP or TCP_UDP listener. .
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.clientsElbv2Mod.IpAddressType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.clientsElbv2Mod.LoadBalancerArn
  
  /**
    * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot specify Elastic IP addresses for your subnets. [Application Load Balancers on Outposts] You must specify one Outpost subnet. [Application Load Balancers on Local Zones] You can specify subnets from one or more Local Zones. [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one Elastic IP address per subnet if you need static IP addresses for your internet-facing load balancer. For internal load balancers, you can specify one private IP address per subnet from the IPv4 range of the subnet. For internet-facing load balancer, you can specify one IPv6 address per subnet.
    */
  var SubnetMappings: js.UndefOr[typings.awsSdk.clientsElbv2Mod.SubnetMappings] = js.undefined
  
  /**
    * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. [Application Load Balancers] You must specify subnets from at least two Availability Zones. [Application Load Balancers on Outposts] You must specify one Outpost subnet. [Application Load Balancers on Local Zones] You can specify subnets from one or more Local Zones. [Network Load Balancers] You can specify subnets from one or more Availability Zones.
    */
  var Subnets: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Subnets] = js.undefined
}
object SetSubnetsInput {
  
  inline def apply(LoadBalancerArn: LoadBalancerArn): SetSubnetsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSubnetsInput]
  }
  
  extension [Self <: SetSubnetsInput](x: Self) {
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    inline def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
    
    inline def setSubnetMappings(value: SubnetMappings): Self = StObject.set(x, "SubnetMappings", value.asInstanceOf[js.Any])
    
    inline def setSubnetMappingsUndefined: Self = StObject.set(x, "SubnetMappings", js.undefined)
    
    inline def setSubnetMappingsVarargs(value: SubnetMapping*): Self = StObject.set(x, "SubnetMappings", js.Array(value*))
    
    inline def setSubnets(value: Subnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: SubnetId*): Self = StObject.set(x, "Subnets", js.Array(value*))
  }
}
