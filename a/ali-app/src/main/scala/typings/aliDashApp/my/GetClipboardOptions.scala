package typings.aliDashApp.my

import typings.aliDashApp.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 剪贴板 https://docs.alipay.com/mini/api/clipboard
trait GetClipboardOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetClipboardOptions: js.UndefOr[js.Function1[/* res */ Anon_Text, Unit]] = js.undefined
}

object GetClipboardOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ Anon_Text => Unit = null
  ): GetClipboardOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetClipboardOptions]
  }
}

