package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMergeConflictsOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.undefined
  /**
    * Contains metadata about the conflicts found in the merge.
    */
  var conflictMetadata: ConflictMetadata
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId
  /**
    * A list of merge hunks of the differences between the files or lines.
    */
  var mergeHunks: MergeHunks
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId
}

object DescribeMergeConflictsOutput {
  @scala.inline
  def apply(
    conflictMetadata: ConflictMetadata,
    destinationCommitId: ObjectId,
    mergeHunks: MergeHunks,
    sourceCommitId: ObjectId,
    baseCommitId: ObjectId = null,
    nextToken: NextToken = null
  ): DescribeMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflictMetadata = conflictMetadata, destinationCommitId = destinationCommitId, mergeHunks = mergeHunks, sourceCommitId = sourceCommitId)
    if (baseCommitId != null) __obj.updateDynamic("baseCommitId")(baseCommitId)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeMergeConflictsOutput]
  }
}

