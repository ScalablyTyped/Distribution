package typings.awsSdk.clientsAutoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScalingPlanResponse extends StObject {
  
  /**
    * The version number of the scaling plan. This value is always 1. Currently, you cannot have multiple scaling plan versions.
    */
  var ScalingPlanVersion: typings.awsSdk.clientsAutoscalingplansMod.ScalingPlanVersion
}
object CreateScalingPlanResponse {
  
  inline def apply(ScalingPlanVersion: ScalingPlanVersion): CreateScalingPlanResponse = {
    val __obj = js.Dynamic.literal(ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScalingPlanResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateScalingPlanResponse] (val x: Self) extends AnyVal {
    
    inline def setScalingPlanVersion(value: ScalingPlanVersion): Self = StObject.set(x, "ScalingPlanVersion", value.asInstanceOf[js.Any])
  }
}
