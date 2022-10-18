package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyComplianceStatus extends StObject {
  
  /**
    * An array of EvaluationResult objects.
    */
  var EvaluationResults: js.UndefOr[typings.awsSdk.clientsFmsMod.EvaluationResults] = js.undefined
  
  /**
    * Details about problems with dependent services, such as WAF or Config, and the error message received that indicates the problem with the service.
    */
  var IssueInfoMap: js.UndefOr[typings.awsSdk.clientsFmsMod.IssueInfoMap] = js.undefined
  
  /**
    * Timestamp of the last update to the EvaluationResult objects.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The member account ID.
    */
  var MemberAccount: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The ID of the Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.clientsFmsMod.PolicyId] = js.undefined
  
  /**
    * The name of the Firewall Manager policy.
    */
  var PolicyName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The Amazon Web Services account that created the Firewall Manager policy.
    */
  var PolicyOwner: js.UndefOr[AWSAccountId] = js.undefined
}
object PolicyComplianceStatus {
  
  inline def apply(): PolicyComplianceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyComplianceStatus]
  }
  
  extension [Self <: PolicyComplianceStatus](x: Self) {
    
    inline def setEvaluationResults(value: EvaluationResults): Self = StObject.set(x, "EvaluationResults", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultsUndefined: Self = StObject.set(x, "EvaluationResults", js.undefined)
    
    inline def setEvaluationResultsVarargs(value: EvaluationResult*): Self = StObject.set(x, "EvaluationResults", js.Array(value*))
    
    inline def setIssueInfoMap(value: IssueInfoMap): Self = StObject.set(x, "IssueInfoMap", value.asInstanceOf[js.Any])
    
    inline def setIssueInfoMapUndefined: Self = StObject.set(x, "IssueInfoMap", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setMemberAccount(value: AWSAccountId): Self = StObject.set(x, "MemberAccount", value.asInstanceOf[js.Any])
    
    inline def setMemberAccountUndefined: Self = StObject.set(x, "MemberAccount", js.undefined)
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    inline def setPolicyName(value: ResourceName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    inline def setPolicyOwner(value: AWSAccountId): Self = StObject.set(x, "PolicyOwner", value.asInstanceOf[js.Any])
    
    inline def setPolicyOwnerUndefined: Self = StObject.set(x, "PolicyOwner", js.undefined)
  }
}
