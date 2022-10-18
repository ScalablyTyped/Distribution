package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevEndpointRequest extends StObject {
  
  /**
    * Name of the DevEndpoint to retrieve information for.
    */
  var EndpointName: GenericString
}
object GetDevEndpointRequest {
  
  inline def apply(EndpointName: GenericString): GetDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevEndpointRequest]
  }
  
  extension [Self <: GetDevEndpointRequest](x: Self) {
    
    inline def setEndpointName(value: GenericString): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
  }
}
