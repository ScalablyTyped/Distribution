package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePullRequestApprovalRuleOutput extends StObject {
  
  /**
    * The ID of the deleted approval rule.   If the approval rule was deleted in an earlier API call, the response is 200 OK without content. 
    */
  var approvalRuleId: ApprovalRuleId
}
object DeletePullRequestApprovalRuleOutput {
  
  inline def apply(approvalRuleId: ApprovalRuleId): DeletePullRequestApprovalRuleOutput = {
    val __obj = js.Dynamic.literal(approvalRuleId = approvalRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePullRequestApprovalRuleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePullRequestApprovalRuleOutput] (val x: Self) extends AnyVal {
    
    inline def setApprovalRuleId(value: ApprovalRuleId): Self = StObject.set(x, "approvalRuleId", value.asInstanceOf[js.Any])
  }
}
