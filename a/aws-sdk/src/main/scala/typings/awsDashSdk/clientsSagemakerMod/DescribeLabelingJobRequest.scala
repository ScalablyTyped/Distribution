package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLabelingJobRequest extends js.Object {
  /**
    * The name of the labeling job to return information for.
    */
  var LabelingJobName: typings.awsDashSdk.clientsSagemakerMod.LabelingJobName = js.native
}

object DescribeLabelingJobRequest {
  @scala.inline
  def apply(LabelingJobName: LabelingJobName): DescribeLabelingJobRequest = {
    val __obj = js.Dynamic.literal(LabelingJobName = LabelingJobName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeLabelingJobRequest]
  }
}

