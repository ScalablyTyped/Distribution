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
    val __obj = js.Dynamic.literal(direction = direction, distance = distance, id = id, location = location, name = name)
  
    __obj.asInstanceOf[Road]
  }
}

