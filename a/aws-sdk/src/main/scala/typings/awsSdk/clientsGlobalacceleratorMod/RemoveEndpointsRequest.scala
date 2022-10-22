package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveEndpointsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  var EndpointGroupArn: GenericString
  
  /**
    * The identifiers of the endpoints that you want to remove.
    */
  var EndpointIdentifiers: typings.awsSdk.clientsGlobalacceleratorMod.EndpointIdentifiers
}
object RemoveEndpointsRequest {
  
  inline def apply(EndpointGroupArn: GenericString, EndpointIdentifiers: EndpointIdentifiers): RemoveEndpointsRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any], EndpointIdentifiers = EndpointIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveEndpointsRequest]
  }
  
  extension [Self <: RemoveEndpointsRequest](x: Self) {
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdentifiers(value: EndpointIdentifiers): Self = StObject.set(x, "EndpointIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdentifiersVarargs(value: EndpointIdentifier*): Self = StObject.set(x, "EndpointIdentifiers", js.Array(value*))
  }
}
