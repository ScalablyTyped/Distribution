package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPullRequestApprovalStatesInput extends js.Object {
  /**
    * The system-generated ID for the pull request.
    */
  var pullRequestId: PullRequestId = js.native
  /**
    * The system-generated ID for the pull request revision.
    */
  var revisionId: RevisionId = js.native
}

object GetPullRequestApprovalStatesInput {
  @scala.inline
  def apply(pullRequestId: PullRequestId, revisionId: RevisionId): GetPullRequestApprovalStatesInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPullRequestApprovalStatesInput]
  }
}

