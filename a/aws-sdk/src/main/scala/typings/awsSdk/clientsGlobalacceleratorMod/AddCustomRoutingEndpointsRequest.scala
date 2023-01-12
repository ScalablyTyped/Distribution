package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCustomRoutingEndpointsRequest extends StObject {
  
  /**
    * The list of endpoint objects to add to a custom routing accelerator.
    */
  var EndpointConfigurations: CustomRoutingEndpointConfigurations
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group for the custom routing endpoint.
    */
  var EndpointGroupArn: GenericString
}
object AddCustomRoutingEndpointsRequest {
  
  inline def apply(EndpointConfigurations: CustomRoutingEndpointConfigurations, EndpointGroupArn: GenericString): AddCustomRoutingEndpointsRequest = {
    val __obj = js.Dynamic.literal(EndpointConfigurations = EndpointConfigurations.asInstanceOf[js.Any], EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCustomRoutingEndpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCustomRoutingEndpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndpointConfigurations(value: CustomRoutingEndpointConfigurations): Self = StObject.set(x, "EndpointConfigurations", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigurationsVarargs(value: CustomRoutingEndpointConfiguration*): Self = StObject.set(x, "EndpointConfigurations", js.Array(value*))
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
  }
}
