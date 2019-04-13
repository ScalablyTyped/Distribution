package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePullRequestDescriptionOutput extends js.Object {
  /**
    * Information about the updated pull request.
    */
  var pullRequest: PullRequest
}

object UpdatePullRequestDescriptionOutput {
  @scala.inline
  def apply(pullRequest: PullRequest): UpdatePullRequestDescriptionOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest)
  
    __obj.asInstanceOf[UpdatePullRequestDescriptionOutput]
  }
}

