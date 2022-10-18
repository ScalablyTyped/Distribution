package typings.awsSdk.clientsAutoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScalingPlanRequest extends StObject {
  
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typings.awsSdk.clientsAutoscalingplansMod.ScalingPlanName
  
  /**
    * The version number of the scaling plan. Currently, the only valid value is 1.
    */
  var ScalingPlanVersion: typings.awsSdk.clientsAutoscalingplansMod.ScalingPlanVersion
}
object DeleteScalingPlanRequest {
  
  inline def apply(ScalingPlanName: ScalingPlanName, ScalingPlanVersion: ScalingPlanVersion): DeleteScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScalingPlanRequest]
  }
  
  extension [Self <: DeleteScalingPlanRequest](x: Self) {
    
    inline def setScalingPlanName(value: ScalingPlanName): Self = StObject.set(x, "ScalingPlanName", value.asInstanceOf[js.Any])
    
    inline def setScalingPlanVersion(value: ScalingPlanVersion): Self = StObject.set(x, "ScalingPlanVersion", value.asInstanceOf[js.Any])
  }
}
