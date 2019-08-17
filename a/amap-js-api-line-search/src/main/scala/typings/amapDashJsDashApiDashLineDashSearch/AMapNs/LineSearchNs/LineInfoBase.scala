package typings.amapDashJsDashApiDashLineDashSearch.AMapNs.LineSearchNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineInfoBase extends LineInfo {
  /**
    * 所在城市的城市编码
    */
  var citycode: String
  /**
    * 终点站
    */
  var end_stop: String
  /**
    * 公交线路id，该id是唯一标识
    */
  var id: String
  /**
    * 线路名称
    */
  var name: String
  /**
    * 线路经纬度
    */
  var path: js.Array[LngLat]
  /**
    * 首发站
    */
  var start_stop: String
  /**
    * 公交类型列表
    */
  var `type`: String
}

object LineInfoBase {
  @scala.inline
  def apply(
    citycode: String,
    end_stop: String,
    id: String,
    name: String,
    path: js.Array[LngLat],
    start_stop: String,
    `type`: String
  ): LineInfoBase = {
    val __obj = js.Dynamic.literal(citycode = citycode, end_stop = end_stop, id = id, name = name, path = path, start_stop = start_stop)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LineInfoBase]
  }
}

