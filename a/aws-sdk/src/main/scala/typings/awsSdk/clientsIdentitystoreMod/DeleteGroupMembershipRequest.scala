package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGroupMembershipRequest extends StObject {
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.clientsIdentitystoreMod.IdentityStoreId
  
  /**
    * The identifier for a GroupMembership in an identity store.
    */
  var MembershipId: ResourceId
}
object DeleteGroupMembershipRequest {
  
  inline def apply(IdentityStoreId: IdentityStoreId, MembershipId: ResourceId): DeleteGroupMembershipRequest = {
    val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any], MembershipId = MembershipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupMembershipRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGroupMembershipRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    inline def setMembershipId(value: ResourceId): Self = StObject.set(x, "MembershipId", value.asInstanceOf[js.Any])
  }
}
