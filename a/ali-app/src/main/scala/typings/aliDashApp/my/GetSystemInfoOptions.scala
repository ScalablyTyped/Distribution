package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSystemInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetSystemInfoOptions: js.UndefOr[js.Function1[/* res */ SystemInfo, Unit]] = js.undefined
}

object GetSystemInfoOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ SystemInfo => Unit = null
  ): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
}

