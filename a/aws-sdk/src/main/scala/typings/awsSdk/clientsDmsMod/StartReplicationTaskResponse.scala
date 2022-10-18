package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReplicationTaskResponse extends StObject {
  
  /**
    * The replication task started.
    */
  var ReplicationTask: js.UndefOr[typings.awsSdk.clientsDmsMod.ReplicationTask] = js.undefined
}
object StartReplicationTaskResponse {
  
  inline def apply(): StartReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartReplicationTaskResponse]
  }
  
  extension [Self <: StartReplicationTaskResponse](x: Self) {
    
    inline def setReplicationTask(value: ReplicationTask): Self = StObject.set(x, "ReplicationTask", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskUndefined: Self = StObject.set(x, "ReplicationTask", js.undefined)
  }
}
