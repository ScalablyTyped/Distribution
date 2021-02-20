package typings.aliApp.my

import typings.aliApp.anon.ResultCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TradePayOptionsMutableBuilder[Self <: TradePayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ ResultCode => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTradeNO(value: String): Self = StObject.set(x, "tradeNO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTradeNOUndefined: Self = StObject.set(x, "tradeNO", js.undefined)
  }
}
