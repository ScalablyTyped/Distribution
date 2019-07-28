package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeviceEventsResponse extends js.Object {
  /**
    * The device events requested for the device ARN.
    */
  var DeviceEvents: js.UndefOr[DeviceEventList] = js.undefined
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}

object ListDeviceEventsResponse {
  @scala.inline
  def apply(DeviceEvents: DeviceEventList = null, NextToken: NextToken = null): ListDeviceEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (DeviceEvents != null) __obj.updateDynamic("DeviceEvents")(DeviceEvents)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDeviceEventsResponse]
  }
}

