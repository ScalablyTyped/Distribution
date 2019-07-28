package typings.aliDashApp.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardAuthOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_AddCardAuthOptions: js.UndefOr[js.Function1[/* res */ AddCardAuthResult, Unit]] = js.undefined
  /**
  		 * 开卡授权的页面地址，从alipay.marketing.card.activateurl.apply接口获取
  		 */
  var url: String
}

object AddCardAuthOptions {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ AddCardAuthResult => Unit = null
  ): AddCardAuthOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AddCardAuthOptions]
  }
}

