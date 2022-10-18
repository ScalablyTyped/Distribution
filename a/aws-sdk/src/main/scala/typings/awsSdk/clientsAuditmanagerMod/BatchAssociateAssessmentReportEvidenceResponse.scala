package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateAssessmentReportEvidenceResponse extends StObject {
  
  /**
    *  A list of errors that the BatchAssociateAssessmentReportEvidence API returned. 
    */
  var errors: js.UndefOr[AssessmentReportEvidenceErrors] = js.undefined
  
  /**
    *  The list of evidence identifiers. 
    */
  var evidenceIds: js.UndefOr[EvidenceIds] = js.undefined
}
object BatchAssociateAssessmentReportEvidenceResponse {
  
  inline def apply(): BatchAssociateAssessmentReportEvidenceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateAssessmentReportEvidenceResponse]
  }
  
  extension [Self <: BatchAssociateAssessmentReportEvidenceResponse](x: Self) {
    
    inline def setErrors(value: AssessmentReportEvidenceErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: AssessmentReportEvidenceError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setEvidenceIds(value: EvidenceIds): Self = StObject.set(x, "evidenceIds", value.asInstanceOf[js.Any])
    
    inline def setEvidenceIdsUndefined: Self = StObject.set(x, "evidenceIds", js.undefined)
    
    inline def setEvidenceIdsVarargs(value: UUID*): Self = StObject.set(x, "evidenceIds", js.Array(value*))
  }
}
