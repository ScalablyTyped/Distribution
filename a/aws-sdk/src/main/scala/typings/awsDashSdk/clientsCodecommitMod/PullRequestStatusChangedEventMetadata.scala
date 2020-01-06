package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestStatusChangedEventMetadata extends js.Object {
  /**
    * The changed status of the pull request.
    */
  var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.native
}

object PullRequestStatusChangedEventMetadata {
  @scala.inline
  def apply(pullRequestStatus: PullRequestStatusEnum = null): PullRequestStatusChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (pullRequestStatus != null) __obj.updateDynamic("pullRequestStatus")(pullRequestStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestStatusChangedEventMetadata]
  }
}

