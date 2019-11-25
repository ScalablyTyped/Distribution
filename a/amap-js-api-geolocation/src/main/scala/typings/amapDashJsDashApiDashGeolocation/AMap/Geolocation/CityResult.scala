package typings.amapDashJsDashApiDashGeolocation.AMap.Geolocation

import typings.amapDashJsDashApiDashGeolocation.amapDashJsDashApiDashGeolocationNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CityResult extends js.Object {
  /**
    * 区域编码
    */
  var adcode: String
  /**
    * 范围
    */
  var bounds: js.Array[Double]
  /**
    * 中心点
    */
  var center: js.Tuple2[Double, Double]
  /**
    * 城市
    */
  var city: String
  /**
    * 城市编码
    */
  var citycode: String
  /**
    * 国家
    */
  var country: String
  /**
    * 状态信息
    */
  var info: String
  /**
    * 是否已转换成高德坐标
    */
  var isConverted: Boolean
  /**
    * 信息描述
    */
  var message: String
  /**
    * 省份
    */
  var province: String
  /**
    * 状态码
    */
  var status: `1`
}

object CityResult {
  @scala.inline
  def apply(
    adcode: String,
    bounds: js.Array[Double],
    center: js.Tuple2[Double, Double],
    city: String,
    citycode: String,
    country: String,
    info: String,
    isConverted: Boolean,
    message: String,
    province: String,
    status: `1`
  ): CityResult = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isConverted = isConverted.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CityResult]
  }
}

