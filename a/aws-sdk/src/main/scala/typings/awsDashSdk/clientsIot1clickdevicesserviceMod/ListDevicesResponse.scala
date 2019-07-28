package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDevicesResponse extends js.Object {
  /**
    * A list of devices.
    */
  var Devices: js.UndefOr[__listOfDeviceDescription] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListDevicesResponse {
  @scala.inline
  def apply(Devices: __listOfDeviceDescription = null, NextToken: __string = null): ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (Devices != null) __obj.updateDynamic("Devices")(Devices)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDevicesResponse]
  }
}

