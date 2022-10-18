package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeManagedEndpointResponse extends StObject {
  
  /**
    * This output displays information about a managed endpoint.
    */
  var endpoint: js.UndefOr[Endpoint] = js.undefined
}
object DescribeManagedEndpointResponse {
  
  inline def apply(): DescribeManagedEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeManagedEndpointResponse]
  }
  
  extension [Self <: DescribeManagedEndpointResponse](x: Self) {
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
  }
}
