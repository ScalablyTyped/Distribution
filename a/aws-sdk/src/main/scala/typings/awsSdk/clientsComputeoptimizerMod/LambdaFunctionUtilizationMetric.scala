package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionUtilizationMetric extends StObject {
  
  /**
    * The name of the utilization metric. The following utilization metrics are available:    Duration - The amount of time that your function code spends processing an event.    Memory - The amount of memory used per invocation.  
    */
  var name: js.UndefOr[LambdaFunctionMetricName] = js.undefined
  
  /**
    * The statistic of the utilization metric. The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only the Maximum statistic, which is the highest value observed during the specified period. The Compute Optimizer console displays graphs for some utilization metrics using the Average statistic, which is the value of Sum / SampleCount during the specified period. For more information, see Viewing resource recommendations in the Compute Optimizer User Guide. You can also get averaged utilization metric data for your resources using Amazon CloudWatch. For more information, see the Amazon CloudWatch User Guide.
    */
  var statistic: js.UndefOr[LambdaFunctionMetricStatistic] = js.undefined
  
  /**
    * The value of the utilization metric.
    */
  var value: js.UndefOr[MetricValue] = js.undefined
}
object LambdaFunctionUtilizationMetric {
  
  inline def apply(): LambdaFunctionUtilizationMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionUtilizationMetric]
  }
  
  extension [Self <: LambdaFunctionUtilizationMetric](x: Self) {
    
    inline def setName(value: LambdaFunctionMetricName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatistic(value: LambdaFunctionMetricStatistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
    
    inline def setValue(value: MetricValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
