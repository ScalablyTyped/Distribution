package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResolverEndpointIpAddressResponse extends StObject {
  
  /**
    * The response to an AssociateResolverEndpointIpAddress request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverEndpoint] = js.undefined
}
object AssociateResolverEndpointIpAddressResponse {
  
  inline def apply(): AssociateResolverEndpointIpAddressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResolverEndpointIpAddressResponse]
  }
  
  extension [Self <: AssociateResolverEndpointIpAddressResponse](x: Self) {
    
    inline def setResolverEndpoint(value: ResolverEndpoint): Self = StObject.set(x, "ResolverEndpoint", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointUndefined: Self = StObject.set(x, "ResolverEndpoint", js.undefined)
  }
}
