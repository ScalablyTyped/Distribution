package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMergeOptionsOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: ObjectId
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId
  /**
    * The merge option or strategy used to merge the code.
    */
  var mergeOptions: MergeOptions
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId
}

object GetMergeOptionsOutput {
  @scala.inline
  def apply(
    baseCommitId: ObjectId,
    destinationCommitId: ObjectId,
    mergeOptions: MergeOptions,
    sourceCommitId: ObjectId
  ): GetMergeOptionsOutput = {
    val __obj = js.Dynamic.literal(baseCommitId = baseCommitId, destinationCommitId = destinationCommitId, mergeOptions = mergeOptions, sourceCommitId = sourceCommitId)
  
    __obj.asInstanceOf[GetMergeOptionsOutput]
  }
}

