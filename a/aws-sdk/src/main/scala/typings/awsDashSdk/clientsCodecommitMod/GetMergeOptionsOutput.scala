package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMergeOptionsOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: ObjectId = js.native
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId = js.native
  /**
    * The merge option or strategy used to merge the code.
    */
  var mergeOptions: MergeOptions = js.native
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId = js.native
}

object GetMergeOptionsOutput {
  @scala.inline
  def apply(
    baseCommitId: ObjectId,
    destinationCommitId: ObjectId,
    mergeOptions: MergeOptions,
    sourceCommitId: ObjectId
  ): GetMergeOptionsOutput = {
    val __obj = js.Dynamic.literal(baseCommitId = baseCommitId.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMergeOptionsOutput]
  }
}

