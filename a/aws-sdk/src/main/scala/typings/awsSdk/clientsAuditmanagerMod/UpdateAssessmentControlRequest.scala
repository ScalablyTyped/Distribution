package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentControlRequest extends StObject {
  
  /**
    *  The unique identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The comment body text for the control. 
    */
  var commentBody: js.UndefOr[ControlCommentBody] = js.undefined
  
  /**
    *  The unique identifier for the control. 
    */
  var controlId: UUID
  
  /**
    *  The unique identifier for the control set. 
    */
  var controlSetId: ControlSetId
  
  /**
    *  The status of the control. 
    */
  var controlStatus: js.UndefOr[ControlStatus] = js.undefined
}
object UpdateAssessmentControlRequest {
  
  inline def apply(assessmentId: UUID, controlId: UUID, controlSetId: ControlSetId): UpdateAssessmentControlRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], controlId = controlId.asInstanceOf[js.Any], controlSetId = controlSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssessmentControlRequest]
  }
  
  extension [Self <: UpdateAssessmentControlRequest](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setCommentBody(value: ControlCommentBody): Self = StObject.set(x, "commentBody", value.asInstanceOf[js.Any])
    
    inline def setCommentBodyUndefined: Self = StObject.set(x, "commentBody", js.undefined)
    
    inline def setControlId(value: UUID): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
    
    inline def setControlSetId(value: ControlSetId): Self = StObject.set(x, "controlSetId", value.asInstanceOf[js.Any])
    
    inline def setControlStatus(value: ControlStatus): Self = StObject.set(x, "controlStatus", value.asInstanceOf[js.Any])
    
    inline def setControlStatusUndefined: Self = StObject.set(x, "controlStatus", js.undefined)
  }
}
