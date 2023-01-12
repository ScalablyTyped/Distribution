package typings.aliApp.my

import typings.aliApp.anon.ResultCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 小程序唤起支付 https://docs.alipay.com/mini/api/openapi-pay
trait TradePayOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 接入小程序支付时传入此参数。此参数为支付宝交易号
  @JSName("success")
  var success_TradePayOptions: js.UndefOr[js.Function1[/* res */ ResultCode, Unit]] = js.undefined
  
  var tradeNO: js.UndefOr[String] = js.undefined
}
object TradePayOptions {
  
  inline def apply(): TradePayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TradePayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TradePayOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: /* res */ ResultCode => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTradeNO(value: String): Self = StObject.set(x, "tradeNO", value.asInstanceOf[js.Any])
    
    inline def setTradeNOUndefined: Self = StObject.set(x, "tradeNO", js.undefined)
  }
}
