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
  def apply(FleetArn: FleetArn, MaxResults: Int | Double = null, NextToken: NextToken = null): ListDevicesRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDevicesRequest]
  }
}

