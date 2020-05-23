package typings.aliApp.my

import typings.aliApp.anon.Connected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBLEConnectionStateChangedOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_OnBLEConnectionStateChangedOptions: js.UndefOr[js.Function1[/* res */ Connected, Unit]] = js.undefined
}

object OnBLEConnectionStateChangedOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ Connected => Unit = null
  ): OnBLEConnectionStateChangedOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OnBLEConnectionStateChangedOptions]
  }
}

