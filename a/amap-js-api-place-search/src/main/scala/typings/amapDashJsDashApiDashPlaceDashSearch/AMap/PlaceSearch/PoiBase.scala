package typings.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch

import typings.amapDashJsDashApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoiBase extends js.Object {
  /**
    * 地址
    */
  var address: String
  var children: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 离中心点距离
    */
  var distance: Double
  /**
    * 全局唯一ID
    */
  var id: String
  /**
    * 兴趣点经纬度
    */
  var location: LngLat | Null
  /**
    * 名称
    */
  var name: String
  var shopinfo: String
  /**
    * 电话
    */
  var tel: String
  /**
    * 兴趣点类型
    */
  var `type`: String
}

object PoiBase {
  @scala.inline
  def apply(
    address: String,
    distance: Double,
    id: String,
    name: String,
    shopinfo: String,
    tel: String,
    `type`: String,
    children: js.Array[_] = null,
    location: LngLat = null
  ): PoiBase = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shopinfo = shopinfo.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoiBase]
  }
}

