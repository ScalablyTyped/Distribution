package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMembership extends StObject {
  
  /**
    * The identifier for a group in the identity store.
    */
  var GroupId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.clientsIdentitystoreMod.IdentityStoreId
  
  /**
    * An object that contains the identifier of a group member. Setting the UserID field to the specific identifier for a user indicates that the user is a member of the group.
    */
  var MemberId: js.UndefOr[typings.awsSdk.clientsIdentitystoreMod.MemberId] = js.undefined
  
  /**
    * The identifier for a GroupMembership object in an identity store.
    */
  var MembershipId: js.UndefOr[ResourceId] = js.undefined
}
object GroupMembership {
  
  inline def apply(IdentityStoreId: IdentityStoreId): GroupMembership = {
    val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMembership]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupMembership] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: ResourceId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: MemberId): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    inline def setMembershipId(value: ResourceId): Self = StObject.set(x, "MembershipId", value.asInstanceOf[js.Any])
    
    inline def setMembershipIdUndefined: Self = StObject.set(x, "MembershipId", js.undefined)
  }
}
