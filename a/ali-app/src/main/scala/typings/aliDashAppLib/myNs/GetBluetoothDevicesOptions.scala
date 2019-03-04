package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetBluetoothDevicesOptions(res: aliDashAppLib.Anon_Devices with ErrMsgResponse): scala.Unit
}

object GetBluetoothDevicesOptions {
  @scala.inline
  def apply(
    success: js.Function1[aliDashAppLib.Anon_Devices with ErrMsgResponse, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetBluetoothDevicesOptions]
  }
}

