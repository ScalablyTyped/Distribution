package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EBSUtilizationMetric extends StObject {
  
  /**
    * The name of the utilization metric. The following utilization metrics are available:    VolumeReadOpsPerSecond - The completed read operations per second from the volume in a specified period of time. Unit: Count    VolumeWriteOpsPerSecond - The completed write operations per second to the volume in a specified period of time. Unit: Count    VolumeReadBytesPerSecond - The bytes read per second from the volume in a specified period of time. Unit: Bytes    VolumeWriteBytesPerSecond - The bytes written to the volume in a specified period of time. Unit: Bytes  
    */
  var name: js.UndefOr[EBSMetricName] = js.undefined
  
  /**
    * The statistic of the utilization metric. The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only the Maximum statistic, which is the highest value observed during the specified period. The Compute Optimizer console displays graphs for some utilization metrics using the Average statistic, which is the value of Sum / SampleCount during the specified period. For more information, see Viewing resource recommendations in the Compute Optimizer User Guide. You can also get averaged utilization metric data for your resources using Amazon CloudWatch. For more information, see the Amazon CloudWatch User Guide.
    */
  var statistic: js.UndefOr[MetricStatistic] = js.undefined
  
  /**
    * The value of the utilization metric.
    */
  var value: js.UndefOr[MetricValue] = js.undefined
}
object EBSUtilizationMetric {
  
  inline def apply(): EBSUtilizationMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBSUtilizationMetric]
  }
  
  extension [Self <: EBSUtilizationMetric](x: Self) {
    
    inline def setName(value: EBSMetricName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatistic(value: MetricStatistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
    
    inline def setValue(value: MetricValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
