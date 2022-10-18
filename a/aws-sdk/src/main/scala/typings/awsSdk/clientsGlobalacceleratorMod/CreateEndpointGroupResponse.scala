package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointGroupResponse extends StObject {
  
  /**
    * The information about the endpoint group that was created.
    */
  var EndpointGroup: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.EndpointGroup] = js.undefined
}
object CreateEndpointGroupResponse {
  
  inline def apply(): CreateEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEndpointGroupResponse]
  }
  
  extension [Self <: CreateEndpointGroupResponse](x: Self) {
    
    inline def setEndpointGroup(value: EndpointGroup): Self = StObject.set(x, "EndpointGroup", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupUndefined: Self = StObject.set(x, "EndpointGroup", js.undefined)
  }
}
