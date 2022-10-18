package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionMemoryProjectedMetric extends StObject {
  
  /**
    * The name of the projected utilization metric.
    */
  var name: js.UndefOr[LambdaFunctionMemoryMetricName] = js.undefined
  
  /**
    * The statistic of the projected utilization metric.
    */
  var statistic: js.UndefOr[LambdaFunctionMemoryMetricStatistic] = js.undefined
  
  /**
    * The values of the projected utilization metrics.
    */
  var value: js.UndefOr[MetricValue] = js.undefined
}
object LambdaFunctionMemoryProjectedMetric {
  
  inline def apply(): LambdaFunctionMemoryProjectedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionMemoryProjectedMetric]
  }
  
  extension [Self <: LambdaFunctionMemoryProjectedMetric](x: Self) {
    
    inline def setName(value: LambdaFunctionMemoryMetricName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatistic(value: LambdaFunctionMemoryMetricStatistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
    
    inline def setValue(value: MetricValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
