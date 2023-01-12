package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplicationTaskResponse extends StObject {
  
  /**
    * The replication task that was created.
    */
  var ReplicationTask: js.UndefOr[typings.awsSdk.clientsDmsMod.ReplicationTask] = js.undefined
}
object CreateReplicationTaskResponse {
  
  inline def apply(): CreateReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateReplicationTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setReplicationTask(value: ReplicationTask): Self = StObject.set(x, "ReplicationTask", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskUndefined: Self = StObject.set(x, "ReplicationTask", js.undefined)
  }
}
