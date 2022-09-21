package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import typings.alipayjssdk.AlipayJSSDK.IAnyObject
import typings.alipayjssdk.AlipayJSSDK.IStringObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 请求的参数 */
  var data: js.UndefOr[IAnyObject] = js.undefined
  
  /** 设置请求的头部信息 */
  var headers: js.UndefOr[IStringObject] = js.undefined
  
  /** 目标服务器 url */
  var url: String
}
object Complete {
  
  inline def apply(url: String): Complete = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
  
  extension [Self <: Complete](x: Self) {
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setData(value: IAnyObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeaders(value: IStringObject): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
