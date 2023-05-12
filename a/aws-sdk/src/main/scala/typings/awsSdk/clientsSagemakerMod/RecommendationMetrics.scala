package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationMetrics extends StObject {
  
  /**
    * Defines the cost per hour for the instance. 
    */
  var CostPerHour: Float
  
  /**
    * Defines the cost per inference for the instance .
    */
  var CostPerInference: Float
  
  /**
    * The expected CPU utilization at maximum invocations per minute for the instance.  NaN indicates that the value is not available.
    */
  var CpuUtilization: js.UndefOr[UtilizationMetric] = js.undefined
  
  /**
    * The expected maximum number of requests per minute for the instance.
    */
  var MaxInvocations: Integer
  
  /**
    * The expected memory utilization at maximum invocations per minute for the instance.  NaN indicates that the value is not available.
    */
  var MemoryUtilization: js.UndefOr[UtilizationMetric] = js.undefined
  
  /**
    * The expected model latency at maximum invocation per minute for the instance.
    */
  var ModelLatency: Integer
}
object RecommendationMetrics {
  
  inline def apply(CostPerHour: Float, CostPerInference: Float, MaxInvocations: Integer, ModelLatency: Integer): RecommendationMetrics = {
    val __obj = js.Dynamic.literal(CostPerHour = CostPerHour.asInstanceOf[js.Any], CostPerInference = CostPerInference.asInstanceOf[js.Any], MaxInvocations = MaxInvocations.asInstanceOf[js.Any], ModelLatency = ModelLatency.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationMetrics] (val x: Self) extends AnyVal {
    
    inline def setCostPerHour(value: Float): Self = StObject.set(x, "CostPerHour", value.asInstanceOf[js.Any])
    
    inline def setCostPerInference(value: Float): Self = StObject.set(x, "CostPerInference", value.asInstanceOf[js.Any])
    
    inline def setCpuUtilization(value: UtilizationMetric): Self = StObject.set(x, "CpuUtilization", value.asInstanceOf[js.Any])
    
    inline def setCpuUtilizationUndefined: Self = StObject.set(x, "CpuUtilization", js.undefined)
    
    inline def setMaxInvocations(value: Integer): Self = StObject.set(x, "MaxInvocations", value.asInstanceOf[js.Any])
    
    inline def setMemoryUtilization(value: UtilizationMetric): Self = StObject.set(x, "MemoryUtilization", value.asInstanceOf[js.Any])
    
    inline def setMemoryUtilizationUndefined: Self = StObject.set(x, "MemoryUtilization", js.undefined)
    
    inline def setModelLatency(value: Integer): Self = StObject.set(x, "ModelLatency", value.asInstanceOf[js.Any])
  }
}
