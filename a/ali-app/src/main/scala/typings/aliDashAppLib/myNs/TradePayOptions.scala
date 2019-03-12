package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 小程序唤起支付 https://docs.alipay.com/mini/api/openapi-pay
trait TradePayOptions
  extends BaseOptions[js.Any, js.Any] {
  	// 接入小程序支付时传入此参数。此参数为支付宝交易号
  @JSName("success")
  var success_TradePayOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_ResultCode, scala.Unit]] = js.undefined
  var tradeNO: js.UndefOr[java.lang.String] = js.undefined
}

object TradePayOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: /* res */ aliDashAppLib.Anon_ResultCode => scala.Unit = null,
    tradeNO: java.lang.String = null
  ): TradePayOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (tradeNO != null) __obj.updateDynamic("tradeNO")(tradeNO)
    __obj.asInstanceOf[TradePayOptions]
  }
}

