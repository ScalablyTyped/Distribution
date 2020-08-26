package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResultCommon extends js.Object {
  /**
    * 公交换乘终点坐标
    */
  var destination: LngLat = js.native
  /**
    * 成功状态说明
    */
  var info: String = js.native
  /**
    * 公交换乘起点坐标
    */
  var origin: LngLat = js.native
  /**
    * 换乘方案列表
    */
  var plans: js.Array[TransferPlan] = js.native
  /**
    * 出租车费用，单位：元
    */
  var taxi_cost: Double = js.native
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
  @scala.inline
  implicit class SearchResultCommonOps[Self <: SearchResultCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestination(value: LngLat): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: LngLat): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlansVarargs(value: TransferPlan*): Self = this.set("plans", js.Array(value :_*))
    @scala.inline
    def setPlans(value: js.Array[TransferPlan]): Self = this.set("plans", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaxi_cost(value: Double): Self = this.set("taxi_cost", value.asInstanceOf[js.Any])
  }
  
}

