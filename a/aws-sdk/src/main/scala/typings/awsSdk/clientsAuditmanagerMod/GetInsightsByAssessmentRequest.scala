package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightsByAssessmentRequest extends StObject {
  
  /**
    * The unique identifier for the assessment. 
    */
  var assessmentId: UUID
}
object GetInsightsByAssessmentRequest {
  
  inline def apply(assessmentId: UUID): GetInsightsByAssessmentRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightsByAssessmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInsightsByAssessmentRequest] (val x: Self) extends AnyVal {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
  }
}
