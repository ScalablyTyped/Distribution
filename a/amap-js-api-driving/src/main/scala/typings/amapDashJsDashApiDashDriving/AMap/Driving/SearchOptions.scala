package typings.amapDashJsDashApiDashDriving.AMap.Driving

import typings.amapDashJsDashApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  /**
    * 途经点
    */
  var waypoints: js.UndefOr[js.Array[LocationValue]] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(waypoints: js.Array[LocationValue] = null): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (waypoints != null) __obj.updateDynamic("waypoints")(waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

