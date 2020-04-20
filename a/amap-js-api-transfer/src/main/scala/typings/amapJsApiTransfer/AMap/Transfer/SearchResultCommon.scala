package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultCommon extends js.Object {
  /**
    * 公交换乘终点坐标
    */
  var destination: LngLat
  /**
    * 成功状态说明
    */
  var info: String
  /**
    * 公交换乘起点坐标
    */
  var origin: LngLat
  /**
    * 换乘方案列表
    */
  var plans: js.Array[TransferPlan]
  /**
    * 出租车费用，单位：元
    */
  var taxi_cost: Double
}

object SearchResultCommon {
  @scala.inline
  def apply(
    destination: LngLat,
    info: String,
    origin: LngLat,
    plans: js.Array[TransferPlan],
    taxi_cost: Double
  ): SearchResultCommon = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultCommon]
  }
}

