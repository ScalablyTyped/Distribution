package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomRoutingEndpointGroupResponse extends StObject {
  
  /**
    * The information about the endpoint group created for a custom routing accelerator.
    */
  var EndpointGroup: js.UndefOr[CustomRoutingEndpointGroup] = js.undefined
}
object CreateCustomRoutingEndpointGroupResponse {
  
  inline def apply(): CreateCustomRoutingEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomRoutingEndpointGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomRoutingEndpointGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setEndpointGroup(value: CustomRoutingEndpointGroup): Self = StObject.set(x, "EndpointGroup", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupUndefined: Self = StObject.set(x, "EndpointGroup", js.undefined)
  }
}
