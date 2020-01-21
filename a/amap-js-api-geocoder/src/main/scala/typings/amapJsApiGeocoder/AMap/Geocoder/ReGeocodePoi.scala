package typings.amapJsApiGeocoder.AMap.Geocoder

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReGeocodePoi extends js.Object {
  /**
    * 址信息
    */
  var address: String
  /**
    * 商圈名称
    */
  var businessArea: String
  /**
    * 该Poi相对于请求坐标的方向
    */
  var direction: String
  /**
    * 该Poi到请求坐标的距离
    */
  var distance: Double
  /**
    * 唯一标识
    */
  var id: String
  /**
    * 坐标
    */
  var location: LngLat
  /**
    * 名称
    */
  var name: String
  /**
    * 电话
    */
  var tel: String
  /**
    * 类型
    */
  var `type`: String
}

object ReGeocodePoi {
  @scala.inline
  def apply(
    address: String,
    businessArea: String,
    direction: String,
    distance: Double,
    id: String,
    location: LngLat,
    name: String,
    tel: String,
    `type`: String
  ): ReGeocodePoi = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], businessArea = businessArea.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReGeocodePoi]
  }
}

