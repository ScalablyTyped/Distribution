package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiTransfer.AMap.Transfer.RailwayDetailsBase
  - typings.amapJsApiTransfer.AMap.Transfer.RailwayDetailsExt
*/
trait RailwayDetails extends js.Object

object RailwayDetails {
  @scala.inline
  def RailwayDetailsBase(
    arrival_stop: RailStop,
    departure_stop: RailStop,
    distance: Double,
    id: String,
    name: String,
    spaces: js.Array[Space],
    time: Double,
    trip: String,
    `type`: String
  ): RailwayDetails = {
    val __obj = js.Dynamic.literal(arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailwayDetails]
  }
  @scala.inline
  def RailwayDetailsExt(
    alters: js.Array[Alter],
    arrival_stop: RailStop,
    departure_stop: RailStop,
    distance: Double,
    id: String,
    name: String,
    spaces: js.Array[Space],
    time: Double,
    trip: String,
    `type`: String,
    via_num: Double,
    via_stops: js.Array[ViaStop]
  ): RailwayDetails = {
    val __obj = js.Dynamic.literal(alters = alters.asInstanceOf[js.Any], arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any], via_num = via_num.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailwayDetails]
  }
}

