package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePullRequestApprovalRuleInput extends StObject {
  
  /**
    * The name of the approval rule you want to delete.
    */
  var approvalRuleName: ApprovalRuleName
  
  /**
    * The system-generated ID of the pull request that contains the approval rule you want to delete.
    */
  var pullRequestId: PullRequestId
}
object DeletePullRequestApprovalRuleInput {
  
  inline def apply(approvalRuleName: ApprovalRuleName, pullRequestId: PullRequestId): DeletePullRequestApprovalRuleInput = {
    val __obj = js.Dynamic.literal(approvalRuleName = approvalRuleName.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePullRequestApprovalRuleInput]
  }
  
  extension [Self <: DeletePullRequestApprovalRuleInput](x: Self) {
    
    inline def setApprovalRuleName(value: ApprovalRuleName): Self = StObject.set(x, "approvalRuleName", value.asInstanceOf[js.Any])
    
    inline def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
  }
}
