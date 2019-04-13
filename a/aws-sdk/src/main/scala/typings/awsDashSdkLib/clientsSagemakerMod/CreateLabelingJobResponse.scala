package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLabelingJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the labeling job. You use this ARN to identify the labeling job.
    */
  var LabelingJobArn: awsDashSdkLib.clientsSagemakerMod.LabelingJobArn
}

object CreateLabelingJobResponse {
  @scala.inline
  def apply(LabelingJobArn: LabelingJobArn): CreateLabelingJobResponse = {
    val __obj = js.Dynamic.literal(LabelingJobArn = LabelingJobArn)
  
    __obj.asInstanceOf[CreateLabelingJobResponse]
  }
}

