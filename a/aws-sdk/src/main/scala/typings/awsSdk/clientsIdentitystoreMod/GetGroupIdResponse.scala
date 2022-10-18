package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupIdResponse extends StObject {
  
  /**
    * The identifier for a group in the identity store.
    */
  var GroupId: ResourceId
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.clientsIdentitystoreMod.IdentityStoreId
}
object GetGroupIdResponse {
  
  inline def apply(GroupId: ResourceId, IdentityStoreId: IdentityStoreId): GetGroupIdResponse = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupIdResponse]
  }
  
  extension [Self <: GetGroupIdResponse](x: Self) {
    
    inline def setGroupId(value: ResourceId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
  }
}
