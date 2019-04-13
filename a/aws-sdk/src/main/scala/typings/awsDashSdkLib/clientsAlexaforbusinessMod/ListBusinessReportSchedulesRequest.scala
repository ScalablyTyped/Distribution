package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBusinessReportSchedulesRequest extends js.Object {
  /**
    * The maximum number of schedules listed in the call.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token used to list the remaining schedules from the previous API call.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListBusinessReportSchedulesRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListBusinessReportSchedulesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBusinessReportSchedulesRequest]
  }
}

