package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubwayEntrance extends js.Object {
  /**
    * 地铁口经纬度坐标
    */
  var location: LngLat
  /**
    * 地铁口名称
    */
  var name: String
}

object SubwayEntrance {
  @scala.inline
  def apply(location: LngLat, name: String): SubwayEntrance = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubwayEntrance]
  }
}

