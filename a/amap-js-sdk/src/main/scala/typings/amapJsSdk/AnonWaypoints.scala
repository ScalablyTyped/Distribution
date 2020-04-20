package typings.amapJsSdk

import typings.amapJsSdk.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWaypoints extends js.Object {
  var waypoints: js.Array[LngLat]
}

object AnonWaypoints {
  @scala.inline
  def apply(waypoints: js.Array[LngLat]): AnonWaypoints = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWaypoints]
  }
}

