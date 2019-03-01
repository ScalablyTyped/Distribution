package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseBluetoothAdapterOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MCloseBluetoothAdapterOptions(res: js.Any): scala.Unit
}

object CloseBluetoothAdapterOptions {
  @scala.inline
  def apply(
    success: js.Function1[js.Any, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): CloseBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[CloseBluetoothAdapterOptions]
  }
}

