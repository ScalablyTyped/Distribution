package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTransformJobsRequest extends js.Object {
  /**
    * A filter that returns only transform jobs created after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
  /**
    * A filter that returns only transform jobs created before the specified time.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
  /**
    * A filter that returns only transform jobs modified after the specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
  /**
    * A filter that returns only transform jobs modified before the specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
  /**
    * The maximum number of transform jobs to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxResults] = js.undefined
  /**
    * A string in the transform job name. This filter returns only transform jobs whose name contains the specified string.
    */
  var NameContains: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NameContains] = js.undefined
  /**
    * If the result of the previous ListTransformJobs request was truncated, the response includes a NextToken. To retrieve the next set of transform jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.undefined
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SortBy] = js.undefined
  /**
    * The sort order for results. The default is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SortOrder] = js.undefined
  /**
    * A filter that retrieves only transform jobs with a specific status.
    */
  var StatusEquals: js.UndefOr[TransformJobStatus] = js.undefined
}

object ListTransformJobsRequest {
  @scala.inline
  def apply(
    CreationTimeAfter: Timestamp = null,
    CreationTimeBefore: Timestamp = null,
    LastModifiedTimeAfter: Timestamp = null,
    LastModifiedTimeBefore: Timestamp = null,
    MaxResults: Int | Double = null,
    NameContains: NameContains = null,
    NextToken: NextToken = null,
    SortBy: SortBy = null,
    SortOrder: SortOrder = null,
    StatusEquals: TransformJobStatus = null
  ): ListTransformJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter)
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore)
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter)
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTransformJobsRequest]
  }
}

