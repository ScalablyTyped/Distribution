package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Road extends js.Object {
  var direction: java.lang.String
  var distance: scala.Double
  var id: java.lang.String
  var location: LngLat
  var name: java.lang.String
}

object Road {
  @scala.inline
  def apply(
    direction: java.lang.String,
    distance: scala.Double,
    id: java.lang.String,
    location: LngLat,
    name: java.lang.String
  ): Road = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Road]
  }
}

