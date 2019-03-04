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
    val __obj = js.Dynamic.literal(direction = direction, distance = distance, first_id = first_id, first_name = first_name, location = location, second_id = second_id, second_name = second_name)
  
    __obj.asInstanceOf[Cross]
  }
}

