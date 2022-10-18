package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointResponse extends StObject {
  
  /**
    * The endpoint that was deleted.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.clientsDmsMod.Endpoint] = js.undefined
}
object DeleteEndpointResponse {
  
  inline def apply(): DeleteEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEndpointResponse]
  }
  
  extension [Self <: DeleteEndpointResponse](x: Self) {
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
  }
}
