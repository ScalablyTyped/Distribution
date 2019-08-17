package typings.amapDashJsDashApiDashDriving.AMapNs.DrivingNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import typings.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.end
import typings.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.start
import typings.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.waypoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Poi extends js.Object {
  var location: LngLat
  var name: String
  var `type`: start | end | waypoint
}

object Poi {
  @scala.inline
  def apply(location: LngLat, name: String, `type`: start | end | waypoint): Poi = {
    val __obj = js.Dynamic.literal(location = location, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Poi]
  }
}

