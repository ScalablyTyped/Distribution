package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WalkStep extends js.Object {
  
  /**
    * 本步行子路段完成后动作
    */
  var action: String = js.native
  
  /**
    * 步行子路段完成后辅助动作，一般为到达某个公交站点或目的地时返回
    */
  var assist_action: String = js.native
  
  /**
    * 步行子路段距离，单位：米
    */
  var distance: Double = js.native
  
  /**
    * 步行子路段描述
    */
  var instruction: String = js.native
  
  /**
    * 步行子路段坐标集合
    */
  var path: js.Array[LngLat] = js.native
  
  /**
    * 道路
    */
  var road: String = js.native
  
  /**
    * 步行子路段预计使用时间，单位：秒
    */
  var time: Double = js.native
}
object WalkStep {
  
  @scala.inline
  def apply(
    action: String,
    assist_action: String,
    distance: Double,
    instruction: String,
    path: js.Array[LngLat],
    road: String,
    time: Double
  ): WalkStep = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assist_action = assist_action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkStep]
  }
  
  @scala.inline
  implicit class WalkStepOps[Self <: WalkStep] (val x: Self) extends AnyVal {
    
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
    def setInstruction(value: String): Self = this.set("instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: LngLat*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[LngLat]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoad(value: String): Self = this.set("road", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
