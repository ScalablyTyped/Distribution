package typings.awsSdk.clientsAutoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScalingPlanRequest extends StObject {
  
  /**
    * A CloudFormation stack or set of tags. You can create one scaling plan per application source. For more information, see ApplicationSource in the AWS Auto Scaling API Reference.
    */
  var ApplicationSource: typings.awsSdk.clientsAutoscalingplansMod.ApplicationSource
  
  /**
    * The scaling instructions. For more information, see ScalingInstruction in the AWS Auto Scaling API Reference.
    */
  var ScalingInstructions: typings.awsSdk.clientsAutoscalingplansMod.ScalingInstructions
  
  /**
    * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
    */
  var ScalingPlanName: typings.awsSdk.clientsAutoscalingplansMod.ScalingPlanName
}
object CreateScalingPlanRequest {
  
  inline def apply(
    ApplicationSource: ApplicationSource,
    ScalingInstructions: ScalingInstructions,
    ScalingPlanName: ScalingPlanName
  ): CreateScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ApplicationSource = ApplicationSource.asInstanceOf[js.Any], ScalingInstructions = ScalingInstructions.asInstanceOf[js.Any], ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScalingPlanRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateScalingPlanRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationSource(value: ApplicationSource): Self = StObject.set(x, "ApplicationSource", value.asInstanceOf[js.Any])
    
    inline def setScalingInstructions(value: ScalingInstructions): Self = StObject.set(x, "ScalingInstructions", value.asInstanceOf[js.Any])
    
    inline def setScalingInstructionsVarargs(value: ScalingInstruction*): Self = StObject.set(x, "ScalingInstructions", js.Array(value*))
    
    inline def setScalingPlanName(value: ScalingPlanName): Self = StObject.set(x, "ScalingPlanName", value.asInstanceOf[js.Any])
  }
}
