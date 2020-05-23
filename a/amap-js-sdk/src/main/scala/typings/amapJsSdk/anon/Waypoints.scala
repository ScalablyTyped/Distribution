package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Waypoints extends js.Object {
  var waypoints: js.Array[LngLat]
}

object Waypoints {
  @scala.inline
  def apply(waypoints: js.Array[LngLat]): Waypoints = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoints]
  }
}

