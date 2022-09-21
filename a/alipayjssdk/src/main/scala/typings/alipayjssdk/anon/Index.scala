package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 传递的 data 对象将会被即将露出的页面通过 onResume 事件接收 */
  var data: js.UndefOr[Record[String, String]] = js.undefined
  
  /** 目标页面在会话页面栈中的索引；如果小于零，则将与当前页面的 index 相加 */
  var index: js.UndefOr[Double] = js.undefined
  
  /** 目标页面的完整 URL */
  var url: js.UndefOr[String] = js.undefined
  
  /** 目标页面的 URL 匹配表达式（ URL 如果包含 urlPattern，匹配成功） */
  var urlPattern: js.UndefOr[String] = js.undefined
}
object Index {
  
  inline def apply(): Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Index]
  }
  
  extension [Self <: Index](x: Self) {
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setData(value: Record[String, String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlPattern(value: String): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    
    inline def setUrlPatternUndefined: Self = StObject.set(x, "urlPattern", js.undefined)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
