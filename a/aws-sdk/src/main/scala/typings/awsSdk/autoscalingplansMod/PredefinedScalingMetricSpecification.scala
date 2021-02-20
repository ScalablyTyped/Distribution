package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredefinedScalingMetricSpecification extends StObject {
  
  /**
    * The metric type. The ALBRequestCountPerTarget metric type applies only to Auto Scaling groups, Spot Fleet requests, and ECS services.
    */
  var PredefinedScalingMetricType: ScalingMetricType = js.native
  
  /**
    * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group for an Application Load Balancer attached to the Auto Scaling group, Spot Fleet request, or ECS service. The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.  
    */
  var ResourceLabel: js.UndefOr[typings.awsSdk.autoscalingplansMod.ResourceLabel] = js.native
}
object PredefinedScalingMetricSpecification {
  
  @scala.inline
  def apply(PredefinedScalingMetricType: ScalingMetricType): PredefinedScalingMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedScalingMetricType = PredefinedScalingMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedScalingMetricSpecification]
  }
  
  @scala.inline
  implicit class PredefinedScalingMetricSpecificationMutableBuilder[Self <: PredefinedScalingMetricSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredefinedScalingMetricType(value: ScalingMetricType): Self = StObject.set(x, "PredefinedScalingMetricType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabel(value: ResourceLabel): Self = StObject.set(x, "ResourceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabelUndefined: Self = StObject.set(x, "ResourceLabel", js.undefined)
  }
}
