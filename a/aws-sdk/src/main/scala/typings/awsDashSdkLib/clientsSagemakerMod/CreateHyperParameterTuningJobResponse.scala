package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHyperParameterTuningJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker assigns an ARN to a hyperparameter tuning job when you create it.
    */
  var HyperParameterTuningJobArn: awsDashSdkLib.clientsSagemakerMod.HyperParameterTuningJobArn
}

object CreateHyperParameterTuningJobResponse {
  @scala.inline
  def apply(HyperParameterTuningJobArn: HyperParameterTuningJobArn): CreateHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobArn = HyperParameterTuningJobArn)
  
    __obj.asInstanceOf[CreateHyperParameterTuningJobResponse]
  }
}

