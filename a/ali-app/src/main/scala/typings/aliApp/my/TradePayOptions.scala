package typings.aliApp.my

import typings.aliApp.anon.ResultCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 小程序唤起支付 https://docs.alipay.com/mini/api/openapi-pay
@js.native
trait TradePayOptions
  extends BaseOptions[js.Any, js.Any] {
      // 接入小程序支付时传入此参数。此参数为支付宝交易号
  @JSName("success")
  var success_TradePayOptions: js.UndefOr[js.Function1[/* res */ ResultCode, Unit]] = js.native
  var tradeNO: js.UndefOr[String] = js.native
}

object TradePayOptions {
  @scala.inline
  def apply(): TradePayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TradePayOptions]
  }
  @scala.inline
  implicit class TradePayOptionsOps[Self <: TradePayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSuccess(value: /* res */ ResultCode => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTradeNO(value: String): Self = this.set("tradeNO", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTradeNO: Self = this.set("tradeNO", js.undefined)
  }
  
}

