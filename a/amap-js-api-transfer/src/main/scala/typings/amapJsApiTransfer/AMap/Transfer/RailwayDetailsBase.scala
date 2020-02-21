package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RailwayDetailsBase extends RailwayDetails {
  /**
    * 火车到站信息
    */
  var arrival_stop: RailStop
  /**
    * 火车始发站信息
    */
  var departure_stop: RailStop
  /**
    * 该换乘段的行车总距离
    */
  var distance: Double
  /**
    * 线路id编码
    */
  var id: String
  /**
    * 线路名称
    */
  var name: String
  /**
    * 仓位及价格信息
    */
  var spaces: js.Array[Space]
  /**
    * 该线路车段耗时
    */
  var time: Double
  /**
    * 线路车次号
    */
  var trip: String
  /**
    * 线路车次类型，参考火车路线类型列表
    */
  var `type`: String
}

object RailwayDetailsBase {
  @scala.inline
  def apply(
    arrival_stop: RailStop,
    departure_stop: RailStop,
    distance: Double,
    id: String,
    name: String,
    spaces: js.Array[Space],
    time: Double,
    trip: String,
    `type`: String
  ): RailwayDetailsBase = {
    val __obj = js.Dynamic.literal(arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailwayDetailsBase]
  }
}

