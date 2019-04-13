package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPullRequestOutput extends js.Object {
  /**
    * Information about the specified pull request.
    */
  var pullRequest: PullRequest
}

object GetPullRequestOutput {
  @scala.inline
  def apply(pullRequest: PullRequest): GetPullRequestOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest)
  
    __obj.asInstanceOf[GetPullRequestOutput]
  }
}

