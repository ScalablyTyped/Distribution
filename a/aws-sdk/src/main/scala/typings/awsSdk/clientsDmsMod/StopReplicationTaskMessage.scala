package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopReplicationTaskMessage extends StObject {
  
  /**
    * The Amazon Resource Name(ARN) of the replication task to be stopped.
    */
  var ReplicationTaskArn: String
}
object StopReplicationTaskMessage {
  
  inline def apply(ReplicationTaskArn: String): StopReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopReplicationTaskMessage]
  }
  
  extension [Self <: StopReplicationTaskMessage](x: Self) {
    
    inline def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
  }
}
