package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cross extends js.Object {
  var direction: java.lang.String
  var distance: scala.Double
  var first_id: java.lang.String
  var first_name: java.lang.String
  var location: LngLat
  var second_id: java.lang.String
  var second_name: java.lang.String
}

object Cross {
  @scala.inline
  def apply(
    direction: java.lang.String,
    distance: scala.Double,
    first_id: java.lang.String,
    first_name: java.lang.String,
    location: LngLat,
    second_id: java.lang.String,
    second_name: java.lang.String
  ): Cross = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("first_id")(first_id)
    __obj.updateDynamic("first_name")(first_name)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("second_id")(second_id)
    __obj.updateDynamic("second_name")(second_name)
    __obj.asInstanceOf[Cross]
  }
}

