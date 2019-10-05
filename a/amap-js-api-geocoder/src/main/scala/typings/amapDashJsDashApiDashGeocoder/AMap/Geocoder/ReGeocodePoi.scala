package typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder

import typings.amapDashJsDashApi.AMap.LngLat
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
    val __obj = js.Dynamic.literal(address = address, businessArea = businessArea, direction = direction, distance = distance, id = id, location = location, name = name, tel = tel)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReGeocodePoi]
  }
}

