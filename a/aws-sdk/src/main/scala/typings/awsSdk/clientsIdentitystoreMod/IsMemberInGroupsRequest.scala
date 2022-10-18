package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMemberInGroupsRequest extends StObject {
  
  /**
    * A list of identifiers for groups in the identity store.
    */
  var GroupIds: typings.awsSdk.clientsIdentitystoreMod.GroupIds
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.clientsIdentitystoreMod.IdentityStoreId
  
  /**
    * An object containing the identifier of a group member.
    */
  var MemberId: typings.awsSdk.clientsIdentitystoreMod.MemberId
}
object IsMemberInGroupsRequest {
  
  inline def apply(GroupIds: GroupIds, IdentityStoreId: IdentityStoreId, MemberId: MemberId): IsMemberInGroupsRequest = {
    val __obj = js.Dynamic.literal(GroupIds = GroupIds.asInstanceOf[js.Any], IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMemberInGroupsRequest]
  }
  
  extension [Self <: IsMemberInGroupsRequest](x: Self) {
    
    inline def setGroupIds(value: GroupIds): Self = StObject.set(x, "GroupIds", value.asInstanceOf[js.Any])
    
    inline def setGroupIdsVarargs(value: ResourceId*): Self = StObject.set(x, "GroupIds", js.Array(value*))
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: MemberId): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
  }
}
