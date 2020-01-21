package typings.amapJsApiDriving.AMap.Driving

import typings.amapJsApi.AMap.LngLat
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
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (taxi_cost != null) __obj.updateDynamic("taxi_cost")(taxi_cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultCommon]
  }
}

