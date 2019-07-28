package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBatchPredictionInput extends js.Object {
  /**
    * The ID assigned to the BatchPrediction during creation.
    */
  var BatchPredictionId: EntityId
  /**
    * A new user-supplied name or description of the BatchPrediction.
    */
  var BatchPredictionName: EntityName
}

object UpdateBatchPredictionInput {
  @scala.inline
  def apply(BatchPredictionId: EntityId, BatchPredictionName: EntityName): UpdateBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId, BatchPredictionName = BatchPredictionName)
  
    __obj.asInstanceOf[UpdateBatchPredictionInput]
  }
}

