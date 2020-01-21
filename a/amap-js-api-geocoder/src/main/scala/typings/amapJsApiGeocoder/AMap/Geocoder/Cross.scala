package typings.amapJsApiGeocoder.AMap.Geocoder

import typings.amapJsApi.AMap.LngLat
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
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], first_id = first_id.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], second_id = second_id.asInstanceOf[js.Any], second_name = second_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cross]
  }
}

