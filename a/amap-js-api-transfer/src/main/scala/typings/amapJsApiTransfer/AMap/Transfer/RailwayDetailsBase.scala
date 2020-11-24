package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RailwayDetailsBase extends RailwayDetails {
  
  /**
    * 火车到站信息
    */
  var arrival_stop: RailStop = js.native
  
  /**
    * 火车始发站信息
    */
  var departure_stop: RailStop = js.native
  
  /**
    * 该换乘段的行车总距离
    */
  var distance: Double = js.native
  
  /**
    * 线路id编码
    */
  var id: String = js.native
  
  /**
    * 线路名称
    */
  var name: String = js.native
  
  /**
    * 仓位及价格信息
    */
  var spaces: js.Array[Space] = js.native
  
  /**
    * 该线路车段耗时
    */
  var time: Double = js.native
  
  /**
    * 线路车次号
    */
  var trip: String = js.native
  
  /**
    * 线路车次类型，参考火车路线类型列表
    */
  var `type`: String = js.native
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
  
  @scala.inline
  implicit class RailwayDetailsBaseOps[Self <: RailwayDetailsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrival_stop(value: RailStop): Self = this.set("arrival_stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeparture_stop(value: RailStop): Self = this.set("departure_stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesVarargs(value: Space*): Self = this.set("spaces", js.Array(value :_*))
    
    @scala.inline
    def setSpaces(value: js.Array[Space]): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrip(value: String): Self = this.set("trip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
