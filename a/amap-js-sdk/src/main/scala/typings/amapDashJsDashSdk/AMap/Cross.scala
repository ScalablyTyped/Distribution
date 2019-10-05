package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cross extends js.Object {
  var direction: String
  var distance: Double
  var first_id: String
  var first_name: String
  var location: LngLat
  var second_id: String
  var second_name: String
}

object Cross {
  @scala.inline
  def apply(
    direction: String,
    distance: Double,
    first_id: String,
    first_name: String,
    location: LngLat,
    second_id: String,
    second_name: String
  ): Cross = {
    val __obj = js.Dynamic.literal(direction = direction, distance = distance, first_id = first_id, first_name = first_name, location = location, second_id = second_id, second_name = second_name)
  
    __obj.asInstanceOf[Cross]
  }
}

