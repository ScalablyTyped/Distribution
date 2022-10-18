package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverEndpointResponse extends StObject {
  
  /**
    * Information about the Resolver endpoint that you specified in a GetResolverEndpoint request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverEndpoint] = js.undefined
}
object GetResolverEndpointResponse {
  
  inline def apply(): GetResolverEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverEndpointResponse]
  }
  
  extension [Self <: GetResolverEndpointResponse](x: Self) {
    
    inline def setResolverEndpoint(value: ResolverEndpoint): Self = StObject.set(x, "ResolverEndpoint", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointUndefined: Self = StObject.set(x, "ResolverEndpoint", js.undefined)
  }
}
