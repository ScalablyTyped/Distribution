package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergePullRequestByFastForwardOutput extends js.Object {
  /**
    * Information about the specified pull request, including the merge.
    */
  var pullRequest: js.UndefOr[PullRequest] = js.native
}

object MergePullRequestByFastForwardOutput {
  @scala.inline
  def apply(pullRequest: PullRequest = null): MergePullRequestByFastForwardOutput = {
    val __obj = js.Dynamic.literal()
    if (pullRequest != null) __obj.updateDynamic("pullRequest")(pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePullRequestByFastForwardOutput]
  }
}

