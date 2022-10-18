package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopReplicationTaskResponse extends StObject {
  
  /**
    * The replication task stopped.
    */
  var ReplicationTask: js.UndefOr[typings.awsSdk.clientsDmsMod.ReplicationTask] = js.undefined
}
object StopReplicationTaskResponse {
  
  inline def apply(): StopReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopReplicationTaskResponse]
  }
  
  extension [Self <: StopReplicationTaskResponse](x: Self) {
    
    inline def setReplicationTask(value: ReplicationTask): Self = StObject.set(x, "ReplicationTask", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskUndefined: Self = StObject.set(x, "ReplicationTask", js.undefined)
  }
}
