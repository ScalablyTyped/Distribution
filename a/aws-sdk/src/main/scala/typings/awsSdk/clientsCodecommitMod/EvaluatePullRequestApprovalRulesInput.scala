package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluatePullRequestApprovalRulesInput extends StObject {
  
  /**
    * The system-generated ID of the pull request you want to evaluate.
    */
  var pullRequestId: PullRequestId
  
  /**
    * The system-generated ID for the pull request revision. To retrieve the most recent revision ID for a pull request, use GetPullRequest.
    */
  var revisionId: RevisionId
}
object EvaluatePullRequestApprovalRulesInput {
  
  inline def apply(pullRequestId: PullRequestId, revisionId: RevisionId): EvaluatePullRequestApprovalRulesInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluatePullRequestApprovalRulesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluatePullRequestApprovalRulesInput] (val x: Self) extends AnyVal {
    
    inline def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
  }
}
