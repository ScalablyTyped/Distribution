package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  var services: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: aliDashAppLib.Anon_Devices with ErrMsgResponse): scala.Unit
}

object GetConnectedBluetoothDevicesOptions {
  @scala.inline
  def apply(
    success: aliDashAppLib.Anon_Devices with ErrMsgResponse => scala.Unit,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    services: js.Array[java.lang.String] = null
  ): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
}

