package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionMemoryRecommendationOption extends StObject {
  
  /**
    * The memory size, in MB, of the function recommendation option.
    */
  var memorySize: js.UndefOr[MemorySize] = js.undefined
  
  /**
    * An array of objects that describe the projected utilization metrics of the function recommendation option.
    */
  var projectedUtilizationMetrics: js.UndefOr[LambdaFunctionMemoryProjectedMetrics] = js.undefined
  
  /**
    * The rank of the function recommendation option. The top recommendation option is ranked as 1.
    */
  var rank: js.UndefOr[Rank] = js.undefined
  
  /**
    * An object that describes the savings opportunity for the Lambda function recommendation option. Savings opportunity includes the estimated monthly savings amount and percentage.
    */
  var savingsOpportunity: js.UndefOr[SavingsOpportunity] = js.undefined
}
object LambdaFunctionMemoryRecommendationOption {
  
  inline def apply(): LambdaFunctionMemoryRecommendationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionMemoryRecommendationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaFunctionMemoryRecommendationOption] (val x: Self) extends AnyVal {
    
    inline def setMemorySize(value: MemorySize): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeUndefined: Self = StObject.set(x, "memorySize", js.undefined)
    
    inline def setProjectedUtilizationMetrics(value: LambdaFunctionMemoryProjectedMetrics): Self = StObject.set(x, "projectedUtilizationMetrics", value.asInstanceOf[js.Any])
    
    inline def setProjectedUtilizationMetricsUndefined: Self = StObject.set(x, "projectedUtilizationMetrics", js.undefined)
    
    inline def setProjectedUtilizationMetricsVarargs(value: LambdaFunctionMemoryProjectedMetric*): Self = StObject.set(x, "projectedUtilizationMetrics", js.Array(value*))
    
    inline def setRank(value: Rank): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setSavingsOpportunity(value: SavingsOpportunity): Self = StObject.set(x, "savingsOpportunity", value.asInstanceOf[js.Any])
    
    inline def setSavingsOpportunityUndefined: Self = StObject.set(x, "savingsOpportunity", js.undefined)
  }
}
