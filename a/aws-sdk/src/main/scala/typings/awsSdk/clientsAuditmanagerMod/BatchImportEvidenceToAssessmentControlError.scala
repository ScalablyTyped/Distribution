package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchImportEvidenceToAssessmentControlError extends StObject {
  
  /**
    *  The error code that the BatchImportEvidenceToAssessmentControl API returned. 
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    *  The error message that the BatchImportEvidenceToAssessmentControl API returned. 
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    *  Manual evidence that can't be collected automatically by Audit Manager. 
    */
  var manualEvidence: js.UndefOr[ManualEvidence] = js.undefined
}
object BatchImportEvidenceToAssessmentControlError {
  
  inline def apply(): BatchImportEvidenceToAssessmentControlError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchImportEvidenceToAssessmentControlError]
  }
  
  extension [Self <: BatchImportEvidenceToAssessmentControlError](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setManualEvidence(value: ManualEvidence): Self = StObject.set(x, "manualEvidence", value.asInstanceOf[js.Any])
    
    inline def setManualEvidenceUndefined: Self = StObject.set(x, "manualEvidence", js.undefined)
  }
}
