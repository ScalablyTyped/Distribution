package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationTaskAssessmentRunProgress extends StObject {
  
  /**
    * The number of individual assessments that have completed, successfully or not.
    */
  var IndividualAssessmentCompletedCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of individual assessments that are specified to run.
    */
  var IndividualAssessmentCount: js.UndefOr[Integer] = js.undefined
}
object ReplicationTaskAssessmentRunProgress {
  
  inline def apply(): ReplicationTaskAssessmentRunProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTaskAssessmentRunProgress]
  }
  
  extension [Self <: ReplicationTaskAssessmentRunProgress](x: Self) {
    
    inline def setIndividualAssessmentCompletedCount(value: Integer): Self = StObject.set(x, "IndividualAssessmentCompletedCount", value.asInstanceOf[js.Any])
    
    inline def setIndividualAssessmentCompletedCountUndefined: Self = StObject.set(x, "IndividualAssessmentCompletedCount", js.undefined)
    
    inline def setIndividualAssessmentCount(value: Integer): Self = StObject.set(x, "IndividualAssessmentCount", value.asInstanceOf[js.Any])
    
    inline def setIndividualAssessmentCountUndefined: Self = StObject.set(x, "IndividualAssessmentCount", js.undefined)
  }
}
