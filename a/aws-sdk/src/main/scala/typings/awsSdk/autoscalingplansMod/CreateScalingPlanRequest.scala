package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateScalingPlanRequest extends StObject {
  
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
  implicit class CreateScalingPlanRequestMutableBuilder[Self <: CreateScalingPlanRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationSource(value: ApplicationSource): Self = StObject.set(x, "ApplicationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingInstructions(value: ScalingInstructions): Self = StObject.set(x, "ScalingInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingInstructionsVarargs(value: ScalingInstruction*): Self = StObject.set(x, "ScalingInstructions", js.Array(value :_*))
    
    @scala.inline
    def setScalingPlanName(value: ScalingPlanName): Self = StObject.set(x, "ScalingPlanName", value.asInstanceOf[js.Any])
  }
}
