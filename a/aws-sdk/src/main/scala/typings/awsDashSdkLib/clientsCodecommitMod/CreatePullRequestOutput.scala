package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePullRequestOutput extends js.Object {
  /**
    * Information about the newly created pull request.
    */
  var pullRequest: PullRequest
}

object CreatePullRequestOutput {
  @scala.inline
  def apply(pullRequest: PullRequest): CreatePullRequestOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest)
  
    __obj.asInstanceOf[CreatePullRequestOutput]
  }
}

