package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateAssessmentReportEvidenceRequest extends StObject {
  
  /**
    *  The identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The identifier for the folder that the evidence is stored in. 
    */
  var evidenceFolderId: UUID
  
  /**
    *  The list of evidence identifiers. 
    */
  var evidenceIds: EvidenceIds
}
object BatchDisassociateAssessmentReportEvidenceRequest {
  
  inline def apply(assessmentId: UUID, evidenceFolderId: UUID, evidenceIds: EvidenceIds): BatchDisassociateAssessmentReportEvidenceRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], evidenceFolderId = evidenceFolderId.asInstanceOf[js.Any], evidenceIds = evidenceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateAssessmentReportEvidenceRequest]
  }
  
  extension [Self <: BatchDisassociateAssessmentReportEvidenceRequest](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setEvidenceFolderId(value: UUID): Self = StObject.set(x, "evidenceFolderId", value.asInstanceOf[js.Any])
    
    inline def setEvidenceIds(value: EvidenceIds): Self = StObject.set(x, "evidenceIds", value.asInstanceOf[js.Any])
    
    inline def setEvidenceIdsVarargs(value: UUID*): Self = StObject.set(x, "evidenceIds", js.Array(value*))
  }
}
