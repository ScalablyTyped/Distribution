package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessedUpdateAction extends StObject {
  
  /**
    * The ID of the cache cluster
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the replication group
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the update action on the Redis cluster
    */
  var UpdateActionStatus: js.UndefOr[typings.awsSdk.clientsElasticacheMod.UpdateActionStatus] = js.undefined
}
object ProcessedUpdateAction {
  
  inline def apply(): ProcessedUpdateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessedUpdateAction]
  }
  
  extension [Self <: ProcessedUpdateAction](x: Self) {
    
    inline def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    inline def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateNameUndefined: Self = StObject.set(x, "ServiceUpdateName", js.undefined)
    
    inline def setUpdateActionStatus(value: UpdateActionStatus): Self = StObject.set(x, "UpdateActionStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateActionStatusUndefined: Self = StObject.set(x, "UpdateActionStatus", js.undefined)
  }
}
