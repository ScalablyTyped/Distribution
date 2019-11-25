package typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder

import typings.amapDashJsDashApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geocode extends js.Object {
  /**
    * 区域编码
    */
  var adcode: String
  /**
    * 地址组成元素
    */
  var addressComponent: GeocodeAddressComponent
  /**
    * 格式化地址
    */
  var formattedAddress: String
  /**
    * 给定地址匹配级别
    */
  var level: String
  /**
    * 坐标
    */
  var location: LngLat
}

object Geocode {
  @scala.inline
  def apply(
    adcode: String,
    addressComponent: GeocodeAddressComponent,
    formattedAddress: String,
    level: String,
    location: LngLat
  ): Geocode = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], addressComponent = addressComponent.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Geocode]
  }
}

