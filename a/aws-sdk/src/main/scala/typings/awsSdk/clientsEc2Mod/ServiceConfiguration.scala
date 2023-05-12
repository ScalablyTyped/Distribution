package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceConfiguration extends StObject {
  
  /**
    * Indicates whether requests from other Amazon Web Services accounts to create an endpoint to the service must first be accepted.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Availability Zones in which the service is available.
    */
  var AvailabilityZones: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The DNS names for the service.
    */
  var BaseEndpointDnsNames: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the Gateway Load Balancers for the service.
    */
  var GatewayLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC endpoint API is restricted.
    */
  var ManagesVpcEndpoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
    */
  var NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The payer responsibility.
    */
  var PayerResponsibility: js.UndefOr[typings.awsSdk.clientsEc2Mod.PayerResponsibility] = js.undefined
  
  /**
    * The private DNS name for the service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the endpoint service private DNS name configuration.
    */
  var PrivateDnsNameConfiguration: js.UndefOr[typings.awsSdk.clientsEc2Mod.PrivateDnsNameConfiguration] = js.undefined
  
  /**
    * The ID of the service.
    */
  var ServiceId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service.
    */
  var ServiceName: js.UndefOr[String] = js.undefined
  
  /**
    * The service state.
    */
  var ServiceState: js.UndefOr[typings.awsSdk.clientsEc2Mod.ServiceState] = js.undefined
  
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[ServiceTypeDetailSet] = js.undefined
  
  /**
    * The supported IP address types.
    */
  var SupportedIpAddressTypes: js.UndefOr[typings.awsSdk.clientsEc2Mod.SupportedIpAddressTypes] = js.undefined
  
  /**
    * The tags assigned to the service.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ServiceConfiguration {
  
  inline def apply(): ServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAcceptanceRequired(value: Boolean): Self = StObject.set(x, "AcceptanceRequired", value.asInstanceOf[js.Any])
    
    inline def setAcceptanceRequiredUndefined: Self = StObject.set(x, "AcceptanceRequired", js.undefined)
    
    inline def setAvailabilityZones(value: ValueStringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setBaseEndpointDnsNames(value: ValueStringList): Self = StObject.set(x, "BaseEndpointDnsNames", value.asInstanceOf[js.Any])
    
    inline def setBaseEndpointDnsNamesUndefined: Self = StObject.set(x, "BaseEndpointDnsNames", js.undefined)
    
    inline def setBaseEndpointDnsNamesVarargs(value: String*): Self = StObject.set(x, "BaseEndpointDnsNames", js.Array(value*))
    
    inline def setGatewayLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "GatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setGatewayLoadBalancerArnsUndefined: Self = StObject.set(x, "GatewayLoadBalancerArns", js.undefined)
    
    inline def setGatewayLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "GatewayLoadBalancerArns", js.Array(value*))
    
    inline def setManagesVpcEndpoints(value: Boolean): Self = StObject.set(x, "ManagesVpcEndpoints", value.asInstanceOf[js.Any])
    
    inline def setManagesVpcEndpointsUndefined: Self = StObject.set(x, "ManagesVpcEndpoints", js.undefined)
    
    inline def setNetworkLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "NetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setNetworkLoadBalancerArnsUndefined: Self = StObject.set(x, "NetworkLoadBalancerArns", js.undefined)
    
    inline def setNetworkLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "NetworkLoadBalancerArns", js.Array(value*))
    
    inline def setPayerResponsibility(value: PayerResponsibility): Self = StObject.set(x, "PayerResponsibility", value.asInstanceOf[js.Any])
    
    inline def setPayerResponsibilityUndefined: Self = StObject.set(x, "PayerResponsibility", js.undefined)
    
    inline def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameConfiguration(value: PrivateDnsNameConfiguration): Self = StObject.set(x, "PrivateDnsNameConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameConfigurationUndefined: Self = StObject.set(x, "PrivateDnsNameConfiguration", js.undefined)
    
    inline def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setServiceState(value: ServiceState): Self = StObject.set(x, "ServiceState", value.asInstanceOf[js.Any])
    
    inline def setServiceStateUndefined: Self = StObject.set(x, "ServiceState", js.undefined)
    
    inline def setServiceType(value: ServiceTypeDetailSet): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
    
    inline def setServiceTypeVarargs(value: ServiceTypeDetail*): Self = StObject.set(x, "ServiceType", js.Array(value*))
    
    inline def setSupportedIpAddressTypes(value: SupportedIpAddressTypes): Self = StObject.set(x, "SupportedIpAddressTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedIpAddressTypesUndefined: Self = StObject.set(x, "SupportedIpAddressTypes", js.undefined)
    
    inline def setSupportedIpAddressTypesVarargs(value: ServiceConnectivityType*): Self = StObject.set(x, "SupportedIpAddressTypes", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
