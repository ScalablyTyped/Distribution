package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestSourceReferenceUpdatedEventMetadata extends js.Object {
  /**
    * The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull request was updated.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was updated.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The commit ID of the most recent commit that the source branch and the destination branch have in common.
    */
  var mergeBase: js.UndefOr[CommitId] = js.native
  /**
    * The name of the repository where the pull request was updated.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object PullRequestSourceReferenceUpdatedEventMetadata {
  @scala.inline
  def apply(
    afterCommitId: CommitId = null,
    beforeCommitId: CommitId = null,
    mergeBase: CommitId = null,
    repositoryName: RepositoryName = null
  ): PullRequestSourceReferenceUpdatedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (mergeBase != null) __obj.updateDynamic("mergeBase")(mergeBase.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestSourceReferenceUpdatedEventMetadata]
  }
}

