package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcEndpointServiceConfigurationRequest extends StObject {
  
  /**
    * Indicates whether requests from service consumers to create an endpoint to your service must be accepted manually.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
    */
  var GatewayLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the Network Load Balancers.
    */
  var NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * (Interface endpoint configuration) The private DNS name to assign to the VPC endpoint service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The supported IP address types. The possible values are ipv4 and ipv6.
    */
  var SupportedIpAddressTypes: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The tags to associate with the service.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateVpcEndpointServiceConfigurationRequest {
  
  inline def apply(): CreateVpcEndpointServiceConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointServiceConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpcEndpointServiceConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setAcceptanceRequired(value: Boolean): Self = StObject.set(x, "AcceptanceRequired", value.asInstanceOf[js.Any])
    
    inline def setAcceptanceRequiredUndefined: Self = StObject.set(x, "AcceptanceRequired", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGatewayLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "GatewayLoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setGatewayLoadBalancerArnsUndefined: Self = StObject.set(x, "GatewayLoadBalancerArns", js.undefined)
    
    inline def setGatewayLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "GatewayLoadBalancerArns", js.Array(value*))
    
    inline def setNetworkLoadBalancerArns(value: ValueStringList): Self = StObject.set(x, "NetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    
    inline def setNetworkLoadBalancerArnsUndefined: Self = StObject.set(x, "NetworkLoadBalancerArns", js.undefined)
    
    inline def setNetworkLoadBalancerArnsVarargs(value: String*): Self = StObject.set(x, "NetworkLoadBalancerArns", js.Array(value*))
    
    inline def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    inline def setSupportedIpAddressTypes(value: ValueStringList): Self = StObject.set(x, "SupportedIpAddressTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedIpAddressTypesUndefined: Self = StObject.set(x, "SupportedIpAddressTypes", js.undefined)
    
    inline def setSupportedIpAddressTypesVarargs(value: String*): Self = StObject.set(x, "SupportedIpAddressTypes", js.Array(value*))
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
