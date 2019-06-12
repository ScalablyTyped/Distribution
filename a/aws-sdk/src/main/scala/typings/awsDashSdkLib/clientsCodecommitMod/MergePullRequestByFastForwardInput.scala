package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergePullRequestByFastForwardInput extends js.Object {
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: RepositoryName
  /**
    * The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.
    */
  var sourceCommitId: js.UndefOr[ObjectId] = js.undefined
}

object MergePullRequestByFastForwardInput {
  @scala.inline
  def apply(pullRequestId: PullRequestId, repositoryName: RepositoryName, sourceCommitId: ObjectId = null): MergePullRequestByFastForwardInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId, repositoryName = repositoryName)
    if (sourceCommitId != null) __obj.updateDynamic("sourceCommitId")(sourceCommitId)
    __obj.asInstanceOf[MergePullRequestByFastForwardInput]
  }
}

