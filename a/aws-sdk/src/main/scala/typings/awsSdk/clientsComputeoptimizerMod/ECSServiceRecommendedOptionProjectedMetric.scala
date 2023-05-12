package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECSServiceRecommendedOptionProjectedMetric extends StObject {
  
  /**
    *  An array of objects that describe the projected metric. 
    */
  var projectedMetrics: js.UndefOr[ECSServiceProjectedMetrics] = js.undefined
  
  /**
    *  The recommended CPU size for the Amazon ECS service. 
    */
  var recommendedCpuUnits: js.UndefOr[CpuSize] = js.undefined
  
  /**
    *  The recommended memory size for the Amazon ECS service. 
    */
  var recommendedMemorySize: js.UndefOr[MemorySize] = js.undefined
}
object ECSServiceRecommendedOptionProjectedMetric {
  
  inline def apply(): ECSServiceRecommendedOptionProjectedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSServiceRecommendedOptionProjectedMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ECSServiceRecommendedOptionProjectedMetric] (val x: Self) extends AnyVal {
    
    inline def setProjectedMetrics(value: ECSServiceProjectedMetrics): Self = StObject.set(x, "projectedMetrics", value.asInstanceOf[js.Any])
    
    inline def setProjectedMetricsUndefined: Self = StObject.set(x, "projectedMetrics", js.undefined)
    
    inline def setProjectedMetricsVarargs(value: ECSServiceProjectedMetric*): Self = StObject.set(x, "projectedMetrics", js.Array(value*))
    
    inline def setRecommendedCpuUnits(value: CpuSize): Self = StObject.set(x, "recommendedCpuUnits", value.asInstanceOf[js.Any])
    
    inline def setRecommendedCpuUnitsUndefined: Self = StObject.set(x, "recommendedCpuUnits", js.undefined)
    
    inline def setRecommendedMemorySize(value: MemorySize): Self = StObject.set(x, "recommendedMemorySize", value.asInstanceOf[js.Any])
    
    inline def setRecommendedMemorySizeUndefined: Self = StObject.set(x, "recommendedMemorySize", js.undefined)
  }
}
