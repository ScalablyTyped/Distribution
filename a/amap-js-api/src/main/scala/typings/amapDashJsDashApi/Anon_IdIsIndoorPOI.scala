package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdIsIndoorPOI extends js.Object {
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

object Anon_IdIsIndoorPOI {
  @scala.inline
  def apply(id: String, isIndoorPOI: Boolean, lnglat: LngLat, name: String): Anon_IdIsIndoorPOI = {
    val __obj = js.Dynamic.literal(id = id, isIndoorPOI = isIndoorPOI, lnglat = lnglat, name = name)
  
    __obj.asInstanceOf[Anon_IdIsIndoorPOI]
  }
}

