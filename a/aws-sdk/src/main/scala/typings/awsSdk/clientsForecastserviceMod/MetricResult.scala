package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricResult extends StObject {
  
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.MetricName] = js.undefined
  
  /**
    * The value for the metric.
    */
  var MetricValue: js.UndefOr[Double] = js.undefined
}
object MetricResult {
  
  inline def apply(): MetricResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricResult] (val x: Self) extends AnyVal {
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setMetricValue(value: Double): Self = StObject.set(x, "MetricValue", value.asInstanceOf[js.Any])
    
    inline def setMetricValueUndefined: Self = StObject.set(x, "MetricValue", js.undefined)
  }
}
