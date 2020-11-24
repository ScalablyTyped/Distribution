package typings.amapJsApiDriving.AMap.Driving

import typings.amapJsApiDriving.amapJsApiDrivingNumbers.`0`
import typings.amapJsApiDriving.amapJsApiDrivingNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveRoute extends js.Object {
  
  /**
    * 起点到终点的驾车距离，单位：米
    */
  var distance: Double = js.native
  
  /**
    * 驾车规划策略
    */
  var policy: String = js.native
  
  /**
    * 限行结果
    * 0 代表限行已规避或未限行，即该路线没有限行路段
    * 1 代表限行无法规避，即该线路有限行路段
    */
  var restriction: `0` | `1` = js.native
  
  /**
    * 子路段DriveStep集合
    */
  var steps: js.Array[DriveStep] = js.native
  
  /**
    * 时间预计，单位：秒
    */
  var time: Double = js.native
  
  /**
    * 此驾车路线收费金额，单位：元
    */
  var tolls: Double = js.native
  
  /**
    * 收费路段长度，单位：米
    */
  var tolls_distance: Double = js.native
}
object DriveRoute {
  
  @scala.inline
  def apply(
    distance: Double,
    policy: String,
    restriction: `0` | `1`,
    steps: js.Array[DriveStep],
    time: Double,
    tolls: Double,
    tolls_distance: Double
  ): DriveRoute = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], restriction = restriction.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveRoute]
  }
  
  @scala.inline
  implicit class DriveRouteOps[Self <: DriveRoute] (val x: Self) extends AnyVal {
    
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestriction(value: `0` | `1`): Self = this.set("restriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: DriveStep*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[DriveStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTolls(value: Double): Self = this.set("tolls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTolls_distance(value: Double): Self = this.set("tolls_distance", value.asInstanceOf[js.Any])
  }
}
