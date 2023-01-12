package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveReplicationTaskMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task that you want to move.
    */
  var ReplicationTaskArn: String
  
  /**
    * The ARN of the replication instance where you want to move the task to.
    */
  var TargetReplicationInstanceArn: String
}
object MoveReplicationTaskMessage {
  
  inline def apply(ReplicationTaskArn: String, TargetReplicationInstanceArn: String): MoveReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any], TargetReplicationInstanceArn = TargetReplicationInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveReplicationTaskMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveReplicationTaskMessage] (val x: Self) extends AnyVal {
    
    inline def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    inline def setTargetReplicationInstanceArn(value: String): Self = StObject.set(x, "TargetReplicationInstanceArn", value.asInstanceOf[js.Any])
  }
}
