package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePullRequestStatusOutput extends js.Object {
  /**
    * Information about the pull request.
    */
  var pullRequest: PullRequest
}

object UpdatePullRequestStatusOutput {
  @scala.inline
  def apply(pullRequest: PullRequest): UpdatePullRequestStatusOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest)
  
    __obj.asInstanceOf[UpdatePullRequestStatusOutput]
  }
}

