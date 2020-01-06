package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopHyperParameterTuningJobRequest extends js.Object {
  /**
    * The name of the tuning job to stop.
    */
  var HyperParameterTuningJobName: typings.awsDashSdk.clientsSagemakerMod.HyperParameterTuningJobName = js.native
}

object StopHyperParameterTuningJobRequest {
  @scala.inline
  def apply(HyperParameterTuningJobName: HyperParameterTuningJobName): StopHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopHyperParameterTuningJobRequest]
  }
}

