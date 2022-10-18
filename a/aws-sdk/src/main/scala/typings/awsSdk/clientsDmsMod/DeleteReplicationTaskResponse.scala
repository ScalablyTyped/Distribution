package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationTaskResponse extends StObject {
  
  /**
    * The deleted replication task.
    */
  var ReplicationTask: js.UndefOr[typings.awsSdk.clientsDmsMod.ReplicationTask] = js.undefined
}
object DeleteReplicationTaskResponse {
  
  inline def apply(): DeleteReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReplicationTaskResponse]
  }
  
  extension [Self <: DeleteReplicationTaskResponse](x: Self) {
    
    inline def setReplicationTask(value: ReplicationTask): Self = StObject.set(x, "ReplicationTask", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskUndefined: Self = StObject.set(x, "ReplicationTask", js.undefined)
  }
}
