package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHarvestJobsRequest extends js.Object {
  /**
    * When specified, the request will return only HarvestJobs associated with the given Channel ID.
    */
  var IncludeChannelId: js.UndefOr[__string] = js.undefined
  /**
    * When specified, the request will return only HarvestJobs in the given status.
    */
  var IncludeStatus: js.UndefOr[__string] = js.undefined
  /**
    * The upper bound on the number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.MaxResults] = js.undefined
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListHarvestJobsRequest {
  @scala.inline
  def apply(
    IncludeChannelId: __string = null,
    IncludeStatus: __string = null,
    MaxResults: Int | Double = null,
    NextToken: __string = null
  ): ListHarvestJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (IncludeChannelId != null) __obj.updateDynamic("IncludeChannelId")(IncludeChannelId)
    if (IncludeStatus != null) __obj.updateDynamic("IncludeStatus")(IncludeStatus)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListHarvestJobsRequest]
  }
}

