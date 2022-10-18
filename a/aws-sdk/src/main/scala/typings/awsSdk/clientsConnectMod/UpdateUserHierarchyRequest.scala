package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserHierarchyRequest extends StObject {
  
  /**
    * The identifier of the hierarchy group.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsSdk.clientsConnectMod.HierarchyGroupId] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier of the user account.
    */
  var UserId: typings.awsSdk.clientsConnectMod.UserId
}
object UpdateUserHierarchyRequest {
  
  inline def apply(InstanceId: InstanceId, UserId: UserId): UpdateUserHierarchyRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserHierarchyRequest]
  }
  
  extension [Self <: UpdateUserHierarchyRequest](x: Self) {
    
    inline def setHierarchyGroupId(value: HierarchyGroupId): Self = StObject.set(x, "HierarchyGroupId", value.asInstanceOf[js.Any])
    
    inline def setHierarchyGroupIdUndefined: Self = StObject.set(x, "HierarchyGroupId", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
