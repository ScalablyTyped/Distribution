package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDescribeMergeConflictsOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.undefined
  /**
    * A list of conflicts for each file, including the conflict metadata and the hunks of the differences between the files.
    */
  var conflicts: Conflicts
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId
  /**
    * A list of any errors returned while describing the merge conflicts for each file.
    */
  var errors: js.UndefOr[BatchDescribeMergeConflictsErrors] = js.undefined
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId
}

object BatchDescribeMergeConflictsOutput {
  @scala.inline
  def apply(
    conflicts: Conflicts,
    destinationCommitId: ObjectId,
    sourceCommitId: ObjectId,
    baseCommitId: ObjectId = null,
    errors: BatchDescribeMergeConflictsErrors = null,
    nextToken: NextToken = null
  ): BatchDescribeMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflicts = conflicts, destinationCommitId = destinationCommitId, sourceCommitId = sourceCommitId)
    if (baseCommitId != null) __obj.updateDynamic("baseCommitId")(baseCommitId)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[BatchDescribeMergeConflictsOutput]
  }
}

