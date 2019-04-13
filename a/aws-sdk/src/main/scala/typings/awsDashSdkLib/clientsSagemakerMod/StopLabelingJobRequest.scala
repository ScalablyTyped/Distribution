package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopLabelingJobRequest extends js.Object {
  /**
    * The name of the labeling job to stop.
    */
  var LabelingJobName: awsDashSdkLib.clientsSagemakerMod.LabelingJobName
}

object StopLabelingJobRequest {
  @scala.inline
  def apply(LabelingJobName: LabelingJobName): StopLabelingJobRequest = {
    val __obj = js.Dynamic.literal(LabelingJobName = LabelingJobName)
  
    __obj.asInstanceOf[StopLabelingJobRequest]
  }
}

