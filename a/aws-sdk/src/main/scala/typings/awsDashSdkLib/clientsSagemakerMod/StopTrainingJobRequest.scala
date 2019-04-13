package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopTrainingJobRequest extends js.Object {
  /**
    * The name of the training job to stop.
    */
  var TrainingJobName: awsDashSdkLib.clientsSagemakerMod.TrainingJobName
}

object StopTrainingJobRequest {
  @scala.inline
  def apply(TrainingJobName: TrainingJobName): StopTrainingJobRequest = {
    val __obj = js.Dynamic.literal(TrainingJobName = TrainingJobName)
  
    __obj.asInstanceOf[StopTrainingJobRequest]
  }
}

