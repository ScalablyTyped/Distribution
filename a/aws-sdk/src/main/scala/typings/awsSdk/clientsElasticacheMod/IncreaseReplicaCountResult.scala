package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncreaseReplicaCountResult extends StObject {
  
  var ReplicationGroup: js.UndefOr[typings.awsSdk.clientsElasticacheMod.ReplicationGroup] = js.undefined
}
object IncreaseReplicaCountResult {
  
  inline def apply(): IncreaseReplicaCountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncreaseReplicaCountResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncreaseReplicaCountResult] (val x: Self) extends AnyVal {
    
    inline def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
