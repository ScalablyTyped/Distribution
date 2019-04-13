package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePullRequestTitleInput extends js.Object {
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
  /**
    * The updated title of the pull request. This will replace the existing title.
    */
  var title: Title
}

object UpdatePullRequestTitleInput {
  @scala.inline
  def apply(pullRequestId: PullRequestId, title: Title): UpdatePullRequestTitleInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId, title = title)
  
    __obj.asInstanceOf[UpdatePullRequestTitleInput]
  }
}

