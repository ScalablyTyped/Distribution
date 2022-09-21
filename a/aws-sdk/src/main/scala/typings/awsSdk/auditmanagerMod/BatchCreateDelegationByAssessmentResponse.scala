package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateDelegationByAssessmentResponse extends StObject {
  
  /**
    *  The delegations that are associated with the assessment. 
    */
  var delegations: js.UndefOr[Delegations] = js.undefined
  
  /**
    *  A list of errors that the BatchCreateDelegationByAssessment API returned. 
    */
  var errors: js.UndefOr[BatchCreateDelegationByAssessmentErrors] = js.undefined
}
object BatchCreateDelegationByAssessmentResponse {
  
  inline def apply(): BatchCreateDelegationByAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateDelegationByAssessmentResponse]
  }
  
  extension [Self <: BatchCreateDelegationByAssessmentResponse](x: Self) {
    
    inline def setDelegations(value: Delegations): Self = StObject.set(x, "delegations", value.asInstanceOf[js.Any])
    
    inline def setDelegationsUndefined: Self = StObject.set(x, "delegations", js.undefined)
    
    inline def setDelegationsVarargs(value: Delegation*): Self = StObject.set(x, "delegations", js.Array(value*))
    
    inline def setErrors(value: BatchCreateDelegationByAssessmentErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: BatchCreateDelegationByAssessmentError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
