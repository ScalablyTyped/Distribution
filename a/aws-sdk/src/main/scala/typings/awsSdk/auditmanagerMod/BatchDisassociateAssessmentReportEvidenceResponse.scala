package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateAssessmentReportEvidenceResponse extends StObject {
  
  /**
    *  A list of errors that the BatchDisassociateAssessmentReportEvidence API returned. 
    */
  var errors: js.UndefOr[AssessmentReportEvidenceErrors] = js.undefined
  
  /**
    *  The identifier for the evidence. 
    */
  var evidenceIds: js.UndefOr[EvidenceIds] = js.undefined
}
object BatchDisassociateAssessmentReportEvidenceResponse {
  
  inline def apply(): BatchDisassociateAssessmentReportEvidenceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateAssessmentReportEvidenceResponse]
  }
  
  extension [Self <: BatchDisassociateAssessmentReportEvidenceResponse](x: Self) {
    
    inline def setErrors(value: AssessmentReportEvidenceErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: AssessmentReportEvidenceError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setEvidenceIds(value: EvidenceIds): Self = StObject.set(x, "evidenceIds", value.asInstanceOf[js.Any])
    
    inline def setEvidenceIdsUndefined: Self = StObject.set(x, "evidenceIds", js.undefined)
    
    inline def setEvidenceIdsVarargs(value: UUID*): Self = StObject.set(x, "evidenceIds", js.Array(value*))
  }
}
