package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateDelegationByAssessmentRequest extends StObject {
  
  /**
    *  The identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The API request to batch create delegations in Audit Manager. 
    */
  var createDelegationRequests: CreateDelegationRequests
}
object BatchCreateDelegationByAssessmentRequest {
  
  inline def apply(assessmentId: UUID, createDelegationRequests: CreateDelegationRequests): BatchCreateDelegationByAssessmentRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], createDelegationRequests = createDelegationRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateDelegationByAssessmentRequest]
  }
  
  extension [Self <: BatchCreateDelegationByAssessmentRequest](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setCreateDelegationRequests(value: CreateDelegationRequests): Self = StObject.set(x, "createDelegationRequests", value.asInstanceOf[js.Any])
    
    inline def setCreateDelegationRequestsVarargs(value: CreateDelegationRequest*): Self = StObject.set(x, "createDelegationRequests", js.Array(value*))
  }
}
