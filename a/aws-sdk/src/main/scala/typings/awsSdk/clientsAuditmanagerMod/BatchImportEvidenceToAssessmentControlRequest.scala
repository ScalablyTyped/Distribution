package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchImportEvidenceToAssessmentControlRequest extends StObject {
  
  /**
    *  The identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The identifier for the control. 
    */
  var controlId: UUID
  
  /**
    *  The identifier for the control set. 
    */
  var controlSetId: ControlSetId
  
  /**
    *  The list of manual evidence objects. 
    */
  var manualEvidence: ManualEvidenceList
}
object BatchImportEvidenceToAssessmentControlRequest {
  
  inline def apply(
    assessmentId: UUID,
    controlId: UUID,
    controlSetId: ControlSetId,
    manualEvidence: ManualEvidenceList
  ): BatchImportEvidenceToAssessmentControlRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], controlId = controlId.asInstanceOf[js.Any], controlSetId = controlSetId.asInstanceOf[js.Any], manualEvidence = manualEvidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchImportEvidenceToAssessmentControlRequest]
  }
  
  extension [Self <: BatchImportEvidenceToAssessmentControlRequest](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setControlId(value: UUID): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
    
    inline def setControlSetId(value: ControlSetId): Self = StObject.set(x, "controlSetId", value.asInstanceOf[js.Any])
    
    inline def setManualEvidence(value: ManualEvidenceList): Self = StObject.set(x, "manualEvidence", value.asInstanceOf[js.Any])
    
    inline def setManualEvidenceVarargs(value: ManualEvidence*): Self = StObject.set(x, "manualEvidence", js.Array(value*))
  }
}
