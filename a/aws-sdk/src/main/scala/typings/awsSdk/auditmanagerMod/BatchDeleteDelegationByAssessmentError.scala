package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteDelegationByAssessmentError extends StObject {
  
  /**
    *  The identifier for the delegation. 
    */
  var delegationId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The error code that the BatchDeleteDelegationByAssessment API returned. 
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    *  The error message that the BatchDeleteDelegationByAssessment API returned. 
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
}
object BatchDeleteDelegationByAssessmentError {
  
  inline def apply(): BatchDeleteDelegationByAssessmentError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteDelegationByAssessmentError]
  }
  
  extension [Self <: BatchDeleteDelegationByAssessmentError](x: Self) {
    
    inline def setDelegationId(value: UUID): Self = StObject.set(x, "delegationId", value.asInstanceOf[js.Any])
    
    inline def setDelegationIdUndefined: Self = StObject.set(x, "delegationId", js.undefined)
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
