package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplicationGroupResult extends StObject {
  
  var ReplicationGroup: js.UndefOr[typings.awsSdk.clientsElasticacheMod.ReplicationGroup] = js.undefined
}
object CreateReplicationGroupResult {
  
  inline def apply(): CreateReplicationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationGroupResult]
  }
  
  extension [Self <: CreateReplicationGroupResult](x: Self) {
    
    inline def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
