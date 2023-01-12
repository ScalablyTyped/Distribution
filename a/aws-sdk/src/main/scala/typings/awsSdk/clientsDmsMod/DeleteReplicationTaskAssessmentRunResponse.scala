package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationTaskAssessmentRunResponse extends StObject {
  
  /**
    * The ReplicationTaskAssessmentRun object for the deleted assessment run.
    */
  var ReplicationTaskAssessmentRun: js.UndefOr[typings.awsSdk.clientsDmsMod.ReplicationTaskAssessmentRun] = js.undefined
}
object DeleteReplicationTaskAssessmentRunResponse {
  
  inline def apply(): DeleteReplicationTaskAssessmentRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReplicationTaskAssessmentRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteReplicationTaskAssessmentRunResponse] (val x: Self) extends AnyVal {
    
    inline def setReplicationTaskAssessmentRun(value: ReplicationTaskAssessmentRun): Self = StObject.set(x, "ReplicationTaskAssessmentRun", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskAssessmentRunUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentRun", js.undefined)
  }
}
