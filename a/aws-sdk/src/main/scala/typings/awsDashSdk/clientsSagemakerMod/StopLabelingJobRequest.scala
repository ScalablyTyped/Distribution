package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopLabelingJobRequest extends js.Object {
  /**
    * The name of the labeling job to stop.
    */
  var LabelingJobName: typings.awsDashSdk.clientsSagemakerMod.LabelingJobName = js.native
}

object StopLabelingJobRequest {
  @scala.inline
  def apply(LabelingJobName: LabelingJobName): StopLabelingJobRequest = {
    val __obj = js.Dynamic.literal(LabelingJobName = LabelingJobName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopLabelingJobRequest]
  }
}

