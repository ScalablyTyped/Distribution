package typings.amapJsApi

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsIndoorPOI extends js.Object {
  /**
    * 热点id
    */
  var id: String
  // internal
  /**
    * 是否室内热点
    */
  var isIndoorPOI: Boolean
  /**
    * 经纬度坐标
    */
  var lnglat: LngLat
  /**
    * 热点名称
    */
  var name: String
}

object AnonIsIndoorPOI {
  @scala.inline
  def apply(id: String, isIndoorPOI: Boolean, lnglat: LngLat, name: String): AnonIsIndoorPOI = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isIndoorPOI = isIndoorPOI.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsIndoorPOI]
  }
}

