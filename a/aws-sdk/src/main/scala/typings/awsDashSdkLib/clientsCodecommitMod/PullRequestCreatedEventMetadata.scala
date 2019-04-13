package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestCreatedEventMetadata extends js.Object {
  /**
    * The commit ID of the tip of the branch specified as the destination branch when the pull request was created.
    */
  var destinationCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * The commit ID of the most recent commit that the source branch and the destination branch have in common.
    */
  var mergeBase: js.UndefOr[CommitId] = js.undefined
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  /**
    * The commit ID on the source branch used when the pull request was created.
    */
  var sourceCommitId: js.UndefOr[CommitId] = js.undefined
}

object PullRequestCreatedEventMetadata {
  @scala.inline
  def apply(
    destinationCommitId: CommitId = null,
    mergeBase: CommitId = null,
    repositoryName: RepositoryName = null,
    sourceCommitId: CommitId = null
  ): PullRequestCreatedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (destinationCommitId != null) __obj.updateDynamic("destinationCommitId")(destinationCommitId)
    if (mergeBase != null) __obj.updateDynamic("mergeBase")(mergeBase)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    if (sourceCommitId != null) __obj.updateDynamic("sourceCommitId")(sourceCommitId)
    __obj.asInstanceOf[PullRequestCreatedEventMetadata]
  }
}

