package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergePullRequestBySquashOutput extends js.Object {
  var pullRequest: js.UndefOr[PullRequest] = js.undefined
}

object MergePullRequestBySquashOutput {
  @scala.inline
  def apply(pullRequest: PullRequest = null): MergePullRequestBySquashOutput = {
    val __obj = js.Dynamic.literal()
    if (pullRequest != null) __obj.updateDynamic("pullRequest")(pullRequest)
    __obj.asInstanceOf[MergePullRequestBySquashOutput]
  }
}

