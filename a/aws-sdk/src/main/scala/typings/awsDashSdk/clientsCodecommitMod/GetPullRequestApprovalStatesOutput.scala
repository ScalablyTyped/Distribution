package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPullRequestApprovalStatesOutput extends js.Object {
  /**
    * Information about users who have approved the pull request.
    */
  var approvals: js.UndefOr[ApprovalList] = js.native
}

object GetPullRequestApprovalStatesOutput {
  @scala.inline
  def apply(approvals: ApprovalList = null): GetPullRequestApprovalStatesOutput = {
    val __obj = js.Dynamic.literal()
    if (approvals != null) __obj.updateDynamic("approvals")(approvals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPullRequestApprovalStatesOutput]
  }
}

