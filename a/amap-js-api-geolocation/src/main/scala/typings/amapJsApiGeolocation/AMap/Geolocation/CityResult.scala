package typings.amapJsApiGeolocation.AMap.Geolocation

import typings.amapJsApiGeolocation.amapJsApiGeolocationNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CityResult extends js.Object {
  /**
    * 区域编码
    */
  var adcode: String = js.native
  /**
    * 范围
    */
  var bounds: js.Array[Double] = js.native
  /**
    * 中心点
    */
  var center: js.Tuple2[Double, Double] = js.native
  /**
    * 城市
    */
  var city: String = js.native
  /**
    * 城市编码
    */
  var citycode: String = js.native
  /**
    * 国家
    */
  var country: String = js.native
  /**
    * 状态信息
    */
  var info: String = js.native
  /**
    * 是否已转换成高德坐标
    */
  var isConverted: Boolean = js.native
  /**
    * 信息描述
    */
  var message: String = js.native
  /**
    * 省份
    */
  var province: String = js.native
  /**
    * 状态码
    */
  var status: `1` = js.native
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
  @scala.inline
  implicit class CityResultOps[Self <: CityResult] (val x: Self) extends AnyVal {
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
    def setAdcode(value: String): Self = this.set("adcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundsVarargs(value: Double*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenter(value: js.Tuple2[Double, Double]): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCitycode(value: String): Self = this.set("citycode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsConverted(value: Boolean): Self = this.set("isConverted", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: `1`): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

