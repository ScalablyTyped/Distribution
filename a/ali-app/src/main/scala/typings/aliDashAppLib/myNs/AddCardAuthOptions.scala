package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardAuthOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_AddCardAuthOptions: js.UndefOr[js.Function1[/* res */ AddCardAuthResult, scala.Unit]] = js.undefined
  /**
  		 * 开卡授权的页面地址，从alipay.marketing.card.activateurl.apply接口获取
  		 */
  var url: java.lang.String
}

object AddCardAuthOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ AddCardAuthResult, scala.Unit] = null
  ): AddCardAuthOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[AddCardAuthOptions]
  }
}

