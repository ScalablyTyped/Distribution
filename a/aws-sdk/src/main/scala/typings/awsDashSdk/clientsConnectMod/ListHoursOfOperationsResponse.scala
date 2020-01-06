package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHoursOfOperationsResponse extends js.Object {
  /**
    * Information about the hours of operation.
    */
  var HoursOfOperationSummaryList: js.UndefOr[typings.awsDashSdk.clientsConnectMod.HoursOfOperationSummaryList] = js.native
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConnectMod.NextToken] = js.native
}

object ListHoursOfOperationsResponse {
  @scala.inline
  def apply(HoursOfOperationSummaryList: HoursOfOperationSummaryList = null, NextToken: NextToken = null): ListHoursOfOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (HoursOfOperationSummaryList != null) __obj.updateDynamic("HoursOfOperationSummaryList")(HoursOfOperationSummaryList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHoursOfOperationsResponse]
  }
}

