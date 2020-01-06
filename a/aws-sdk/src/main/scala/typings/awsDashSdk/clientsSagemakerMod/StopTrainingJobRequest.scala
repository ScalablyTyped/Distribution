package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTrainingJobRequest extends js.Object {
  /**
    * The name of the training job to stop.
    */
  var TrainingJobName: typings.awsDashSdk.clientsSagemakerMod.TrainingJobName = js.native
}

object StopTrainingJobRequest {
  @scala.inline
  def apply(TrainingJobName: TrainingJobName): StopTrainingJobRequest = {
    val __obj = js.Dynamic.literal(TrainingJobName = TrainingJobName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopTrainingJobRequest]
  }
}

