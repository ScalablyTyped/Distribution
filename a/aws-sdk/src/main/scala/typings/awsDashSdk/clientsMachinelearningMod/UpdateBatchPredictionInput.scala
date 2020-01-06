package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBatchPredictionInput extends js.Object {
  /**
    * The ID assigned to the BatchPrediction during creation.
    */
  var BatchPredictionId: EntityId = js.native
  /**
    * A new user-supplied name or description of the BatchPrediction.
    */
  var BatchPredictionName: EntityName = js.native
}

object UpdateBatchPredictionInput {
  @scala.inline
  def apply(BatchPredictionId: EntityId, BatchPredictionName: EntityName): UpdateBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId.asInstanceOf[js.Any], BatchPredictionName = BatchPredictionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateBatchPredictionInput]
  }
}

