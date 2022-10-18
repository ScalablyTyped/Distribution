package typings.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizedMetricSpecification extends StObject {
  
  /**
    * The dimensions of the metric.  Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling policy.
    */
  var Dimensions: js.UndefOr[MetricDimensions] = js.undefined
  
  /**
    * The name of the metric. 
    */
  var MetricName: typings.awsSdk.clientsApplicationautoscalingMod.MetricName
  
  /**
    * The namespace of the metric.
    */
  var Namespace: MetricNamespace
  
  /**
    * The statistic of the metric.
    */
  var Statistic: MetricStatistic
  
  /**
    * The unit of the metric.
    */
  var Unit: js.UndefOr[MetricUnit] = js.undefined
}
object CustomizedMetricSpecification {
  
  inline def apply(MetricName: MetricName, Namespace: MetricNamespace, Statistic: MetricStatistic): CustomizedMetricSpecification = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Statistic = Statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizedMetricSpecification]
  }
  
  extension [Self <: CustomizedMetricSpecification](x: Self) {
    
    inline def setDimensions(value: MetricDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: MetricDimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: MetricNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setStatistic(value: MetricStatistic): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: MetricUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
