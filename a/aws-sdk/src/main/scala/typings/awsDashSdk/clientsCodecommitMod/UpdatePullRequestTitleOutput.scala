package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePullRequestTitleOutput extends js.Object {
  /**
    * Information about the updated pull request.
    */
  var pullRequest: PullRequest
}

object UpdatePullRequestTitleOutput {
  @scala.inline
  def apply(pullRequest: PullRequest): UpdatePullRequestTitleOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest)
  
    __obj.asInstanceOf[UpdatePullRequestTitleOutput]
  }
}

