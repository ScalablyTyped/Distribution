package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReplicationTaskAssessmentRunResponse extends StObject {
  
  /**
    * The premigration assessment run that was started.
    */
  var ReplicationTaskAssessmentRun: js.UndefOr[typings.awsSdk.clientsDmsMod.ReplicationTaskAssessmentRun] = js.undefined
}
object StartReplicationTaskAssessmentRunResponse {
  
  inline def apply(): StartReplicationTaskAssessmentRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartReplicationTaskAssessmentRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReplicationTaskAssessmentRunResponse] (val x: Self) extends AnyVal {
    
    inline def setReplicationTaskAssessmentRun(value: ReplicationTaskAssessmentRun): Self = StObject.set(x, "ReplicationTaskAssessmentRun", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskAssessmentRunUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentRun", js.undefined)
  }
}
