package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchDevicesResponse extends js.Object {
  /**
    * The devices that meet the specified set of filter criteria, in sort order.
    */
  var Devices: js.UndefOr[DeviceDataList] = js.undefined
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  /**
    * The total number of devices returned.
    */
  var TotalCount: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.TotalCount] = js.undefined
}

object SearchDevicesResponse {
  @scala.inline
  def apply(Devices: DeviceDataList = null, NextToken: NextToken = null, TotalCount: Int | Double = null): SearchDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (Devices != null) __obj.updateDynamic("Devices")(Devices)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDevicesResponse]
  }
}

