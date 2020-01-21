package typings.amapJsApi

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdIsIndoorPOI extends js.Object {
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

object AnonIdIsIndoorPOI {
  @scala.inline
  def apply(id: String, isIndoorPOI: Boolean, lnglat: LngLat, name: String): AnonIdIsIndoorPOI = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isIndoorPOI = isIndoorPOI.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdIsIndoorPOI]
  }
}

