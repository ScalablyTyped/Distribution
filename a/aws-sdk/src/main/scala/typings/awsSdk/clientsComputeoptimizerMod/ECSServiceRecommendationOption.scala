package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECSServiceRecommendationOption extends StObject {
  
  /**
    *  The CPU and memory size recommendations for the containers within the task of your Amazon ECS service. 
    */
  var containerRecommendations: js.UndefOr[ContainerRecommendations] = js.undefined
  
  /**
    *  The CPU size of the Amazon ECS service recommendation option. 
    */
  var cpu: js.UndefOr[NullableCpu] = js.undefined
  
  /**
    *  The memory size of the Amazon ECS service recommendation option. 
    */
  var memory: js.UndefOr[NullableMemory] = js.undefined
  
  /**
    *  An array of objects that describe the projected utilization metrics of the Amazon ECS service recommendation option. 
    */
  var projectedUtilizationMetrics: js.UndefOr[ECSServiceProjectedUtilizationMetrics] = js.undefined
  
  var savingsOpportunity: js.UndefOr[SavingsOpportunity] = js.undefined
}
object ECSServiceRecommendationOption {
  
  inline def apply(): ECSServiceRecommendationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSServiceRecommendationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ECSServiceRecommendationOption] (val x: Self) extends AnyVal {
    
    inline def setContainerRecommendations(value: ContainerRecommendations): Self = StObject.set(x, "containerRecommendations", value.asInstanceOf[js.Any])
    
    inline def setContainerRecommendationsUndefined: Self = StObject.set(x, "containerRecommendations", js.undefined)
    
    inline def setContainerRecommendationsVarargs(value: ContainerRecommendation*): Self = StObject.set(x, "containerRecommendations", js.Array(value*))
    
    inline def setCpu(value: NullableCpu): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setMemory(value: NullableMemory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setProjectedUtilizationMetrics(value: ECSServiceProjectedUtilizationMetrics): Self = StObject.set(x, "projectedUtilizationMetrics", value.asInstanceOf[js.Any])
    
    inline def setProjectedUtilizationMetricsUndefined: Self = StObject.set(x, "projectedUtilizationMetrics", js.undefined)
    
    inline def setProjectedUtilizationMetricsVarargs(value: ECSServiceProjectedUtilizationMetric*): Self = StObject.set(x, "projectedUtilizationMetrics", js.Array(value*))
    
    inline def setSavingsOpportunity(value: SavingsOpportunity): Self = StObject.set(x, "savingsOpportunity", value.asInstanceOf[js.Any])
    
    inline def setSavingsOpportunityUndefined: Self = StObject.set(x, "savingsOpportunity", js.undefined)
  }
}
