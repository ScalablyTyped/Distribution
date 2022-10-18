package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointAccessResponse extends StObject {
  
  /**
    * The created VPC endpoint.
    */
  var endpoint: js.UndefOr[EndpointAccess] = js.undefined
}
object CreateEndpointAccessResponse {
  
  inline def apply(): CreateEndpointAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEndpointAccessResponse]
  }
  
  extension [Self <: CreateEndpointAccessResponse](x: Self) {
    
    inline def setEndpoint(value: EndpointAccess): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
  }
}
