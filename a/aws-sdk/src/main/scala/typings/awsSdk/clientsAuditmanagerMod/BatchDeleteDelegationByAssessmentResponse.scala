package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteDelegationByAssessmentResponse extends StObject {
  
  /**
    *  A list of errors that the BatchDeleteDelegationByAssessment API returned. 
    */
  var errors: js.UndefOr[BatchDeleteDelegationByAssessmentErrors] = js.undefined
}
object BatchDeleteDelegationByAssessmentResponse {
  
  inline def apply(): BatchDeleteDelegationByAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteDelegationByAssessmentResponse]
  }
  
  extension [Self <: BatchDeleteDelegationByAssessmentResponse](x: Self) {
    
    inline def setErrors(value: BatchDeleteDelegationByAssessmentErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: BatchDeleteDelegationByAssessmentError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
