package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentControlSetStatusRequest extends StObject {
  
  /**
    *  The unique identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The comment that's related to the status update. 
    */
  var comment: DelegationComment
  
  /**
    *  The unique identifier for the control set. 
    */
  var controlSetId: String
  
  /**
    *  The status of the control set that's being updated. 
    */
  var status: ControlSetStatus
}
object UpdateAssessmentControlSetStatusRequest {
  
  inline def apply(assessmentId: UUID, comment: DelegationComment, controlSetId: String, status: ControlSetStatus): UpdateAssessmentControlSetStatusRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], controlSetId = controlSetId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssessmentControlSetStatusRequest]
  }
  
  extension [Self <: UpdateAssessmentControlSetStatusRequest](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setComment(value: DelegationComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setControlSetId(value: String): Self = StObject.set(x, "controlSetId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ControlSetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
