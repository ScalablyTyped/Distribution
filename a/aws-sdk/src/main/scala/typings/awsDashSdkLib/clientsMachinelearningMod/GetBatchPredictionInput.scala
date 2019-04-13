package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBatchPredictionInput extends js.Object {
  /**
    * An ID assigned to the BatchPrediction at creation.
    */
  var BatchPredictionId: EntityId
}

object GetBatchPredictionInput {
  @scala.inline
  def apply(BatchPredictionId: EntityId): GetBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId)
  
    __obj.asInstanceOf[GetBatchPredictionInput]
  }
}

