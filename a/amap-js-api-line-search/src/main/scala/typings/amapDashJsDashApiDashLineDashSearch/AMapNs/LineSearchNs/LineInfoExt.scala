package typings.amapDashJsDashApiDashLineDashSearch.AMapNs.LineSearchNs

import typings.amapDashJsDashApi.AMapNs.Bounds
import typings.amapDashJsDashApi.AMapNs.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.amapDashJsDashApiDashLineDashSearch.AMapNs.LineSearchNs.LineInfo because Already inherited */ trait LineInfoExt extends LineInfoBase {
  /**
    * 起步票价，单位：元
    */
  var basic_price: String
   // is string actually
  /**
    * 全程距离，单位：千米
    */
  var bounds: Bounds
  /**
    * 所属公交公司
    */
  var company: String
  /**
    * 全程距离，单位：千米
    */
  var distance: String
  /**
    * 末班车时间
    */
  var etime: String
  /**
    * 首班车时间
    */
  var stime: String
  /**
    * 全程票价，单位：元
    */
  var total_price: String
  /**
    * 途径站，包括首发站和终点站
    */
  var via_stops: js.Array[BusStop]
}

object LineInfoExt {
  @scala.inline
  def apply(
    basic_price: String,
    bounds: Bounds,
    citycode: String,
    company: String,
    distance: String,
    end_stop: String,
    etime: String,
    id: String,
    name: String,
    path: js.Array[LngLat],
    start_stop: String,
    stime: String,
    total_price: String,
    `type`: String,
    via_stops: js.Array[BusStop]
  ): LineInfoExt = {
    val __obj = js.Dynamic.literal(basic_price = basic_price, bounds = bounds, citycode = citycode, company = company, distance = distance, end_stop = end_stop, etime = etime, id = id, name = name, path = path, start_stop = start_stop, stime = stime, total_price = total_price, via_stops = via_stops)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LineInfoExt]
  }
}

