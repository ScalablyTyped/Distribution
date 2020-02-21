package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultBase
  extends SearchResultCommon
     with SearchResult {
  /**
    * 公交换乘终点
    */
  var end: js.UndefOr[Poi] = js.undefined
  /**
    * 公交换乘起点
    */
  var start: js.UndefOr[Poi] = js.undefined
}

object SearchResultBase {
  @scala.inline
  def apply(
    destination: LngLat,
    info: String,
    origin: LngLat,
    plans: js.Array[TransferPlan],
    taxi_cost: Double,
    end: Poi = null,
    start: Poi = null
  ): SearchResultBase = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultBase]
  }
}

