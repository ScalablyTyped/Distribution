package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrainingJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: typings.awsDashSdk.clientsSagemakerMod.TrainingJobArn = js.native
}

object CreateTrainingJobResponse {
  @scala.inline
  def apply(TrainingJobArn: TrainingJobArn): CreateTrainingJobResponse = {
    val __obj = js.Dynamic.literal(TrainingJobArn = TrainingJobArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateTrainingJobResponse]
  }
}

