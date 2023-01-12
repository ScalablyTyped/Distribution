package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyReplicationGroupShardConfigurationResult extends StObject {
  
  var ReplicationGroup: js.UndefOr[typings.awsSdk.clientsElasticacheMod.ReplicationGroup] = js.undefined
}
object ModifyReplicationGroupShardConfigurationResult {
  
  inline def apply(): ModifyReplicationGroupShardConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationGroupShardConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyReplicationGroupShardConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
