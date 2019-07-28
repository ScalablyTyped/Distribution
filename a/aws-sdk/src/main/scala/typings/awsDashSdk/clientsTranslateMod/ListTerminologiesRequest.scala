package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTerminologiesRequest extends js.Object {
  /**
    * The maximum number of custom terminologies returned per list request.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  /**
    * If the result of the request to ListTerminologies was truncated, include the NextToken to fetch the next group of custom terminologies. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsTranslateMod.NextToken] = js.undefined
}

object ListTerminologiesRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined, NextToken: NextToken = null): ListTerminologiesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTerminologiesRequest]
  }
}

