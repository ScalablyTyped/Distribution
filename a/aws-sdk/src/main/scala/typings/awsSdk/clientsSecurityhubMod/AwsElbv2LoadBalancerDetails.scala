package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbv2LoadBalancerDetails extends StObject {
  
  /**
    * The Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.AvailabilityZones] = js.undefined
  
  /**
    * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
    */
  var CanonicalHostedZoneId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the load balancer was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The public DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses).
    */
  var IpAddressType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Attributes of the load balancer.
    */
  var LoadBalancerAttributes: js.UndefOr[AwsElbv2LoadBalancerAttributes] = js.undefined
  
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses.
    */
  var Scheme: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.SecurityGroups] = js.undefined
  
  /**
    * The state of the load balancer.
    */
  var State: js.UndefOr[LoadBalancerState] = js.undefined
  
  /**
    * The type of load balancer.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the VPC for the load balancer.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElbv2LoadBalancerDetails {
  
  inline def apply(): AwsElbv2LoadBalancerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbv2LoadBalancerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsElbv2LoadBalancerDetails] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setCanonicalHostedZoneId(value: NonEmptyString): Self = StObject.set(x, "CanonicalHostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setCanonicalHostedZoneIdUndefined: Self = StObject.set(x, "CanonicalHostedZoneId", js.undefined)
    
    inline def setCreatedTime(value: NonEmptyString): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDNSName(value: NonEmptyString): Self = StObject.set(x, "DNSName", value.asInstanceOf[js.Any])
    
    inline def setDNSNameUndefined: Self = StObject.set(x, "DNSName", js.undefined)
    
    inline def setIpAddressType(value: NonEmptyString): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    inline def setLoadBalancerAttributes(value: AwsElbv2LoadBalancerAttributes): Self = StObject.set(x, "LoadBalancerAttributes", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerAttributesUndefined: Self = StObject.set(x, "LoadBalancerAttributes", js.undefined)
    
    inline def setLoadBalancerAttributesVarargs(value: AwsElbv2LoadBalancerAttribute*): Self = StObject.set(x, "LoadBalancerAttributes", js.Array(value*))
    
    inline def setScheme(value: NonEmptyString): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "Scheme", js.undefined)
    
    inline def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setState(value: LoadBalancerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
