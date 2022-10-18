package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecreaseReplicaCountResult extends StObject {
  
  var ReplicationGroup: js.UndefOr[typings.awsSdk.clientsElasticacheMod.ReplicationGroup] = js.undefined
}
object DecreaseReplicaCountResult {
  
  inline def apply(): DecreaseReplicaCountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecreaseReplicaCountResult]
  }
  
  extension [Self <: DecreaseReplicaCountResult](x: Self) {
    
    inline def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
