package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBatchPredictionInput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the BatchPrediction.
    */
  var BatchPredictionId: EntityId
}

object DeleteBatchPredictionInput {
  @scala.inline
  def apply(BatchPredictionId: EntityId): DeleteBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId)
  
    __obj.asInstanceOf[DeleteBatchPredictionInput]
  }
}

