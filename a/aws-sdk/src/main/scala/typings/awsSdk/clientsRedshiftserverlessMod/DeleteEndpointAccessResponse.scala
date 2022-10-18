package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointAccessResponse extends StObject {
  
  /**
    * The deleted VPC endpoint.
    */
  var endpoint: js.UndefOr[EndpointAccess] = js.undefined
}
object DeleteEndpointAccessResponse {
  
  inline def apply(): DeleteEndpointAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEndpointAccessResponse]
  }
  
  extension [Self <: DeleteEndpointAccessResponse](x: Self) {
    
    inline def setEndpoint(value: EndpointAccess): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
  }
}
