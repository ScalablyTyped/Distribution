package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricStreamStatisticsMetric extends StObject {
  
  /**
    * The name of the metric.
    */
  var MetricName: typings.awsSdk.clientsCloudwatchMod.MetricName
  
  /**
    * The namespace of the metric.
    */
  var Namespace: typings.awsSdk.clientsCloudwatchMod.Namespace
}
object MetricStreamStatisticsMetric {
  
  inline def apply(MetricName: MetricName, Namespace: Namespace): MetricStreamStatisticsMetric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricStreamStatisticsMetric]
  }
  
  extension [Self <: MetricStreamStatisticsMetric](x: Self) {
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
