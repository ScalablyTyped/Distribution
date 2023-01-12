package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResolverEndpointRequest extends StObject {
  
  /**
    * The ID of the Resolver endpoint that you want to delete.
    */
  var ResolverEndpointId: ResourceId
}
object DeleteResolverEndpointRequest {
  
  inline def apply(ResolverEndpointId: ResourceId): DeleteResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResolverEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResolverEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
  }
}
