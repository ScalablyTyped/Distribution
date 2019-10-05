package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDevicesRequest extends js.Object {
  /**
    * The type of the device, such as "button".
    */
  var DeviceType: js.UndefOr[__string] = js.undefined
  /**
    * The maximum number of results to return per request. If not set, a default value of
    100 is used.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsIot1clickdevicesserviceMod.MaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListDevicesRequest {
  @scala.inline
  def apply(DeviceType: __string = null, MaxResults: Int | Double = null, NextToken: __string = null): ListDevicesRequest = {
    val __obj = js.Dynamic.literal()
    if (DeviceType != null) __obj.updateDynamic("DeviceType")(DeviceType)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDevicesRequest]
  }
}

