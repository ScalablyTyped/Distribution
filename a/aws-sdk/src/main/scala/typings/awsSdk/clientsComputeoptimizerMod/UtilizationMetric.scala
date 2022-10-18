package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilizationMetric extends StObject {
  
  /**
    * The name of the utilization metric. The following utilization metrics are available:    Cpu - The percentage of allocated EC2 compute units that are currently in use on the instance. This metric identifies the processing power required to run an application on the instance. Depending on the instance type, tools in your operating system can show a lower percentage than CloudWatch when the instance is not allocated a full processor core. Units: Percent    Memory - The percentage of memory that is currently in use on the instance. This metric identifies the amount of memory required to run an application on the instance. Units: Percent  The Memory metric is returned only for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent.     EBS_READ_OPS_PER_SECOND - The completed read operations from all EBS volumes attached to the instance in a specified period of time. Unit: Count    EBS_WRITE_OPS_PER_SECOND - The completed write operations to all EBS volumes attached to the instance in a specified period of time. Unit: Count    EBS_READ_BYTES_PER_SECOND - The bytes read from all EBS volumes attached to the instance in a specified period of time. Unit: Bytes    EBS_WRITE_BYTES_PER_SECOND - The bytes written to all EBS volumes attached to the instance in a specified period of time. Unit: Bytes    DISK_READ_OPS_PER_SECOND - The completed read operations from all instance store volumes available to the instance in a specified period of time. If there are no instance store volumes, either the value is 0 or the metric is not reported.    DISK_WRITE_OPS_PER_SECOND - The completed write operations from all instance store volumes available to the instance in a specified period of time. If there are no instance store volumes, either the value is 0 or the metric is not reported.    DISK_READ_BYTES_PER_SECOND - The bytes read from all instance store volumes available to the instance. This metric is used to determine the volume of the data the application reads from the disk of the instance. This can be used to determine the speed of the application. If there are no instance store volumes, either the value is 0 or the metric is not reported.    DISK_WRITE_BYTES_PER_SECOND - The bytes written to all instance store volumes available to the instance. This metric is used to determine the volume of the data the application writes onto the disk of the instance. This can be used to determine the speed of the application. If there are no instance store volumes, either the value is 0 or the metric is not reported.    NETWORK_IN_BYTES_PER_SECOND - The number of bytes received by the instance on all network interfaces. This metric identifies the volume of incoming network traffic to a single instance.    NETWORK_OUT_BYTES_PER_SECOND - The number of bytes sent out by the instance on all network interfaces. This metric identifies the volume of outgoing network traffic from a single instance.    NETWORK_PACKETS_IN_PER_SECOND - The number of packets received by the instance on all network interfaces. This metric identifies the volume of incoming traffic in terms of the number of packets on a single instance.    NETWORK_PACKETS_OUT_PER_SECOND - The number of packets sent out by the instance on all network interfaces. This metric identifies the volume of outgoing traffic in terms of the number of packets on a single instance.  
    */
  var name: js.UndefOr[MetricName] = js.undefined
  
  /**
    * The statistic of the utilization metric. The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only the Maximum statistic, which is the highest value observed during the specified period. The Compute Optimizer console displays graphs for some utilization metrics using the Average statistic, which is the value of Sum / SampleCount during the specified period. For more information, see Viewing resource recommendations in the Compute Optimizer User Guide. You can also get averaged utilization metric data for your resources using Amazon CloudWatch. For more information, see the Amazon CloudWatch User Guide.
    */
  var statistic: js.UndefOr[MetricStatistic] = js.undefined
  
  /**
    * The value of the utilization metric.
    */
  var value: js.UndefOr[MetricValue] = js.undefined
}
object UtilizationMetric {
  
  inline def apply(): UtilizationMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilizationMetric]
  }
  
  extension [Self <: UtilizationMetric](x: Self) {
    
    inline def setName(value: MetricName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatistic(value: MetricStatistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
    
    inline def setValue(value: MetricValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
