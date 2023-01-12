package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReplicationTaskAssessmentMessage extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: String
}
object StartReplicationTaskAssessmentMessage {
  
  inline def apply(ReplicationTaskArn: String): StartReplicationTaskAssessmentMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReplicationTaskAssessmentMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReplicationTaskAssessmentMessage] (val x: Self) extends AnyVal {
    
    inline def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
  }
}
