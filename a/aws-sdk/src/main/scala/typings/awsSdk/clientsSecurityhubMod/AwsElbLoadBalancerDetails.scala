package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerDetails extends StObject {
  
  /**
    * The list of Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[StringList] = js.undefined
  
  /**
    * Information about the configuration of the EC2 instances.
    */
  var BackendServerDescriptions: js.UndefOr[AwsElbLoadBalancerBackendServerDescriptions] = js.undefined
  
  /**
    * The name of the Amazon Route 53 hosted zone for the load balancer.
    */
  var CanonicalHostedZoneName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the Amazon Route 53 hosted zone for the load balancer.
    */
  var CanonicalHostedZoneNameID: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the load balancer was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces, and date and time should be separated by T. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The DNS name of the load balancer.
    */
  var DnsName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the health checks that are conducted on the load balancer.
    */
  var HealthCheck: js.UndefOr[AwsElbLoadBalancerHealthCheck] = js.undefined
  
  /**
    * List of EC2 instances for the load balancer.
    */
  var Instances: js.UndefOr[AwsElbLoadBalancerInstances] = js.undefined
  
  /**
    * The policies that are enabled for the load balancer listeners.
    */
  var ListenerDescriptions: js.UndefOr[AwsElbLoadBalancerListenerDescriptions] = js.undefined
  
  /**
    * The attributes for a load balancer.
    */
  var LoadBalancerAttributes: js.UndefOr[AwsElbLoadBalancerAttributes] = js.undefined
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The policies for a load balancer.
    */
  var Policies: js.UndefOr[AwsElbLoadBalancerPolicies] = js.undefined
  
  /**
    * The type of load balancer. Only provided if the load balancer is in a VPC. If Scheme is internet-facing, the load balancer has a public DNS name that resolves to a public IP address. If Scheme is internal, the load balancer has a public DNS name that resolves to a private IP address.
    */
  var Scheme: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The security groups for the load balancer. Only provided if the load balancer is in a VPC.
    */
  var SecurityGroups: js.UndefOr[StringList] = js.undefined
  
  /**
    * Information about the security group for the load balancer. This is the security group that is used for inbound rules.
    */
  var SourceSecurityGroup: js.UndefOr[AwsElbLoadBalancerSourceSecurityGroup] = js.undefined
  
  /**
    * The list of subnet identifiers for the load balancer.
    */
  var Subnets: js.UndefOr[StringList] = js.undefined
  
  /**
    * The identifier of the VPC for the load balancer.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElbLoadBalancerDetails {
  
  inline def apply(): AwsElbLoadBalancerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsElbLoadBalancerDetails] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZones(value: StringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: NonEmptyString*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setBackendServerDescriptions(value: AwsElbLoadBalancerBackendServerDescriptions): Self = StObject.set(x, "BackendServerDescriptions", value.asInstanceOf[js.Any])
    
    inline def setBackendServerDescriptionsUndefined: Self = StObject.set(x, "BackendServerDescriptions", js.undefined)
    
    inline def setBackendServerDescriptionsVarargs(value: AwsElbLoadBalancerBackendServerDescription*): Self = StObject.set(x, "BackendServerDescriptions", js.Array(value*))
    
    inline def setCanonicalHostedZoneName(value: NonEmptyString): Self = StObject.set(x, "CanonicalHostedZoneName", value.asInstanceOf[js.Any])
    
    inline def setCanonicalHostedZoneNameID(value: NonEmptyString): Self = StObject.set(x, "CanonicalHostedZoneNameID", value.asInstanceOf[js.Any])
    
    inline def setCanonicalHostedZoneNameIDUndefined: Self = StObject.set(x, "CanonicalHostedZoneNameID", js.undefined)
    
    inline def setCanonicalHostedZoneNameUndefined: Self = StObject.set(x, "CanonicalHostedZoneName", js.undefined)
    
    inline def setCreatedTime(value: NonEmptyString): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDnsName(value: NonEmptyString): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    inline def setHealthCheck(value: AwsElbLoadBalancerHealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "HealthCheck", js.undefined)
    
    inline def setInstances(value: AwsElbLoadBalancerInstances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: AwsElbLoadBalancerInstance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setListenerDescriptions(value: AwsElbLoadBalancerListenerDescriptions): Self = StObject.set(x, "ListenerDescriptions", value.asInstanceOf[js.Any])
    
    inline def setListenerDescriptionsUndefined: Self = StObject.set(x, "ListenerDescriptions", js.undefined)
    
    inline def setListenerDescriptionsVarargs(value: AwsElbLoadBalancerListenerDescription*): Self = StObject.set(x, "ListenerDescriptions", js.Array(value*))
    
    inline def setLoadBalancerAttributes(value: AwsElbLoadBalancerAttributes): Self = StObject.set(x, "LoadBalancerAttributes", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerAttributesUndefined: Self = StObject.set(x, "LoadBalancerAttributes", js.undefined)
    
    inline def setLoadBalancerName(value: NonEmptyString): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNameUndefined: Self = StObject.set(x, "LoadBalancerName", js.undefined)
    
    inline def setPolicies(value: AwsElbLoadBalancerPolicies): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    inline def setScheme(value: NonEmptyString): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "Scheme", js.undefined)
    
    inline def setSecurityGroups(value: StringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSourceSecurityGroup(value: AwsElbLoadBalancerSourceSecurityGroup): Self = StObject.set(x, "SourceSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setSourceSecurityGroupUndefined: Self = StObject.set(x, "SourceSecurityGroup", js.undefined)
    
    inline def setSubnets(value: StringList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Subnets", js.Array(value*))
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
