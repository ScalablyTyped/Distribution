package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveStep extends js.Object {
  
  var action: String = js.native
  
  var assist_action: String = js.native
  
  var cities: js.UndefOr[js.Array[ViaCity]] = js.native
  
  var distance: Double = js.native
  
  var end_location: LngLat = js.native
  
  var instruction: String = js.native
  
  var orientation: String = js.native
  
  var path: js.Array[LngLat] = js.native
  
  var road: String = js.native
  
  var start_location: LngLat = js.native
  
  var time: Double = js.native
  
  var tmcs: js.UndefOr[js.Array[TMC]] = js.native
  
  var toll_road: String = js.native
  
  var tolls: Double = js.native
  
  var tolls_distance: Double = js.native
}
object DriveStep {
  
  @scala.inline
  def apply(
    action: String,
    assist_action: String,
    distance: Double,
    end_location: LngLat,
    instruction: String,
    orientation: String,
    path: js.Array[LngLat],
    road: String,
    start_location: LngLat,
    time: Double,
    toll_road: String,
    tolls: Double,
    tolls_distance: Double
  ): DriveStep = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assist_action = assist_action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], toll_road = toll_road.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveStep]
  }
  
  @scala.inline
  implicit class DriveStepOps[Self <: DriveStep] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssist_action(value: String): Self = this.set("assist_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_location(value: LngLat): Self = this.set("end_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstruction(value: String): Self = this.set("instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: LngLat*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[LngLat]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoad(value: String): Self = this.set("road", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_location(value: LngLat): Self = this.set("start_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToll_road(value: String): Self = this.set("toll_road", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTolls(value: Double): Self = this.set("tolls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTolls_distance(value: Double): Self = this.set("tolls_distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitiesVarargs(value: ViaCity*): Self = this.set("cities", js.Array(value :_*))
    
    @scala.inline
    def setCities(value: js.Array[ViaCity]): Self = this.set("cities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCities: Self = this.set("cities", js.undefined)
    
    @scala.inline
    def setTmcsVarargs(value: TMC*): Self = this.set("tmcs", js.Array(value :_*))
    
    @scala.inline
    def setTmcs(value: js.Array[TMC]): Self = this.set("tmcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTmcs: Self = this.set("tmcs", js.undefined)
  }
}
