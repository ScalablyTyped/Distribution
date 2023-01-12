package typings.awsSdk.clientsAutoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScalingPlanRequest extends StObject {
  
  /**
    * A CloudFormation stack or set of tags. For more information, see ApplicationSource in the AWS Auto Scaling API Reference.
    */
  var ApplicationSource: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.ApplicationSource] = js.undefined
  
  /**
    * The scaling instructions. For more information, see ScalingInstruction in the AWS Auto Scaling API Reference.
    */
  var ScalingInstructions: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.ScalingInstructions] = js.undefined
  
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typings.awsSdk.clientsAutoscalingplansMod.ScalingPlanName
  
  /**
    * The version number of the scaling plan. The only valid value is 1. Currently, you cannot have multiple scaling plan versions.
    */
  var ScalingPlanVersion: typings.awsSdk.clientsAutoscalingplansMod.ScalingPlanVersion
}
object UpdateScalingPlanRequest {
  
  inline def apply(ScalingPlanName: ScalingPlanName, ScalingPlanVersion: ScalingPlanVersion): UpdateScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScalingPlanRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateScalingPlanRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationSource(value: ApplicationSource): Self = StObject.set(x, "ApplicationSource", value.asInstanceOf[js.Any])
    
    inline def setApplicationSourceUndefined: Self = StObject.set(x, "ApplicationSource", js.undefined)
    
    inline def setScalingInstructions(value: ScalingInstructions): Self = StObject.set(x, "ScalingInstructions", value.asInstanceOf[js.Any])
    
    inline def setScalingInstructionsUndefined: Self = StObject.set(x, "ScalingInstructions", js.undefined)
    
    inline def setScalingInstructionsVarargs(value: ScalingInstruction*): Self = StObject.set(x, "ScalingInstructions", js.Array(value*))
    
    inline def setScalingPlanName(value: ScalingPlanName): Self = StObject.set(x, "ScalingPlanName", value.asInstanceOf[js.Any])
    
    inline def setScalingPlanVersion(value: ScalingPlanVersion): Self = StObject.set(x, "ScalingPlanVersion", value.asInstanceOf[js.Any])
  }
}
