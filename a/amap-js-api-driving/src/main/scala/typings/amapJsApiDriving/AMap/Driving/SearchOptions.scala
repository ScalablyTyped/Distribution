package typings.amapJsApiDriving.AMap.Driving

import typings.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOptions extends js.Object {
  /**
    * 途经点
    */
  var waypoints: js.UndefOr[js.Array[LocationValue]] = js.native
}

object SearchOptions {
  @scala.inline
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
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
    def setWaypointsVarargs(value: LocationValue*): Self = this.set("waypoints", js.Array(value :_*))
    @scala.inline
    def setWaypoints(value: js.Array[LocationValue]): Self = this.set("waypoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaypoints: Self = this.set("waypoints", js.undefined)
  }
  
}

