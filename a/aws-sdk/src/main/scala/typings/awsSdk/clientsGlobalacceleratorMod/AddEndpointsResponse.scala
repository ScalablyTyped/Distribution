package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEndpointsResponse extends StObject {
  
  /**
    * The list of endpoint objects.
    */
  var EndpointDescriptions: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.EndpointDescriptions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  var EndpointGroupArn: js.UndefOr[GenericString] = js.undefined
}
object AddEndpointsResponse {
  
  inline def apply(): AddEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddEndpointsResponse]
  }
  
  extension [Self <: AddEndpointsResponse](x: Self) {
    
    inline def setEndpointDescriptions(value: EndpointDescriptions): Self = StObject.set(x, "EndpointDescriptions", value.asInstanceOf[js.Any])
    
    inline def setEndpointDescriptionsUndefined: Self = StObject.set(x, "EndpointDescriptions", js.undefined)
    
    inline def setEndpointDescriptionsVarargs(value: EndpointDescription*): Self = StObject.set(x, "EndpointDescriptions", js.Array(value*))
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupArnUndefined: Self = StObject.set(x, "EndpointGroupArn", js.undefined)
  }
}
