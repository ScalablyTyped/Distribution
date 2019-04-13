package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestStatusChangedEventMetadata extends js.Object {
  /**
    * The changed status of the pull request.
    */
  var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined
}

object PullRequestStatusChangedEventMetadata {
  @scala.inline
  def apply(pullRequestStatus: PullRequestStatusEnum = null): PullRequestStatusChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (pullRequestStatus != null) __obj.updateDynamic("pullRequestStatus")(pullRequestStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestStatusChangedEventMetadata]
  }
}

