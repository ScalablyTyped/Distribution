package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VpcEndpointServiceDetails extends StObject {
  
  /**
    * Whether requests from other Amazon Web Services accounts to create an endpoint to the service must first be accepted.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Availability Zones where the service is available.
    */
  var AvailabilityZones: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The DNS names for the service.
    */
  var BaseEndpointDnsNames: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The ARNs of the Gateway Load Balancers for the service.
    */
  var GatewayLoadBalancerArns: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * Whether the service manages its VPC endpoints.
    */
  var ManagesVpcEndpoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARNs of the Network Load Balancers for the service.
    */
  var NetworkLoadBalancerArns: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The private DNS name for the service.
    */
  var PrivateDnsName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the service.
    */
  var ServiceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the service.
    */
  var ServiceName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current state of the service. Valid values are as follows:    Available     Deleted     Deleting     Failed     Pending   
    */
  var ServiceState: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The types for the service.
    */
  var ServiceType: js.UndefOr[AwsEc2VpcEndpointServiceServiceTypeList] = js.undefined
}
object AwsEc2VpcEndpointServiceDetails {
  
  inline def apply(): AwsEc2VpcEndpointServiceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VpcEndpointServiceDetails]
  }
  
  extension [Self <: AwsEc2VpcEndpointServiceDetails](x: Self) {
    
    inline def setAcceptanceRequired(value: Boolean): Self = StObject.set(x, "AcceptanceRequired", value.asInstanceOf[js.Any])
    
    inline def setAcceptanceRequiredUndefined: Self = StObject.set(x, "AcceptanceRequired", js.undefined)
    
    inline def setAvailabilityZones(value: NonEmptyStringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: NonEmptyString*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setBaseEndpointDnsNames(value: NonEmptyStringList): Self = StObject.set(x, "BaseEndpointDnsNames", value.asInstanceOf[js.Any])
    
    inline def setBaseEndpointDnsNamesUndefined: Self = StObject.set(x, "BaseEndpointDnsNames", js.undefined)
    
    inline def setBaseEndpointDnsNamesVarargs(value: NonEmptyString*): Self = StObject.set(x, "BaseEndpointDnsNames", js.Array(value*))
    
    inline def setGatewayLoadBalancerArns(value: NonEmptyStringList): Self = StObject.set(x, "GatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setGatewayLoadBalancerArnsUndefined: Self = StObject.set(x, "GatewayLoadBalancerArns", js.undefined)
    
    inline def setGatewayLoadBalancerArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "GatewayLoadBalancerArns", js.Array(value*))
    
    inline def setManagesVpcEndpoints(value: Boolean): Self = StObject.set(x, "ManagesVpcEndpoints", value.asInstanceOf[js.Any])
    
    inline def setManagesVpcEndpointsUndefined: Self = StObject.set(x, "ManagesVpcEndpoints", js.undefined)
    
    inline def setNetworkLoadBalancerArns(value: NonEmptyStringList): Self = StObject.set(x, "NetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setNetworkLoadBalancerArnsUndefined: Self = StObject.set(x, "NetworkLoadBalancerArns", js.undefined)
    
    inline def setNetworkLoadBalancerArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "NetworkLoadBalancerArns", js.Array(value*))
    
    inline def setPrivateDnsName(value: NonEmptyString): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    inline def setServiceId(value: NonEmptyString): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    inline def setServiceName(value: NonEmptyString): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setServiceState(value: NonEmptyString): Self = StObject.set(x, "ServiceState", value.asInstanceOf[js.Any])
    
    inline def setServiceStateUndefined: Self = StObject.set(x, "ServiceState", js.undefined)
    
    inline def setServiceType(value: AwsEc2VpcEndpointServiceServiceTypeList): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
    
    inline def setServiceTypeVarargs(value: AwsEc2VpcEndpointServiceServiceTypeDetails*): Self = StObject.set(x, "ServiceType", js.Array(value*))
  }
}
