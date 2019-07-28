package typings.aliDashApp.myNs

import typings.aliDashApp.Anon_Devices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetBluetoothDevicesOptions(res: Anon_Devices with ErrMsgResponse): Unit
}

object GetBluetoothDevicesOptions {
  @scala.inline
  def apply(
    success: Anon_Devices with ErrMsgResponse => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetBluetoothDevicesOptions]
  }
}

