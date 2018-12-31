package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 支付宝客户端经纬度定位缓存过期时间，单位秒。默认 30s。使用缓存会加快定位速度，缓存过期会重新定位
  		 */
  var cacheTimeout: scala.Double
  /**
  		 * 0：默认，获取经纬度
  		 * 1：获取经纬度和详细到区县级别的逆地理编码数据
  		 * 2：获取经纬度和详细到街道级别的逆地理编码数据，不推荐使用
  		 * 3：获取经纬度和详细到POI级别的逆地理编码数据，不推荐使用
  		 */
  var `type`: aliDashAppLib.aliDashAppLibNumbers.`0` | aliDashAppLib.aliDashAppLibNumbers.`1` | aliDashAppLib.aliDashAppLibNumbers.`2` | aliDashAppLib.aliDashAppLibNumbers.`3`
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  @JSName("success")
  def success_MGetLocationOptions(res: LocationData): scala.Unit
}

