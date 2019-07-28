package typings.aliDashApp.myNs

import typings.aliDashApp.Anon_Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 获取服务器时间 https://docs.alipay.com/mini/api/get-server-time
trait GetServerTimeOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetServerTimeOptions: js.UndefOr[js.Function1[/* res */ Anon_Time, Unit]] = js.undefined
}

object GetServerTimeOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ Anon_Time => Unit = null
  ): GetServerTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetServerTimeOptions]
  }
}

