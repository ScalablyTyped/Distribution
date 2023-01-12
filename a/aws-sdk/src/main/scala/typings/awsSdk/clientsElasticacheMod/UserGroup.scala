package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user group.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * The current supported value is Redis. 
    */
  var Engine: js.UndefOr[EngineType] = js.undefined
  
  /**
    * The minimum engine version required, which is Redis 6.0
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A list of updates being applied to the user group.
    */
  var PendingChanges: js.UndefOr[UserGroupPendingChanges] = js.undefined
  
  /**
    * A list of replication groups that the user group can access.
    */
  var ReplicationGroups: js.UndefOr[UGReplicationGroupIdList] = js.undefined
  
  /**
    * Indicates user group status. Can be "creating", "active", "modifying", "deleting".
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the user group.
    */
  var UserGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The list of user IDs that belong to the user group.
    */
  var UserIds: js.UndefOr[UserIdList] = js.undefined
}
object UserGroup {
  
  inline def apply(): UserGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserGroup] (val x: Self) extends AnyVal {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setEngine(value: EngineType): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setMinimumEngineVersion(value: String): Self = StObject.set(x, "MinimumEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumEngineVersionUndefined: Self = StObject.set(x, "MinimumEngineVersion", js.undefined)
    
    inline def setPendingChanges(value: UserGroupPendingChanges): Self = StObject.set(x, "PendingChanges", value.asInstanceOf[js.Any])
    
    inline def setPendingChangesUndefined: Self = StObject.set(x, "PendingChanges", js.undefined)
    
    inline def setReplicationGroups(value: UGReplicationGroupIdList): Self = StObject.set(x, "ReplicationGroups", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupsUndefined: Self = StObject.set(x, "ReplicationGroups", js.undefined)
    
    inline def setReplicationGroupsVarargs(value: String*): Self = StObject.set(x, "ReplicationGroups", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserGroupId(value: String): Self = StObject.set(x, "UserGroupId", value.asInstanceOf[js.Any])
    
    inline def setUserGroupIdUndefined: Self = StObject.set(x, "UserGroupId", js.undefined)
    
    inline def setUserIds(value: UserIdList): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
    
    inline def setUserIdsVarargs(value: UserId*): Self = StObject.set(x, "UserIds", js.Array(value*))
  }
}
