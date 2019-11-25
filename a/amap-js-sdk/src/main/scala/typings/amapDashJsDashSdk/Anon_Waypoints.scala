package typings.amapDashJsDashSdk

import typings.amapDashJsDashSdk.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Waypoints extends js.Object {
  var waypoints: js.Array[LngLat]
}

object Anon_Waypoints {
  @scala.inline
  def apply(waypoints: js.Array[LngLat]): Anon_Waypoints = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Waypoints]
  }
}

