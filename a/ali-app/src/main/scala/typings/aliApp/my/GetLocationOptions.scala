package typings.aliApp.my

import typings.aliApp.aliAppInts.`0`
import typings.aliApp.aliAppInts.`1`
import typings.aliApp.aliAppInts.`2`
import typings.aliApp.aliAppInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocationOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 支付宝客户端经纬度定位缓存过期时间，单位秒。默认 30s。使用缓存会加快定位速度，缓存过期会重新定位
    */
  var cacheTimeout: Double
  
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  @JSName("success")
  def success_MGetLocationOptions(res: LocationData): Unit
  
  /**
    * 0：默认，获取经纬度
    * 1：获取经纬度和详细到区县级别的逆地理编码数据
    * 2：获取经纬度和详细到街道级别的逆地理编码数据，不推荐使用
    * 3：获取经纬度和详细到POI级别的逆地理编码数据，不推荐使用
    */
  var `type`: `0` | `1` | `2` | `3`
}
object GetLocationOptions {
  
  inline def apply(cacheTimeout: Double, success: LocationData => Unit, `type`: `0` | `1` | `2` | `3`): GetLocationOptions = {
    val __obj = js.Dynamic.literal(cacheTimeout = cacheTimeout.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocationOptions]
  }
  
  extension [Self <: GetLocationOptions](x: Self) {
    
    inline def setCacheTimeout(value: Double): Self = StObject.set(x, "cacheTimeout", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: LocationData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setType(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
