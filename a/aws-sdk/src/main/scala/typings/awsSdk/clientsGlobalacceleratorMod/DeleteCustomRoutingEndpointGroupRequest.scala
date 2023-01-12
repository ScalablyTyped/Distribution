package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomRoutingEndpointGroupRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group to delete.
    */
  var EndpointGroupArn: GenericString
}
object DeleteCustomRoutingEndpointGroupRequest {
  
  inline def apply(EndpointGroupArn: GenericString): DeleteCustomRoutingEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomRoutingEndpointGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCustomRoutingEndpointGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
  }
}
