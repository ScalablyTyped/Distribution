package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateScalingPlanResponse extends js.Object {
  
  /**
    * The version number of the scaling plan. This value is always 1. Currently, you cannot specify multiple scaling plan versions.
    */
  var ScalingPlanVersion: typings.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
}
object CreateScalingPlanResponse {
  
  @scala.inline
  def apply(ScalingPlanVersion: ScalingPlanVersion): CreateScalingPlanResponse = {
    val __obj = js.Dynamic.literal(ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScalingPlanResponse]
  }
  
  @scala.inline
  implicit class CreateScalingPlanResponseOps[Self <: CreateScalingPlanResponse] (val x: Self) extends AnyVal {
    
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
    def setScalingPlanVersion(value: ScalingPlanVersion): Self = this.set("ScalingPlanVersion", value.asInstanceOf[js.Any])
  }
}
