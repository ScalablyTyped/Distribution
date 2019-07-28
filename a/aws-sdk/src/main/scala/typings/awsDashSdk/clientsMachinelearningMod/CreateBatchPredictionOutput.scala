package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBatchPredictionOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the BatchPrediction. This value is identical to the value of the BatchPredictionId in the request.
    */
  var BatchPredictionId: js.UndefOr[EntityId] = js.undefined
}

object CreateBatchPredictionOutput {
  @scala.inline
  def apply(BatchPredictionId: EntityId = null): CreateBatchPredictionOutput = {
    val __obj = js.Dynamic.literal()
    if (BatchPredictionId != null) __obj.updateDynamic("BatchPredictionId")(BatchPredictionId)
    __obj.asInstanceOf[CreateBatchPredictionOutput]
  }
}

