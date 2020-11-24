package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveRoute extends js.Object {
  
  var distance: Double = js.native
  
  var policy: String = js.native
  
  var steps: js.Array[DriveStep] = js.native
  
  var time: Double = js.native
  
  var tolls: Double = js.native
  
  var tolls_distance: Double = js.native
}
object DriveRoute {
  
  @scala.inline
  def apply(
    distance: Double,
    policy: String,
    steps: js.Array[DriveStep],
    time: Double,
    tolls: Double,
    tolls_distance: Double
  ): DriveRoute = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
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
