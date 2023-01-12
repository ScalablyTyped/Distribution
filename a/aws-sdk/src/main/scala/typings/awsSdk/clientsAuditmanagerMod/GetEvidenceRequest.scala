package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEvidenceRequest extends StObject {
  
  /**
    *  The unique identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The unique identifier for the control set. 
    */
  var controlSetId: ControlSetId
  
  /**
    *  The unique identifier for the folder that the evidence is stored in. 
    */
  var evidenceFolderId: UUID
  
  /**
    *  The unique identifier for the evidence. 
    */
  var evidenceId: UUID
}
object GetEvidenceRequest {
  
  inline def apply(assessmentId: UUID, controlSetId: ControlSetId, evidenceFolderId: UUID, evidenceId: UUID): GetEvidenceRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], controlSetId = controlSetId.asInstanceOf[js.Any], evidenceFolderId = evidenceFolderId.asInstanceOf[js.Any], evidenceId = evidenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEvidenceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEvidenceRequest] (val x: Self) extends AnyVal {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setControlSetId(value: ControlSetId): Self = StObject.set(x, "controlSetId", value.asInstanceOf[js.Any])
    
    inline def setEvidenceFolderId(value: UUID): Self = StObject.set(x, "evidenceFolderId", value.asInstanceOf[js.Any])
    
    inline def setEvidenceId(value: UUID): Self = StObject.set(x, "evidenceId", value.asInstanceOf[js.Any])
  }
}
