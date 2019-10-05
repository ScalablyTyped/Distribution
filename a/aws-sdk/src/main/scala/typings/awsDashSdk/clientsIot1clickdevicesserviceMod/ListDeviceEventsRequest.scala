package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeviceEventsRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: __string
  /**
    * The start date for the device event query, in ISO8061 format. For example,
    2018-03-28T15:45:12.880Z
    
    */
  var FromTimeStamp: __timestampIso8601
  /**
    * The maximum number of results to return per request. If not set, a default value of
    100 is used.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsIot1clickdevicesserviceMod.MaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * The end date for the device event query, in ISO8061 format. For example,
    2018-03-28T15:45:12.880Z
    
    */
  var ToTimeStamp: __timestampIso8601
}

object ListDeviceEventsRequest {
  @scala.inline
  def apply(
    DeviceId: __string,
    FromTimeStamp: __timestampIso8601,
    ToTimeStamp: __timestampIso8601,
    MaxResults: Int | Double = null,
    NextToken: __string = null
  ): ListDeviceEventsRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId, FromTimeStamp = FromTimeStamp, ToTimeStamp = ToTimeStamp)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDeviceEventsRequest]
  }
}

