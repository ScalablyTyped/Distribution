package typings.amapDashJsDashApiDashDistrictDashSearch.AMap.DistrictSearch

import typings.amapDashJsDashApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait District extends js.Object {
  /**
    * 区域编码
    */
  var adcode: String
  /**
    * 边界坐标集合
    */
  var boundaries: js.UndefOr[js.Array[js.Array[LngLat]]] = js.undefined
  /**
    * 中心点经纬度坐标
    */
  var center: LngLat
  /**
    * 城市编码
    */
  var citycode: String
  /**
    * 下级行政区信息列表
    */
  var districtList: js.UndefOr[js.Array[District]] = js.undefined
  /**
    * 行政区划级别
    */
  var level: Level
  /**
    * 行政区名称
    */
  var name: String
}

object District {
  @scala.inline
  def apply(
    adcode: String,
    center: LngLat,
    citycode: String,
    level: Level,
    name: String,
    boundaries: js.Array[js.Array[LngLat]] = null,
    districtList: js.Array[District] = null
  ): District = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (boundaries != null) __obj.updateDynamic("boundaries")(boundaries.asInstanceOf[js.Any])
    if (districtList != null) __obj.updateDynamic("districtList")(districtList.asInstanceOf[js.Any])
    __obj.asInstanceOf[District]
  }
}

