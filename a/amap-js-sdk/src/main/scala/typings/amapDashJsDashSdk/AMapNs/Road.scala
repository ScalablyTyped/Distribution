package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Road extends js.Object {
  var direction: String
  var distance: Double
  var id: String
  var location: LngLat
  var name: String
}

object Road {
  @scala.inline
  def apply(direction: String, distance: Double, id: String, location: LngLat, name: String): Road = {
    val __obj = js.Dynamic.literal(direction = direction, distance = distance, id = id, location = location, name = name)
  
    __obj.asInstanceOf[Road]
  }
}

