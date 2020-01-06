package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestTarget extends js.Object {
  /**
    * The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or will be merged.
    */
  var destinationCommit: js.UndefOr[CommitId] = js.native
  /**
    * The branch of the repository where the pull request changes are merged. Also known as the destination branch. 
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.native
  /**
    * The commit ID of the most recent commit that the source branch and the destination branch have in common.
    */
  var mergeBase: js.UndefOr[CommitId] = js.native
  /**
    * Returns metadata about the state of the merge, including whether the merge has been made.
    */
  var mergeMetadata: js.UndefOr[MergeMetadata] = js.native
  /**
    * The name of the repository that contains the pull request source and destination branches.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
  /**
    * The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is updated by a push while the pull request is open, the commit ID changes to reflect the new tip of the branch.
    */
  var sourceCommit: js.UndefOr[CommitId] = js.native
  /**
    * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
    */
  var sourceReference: js.UndefOr[ReferenceName] = js.native
}

object PullRequestTarget {
  @scala.inline
  def apply(
    destinationCommit: CommitId = null,
    destinationReference: ReferenceName = null,
    mergeBase: CommitId = null,
    mergeMetadata: MergeMetadata = null,
    repositoryName: RepositoryName = null,
    sourceCommit: CommitId = null,
    sourceReference: ReferenceName = null
  ): PullRequestTarget = {
    val __obj = js.Dynamic.literal()
    if (destinationCommit != null) __obj.updateDynamic("destinationCommit")(destinationCommit.asInstanceOf[js.Any])
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference.asInstanceOf[js.Any])
    if (mergeBase != null) __obj.updateDynamic("mergeBase")(mergeBase.asInstanceOf[js.Any])
    if (mergeMetadata != null) __obj.updateDynamic("mergeMetadata")(mergeMetadata.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    if (sourceCommit != null) __obj.updateDynamic("sourceCommit")(sourceCommit.asInstanceOf[js.Any])
    if (sourceReference != null) __obj.updateDynamic("sourceReference")(sourceReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestTarget]
  }
}

