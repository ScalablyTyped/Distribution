package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBusinessReportSchedulesRequest extends js.Object {
  /**
    * The maximum number of schedules listed in the call.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.MaxResults] = js.undefined
  /**
    * The token used to list the remaining schedules from the previous API call.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}

object ListBusinessReportSchedulesRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: NextToken = null): ListBusinessReportSchedulesRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBusinessReportSchedulesRequest]
  }
}

