package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDevEndpointRequest extends StObject {
  
  /**
    * The name of the DevEndpoint.
    */
  var EndpointName: GenericString
}
object DeleteDevEndpointRequest {
  
  inline def apply(EndpointName: GenericString): DeleteDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDevEndpointRequest]
  }
  
  extension [Self <: DeleteDevEndpointRequest](x: Self) {
    
    inline def setEndpointName(value: GenericString): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
  }
}
