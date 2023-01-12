package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateAssessmentReportEvidenceRequest extends StObject {
  
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
object BatchAssociateAssessmentReportEvidenceRequest {
  
  inline def apply(assessmentId: UUID, evidenceFolderId: UUID, evidenceIds: EvidenceIds): BatchAssociateAssessmentReportEvidenceRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], evidenceFolderId = evidenceFolderId.asInstanceOf[js.Any], evidenceIds = evidenceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateAssessmentReportEvidenceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchAssociateAssessmentReportEvidenceRequest] (val x: Self) extends AnyVal {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setEvidenceFolderId(value: UUID): Self = StObject.set(x, "evidenceFolderId", value.asInstanceOf[js.Any])
    
    inline def setEvidenceIds(value: EvidenceIds): Self = StObject.set(x, "evidenceIds", value.asInstanceOf[js.Any])
    
    inline def setEvidenceIdsVarargs(value: UUID*): Self = StObject.set(x, "evidenceIds", js.Array(value*))
  }
}
