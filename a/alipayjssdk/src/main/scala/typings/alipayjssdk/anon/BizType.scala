package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BizType extends StObject {
  
  /** 自定义业务类型  */
  var bizType: js.UndefOr[String] = js.undefined
  
  /** 钱包经纬度定位缓存过期时间，单位秒。默认 30s。使用缓存会加快定位速度，缓存过期会重新定位 */
  var cacheTimeout: js.UndefOr[Double] = js.undefined
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 定位超时失败回调时间，单位秒。默认10s */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** 支持 0：详细逆地理编码，带周边信；1：逆地理编码到城市；2：仅获取经纬度、速度和精度。默认为 2 */
  var `type`: js.UndefOr[Double] = js.undefined
}
object BizType {
  
  inline def apply(): BizType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BizType]
  }
  
  extension [Self <: BizType](x: Self) {
    
    inline def setBizType(value: String): Self = StObject.set(x, "bizType", value.asInstanceOf[js.Any])
    
    inline def setBizTypeUndefined: Self = StObject.set(x, "bizType", js.undefined)
    
    inline def setCacheTimeout(value: Double): Self = StObject.set(x, "cacheTimeout", value.asInstanceOf[js.Any])
    
    inline def setCacheTimeoutUndefined: Self = StObject.set(x, "cacheTimeout", js.undefined)
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
