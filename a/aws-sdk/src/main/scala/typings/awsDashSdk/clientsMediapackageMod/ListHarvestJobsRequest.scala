package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHarvestJobsRequest extends js.Object {
  /**
    * When specified, the request will return only HarvestJobs associated with the given Channel ID.
    */
  var IncludeChannelId: js.UndefOr[__string] = js.native
  /**
    * When specified, the request will return only HarvestJobs in the given status.
    */
  var IncludeStatus: js.UndefOr[__string] = js.native
  /**
    * The upper bound on the number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.MaxResults] = js.native
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[__string] = js.native
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
    if (IncludeChannelId != null) __obj.updateDynamic("IncludeChannelId")(IncludeChannelId.asInstanceOf[js.Any])
    if (IncludeStatus != null) __obj.updateDynamic("IncludeStatus")(IncludeStatus.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHarvestJobsRequest]
  }
}

