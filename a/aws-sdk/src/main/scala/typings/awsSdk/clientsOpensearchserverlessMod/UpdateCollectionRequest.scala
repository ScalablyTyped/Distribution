package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCollectionRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier to ensure idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A description of the collection.
    */
  var description: js.UndefOr[UpdateCollectionRequestDescriptionString] = js.undefined
  
  /**
    * The unique identifier of the collection.
    */
  var id: CollectionId
}
object UpdateCollectionRequest {
  
  inline def apply(id: CollectionId): UpdateCollectionRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCollectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCollectionRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: UpdateCollectionRequestDescriptionString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: CollectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
