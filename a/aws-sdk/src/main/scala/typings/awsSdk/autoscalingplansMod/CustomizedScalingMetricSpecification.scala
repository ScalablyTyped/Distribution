package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomizedScalingMetricSpecification extends StObject {
  
  /**
    * The dimensions of the metric. Conditional: If you published your metric with dimensions, you must specify the same dimensions in your customized scaling metric specification.
    */
  var Dimensions: js.UndefOr[MetricDimensions] = js.native
  
  /**
    * The name of the metric.
    */
  var MetricName: typings.awsSdk.autoscalingplansMod.MetricName = js.native
  
  /**
    * The namespace of the metric.
    */
  var Namespace: MetricNamespace = js.native
  
  /**
    * The statistic of the metric.
    */
  var Statistic: MetricStatistic = js.native
  
  /**
    * The unit of the metric. 
    */
  var Unit: js.UndefOr[MetricUnit] = js.native
}
object CustomizedScalingMetricSpecification {
  
  @scala.inline
  def apply(MetricName: MetricName, Namespace: MetricNamespace, Statistic: MetricStatistic): CustomizedScalingMetricSpecification = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Statistic = Statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizedScalingMetricSpecification]
  }
  
  @scala.inline
  implicit class CustomizedScalingMetricSpecificationMutableBuilder[Self <: CustomizedScalingMetricSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: MetricDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: MetricDimension*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: MetricNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatistic(value: MetricStatistic): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: MetricUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
