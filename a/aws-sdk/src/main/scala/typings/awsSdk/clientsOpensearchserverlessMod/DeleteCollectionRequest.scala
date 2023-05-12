package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCollectionRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier to ensure idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The unique identifier of the collection. For example, 1iu5usc406kd. The ID is part of the collection endpoint. You can also retrieve it using the ListCollections API.
    */
  var id: CollectionId
}
object DeleteCollectionRequest {
  
  inline def apply(id: CollectionId): DeleteCollectionRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCollectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCollectionRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setId(value: CollectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
