package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePullRequestApprovalStateInput extends js.Object {
  /**
    * The approval state to associate with the user on the pull request.
    */
  var approvalState: ApprovalState = js.native
  /**
    * The system-generated ID of the pull request.
    */
  var pullRequestId: PullRequestId = js.native
  /**
    * The system-generated ID of the revision.
    */
  var revisionId: RevisionId = js.native
}

object UpdatePullRequestApprovalStateInput {
  @scala.inline
  def apply(approvalState: ApprovalState, pullRequestId: PullRequestId, revisionId: RevisionId): UpdatePullRequestApprovalStateInput = {
    val __obj = js.Dynamic.literal(approvalState = approvalState.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePullRequestApprovalStateInput]
  }
}

