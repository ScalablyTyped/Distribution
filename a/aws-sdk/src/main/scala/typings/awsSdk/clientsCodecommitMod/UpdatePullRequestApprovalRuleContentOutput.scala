package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePullRequestApprovalRuleContentOutput extends StObject {
  
  /**
    * Information about the updated approval rule.
    */
  var approvalRule: ApprovalRule
}
object UpdatePullRequestApprovalRuleContentOutput {
  
  inline def apply(approvalRule: ApprovalRule): UpdatePullRequestApprovalRuleContentOutput = {
    val __obj = js.Dynamic.literal(approvalRule = approvalRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestApprovalRuleContentOutput]
  }
  
  extension [Self <: UpdatePullRequestApprovalRuleContentOutput](x: Self) {
    
    inline def setApprovalRule(value: ApprovalRule): Self = StObject.set(x, "approvalRule", value.asInstanceOf[js.Any])
  }
}
