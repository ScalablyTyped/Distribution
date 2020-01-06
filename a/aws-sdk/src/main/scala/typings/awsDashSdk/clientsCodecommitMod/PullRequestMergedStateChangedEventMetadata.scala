package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestMergedStateChangedEventMetadata extends js.Object {
  /**
    * The name of the branch that the pull request is merged into.
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.native
  /**
    * Information about the merge state change event.
    */
  var mergeMetadata: js.UndefOr[MergeMetadata] = js.native
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object PullRequestMergedStateChangedEventMetadata {
  @scala.inline
  def apply(
    destinationReference: ReferenceName = null,
    mergeMetadata: MergeMetadata = null,
    repositoryName: RepositoryName = null
  ): PullRequestMergedStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference.asInstanceOf[js.Any])
    if (mergeMetadata != null) __obj.updateDynamic("mergeMetadata")(mergeMetadata.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestMergedStateChangedEventMetadata]
  }
}

