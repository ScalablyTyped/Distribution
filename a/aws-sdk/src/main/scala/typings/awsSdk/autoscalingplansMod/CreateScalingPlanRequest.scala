package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateScalingPlanRequest extends js.Object {
  
  /**
    * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
    */
  var ApplicationSource: typings.awsSdk.autoscalingplansMod.ApplicationSource = js.native
  
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: typings.awsSdk.autoscalingplansMod.ScalingInstructions = js.native
  
  /**
    * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
    */
  var ScalingPlanName: typings.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
}
object CreateScalingPlanRequest {
  
  @scala.inline
  def apply(
    ApplicationSource: ApplicationSource,
    ScalingInstructions: ScalingInstructions,
    ScalingPlanName: ScalingPlanName
  ): CreateScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ApplicationSource = ApplicationSource.asInstanceOf[js.Any], ScalingInstructions = ScalingInstructions.asInstanceOf[js.Any], ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScalingPlanRequest]
  }
  
  @scala.inline
  implicit class CreateScalingPlanRequestOps[Self <: CreateScalingPlanRequest] (val x: Self) extends AnyVal {
    
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
    def setApplicationSource(value: ApplicationSource): Self = this.set("ApplicationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingInstructionsVarargs(value: ScalingInstruction*): Self = this.set("ScalingInstructions", js.Array(value :_*))
    
    @scala.inline
    def setScalingInstructions(value: ScalingInstructions): Self = this.set("ScalingInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPlanName(value: ScalingPlanName): Self = this.set("ScalingPlanName", value.asInstanceOf[js.Any])
  }
}
