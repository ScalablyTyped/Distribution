package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.amapJsApiTransfer.AMap.Transfer.RailwayDetails because Already inherited */ @js.native
trait RailwayDetailsExt extends RailwayDetailsBase {
  
  /**
    * 聚合的备选方案
    */
  var alters: js.Array[Alter] = js.native
  
  /**
    * 途经站点数量
    */
  var via_num: Double = js.native
  
  /**
    * 途经站点信息
    */
  var via_stops: js.Array[ViaStop] = js.native
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
  
  @scala.inline
  implicit class RailwayDetailsExtOps[Self <: RailwayDetailsExt] (val x: Self) extends AnyVal {
    
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
    def setAltersVarargs(value: Alter*): Self = this.set("alters", js.Array(value :_*))
    
    @scala.inline
    def setAlters(value: js.Array[Alter]): Self = this.set("alters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVia_num(value: Double): Self = this.set("via_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVia_stopsVarargs(value: ViaStop*): Self = this.set("via_stops", js.Array(value :_*))
    
    @scala.inline
    def setVia_stops(value: js.Array[ViaStop]): Self = this.set("via_stops", value.asInstanceOf[js.Any])
  }
}
