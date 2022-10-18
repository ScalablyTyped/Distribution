package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishMetricsInput extends StObject {
  
  /**
    *  Internal only. The name of the environment.
    */
  var EnvironmentName: typings.awsSdk.clientsMwaaMod.EnvironmentName
  
  /**
    *  Internal only. Publishes metrics to Amazon CloudWatch. To learn more about the metrics published to Amazon CloudWatch, see Amazon MWAA performance metrics in Amazon CloudWatch.
    */
  var MetricData: typings.awsSdk.clientsMwaaMod.MetricData
}
object PublishMetricsInput {
  
  inline def apply(EnvironmentName: EnvironmentName, MetricData: MetricData): PublishMetricsInput = {
    val __obj = js.Dynamic.literal(EnvironmentName = EnvironmentName.asInstanceOf[js.Any], MetricData = MetricData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishMetricsInput]
  }
  
  extension [Self <: PublishMetricsInput](x: Self) {
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setMetricData(value: MetricData): Self = StObject.set(x, "MetricData", value.asInstanceOf[js.Any])
    
    inline def setMetricDataVarargs(value: MetricDatum*): Self = StObject.set(x, "MetricData", js.Array(value*))
  }
}
