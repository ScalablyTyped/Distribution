package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationTaskAssessmentRunMessage extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the premigration assessment run to be deleted.
    */
  var ReplicationTaskAssessmentRunArn: String
}
object DeleteReplicationTaskAssessmentRunMessage {
  
  inline def apply(ReplicationTaskAssessmentRunArn: String): DeleteReplicationTaskAssessmentRunMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskAssessmentRunArn = ReplicationTaskAssessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationTaskAssessmentRunMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteReplicationTaskAssessmentRunMessage] (val x: Self) extends AnyVal {
    
    inline def setReplicationTaskAssessmentRunArn(value: String): Self = StObject.set(x, "ReplicationTaskAssessmentRunArn", value.asInstanceOf[js.Any])
  }
}
