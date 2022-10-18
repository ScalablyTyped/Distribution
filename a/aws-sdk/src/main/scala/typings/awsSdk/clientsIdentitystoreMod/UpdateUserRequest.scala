package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserRequest extends StObject {
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.clientsIdentitystoreMod.IdentityStoreId
  
  /**
    * A list of AttributeOperation objects to apply to the requested user. These operations might add, replace, or remove an attribute.
    */
  var Operations: AttributeOperations
  
  /**
    * The identifier for a user in the identity store.
    */
  var UserId: ResourceId
}
object UpdateUserRequest {
  
  inline def apply(IdentityStoreId: IdentityStoreId, Operations: AttributeOperations, UserId: ResourceId): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  
  extension [Self <: UpdateUserRequest](x: Self) {
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: AttributeOperations): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: AttributeOperation*): Self = StObject.set(x, "Operations", js.Array(value*))
    
    inline def setUserId(value: ResourceId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
