package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.OpenBluetoothAdapterOptions> */
trait PartialOpenBluetoothAdapt extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonIsSupportBLE, Unit]] = js.undefined
}

object PartialOpenBluetoothAdapt {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ AnonIsSupportBLE => Unit = null
  ): PartialOpenBluetoothAdapt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PartialOpenBluetoothAdapt]
  }
}

