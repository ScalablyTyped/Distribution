package typings.amapDashJsDashApiDashDriving.AMap.Driving

import typings.amapDashJsDashApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultCommon extends js.Object {
  /**
    * 驾车规划终点坐标
    */
  var destination: LngLat
  /**
    * 成功状态说明
    */
  var info: String
  /**
    * 驾车规划起点坐标
    */
  var origin: LngLat
  /**
    * 驾车规划路线列表
    */
  var routes: js.Array[DriveRoute]
  /**
    * 打车费用，仅extensions为“all”时返回
    * 单位：元
    */
  var taxi_cost: js.UndefOr[Double] = js.undefined
}

object SearchResultCommon {
  @scala.inline
  def apply(
    destination: LngLat,
    info: String,
    origin: LngLat,
    routes: js.Array[DriveRoute],
    taxi_cost: Int | Double = null
  ): SearchResultCommon = {
    val __obj = js.Dynamic.literal(destination = destination, info = info, origin = origin, routes = routes)
    if (taxi_cost != null) __obj.updateDynamic("taxi_cost")(taxi_cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultCommon]
  }
}

