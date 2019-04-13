package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestTarget extends js.Object {
  /**
    * The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or will be merged.
    */
  var destinationCommit: js.UndefOr[CommitId] = js.undefined
  /**
    * The branch of the repository where the pull request changes will be merged into. Also known as the destination branch. 
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.undefined
  /**
    * The commit ID of the most recent commit that the source branch and the destination branch have in common.
    */
  var mergeBase: js.UndefOr[CommitId] = js.undefined
  /**
    * Returns metadata about the state of the merge, including whether the merge has been made.
    */
  var mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined
  /**
    * The name of the repository that contains the pull request source and destination branches.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  /**
    * The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is updated by a push while the pull request is open, the commit ID will change to reflect the new tip of the branch.
    */
  var sourceCommit: js.UndefOr[CommitId] = js.undefined
  /**
    * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
    */
  var sourceReference: js.UndefOr[ReferenceName] = js.undefined
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
    if (destinationCommit != null) __obj.updateDynamic("destinationCommit")(destinationCommit)
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference)
    if (mergeBase != null) __obj.updateDynamic("mergeBase")(mergeBase)
    if (mergeMetadata != null) __obj.updateDynamic("mergeMetadata")(mergeMetadata)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    if (sourceCommit != null) __obj.updateDynamic("sourceCommit")(sourceCommit)
    if (sourceReference != null) __obj.updateDynamic("sourceReference")(sourceReference)
    __obj.asInstanceOf[PullRequestTarget]
  }
}

