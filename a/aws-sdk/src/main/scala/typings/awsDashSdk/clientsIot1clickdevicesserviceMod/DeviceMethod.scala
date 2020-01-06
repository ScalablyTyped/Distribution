package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMethod extends js.Object {
  /**
    * The type of the device, such as "button".
    */
  var DeviceType: js.UndefOr[__string] = js.native
  /**
    * The name of the method applicable to the deviceType.
    */
  var MethodName: js.UndefOr[__string] = js.native
}

object DeviceMethod {
  @scala.inline
  def apply(DeviceType: __string = null, MethodName: __string = null): DeviceMethod = {
    val __obj = js.Dynamic.literal()
    if (DeviceType != null) __obj.updateDynamic("DeviceType")(DeviceType.asInstanceOf[js.Any])
    if (MethodName != null) __obj.updateDynamic("MethodName")(MethodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMethod]
  }
}

