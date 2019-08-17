package typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cross extends js.Object {
  /**
    * 与查询点的相对方位
    */
  var direction: String
  /**
    * 道路离查询点最近距离
    */
  var distance: Double
  /**
    * 第一条道路id
    */
  var first_id: String
  /**
    * 第一条道路名称
    */
  var first_name: String
  /**
    * 经纬度
    */
  var location: LngLat
  /**
    * 第二条道路id
    */
  var second_id: String
  /**
    * 第二条道路名称
    */
  var second_name: String
}

object Cross {
  @scala.inline
  def apply(
    direction: String,
    distance: Double,
    first_id: String,
    first_name: String,
    location: LngLat,
    second_id: String,
    second_name: String
  ): Cross = {
    val __obj = js.Dynamic.literal(direction = direction, distance = distance, first_id = first_id, first_name = first_name, location = location, second_id = second_id, second_name = second_name)
  
    __obj.asInstanceOf[Cross]
  }
}

