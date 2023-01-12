package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowCustomRoutingTrafficRequest extends StObject {
  
  /**
    * Indicates whether all destination IP addresses and ports for a specified VPC subnet endpoint can receive traffic from a custom routing accelerator. The value is TRUE or FALSE.  When set to TRUE, all destinations in the custom routing VPC subnet can receive traffic. Note that you cannot specify destination IP addresses and ports when the value is set to TRUE. When set to FALSE (or not specified), you must specify a list of destination IP addresses that are allowed to receive traffic. A list of ports is optional. If you don't specify a list of ports, the ports that can accept traffic is the same as the ports configured for the endpoint group. The default value is FALSE.
    */
  var AllowAllTrafficToEndpoint: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * A list of specific Amazon EC2 instance IP addresses (destination addresses) in a subnet that you want to allow to receive traffic. The IP addresses must be a subset of the IP addresses that you specified for the endpoint group.  DestinationAddresses is required if AllowAllTrafficToEndpoint is FALSE or is not specified.
    */
  var DestinationAddresses: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.DestinationAddresses] = js.undefined
  
  /**
    * A list of specific Amazon EC2 instance ports (destination ports) that you want to allow to receive traffic.
    */
  var DestinationPorts: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.DestinationPorts] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  var EndpointGroupArn: GenericString
  
  /**
    * An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet ID.
    */
  var EndpointId: GenericString
}
object AllowCustomRoutingTrafficRequest {
  
  inline def apply(EndpointGroupArn: GenericString, EndpointId: GenericString): AllowCustomRoutingTrafficRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowCustomRoutingTrafficRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowCustomRoutingTrafficRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowAllTrafficToEndpoint(value: GenericBoolean): Self = StObject.set(x, "AllowAllTrafficToEndpoint", value.asInstanceOf[js.Any])
    
    inline def setAllowAllTrafficToEndpointUndefined: Self = StObject.set(x, "AllowAllTrafficToEndpoint", js.undefined)
    
    inline def setDestinationAddresses(value: DestinationAddresses): Self = StObject.set(x, "DestinationAddresses", value.asInstanceOf[js.Any])
    
    inline def setDestinationAddressesUndefined: Self = StObject.set(x, "DestinationAddresses", js.undefined)
    
    inline def setDestinationAddressesVarargs(value: IpAddress*): Self = StObject.set(x, "DestinationAddresses", js.Array(value*))
    
    inline def setDestinationPorts(value: DestinationPorts): Self = StObject.set(x, "DestinationPorts", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortsUndefined: Self = StObject.set(x, "DestinationPorts", js.undefined)
    
    inline def setDestinationPortsVarargs(value: PortNumber*): Self = StObject.set(x, "DestinationPorts", js.Array(value*))
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointId(value: GenericString): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
  }
}
