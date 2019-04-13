package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMergeConflictsOutput extends js.Object {
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: CommitId
  /**
    * A Boolean value that indicates whether the code is mergable by the specified merge option.
    */
  var mergeable: IsMergeable
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: CommitId
}

object GetMergeConflictsOutput {
  @scala.inline
  def apply(destinationCommitId: CommitId, mergeable: IsMergeable, sourceCommitId: CommitId): GetMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(destinationCommitId = destinationCommitId, mergeable = mergeable, sourceCommitId = sourceCommitId)
  
    __obj.asInstanceOf[GetMergeConflictsOutput]
  }
}

