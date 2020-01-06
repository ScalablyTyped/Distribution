package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLabelingJobsResponse extends js.Object {
  /**
    * An array of LabelingJobSummary objects, each describing a labeling job.
    */
  var LabelingJobSummaryList: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LabelingJobSummaryList] = js.native
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.native
}

object ListLabelingJobsResponse {
  @scala.inline
  def apply(LabelingJobSummaryList: LabelingJobSummaryList = null, NextToken: NextToken = null): ListLabelingJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (LabelingJobSummaryList != null) __obj.updateDynamic("LabelingJobSummaryList")(LabelingJobSummaryList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLabelingJobsResponse]
  }
}

