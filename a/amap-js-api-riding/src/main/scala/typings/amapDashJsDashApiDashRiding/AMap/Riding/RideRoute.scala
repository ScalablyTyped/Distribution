package typings.amapDashJsDashApiDashRiding.AMap.Riding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RideRoute extends js.Object {
  /**
    * 起点到终点总步行距离，单位：米
    */
  var distance: Double
  /**
    * 路段列表，以道路名称作为分段依据，将整个骑行导航方案分隔成若干路段
    */
  var rides: js.Array[RideStep]
  /**
    * 步行时间预计，单位：秒
    */
  var time: Double
}

object RideRoute {
  @scala.inline
  def apply(distance: Double, rides: js.Array[RideStep], time: Double): RideRoute = {
    val __obj = js.Dynamic.literal(distance = distance, rides = rides, time = time)
  
    __obj.asInstanceOf[RideRoute]
  }
}

