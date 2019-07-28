package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBatchPredictionOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the BatchPrediction. This value should be identical to the value of the BatchPredictionID in the request.
    */
  var BatchPredictionId: js.UndefOr[EntityId] = js.undefined
}

object DeleteBatchPredictionOutput {
  @scala.inline
  def apply(BatchPredictionId: EntityId = null): DeleteBatchPredictionOutput = {
    val __obj = js.Dynamic.literal()
    if (BatchPredictionId != null) __obj.updateDynamic("BatchPredictionId")(BatchPredictionId)
    __obj.asInstanceOf[DeleteBatchPredictionOutput]
  }
}

