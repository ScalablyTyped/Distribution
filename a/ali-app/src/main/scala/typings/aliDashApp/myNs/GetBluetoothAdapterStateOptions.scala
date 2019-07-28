package typings.aliDashApp.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBluetoothAdapterStateOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetBluetoothAdapterStateOptions(res: BluetoothAdapterStateData): Unit
}

object GetBluetoothAdapterStateOptions {
  @scala.inline
  def apply(
    success: BluetoothAdapterStateData => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetBluetoothAdapterStateOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetBluetoothAdapterStateOptions]
  }
}

