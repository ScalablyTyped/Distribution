package typings.aliApp.my

import typings.aliApp.aliAppNumbers.`0`
import typings.aliApp.aliAppNumbers.`1`
import typings.aliApp.aliAppNumbers.`2`
import typings.aliApp.aliAppNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 支付宝客户端经纬度定位缓存过期时间，单位秒。默认 30s。使用缓存会加快定位速度，缓存过期会重新定位
    */
  var cacheTimeout: Double = js.native
  /**
    * 0：默认，获取经纬度
    * 1：获取经纬度和详细到区县级别的逆地理编码数据
    * 2：获取经纬度和详细到街道级别的逆地理编码数据，不推荐使用
    * 3：获取经纬度和详细到POI级别的逆地理编码数据，不推荐使用
    */
  var `type`: `0` | `1` | `2` | `3` = js.native
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  @JSName("success")
  def success_MGetLocationOptions(res: LocationData): Unit = js.native
}

object GetLocationOptions {
  @scala.inline
  def apply(cacheTimeout: Double, success: LocationData => Unit, `type`: `0` | `1` | `2` | `3`): GetLocationOptions = {
    val __obj = js.Dynamic.literal(cacheTimeout = cacheTimeout.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocationOptions]
  }
  @scala.inline
  implicit class GetLocationOptionsOps[Self <: GetLocationOptions] (val x: Self) extends AnyVal {
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
    def setCacheTimeout(value: Double): Self = this.set("cacheTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: LocationData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: `0` | `1` | `2` | `3`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

