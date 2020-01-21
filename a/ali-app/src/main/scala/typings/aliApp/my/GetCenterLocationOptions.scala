package typings.aliApp.my

import typings.aliApp.AnonLatitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 地图 https://docs.alipay.com/mini/api/ui-map
trait GetCenterLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetCenterLocationOptions: js.UndefOr[js.Function1[/* res */ AnonLatitude, Unit]] = js.undefined
}

object GetCenterLocationOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ AnonLatitude => Unit = null
  ): GetCenterLocationOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetCenterLocationOptions]
  }
}

