package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDataV2 extends StObject {
  
  /**
    * The metric name, thresholds, and metric filters of the returned metric.
    */
  var Metric: js.UndefOr[MetricV2] = js.undefined
  
  /**
    * The corresponding value of the metric returned in the response.
    */
  var Value: js.UndefOr[typings.awsSdk.clientsConnectMod.Value] = js.undefined
}
object MetricDataV2 {
  
  inline def apply(): MetricDataV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDataV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDataV2] (val x: Self) extends AnyVal {
    
    inline def setMetric(value: MetricV2): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
