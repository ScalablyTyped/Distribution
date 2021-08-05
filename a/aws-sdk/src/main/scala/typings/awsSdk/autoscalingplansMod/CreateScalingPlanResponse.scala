package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScalingPlanResponse extends StObject {
  
  /**
    * The version number of the scaling plan. This value is always 1. Currently, you cannot specify multiple scaling plan versions.
    */
  var ScalingPlanVersion: typings.awsSdk.autoscalingplansMod.ScalingPlanVersion
}
object CreateScalingPlanResponse {
  
  inline def apply(ScalingPlanVersion: ScalingPlanVersion): CreateScalingPlanResponse = {
    val __obj = js.Dynamic.literal(ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScalingPlanResponse]
  }
  
  extension [Self <: CreateScalingPlanResponse](x: Self) {
    
    inline def setScalingPlanVersion(value: ScalingPlanVersion): Self = StObject.set(x, "ScalingPlanVersion", value.asInstanceOf[js.Any])
  }
}
