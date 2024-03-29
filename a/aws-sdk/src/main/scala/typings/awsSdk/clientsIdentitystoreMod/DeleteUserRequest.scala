package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserRequest extends StObject {
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.clientsIdentitystoreMod.IdentityStoreId
  
  /**
    * The identifier for a user in the identity store.
    */
  var UserId: ResourceId
}
object DeleteUserRequest {
  
  inline def apply(IdentityStoreId: IdentityStoreId, UserId: ResourceId): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteUserRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: ResourceId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
