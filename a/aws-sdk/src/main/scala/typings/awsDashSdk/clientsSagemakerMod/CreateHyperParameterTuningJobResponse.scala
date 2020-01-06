package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHyperParameterTuningJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker assigns an ARN to a hyperparameter tuning job when you create it.
    */
  var HyperParameterTuningJobArn: typings.awsDashSdk.clientsSagemakerMod.HyperParameterTuningJobArn = js.native
}

object CreateHyperParameterTuningJobResponse {
  @scala.inline
  def apply(HyperParameterTuningJobArn: HyperParameterTuningJobArn): CreateHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateHyperParameterTuningJobResponse]
  }
}

