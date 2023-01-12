package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationInstanceTaskLog extends StObject {
  
  /**
    * The size, in bytes, of the replication task log.
    */
  var ReplicationInstanceTaskLogSize: js.UndefOr[Long] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the replication task.
    */
  var ReplicationTaskName: js.UndefOr[String] = js.undefined
}
object ReplicationInstanceTaskLog {
  
  inline def apply(): ReplicationInstanceTaskLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationInstanceTaskLog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationInstanceTaskLog] (val x: Self) extends AnyVal {
    
    inline def setReplicationInstanceTaskLogSize(value: Long): Self = StObject.set(x, "ReplicationInstanceTaskLogSize", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceTaskLogSizeUndefined: Self = StObject.set(x, "ReplicationInstanceTaskLogSize", js.undefined)
    
    inline def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskArnUndefined: Self = StObject.set(x, "ReplicationTaskArn", js.undefined)
    
    inline def setReplicationTaskName(value: String): Self = StObject.set(x, "ReplicationTaskName", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskNameUndefined: Self = StObject.set(x, "ReplicationTaskName", js.undefined)
  }
}
