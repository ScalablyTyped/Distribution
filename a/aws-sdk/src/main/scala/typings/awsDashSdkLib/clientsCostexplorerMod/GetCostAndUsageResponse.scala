package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCostAndUsageResponse extends js.Object {
  /**
    * The groups that are specified by the Filter or GroupBy parameters in the request.
    */
  var GroupDefinitions: js.UndefOr[GroupDefinitions] = js.undefined
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
  /**
    * The time period that is covered by the results in the response.
    */
  var ResultsByTime: js.UndefOr[ResultsByTime] = js.undefined
}

object GetCostAndUsageResponse {
  @scala.inline
  def apply(
    GroupDefinitions: GroupDefinitions = null,
    NextPageToken: NextPageToken = null,
    ResultsByTime: ResultsByTime = null
  ): GetCostAndUsageResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupDefinitions != null) __obj.updateDynamic("GroupDefinitions")(GroupDefinitions)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (ResultsByTime != null) __obj.updateDynamic("ResultsByTime")(ResultsByTime)
    __obj.asInstanceOf[GetCostAndUsageResponse]
  }
}

