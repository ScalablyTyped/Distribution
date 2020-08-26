package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Waypoints extends js.Object {
  var waypoints: js.Array[LngLat] = js.native
}

object Waypoints {
  @scala.inline
  def apply(waypoints: js.Array[LngLat]): Waypoints = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoints]
  }
  @scala.inline
  implicit class WaypointsOps[Self <: Waypoints] (val x: Self) extends AnyVal {
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
    def setWaypointsVarargs(value: LngLat*): Self = this.set("waypoints", js.Array(value :_*))
    @scala.inline
    def setWaypoints(value: js.Array[LngLat]): Self = this.set("waypoints", value.asInstanceOf[js.Any])
  }
  
}

