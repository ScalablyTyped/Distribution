package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCostAndUsageWithResourcesResponse extends js.Object {
  /**
    * The groups that are specified by the Filter or GroupBy parameters in the request.
    */
  var GroupDefinitions: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.GroupDefinitions] = js.native
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.NextPageToken] = js.native
  /**
    * The time period that is covered by the results in the response.
    */
  var ResultsByTime: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ResultsByTime] = js.native
}

object GetCostAndUsageWithResourcesResponse {
  @scala.inline
  def apply(
    GroupDefinitions: GroupDefinitions = null,
    NextPageToken: NextPageToken = null,
    ResultsByTime: ResultsByTime = null
  ): GetCostAndUsageWithResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupDefinitions != null) __obj.updateDynamic("GroupDefinitions")(GroupDefinitions.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (ResultsByTime != null) __obj.updateDynamic("ResultsByTime")(ResultsByTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCostAndUsageWithResourcesResponse]
  }
}

