package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteDelegationByAssessmentRequest extends StObject {
  
  /**
    *  The identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The identifiers for the delegations. 
    */
  var delegationIds: DelegationIds
}
object BatchDeleteDelegationByAssessmentRequest {
  
  inline def apply(assessmentId: UUID, delegationIds: DelegationIds): BatchDeleteDelegationByAssessmentRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], delegationIds = delegationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteDelegationByAssessmentRequest]
  }
  
  extension [Self <: BatchDeleteDelegationByAssessmentRequest](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setDelegationIds(value: DelegationIds): Self = StObject.set(x, "delegationIds", value.asInstanceOf[js.Any])
    
    inline def setDelegationIdsVarargs(value: UUID*): Self = StObject.set(x, "delegationIds", js.Array(value*))
  }
}
