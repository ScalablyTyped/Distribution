package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResolverEndpointResponse extends StObject {
  
  /**
    * Information about the DeleteResolverEndpoint request, including the status of the request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverEndpoint] = js.undefined
}
object DeleteResolverEndpointResponse {
  
  inline def apply(): DeleteResolverEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResolverEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResolverEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setResolverEndpoint(value: ResolverEndpoint): Self = StObject.set(x, "ResolverEndpoint", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointUndefined: Self = StObject.set(x, "ResolverEndpoint", js.undefined)
  }
}
