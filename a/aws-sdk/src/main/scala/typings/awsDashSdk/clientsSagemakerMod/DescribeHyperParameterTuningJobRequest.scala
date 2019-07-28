package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHyperParameterTuningJobRequest extends js.Object {
  /**
    * The name of the tuning job to describe.
    */
  var HyperParameterTuningJobName: typings.awsDashSdk.clientsSagemakerMod.HyperParameterTuningJobName
}

object DescribeHyperParameterTuningJobRequest {
  @scala.inline
  def apply(HyperParameterTuningJobName: HyperParameterTuningJobName): DescribeHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobName = HyperParameterTuningJobName)
  
    __obj.asInstanceOf[DescribeHyperParameterTuningJobRequest]
  }
}

