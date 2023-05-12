package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECSServiceProjectedUtilizationMetric extends StObject {
  
  /**
    *  The lower bound values for the projected utilization metrics. 
    */
  var lowerBoundValue: js.UndefOr[LowerBoundValue] = js.undefined
  
  /**
    *  The name of the projected utilization metric.  The following utilization metrics are available:    Cpu — The percentage of allocated compute units that are currently in use on the service tasks.    Memory — The percentage of memory that's currently in use on the service tasks.  
    */
  var name: js.UndefOr[ECSServiceMetricName] = js.undefined
  
  /**
    * The statistic of the projected utilization metric. The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only the Maximum statistic, which is the highest value observed during the specified period. The Compute Optimizer console displays graphs for some utilization metrics using the Average statistic, which is the value of Sum / SampleCount during the specified period. For more information, see Viewing resource recommendations in the Compute Optimizer User Guide. You can also get averaged utilization metric data for your resources using Amazon CloudWatch. For more information, see the Amazon CloudWatch User Guide.
    */
  var statistic: js.UndefOr[ECSServiceMetricStatistic] = js.undefined
  
  /**
    *  The upper bound values for the projected utilization metrics. 
    */
  var upperBoundValue: js.UndefOr[UpperBoundValue] = js.undefined
}
object ECSServiceProjectedUtilizationMetric {
  
  inline def apply(): ECSServiceProjectedUtilizationMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSServiceProjectedUtilizationMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ECSServiceProjectedUtilizationMetric] (val x: Self) extends AnyVal {
    
    inline def setLowerBoundValue(value: LowerBoundValue): Self = StObject.set(x, "lowerBoundValue", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundValueUndefined: Self = StObject.set(x, "lowerBoundValue", js.undefined)
    
    inline def setName(value: ECSServiceMetricName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatistic(value: ECSServiceMetricStatistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
    
    inline def setUpperBoundValue(value: UpperBoundValue): Self = StObject.set(x, "upperBoundValue", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundValueUndefined: Self = StObject.set(x, "upperBoundValue", js.undefined)
  }
}
