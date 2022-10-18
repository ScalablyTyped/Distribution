package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricMonitor extends StObject {
  
  /**
    * A structure that defines the metric.
    */
  var metricDefinition: MetricDefinition
}
object MetricMonitor {
  
  inline def apply(metricDefinition: MetricDefinition): MetricMonitor = {
    val __obj = js.Dynamic.literal(metricDefinition = metricDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricMonitor]
  }
  
  extension [Self <: MetricMonitor](x: Self) {
    
    inline def setMetricDefinition(value: MetricDefinition): Self = StObject.set(x, "metricDefinition", value.asInstanceOf[js.Any])
  }
}
