package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metric extends StObject {
  
  /**
    * The dimensions for the metric. For the list of available dimensions, see the Amazon Web Services documentation available from the table in Amazon Web Services services that publish CloudWatch metrics  in the Amazon CloudWatch User Guide.  Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling policy.
    */
  var Dimensions: js.UndefOr[MetricDimensions] = js.undefined
  
  /**
    * The name of the metric.
    */
  var MetricName: typings.awsSdk.autoscalingMod.MetricName
  
  /**
    * The namespace of the metric. For more information, see the table in Amazon Web Services services that publish CloudWatch metrics  in the Amazon CloudWatch User Guide.
    */
  var Namespace: MetricNamespace
}
object Metric {
  
  inline def apply(MetricName: MetricName, Namespace: MetricNamespace): Metric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
  
  extension [Self <: Metric](x: Self) {
    
    inline def setDimensions(value: MetricDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: MetricDimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: MetricNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
