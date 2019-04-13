package typings
package awsDashSdkLib.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMethod extends js.Object {
  /**
    * The type of the device, such as "button".
    */
  var DeviceType: js.UndefOr[__string] = js.undefined
  /**
    * The name of the method applicable to the deviceType.
    */
  var MethodName: js.UndefOr[__string] = js.undefined
}

object DeviceMethod {
  @scala.inline
  def apply(DeviceType: __string = null, MethodName: __string = null): DeviceMethod = {
    val __obj = js.Dynamic.literal()
    if (DeviceType != null) __obj.updateDynamic("DeviceType")(DeviceType)
    if (MethodName != null) __obj.updateDynamic("MethodName")(MethodName)
    __obj.asInstanceOf[DeviceMethod]
  }
}

