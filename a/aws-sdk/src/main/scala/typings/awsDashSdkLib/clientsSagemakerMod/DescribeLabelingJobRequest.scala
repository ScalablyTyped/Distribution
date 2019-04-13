package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLabelingJobRequest extends js.Object {
  /**
    * The name of the labeling job to return information for.
    */
  var LabelingJobName: awsDashSdkLib.clientsSagemakerMod.LabelingJobName
}

object DescribeLabelingJobRequest {
  @scala.inline
  def apply(LabelingJobName: LabelingJobName): DescribeLabelingJobRequest = {
    val __obj = js.Dynamic.literal(LabelingJobName = LabelingJobName)
  
    __obj.asInstanceOf[DescribeLabelingJobRequest]
  }
}

