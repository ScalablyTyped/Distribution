package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBluetoothAdapterStateOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetBluetoothAdapterStateOptions(res: BluetoothAdapterStateData): scala.Unit
}

object GetBluetoothAdapterStateOptions {
  @scala.inline
  def apply(
    success: js.Function1[BluetoothAdapterStateData, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetBluetoothAdapterStateOptions = {
    val __obj = js.Dynamic.literal(success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetBluetoothAdapterStateOptions]
  }
}

