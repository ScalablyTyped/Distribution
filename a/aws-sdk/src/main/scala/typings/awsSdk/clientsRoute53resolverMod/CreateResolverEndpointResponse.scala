package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResolverEndpointResponse extends StObject {
  
  /**
    * Information about the CreateResolverEndpoint request, including the status of the request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverEndpoint] = js.undefined
}
object CreateResolverEndpointResponse {
  
  inline def apply(): CreateResolverEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResolverEndpointResponse]
  }
  
  extension [Self <: CreateResolverEndpointResponse](x: Self) {
    
    inline def setResolverEndpoint(value: ResolverEndpoint): Self = StObject.set(x, "ResolverEndpoint", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointUndefined: Self = StObject.set(x, "ResolverEndpoint", js.undefined)
  }
}
