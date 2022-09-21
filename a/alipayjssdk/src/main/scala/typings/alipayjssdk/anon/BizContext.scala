package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BizContext extends StObject {
  
  /** 支付额外的参数，格式为JSON字符串 */
  var bizContext: js.UndefOr[String] = js.undefined
  
  /** 交易子类型 */
  var bizSubType: js.UndefOr[String] = js.undefined
  
  /** 交易类型，默认为 ‘trade’ */
  var bizType: js.UndefOr[String] = js.undefined
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 完整的支付参数拼接成的字符串，从服务端获取。需要入驻蚂蚁金服开放平台 */
  var orderStr: js.UndefOr[String] = js.undefined
  
  /** 商户id */
  var partnerID: js.UndefOr[String] = js.undefined
  
  /** 交易号，多个交易号请用英文分号`;`分隔 */
  var tradeNO: js.UndefOr[String] = js.undefined
}
object BizContext {
  
  inline def apply(): BizContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BizContext]
  }
  
  extension [Self <: BizContext](x: Self) {
    
    inline def setBizContext(value: String): Self = StObject.set(x, "bizContext", value.asInstanceOf[js.Any])
    
    inline def setBizContextUndefined: Self = StObject.set(x, "bizContext", js.undefined)
    
    inline def setBizSubType(value: String): Self = StObject.set(x, "bizSubType", value.asInstanceOf[js.Any])
    
    inline def setBizSubTypeUndefined: Self = StObject.set(x, "bizSubType", js.undefined)
    
    inline def setBizType(value: String): Self = StObject.set(x, "bizType", value.asInstanceOf[js.Any])
    
    inline def setBizTypeUndefined: Self = StObject.set(x, "bizType", js.undefined)
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setOrderStr(value: String): Self = StObject.set(x, "orderStr", value.asInstanceOf[js.Any])
    
    inline def setOrderStrUndefined: Self = StObject.set(x, "orderStr", js.undefined)
    
    inline def setPartnerID(value: String): Self = StObject.set(x, "partnerID", value.asInstanceOf[js.Any])
    
    inline def setPartnerIDUndefined: Self = StObject.set(x, "partnerID", js.undefined)
    
    inline def setTradeNO(value: String): Self = StObject.set(x, "tradeNO", value.asInstanceOf[js.Any])
    
    inline def setTradeNOUndefined: Self = StObject.set(x, "tradeNO", js.undefined)
  }
}
