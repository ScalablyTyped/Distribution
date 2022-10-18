package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationInstanceMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replication instance to be deleted.
    */
  var ReplicationInstanceArn: String
}
object DeleteReplicationInstanceMessage {
  
  inline def apply(ReplicationInstanceArn: String): DeleteReplicationInstanceMessage = {
    val __obj = js.Dynamic.literal(ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationInstanceMessage]
  }
  
  extension [Self <: DeleteReplicationInstanceMessage](x: Self) {
    
    inline def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
  }
}
