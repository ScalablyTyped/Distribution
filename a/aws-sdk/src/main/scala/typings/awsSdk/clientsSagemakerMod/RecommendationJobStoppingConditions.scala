package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationJobStoppingConditions extends StObject {
  
  /**
    * The maximum number of requests per minute expected for the endpoint.
    */
  var MaxInvocations: js.UndefOr[Integer] = js.undefined
  
  /**
    * The interval of time taken by a model to respond as viewed from SageMaker. The interval includes the local communication time taken to send the request and to fetch the response from the container of a model and the time taken to complete the inference in the container.
    */
  var ModelLatencyThresholds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelLatencyThresholds] = js.undefined
}
object RecommendationJobStoppingConditions {
  
  inline def apply(): RecommendationJobStoppingConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationJobStoppingConditions]
  }
  
  extension [Self <: RecommendationJobStoppingConditions](x: Self) {
    
    inline def setMaxInvocations(value: Integer): Self = StObject.set(x, "MaxInvocations", value.asInstanceOf[js.Any])
    
    inline def setMaxInvocationsUndefined: Self = StObject.set(x, "MaxInvocations", js.undefined)
    
    inline def setModelLatencyThresholds(value: ModelLatencyThresholds): Self = StObject.set(x, "ModelLatencyThresholds", value.asInstanceOf[js.Any])
    
    inline def setModelLatencyThresholdsUndefined: Self = StObject.set(x, "ModelLatencyThresholds", js.undefined)
    
    inline def setModelLatencyThresholdsVarargs(value: ModelLatencyThreshold*): Self = StObject.set(x, "ModelLatencyThresholds", js.Array(value*))
  }
}
