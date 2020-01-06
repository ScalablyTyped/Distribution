package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergePullRequestByThreeWayOutput extends js.Object {
  var pullRequest: js.UndefOr[PullRequest] = js.native
}

object MergePullRequestByThreeWayOutput {
  @scala.inline
  def apply(pullRequest: PullRequest = null): MergePullRequestByThreeWayOutput = {
    val __obj = js.Dynamic.literal()
    if (pullRequest != null) __obj.updateDynamic("pullRequest")(pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePullRequestByThreeWayOutput]
  }
}

