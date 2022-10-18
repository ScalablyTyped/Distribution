package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationPortMapping extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom routing accelerator that you have port mappings for.
    */
  var AcceleratorArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The IP address/port combinations (sockets) that map to a given destination socket address.
    */
  var AcceleratorSocketAddresses: js.UndefOr[SocketAddresses] = js.undefined
  
  /**
    * The endpoint IP address/port combination for traffic received on the accelerator socket address.
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
    * The Amazon Web Services Region for the endpoint group.
    */
  var EndpointGroupRegion: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The ID for the virtual private cloud (VPC) subnet.
    */
  var EndpointId: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The IP address type that an accelerator supports. For a custom routing accelerator, the value must be IPV4.
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.IpAddressType] = js.undefined
}
object DestinationPortMapping {
  
  inline def apply(): DestinationPortMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationPortMapping]
  }
  
  extension [Self <: DestinationPortMapping](x: Self) {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorArnUndefined: Self = StObject.set(x, "AcceleratorArn", js.undefined)
    
    inline def setAcceleratorSocketAddresses(value: SocketAddresses): Self = StObject.set(x, "AcceleratorSocketAddresses", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorSocketAddressesUndefined: Self = StObject.set(x, "AcceleratorSocketAddresses", js.undefined)
    
    inline def setAcceleratorSocketAddressesVarargs(value: SocketAddress*): Self = StObject.set(x, "AcceleratorSocketAddresses", js.Array(value*))
    
    inline def setDestinationSocketAddress(value: SocketAddress): Self = StObject.set(x, "DestinationSocketAddress", value.asInstanceOf[js.Any])
    
    inline def setDestinationSocketAddressUndefined: Self = StObject.set(x, "DestinationSocketAddress", js.undefined)
    
    inline def setDestinationTrafficState(value: CustomRoutingDestinationTrafficState): Self = StObject.set(x, "DestinationTrafficState", value.asInstanceOf[js.Any])
    
    inline def setDestinationTrafficStateUndefined: Self = StObject.set(x, "DestinationTrafficState", js.undefined)
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupArnUndefined: Self = StObject.set(x, "EndpointGroupArn", js.undefined)
    
    inline def setEndpointGroupRegion(value: GenericString): Self = StObject.set(x, "EndpointGroupRegion", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupRegionUndefined: Self = StObject.set(x, "EndpointGroupRegion", js.undefined)
    
    inline def setEndpointId(value: GenericString): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "EndpointId", js.undefined)
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
  }
}
