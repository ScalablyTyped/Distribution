package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePrivateDnsNamespaceRequest extends StObject {
  
  /**
    * The ID of the namespace that you want to update.
    */
  var Id: ResourceId
  
  /**
    * Updated properties for the private DNS namespace.
    */
  var Namespace: PrivateDnsNamespaceChange
  
  /**
    * A unique string that identifies the request and that allows failed UpdatePrivateDnsNamespace requests to be retried without the risk of running the operation twice. UpdaterRequestId can be any unique string (for example, a date/timestamp).
    */
  var UpdaterRequestId: js.UndefOr[ResourceId] = js.undefined
}
object UpdatePrivateDnsNamespaceRequest {
  
  inline def apply(Id: ResourceId, Namespace: PrivateDnsNamespaceChange): UpdatePrivateDnsNamespaceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePrivateDnsNamespaceRequest]
  }
  
  extension [Self <: UpdatePrivateDnsNamespaceRequest](x: Self) {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: PrivateDnsNamespaceChange): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setUpdaterRequestId(value: ResourceId): Self = StObject.set(x, "UpdaterRequestId", value.asInstanceOf[js.Any])
    
    inline def setUpdaterRequestIdUndefined: Self = StObject.set(x, "UpdaterRequestId", js.undefined)
  }
}
