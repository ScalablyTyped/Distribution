package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEndpointsRequest extends StObject {
  
  /**
    * The list of endpoint objects.
    */
  var EndpointConfigurations: typings.awsSdk.clientsGlobalacceleratorMod.EndpointConfigurations
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  var EndpointGroupArn: GenericString
}
object AddEndpointsRequest {
  
  inline def apply(EndpointConfigurations: EndpointConfigurations, EndpointGroupArn: GenericString): AddEndpointsRequest = {
    val __obj = js.Dynamic.literal(EndpointConfigurations = EndpointConfigurations.asInstanceOf[js.Any], EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEndpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddEndpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndpointConfigurations(value: EndpointConfigurations): Self = StObject.set(x, "EndpointConfigurations", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigurationsVarargs(value: EndpointConfiguration*): Self = StObject.set(x, "EndpointConfigurations", js.Array(value*))
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
  }
}
