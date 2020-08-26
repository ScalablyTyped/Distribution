package typings.amapJsApiDriving.anon

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiDriving.amapJsApiDrivingStrings.end
import typings.amapJsApiDriving.amapJsApiDrivingStrings.start
import typings.amapJsApiDriving.amapJsApiDrivingStrings.waypoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api-driving.AMap.Driving.Poi & {  isWaypoint :boolean} */
@js.native
trait PoiisWaypointboolean extends js.Object {
  var isWaypoint: Boolean = js.native
  var location: LngLat = js.native
  var name: String = js.native
  var `type`: start | end | waypoint = js.native
}

object PoiisWaypointboolean {
  @scala.inline
  def apply(isWaypoint: Boolean, location: LngLat, name: String, `type`: start | end | waypoint): PoiisWaypointboolean = {
    val __obj = js.Dynamic.literal(isWaypoint = isWaypoint.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoiisWaypointboolean]
  }
  @scala.inline
  implicit class PoiisWaypointbooleanOps[Self <: PoiisWaypointboolean] (val x: Self) extends AnyVal {
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
    def setIsWaypoint(value: Boolean): Self = this.set("isWaypoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LngLat): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: start | end | waypoint): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

