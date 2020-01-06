package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeviceResponse extends js.Object {
  /**
    * Device details.
    */
  var DeviceDescription: js.UndefOr[typings.awsDashSdk.clientsIot1clickdevicesserviceMod.DeviceDescription] = js.native
}

object DescribeDeviceResponse {
  @scala.inline
  def apply(DeviceDescription: DeviceDescription = null): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (DeviceDescription != null) __obj.updateDynamic("DeviceDescription")(DeviceDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
}

