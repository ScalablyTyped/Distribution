package typings.amapJsApiDriving.AMap.Driving

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveStep extends js.Object {
  
  /**
    * 本驾车子路段完成后动作
    */
  var action: String = js.native
  
  /**
    * 驾车子路段完成后辅助动作，一般为到达某个目的地时返回
    */
  var assistant_action: String = js.native
  
  /**
    * 途径城市列表
    */
  var cities: js.UndefOr[js.Array[ViaCity]] = js.native
  
  /**
    * 此路段距离，单位：米
    */
  var distance: Double = js.native
  
  /**
    * 此路段终点
    */
  var end_location: LngLat = js.native
  
  /**
    * 此路段说明
    */
  var instruction: String = js.native
  
  /**
    * 驾车方向
    */
  var orientation: String = js.native
  
  /**
    * 此路段坐标集合
    */
  var path: js.Array[LngLat] = js.native
  
  /**
    * 道路
    */
  var road: String = js.native
  
  /**
    * 此路段起点
    */
  var start_location: LngLat = js.native
  
  /**
    * 此路段预计使用时间，单位：秒
    */
  var time: Double = js.native
  
  /**
    * 实时交通信息列表
    */
  var tmcs: js.UndefOr[js.Array[TMC]] = js.native
  
  var tmcsPaths: js.UndefOr[js.Array[TMCsPath]] = js.native
  
  /**
    * 收费路段长度，单位：米
    */
  var toll_distance: Double = js.native
  
  /**
    * 主要收费道路
    */
  var toll_road: String = js.native
  
  /**
    * 此段收费，单位：元
    */
  var tolls: Double = js.native
}
object DriveStep {
  
  @scala.inline
  def apply(
    action: String,
    assistant_action: String,
    distance: Double,
    end_location: LngLat,
    instruction: String,
    orientation: String,
    path: js.Array[LngLat],
    road: String,
    start_location: LngLat,
    time: Double,
    toll_distance: Double,
    toll_road: String,
    tolls: Double
  ): DriveStep = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assistant_action = assistant_action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], toll_distance = toll_distance.asInstanceOf[js.Any], toll_road = toll_road.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any])
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
    def setAssistant_action(value: String): Self = this.set("assistant_action", value.asInstanceOf[js.Any])
    
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
    def setToll_distance(value: Double): Self = this.set("toll_distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToll_road(value: String): Self = this.set("toll_road", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTolls(value: Double): Self = this.set("tolls", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setTmcsPathsVarargs(value: TMCsPath*): Self = this.set("tmcsPaths", js.Array(value :_*))
    
    @scala.inline
    def setTmcsPaths(value: js.Array[TMCsPath]): Self = this.set("tmcsPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTmcsPaths: Self = this.set("tmcsPaths", js.undefined)
  }
}
