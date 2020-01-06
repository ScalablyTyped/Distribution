package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMergeCommitOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.native
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: js.UndefOr[ObjectId] = js.native
  /**
    * The commit ID for the merge commit created when the source branch was merged into the destination branch. If the fast-forward merge strategy was used, there is no merge commit.
    */
  var mergedCommitId: js.UndefOr[ObjectId] = js.native
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: js.UndefOr[ObjectId] = js.native
}

object GetMergeCommitOutput {
  @scala.inline
  def apply(
    baseCommitId: ObjectId = null,
    destinationCommitId: ObjectId = null,
    mergedCommitId: ObjectId = null,
    sourceCommitId: ObjectId = null
  ): GetMergeCommitOutput = {
    val __obj = js.Dynamic.literal()
    if (baseCommitId != null) __obj.updateDynamic("baseCommitId")(baseCommitId.asInstanceOf[js.Any])
    if (destinationCommitId != null) __obj.updateDynamic("destinationCommitId")(destinationCommitId.asInstanceOf[js.Any])
    if (mergedCommitId != null) __obj.updateDynamic("mergedCommitId")(mergedCommitId.asInstanceOf[js.Any])
    if (sourceCommitId != null) __obj.updateDynamic("sourceCommitId")(sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeCommitOutput]
  }
}

