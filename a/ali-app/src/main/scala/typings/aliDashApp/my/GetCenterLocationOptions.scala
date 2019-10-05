package typings.aliDashApp.my

import typings.aliDashApp.Anon_Latitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 地图 https://docs.alipay.com/mini/api/ui-map
trait GetCenterLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetCenterLocationOptions: js.UndefOr[js.Function1[/* res */ Anon_Latitude, Unit]] = js.undefined
}

object GetCenterLocationOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ Anon_Latitude => Unit = null
  ): GetCenterLocationOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetCenterLocationOptions]
  }
}

