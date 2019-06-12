package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMergeConflictsOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.undefined
  /**
    * A list of metadata for any conflicts found.
    */
  var conflictMetadataList: ConflictMetadataList
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId
  /**
    * A Boolean value that indicates whether the code is mergeable by the specified merge option.
    */
  var mergeable: IsMergeable
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId
}

object GetMergeConflictsOutput {
  @scala.inline
  def apply(
    conflictMetadataList: ConflictMetadataList,
    destinationCommitId: ObjectId,
    mergeable: IsMergeable,
    sourceCommitId: ObjectId,
    baseCommitId: ObjectId = null,
    nextToken: NextToken = null
  ): GetMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflictMetadataList = conflictMetadataList, destinationCommitId = destinationCommitId, mergeable = mergeable, sourceCommitId = sourceCommitId)
    if (baseCommitId != null) __obj.updateDynamic("baseCommitId")(baseCommitId)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetMergeConflictsOutput]
  }
}

