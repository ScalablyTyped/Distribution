package typings.amapDashJsDashApiDashLineDashSearch.AMap.LineSearch

import typings.amapDashJsDashApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusStop extends js.Object {
  var id: String
  var location: LngLat
  var name: String
  var sequence: Double
}

object BusStop {
  @scala.inline
  def apply(id: String, location: LngLat, name: String, sequence: Double): BusStop = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BusStop]
  }
}

