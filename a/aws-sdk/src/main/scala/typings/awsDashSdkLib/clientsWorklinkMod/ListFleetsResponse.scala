package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFleetsResponse extends js.Object {
  /**
    * The summary list of the fleets.
    */
  var FleetSummaryList: js.UndefOr[FleetSummaryList] = js.undefined
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListFleetsResponse {
  @scala.inline
  def apply(FleetSummaryList: FleetSummaryList = null, NextToken: NextToken = null): ListFleetsResponse = {
    val __obj = js.Dynamic.literal()
    if (FleetSummaryList != null) __obj.updateDynamic("FleetSummaryList")(FleetSummaryList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFleetsResponse]
  }
}

