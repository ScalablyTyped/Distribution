package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricMonitorConfig extends StObject {
  
  /**
    * A structure that defines the metric.
    */
  var metricDefinition: MetricDefinitionConfig
}
object MetricMonitorConfig {
  
  inline def apply(metricDefinition: MetricDefinitionConfig): MetricMonitorConfig = {
    val __obj = js.Dynamic.literal(metricDefinition = metricDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricMonitorConfig]
  }
  
  extension [Self <: MetricMonitorConfig](x: Self) {
    
    inline def setMetricDefinition(value: MetricDefinitionConfig): Self = StObject.set(x, "metricDefinition", value.asInstanceOf[js.Any])
  }
}
