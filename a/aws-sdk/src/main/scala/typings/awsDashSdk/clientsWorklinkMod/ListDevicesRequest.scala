package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDevicesRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
  /**
    * The maximum number of results to be included in the next page.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.MaxResults] = js.undefined
  /**
    * The pagination token used to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.NextToken] = js.undefined
}

object ListDevicesRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListDevicesRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDevicesRequest]
  }
}

