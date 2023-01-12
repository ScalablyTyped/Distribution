package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentReportEvidenceError extends StObject {
  
  /**
    *  The error code that the AssessmentReportEvidence API returned. 
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    *  The error message that the AssessmentReportEvidence API returned. 
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    *  The identifier for the evidence. 
    */
  var evidenceId: js.UndefOr[UUID] = js.undefined
}
object AssessmentReportEvidenceError {
  
  inline def apply(): AssessmentReportEvidenceError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentReportEvidenceError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssessmentReportEvidenceError] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setEvidenceId(value: UUID): Self = StObject.set(x, "evidenceId", value.asInstanceOf[js.Any])
    
    inline def setEvidenceIdUndefined: Self = StObject.set(x, "evidenceId", js.undefined)
  }
}
