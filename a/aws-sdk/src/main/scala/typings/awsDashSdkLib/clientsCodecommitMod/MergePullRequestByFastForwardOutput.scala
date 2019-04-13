package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergePullRequestByFastForwardOutput extends js.Object {
  /**
    * Information about the specified pull request, including information about the merge.
    */
  var pullRequest: js.UndefOr[PullRequest] = js.undefined
}

object MergePullRequestByFastForwardOutput {
  @scala.inline
  def apply(pullRequest: PullRequest = null): MergePullRequestByFastForwardOutput = {
    val __obj = js.Dynamic.literal()
    if (pullRequest != null) __obj.updateDynamic("pullRequest")(pullRequest)
    __obj.asInstanceOf[MergePullRequestByFastForwardOutput]
  }
}

