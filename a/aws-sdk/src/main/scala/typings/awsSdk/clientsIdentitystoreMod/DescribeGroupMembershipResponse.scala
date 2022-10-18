package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGroupMembershipResponse extends StObject {
  
  /**
    * The identifier for a group in the identity store.
    */
  var GroupId: ResourceId
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.clientsIdentitystoreMod.IdentityStoreId
  
  var MemberId: typings.awsSdk.clientsIdentitystoreMod.MemberId
  
  /**
    * The identifier for a GroupMembership in an identity store.
    */
  var MembershipId: ResourceId
}
object DescribeGroupMembershipResponse {
  
  inline def apply(
    GroupId: ResourceId,
    IdentityStoreId: IdentityStoreId,
    MemberId: MemberId,
    MembershipId: ResourceId
  ): DescribeGroupMembershipResponse = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], MembershipId = MembershipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupMembershipResponse]
  }
  
  extension [Self <: DescribeGroupMembershipResponse](x: Self) {
    
    inline def setGroupId(value: ResourceId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: MemberId): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMembershipId(value: ResourceId): Self = StObject.set(x, "MembershipId", value.asInstanceOf[js.Any])
  }
}
