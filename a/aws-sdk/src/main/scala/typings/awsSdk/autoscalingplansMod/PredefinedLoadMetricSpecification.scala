package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredefinedLoadMetricSpecification extends StObject {
  
  /**
    * The metric type.
    */
  var PredefinedLoadMetricType: LoadMetricType
  
  /**
    * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group for an Application Load Balancer attached to the Auto Scaling group. The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.  
    */
  var ResourceLabel: js.UndefOr[typings.awsSdk.autoscalingplansMod.ResourceLabel] = js.undefined
}
object PredefinedLoadMetricSpecification {
  
  @scala.inline
  def apply(PredefinedLoadMetricType: LoadMetricType): PredefinedLoadMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedLoadMetricType = PredefinedLoadMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedLoadMetricSpecification]
  }
  
  @scala.inline
  implicit class PredefinedLoadMetricSpecificationMutableBuilder[Self <: PredefinedLoadMetricSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredefinedLoadMetricType(value: LoadMetricType): Self = StObject.set(x, "PredefinedLoadMetricType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabel(value: ResourceLabel): Self = StObject.set(x, "ResourceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabelUndefined: Self = StObject.set(x, "ResourceLabel", js.undefined)
  }
}
