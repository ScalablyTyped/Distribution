package typings.aliApp.my

import typings.aliApp.anon.DeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBLECharacteristicValueChangeOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_OnBLECharacteristicValueChangeOptions: js.UndefOr[js.Function1[/* res */ DeviceId, Unit]] = js.undefined
}

object OnBLECharacteristicValueChangeOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ DeviceId => Unit = null
  ): OnBLECharacteristicValueChangeOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OnBLECharacteristicValueChangeOptions]
  }
}

