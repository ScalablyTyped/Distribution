package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPullRequestApprovalStatesOutput extends StObject {
  
  /**
    * Information about users who have approved the pull request.
    */
  var approvals: js.UndefOr[ApprovalList] = js.undefined
}
object GetPullRequestApprovalStatesOutput {
  
  inline def apply(): GetPullRequestApprovalStatesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPullRequestApprovalStatesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPullRequestApprovalStatesOutput] (val x: Self) extends AnyVal {
    
    inline def setApprovals(value: ApprovalList): Self = StObject.set(x, "approvals", value.asInstanceOf[js.Any])
    
    inline def setApprovalsUndefined: Self = StObject.set(x, "approvals", js.undefined)
    
    inline def setApprovalsVarargs(value: Approval*): Self = StObject.set(x, "approvals", js.Array(value*))
  }
}
