package typings.amapJsApiRiding.AMap.Riding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RideRoute extends js.Object {
  /**
    * 起点到终点总步行距离，单位：米
    */
  var distance: Double = js.native
  /**
    * 路段列表，以道路名称作为分段依据，将整个骑行导航方案分隔成若干路段
    */
  var rides: js.Array[RideStep] = js.native
  /**
    * 步行时间预计，单位：秒
    */
  var time: Double = js.native
}

object RideRoute {
  @scala.inline
  def apply(distance: Double, rides: js.Array[RideStep], time: Double): RideRoute = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], rides = rides.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[RideRoute]
  }
  @scala.inline
  implicit class RideRouteOps[Self <: RideRoute] (val x: Self) extends AnyVal {
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setRidesVarargs(value: RideStep*): Self = this.set("rides", js.Array(value :_*))
    @scala.inline
    def setRides(value: js.Array[RideStep]): Self = this.set("rides", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

