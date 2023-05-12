package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMetricAttributionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the destination dataset group for the metric attribution.
    */
  var datasetGroupArn: Arn
  
  /**
    * A list of metric attributes for the metric attribution. Each metric attribute specifies an event type to track and a function. Available functions are SUM() or SAMPLECOUNT(). For SUM() functions, provide the dataset type (either Interactions or Items) and column to sum as a parameter. For example SUM(Items.PRICE).
    */
  var metrics: MetricAttributes
  
  /**
    * The output configuration details for the metric attribution.
    */
  var metricsOutputConfig: MetricAttributionOutput
  
  /**
    * A name for the metric attribution.
    */
  var name: Name
}
object CreateMetricAttributionRequest {
  
  inline def apply(
    datasetGroupArn: Arn,
    metrics: MetricAttributes,
    metricsOutputConfig: MetricAttributionOutput,
    name: Name
  ): CreateMetricAttributionRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], metricsOutputConfig = metricsOutputConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMetricAttributionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMetricAttributionRequest] (val x: Self) extends AnyVal {
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: MetricAttributes): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsOutputConfig(value: MetricAttributionOutput): Self = StObject.set(x, "metricsOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setMetricsVarargs(value: MetricAttribute*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
