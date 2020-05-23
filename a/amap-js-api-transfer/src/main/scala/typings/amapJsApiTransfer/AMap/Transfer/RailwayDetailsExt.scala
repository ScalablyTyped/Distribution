package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.amapJsApiTransfer.AMap.Transfer.RailwayDetails because Already inherited */ trait RailwayDetailsExt extends RailwayDetailsBase {
  /**
    * 聚合的备选方案
    */
  var alters: js.Array[Alter]
  /**
    * 途经站点数量
    */
  var via_num: Double
  /**
    * 途经站点信息
    */
  var via_stops: js.Array[ViaStop]
}

object RailwayDetailsExt {
  @scala.inline
  def apply(
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
  ): RailwayDetailsExt = {
    val __obj = js.Dynamic.literal(alters = alters.asInstanceOf[js.Any], arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any], via_num = via_num.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailwayDetailsExt]
  }
}

