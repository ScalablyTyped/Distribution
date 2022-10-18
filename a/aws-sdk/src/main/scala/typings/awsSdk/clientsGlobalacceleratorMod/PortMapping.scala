package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortMapping extends StObject {
  
  /**
    * The accelerator port.
    */
  var AcceleratorPort: js.UndefOr[PortNumber] = js.undefined
  
  /**
    * The EC2 instance IP address and port number in the virtual private cloud (VPC) subnet.
    */
  var DestinationSocketAddress: js.UndefOr[SocketAddress] = js.undefined
  
  /**
    * Indicates whether or not a port mapping destination can receive traffic. The value is either ALLOW, if traffic is allowed to the destination, or DENY, if traffic is not allowed to the destination.
    */
  var DestinationTrafficState: js.UndefOr[CustomRoutingDestinationTrafficState] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  var EndpointGroupArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The IP address of the VPC subnet (the subnet ID).
    */
  var EndpointId: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The protocols supported by the endpoint group.
    */
  var Protocols: js.UndefOr[CustomRoutingProtocols] = js.undefined
}
object PortMapping {
  
  inline def apply(): PortMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortMapping]
  }
  
  extension [Self <: PortMapping](x: Self) {
    
    inline def setAcceleratorPort(value: PortNumber): Self = StObject.set(x, "AcceleratorPort", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorPortUndefined: Self = StObject.set(x, "AcceleratorPort", js.undefined)
    
    inline def setDestinationSocketAddress(value: SocketAddress): Self = StObject.set(x, "DestinationSocketAddress", value.asInstanceOf[js.Any])
    
    inline def setDestinationSocketAddressUndefined: Self = StObject.set(x, "DestinationSocketAddress", js.undefined)
    
    inline def setDestinationTrafficState(value: CustomRoutingDestinationTrafficState): Self = StObject.set(x, "DestinationTrafficState", value.asInstanceOf[js.Any])
    
    inline def setDestinationTrafficStateUndefined: Self = StObject.set(x, "DestinationTrafficState", js.undefined)
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupArnUndefined: Self = StObject.set(x, "EndpointGroupArn", js.undefined)
    
    inline def setEndpointId(value: GenericString): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "EndpointId", js.undefined)
    
    inline def setProtocols(value: CustomRoutingProtocols): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: CustomRoutingProtocol*): Self = StObject.set(x, "Protocols", js.Array(value*))
  }
}
