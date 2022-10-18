package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancer extends StObject {
  
  /**
    * The subnets for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.clientsElbv2Mod.AvailabilityZones] = js.undefined
  
  /**
    * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
    */
  var CanonicalHostedZoneId: js.UndefOr[typings.awsSdk.clientsElbv2Mod.CanonicalHostedZoneId] = js.undefined
  
  /**
    * The date and time the load balancer was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * [Application Load Balancers on Outposts] The ID of the customer-owned address pool.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[typings.awsSdk.clientsElbv2Mod.CustomerOwnedIpv4Pool] = js.undefined
  
  /**
    * The public DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[typings.awsSdk.clientsElbv2Mod.DNSName] = js.undefined
  
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses).
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.clientsElbv2Mod.IpAddressType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsSdk.clientsElbv2Mod.LoadBalancerArn] = js.undefined
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[typings.awsSdk.clientsElbv2Mod.LoadBalancerName] = js.undefined
  
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load balancers can route requests from clients over the internet. The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can route requests only from clients with access to the VPC for the load balancer.
    */
  var Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.undefined
  
  /**
    * The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.clientsElbv2Mod.SecurityGroups] = js.undefined
  
  /**
    * The state of the load balancer.
    */
  var State: js.UndefOr[LoadBalancerState] = js.undefined
  
  /**
    * The type of load balancer.
    */
  var Type: js.UndefOr[LoadBalancerTypeEnum] = js.undefined
  
  /**
    * The ID of the VPC for the load balancer.
    */
  var VpcId: js.UndefOr[typings.awsSdk.clientsElbv2Mod.VpcId] = js.undefined
}
object LoadBalancer {
  
  inline def apply(): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancer]
  }
  
  extension [Self <: LoadBalancer](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setCanonicalHostedZoneId(value: CanonicalHostedZoneId): Self = StObject.set(x, "CanonicalHostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setCanonicalHostedZoneIdUndefined: Self = StObject.set(x, "CanonicalHostedZoneId", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setCustomerOwnedIpv4Pool(value: CustomerOwnedIpv4Pool): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    inline def setDNSName(value: DNSName): Self = StObject.set(x, "DNSName", value.asInstanceOf[js.Any])
    
    inline def setDNSNameUndefined: Self = StObject.set(x, "DNSName", js.undefined)
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    inline def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerArnUndefined: Self = StObject.set(x, "LoadBalancerArn", js.undefined)
    
    inline def setLoadBalancerName(value: LoadBalancerName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNameUndefined: Self = StObject.set(x, "LoadBalancerName", js.undefined)
    
    inline def setScheme(value: LoadBalancerSchemeEnum): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "Scheme", js.undefined)
    
    inline def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setState(value: LoadBalancerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: LoadBalancerTypeEnum): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
