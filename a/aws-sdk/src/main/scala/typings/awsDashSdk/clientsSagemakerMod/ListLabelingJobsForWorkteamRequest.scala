package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLabelingJobsForWorkteamRequest extends js.Object {
  /**
    * A filter that returns only labeling jobs created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
  /**
    * A filter that returns only labeling jobs created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
  /**
    * A filter the limits jobs to only the ones whose job reference code contains the specified string.
    */
  var JobReferenceCodeContains: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.JobReferenceCodeContains] = js.undefined
  /**
    * The maximum number of labeling jobs to return in each page of the response.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxResults] = js.undefined
  /**
    * If the result of the previous ListLabelingJobsForWorkteam request was truncated, the response includes a NextToken. To retrieve the next set of labeling jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.undefined
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[ListLabelingJobsForWorkteamSortByOptions] = js.undefined
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SortOrder] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the work team for which you want to see labeling jobs for.
    */
  var WorkteamArn: typings.awsDashSdk.clientsSagemakerMod.WorkteamArn
}

object ListLabelingJobsForWorkteamRequest {
  @scala.inline
  def apply(
    WorkteamArn: WorkteamArn,
    CreationTimeAfter: Timestamp = null,
    CreationTimeBefore: Timestamp = null,
    JobReferenceCodeContains: JobReferenceCodeContains = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SortBy: ListLabelingJobsForWorkteamSortByOptions = null,
    SortOrder: SortOrder = null
  ): ListLabelingJobsForWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamArn = WorkteamArn)
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter)
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore)
    if (JobReferenceCodeContains != null) __obj.updateDynamic("JobReferenceCodeContains")(JobReferenceCodeContains)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLabelingJobsForWorkteamRequest]
  }
}

