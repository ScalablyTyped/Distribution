package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBluetoothDeviceFoundOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_OnBluetoothDeviceFoundOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Devices, scala.Unit]] = js.undefined
}

object OnBluetoothDeviceFoundOptions {
  @scala.inline
  def apply(
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ aliDashAppLib.Anon_Devices, scala.Unit] = null
  ): OnBluetoothDeviceFoundOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[OnBluetoothDeviceFoundOptions]
  }
}

