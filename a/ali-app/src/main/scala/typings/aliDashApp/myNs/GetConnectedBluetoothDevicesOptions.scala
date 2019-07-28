package typings.aliDashApp.myNs

import typings.aliDashApp.Anon_Devices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  var services: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: Anon_Devices with ErrMsgResponse): Unit
}

object GetConnectedBluetoothDevicesOptions {
  @scala.inline
  def apply(
    success: Anon_Devices with ErrMsgResponse => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    services: js.Array[String] = null
  ): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
}

