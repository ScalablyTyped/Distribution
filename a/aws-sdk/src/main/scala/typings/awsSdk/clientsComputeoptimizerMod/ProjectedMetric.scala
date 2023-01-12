package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectedMetric extends StObject {
  
  /**
    * The name of the projected utilization metric. The following projected utilization metrics are returned:    Cpu - The projected percentage of allocated EC2 compute units that would be in use on the recommendation option had you used that resource during the analyzed period. This metric identifies the processing power required to run an application on the recommendation option. Depending on the instance type, tools in your operating system can show a lower percentage than CloudWatch when the instance is not allocated a full processor core. Units: Percent    Memory - The percentage of memory that would be in use on the recommendation option had you used that resource during the analyzed period. This metric identifies the amount of memory required to run an application on the recommendation option. Units: Percent  The Memory metric is returned only for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent.   
    */
  var name: js.UndefOr[MetricName] = js.undefined
  
  /**
    * The timestamps of the projected utilization metric.
    */
  var timestamps: js.UndefOr[Timestamps] = js.undefined
  
  /**
    * The values of the projected utilization metrics.
    */
  var values: js.UndefOr[MetricValues] = js.undefined
}
object ProjectedMetric {
  
  inline def apply(): ProjectedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectedMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectedMetric] (val x: Self) extends AnyVal {
    
    inline def setName(value: MetricName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTimestamps(value: Timestamps): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setTimestampsVarargs(value: js.Date*): Self = StObject.set(x, "timestamps", js.Array(value*))
    
    inline def setValues(value: MetricValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: MetricValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
