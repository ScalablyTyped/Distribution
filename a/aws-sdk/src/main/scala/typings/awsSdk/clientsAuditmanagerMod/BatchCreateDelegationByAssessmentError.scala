package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateDelegationByAssessmentError extends StObject {
  
  /**
    *  The API request to batch create delegations in Audit Manager. 
    */
  var createDelegationRequest: js.UndefOr[CreateDelegationRequest] = js.undefined
  
  /**
    *  The error code that the BatchCreateDelegationByAssessment API returned. 
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    *  The error message that the BatchCreateDelegationByAssessment API returned. 
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
}
object BatchCreateDelegationByAssessmentError {
  
  inline def apply(): BatchCreateDelegationByAssessmentError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateDelegationByAssessmentError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateDelegationByAssessmentError] (val x: Self) extends AnyVal {
    
    inline def setCreateDelegationRequest(value: CreateDelegationRequest): Self = StObject.set(x, "createDelegationRequest", value.asInstanceOf[js.Any])
    
    inline def setCreateDelegationRequestUndefined: Self = StObject.set(x, "createDelegationRequest", js.undefined)
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
