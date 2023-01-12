package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRoutingEndpointGroup extends StObject {
  
  /**
    * For a custom routing accelerator, describes the port range and protocol for all endpoints (virtual private cloud subnets) in an endpoint group to accept client traffic on.
    */
  var DestinationDescriptions: js.UndefOr[CustomRoutingDestinationDescriptions] = js.undefined
  
  /**
    * For a custom routing accelerator, describes the endpoints (virtual private cloud subnets) in an endpoint group to accept client traffic on.
    */
  var EndpointDescriptions: js.UndefOr[CustomRoutingEndpointDescriptions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  var EndpointGroupArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Amazon Web Services Region where the endpoint group is located.
    */
  var EndpointGroupRegion: js.UndefOr[GenericString] = js.undefined
}
object CustomRoutingEndpointGroup {
  
  inline def apply(): CustomRoutingEndpointGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRoutingEndpointGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomRoutingEndpointGroup] (val x: Self) extends AnyVal {
    
    inline def setDestinationDescriptions(value: CustomRoutingDestinationDescriptions): Self = StObject.set(x, "DestinationDescriptions", value.asInstanceOf[js.Any])
    
    inline def setDestinationDescriptionsUndefined: Self = StObject.set(x, "DestinationDescriptions", js.undefined)
    
    inline def setDestinationDescriptionsVarargs(value: CustomRoutingDestinationDescription*): Self = StObject.set(x, "DestinationDescriptions", js.Array(value*))
    
    inline def setEndpointDescriptions(value: CustomRoutingEndpointDescriptions): Self = StObject.set(x, "EndpointDescriptions", value.asInstanceOf[js.Any])
    
    inline def setEndpointDescriptionsUndefined: Self = StObject.set(x, "EndpointDescriptions", js.undefined)
    
    inline def setEndpointDescriptionsVarargs(value: CustomRoutingEndpointDescription*): Self = StObject.set(x, "EndpointDescriptions", js.Array(value*))
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupArnUndefined: Self = StObject.set(x, "EndpointGroupArn", js.undefined)
    
    inline def setEndpointGroupRegion(value: GenericString): Self = StObject.set(x, "EndpointGroupRegion", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupRegionUndefined: Self = StObject.set(x, "EndpointGroupRegion", js.undefined)
  }
}
