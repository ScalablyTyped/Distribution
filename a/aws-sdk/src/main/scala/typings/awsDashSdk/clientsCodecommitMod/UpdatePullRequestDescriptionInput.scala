package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePullRequestDescriptionInput extends js.Object {
  /**
    * The updated content of the description for the pull request. This content will replace the existing description.
    */
  var description: Description
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
}

object UpdatePullRequestDescriptionInput {
  @scala.inline
  def apply(description: Description, pullRequestId: PullRequestId): UpdatePullRequestDescriptionInput = {
    val __obj = js.Dynamic.literal(description = description, pullRequestId = pullRequestId)
  
    __obj.asInstanceOf[UpdatePullRequestDescriptionInput]
  }
}

