package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentStatusRequest extends StObject {
  
  /**
    *  The unique identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The current status of the assessment. 
    */
  var status: AssessmentStatus
}
object UpdateAssessmentStatusRequest {
  
  inline def apply(assessmentId: UUID, status: AssessmentStatus): UpdateAssessmentStatusRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssessmentStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAssessmentStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AssessmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
