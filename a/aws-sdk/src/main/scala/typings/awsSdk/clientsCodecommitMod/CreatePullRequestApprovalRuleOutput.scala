package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePullRequestApprovalRuleOutput extends StObject {
  
  /**
    * Information about the created approval rule.
    */
  var approvalRule: ApprovalRule
}
object CreatePullRequestApprovalRuleOutput {
  
  inline def apply(approvalRule: ApprovalRule): CreatePullRequestApprovalRuleOutput = {
    val __obj = js.Dynamic.literal(approvalRule = approvalRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePullRequestApprovalRuleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePullRequestApprovalRuleOutput] (val x: Self) extends AnyVal {
    
    inline def setApprovalRule(value: ApprovalRule): Self = StObject.set(x, "approvalRule", value.asInstanceOf[js.Any])
  }
}
