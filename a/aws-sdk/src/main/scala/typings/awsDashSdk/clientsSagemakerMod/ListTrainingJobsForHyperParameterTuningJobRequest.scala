package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrainingJobsForHyperParameterTuningJobRequest extends js.Object {
  /**
    * The name of the tuning job whose training jobs you want to list.
    */
  var HyperParameterTuningJobName: typings.awsDashSdk.clientsSagemakerMod.HyperParameterTuningJobName = js.native
  /**
    * The maximum number of training jobs to return. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxResults] = js.native
  /**
    * If the result of the previous ListTrainingJobsForHyperParameterTuningJob request was truncated, the response includes a NextToken. To retrieve the next set of training jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.native
  /**
    * The field to sort results by. The default is Name. If the value of this field is FinalObjectiveMetricValue, any training jobs that did not return an objective metric are not listed.
    */
  var SortBy: js.UndefOr[TrainingJobSortByOptions] = js.native
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SortOrder] = js.native
  /**
    * A filter that returns only training jobs with the specified status.
    */
  var StatusEquals: js.UndefOr[TrainingJobStatus] = js.native
}

object ListTrainingJobsForHyperParameterTuningJobRequest {
  @scala.inline
  def apply(
    HyperParameterTuningJobName: HyperParameterTuningJobName,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SortBy: TrainingJobSortByOptions = null,
    SortOrder: SortOrder = null,
    StatusEquals: TrainingJobStatus = null
  ): ListTrainingJobsForHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingJobsForHyperParameterTuningJobRequest]
  }
}

