package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestMergedStateChangedEventMetadata extends js.Object {
  /**
    * The name of the branch that the pull request will be merged into.
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.undefined
  /**
    * Information about the merge state change event.
    */
  var mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}

object PullRequestMergedStateChangedEventMetadata {
  @scala.inline
  def apply(
    destinationReference: ReferenceName = null,
    mergeMetadata: MergeMetadata = null,
    repositoryName: RepositoryName = null
  ): PullRequestMergedStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference)
    if (mergeMetadata != null) __obj.updateDynamic("mergeMetadata")(mergeMetadata)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[PullRequestMergedStateChangedEventMetadata]
  }
}

