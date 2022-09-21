package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchImportEvidenceToAssessmentControlResponse extends StObject {
  
  /**
    *  A list of errors that the BatchImportEvidenceToAssessmentControl API returned. 
    */
  var errors: js.UndefOr[BatchImportEvidenceToAssessmentControlErrors] = js.undefined
}
object BatchImportEvidenceToAssessmentControlResponse {
  
  inline def apply(): BatchImportEvidenceToAssessmentControlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchImportEvidenceToAssessmentControlResponse]
  }
  
  extension [Self <: BatchImportEvidenceToAssessmentControlResponse](x: Self) {
    
    inline def setErrors(value: BatchImportEvidenceToAssessmentControlErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: BatchImportEvidenceToAssessmentControlError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
