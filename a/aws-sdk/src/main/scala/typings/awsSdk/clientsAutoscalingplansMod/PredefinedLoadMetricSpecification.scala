package typings.awsSdk.clientsAutoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredefinedLoadMetricSpecification extends StObject {
  
  /**
    * The metric type.
    */
  var PredefinedLoadMetricType: LoadMetricType
  
  /**
    * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBTargetGroupRequestCount and there is a target group for an Application Load Balancer attached to the Auto Scaling group. You create the resource label by appending the final portion of the load balancer ARN and the final portion of the target group ARN into a single value, separated by a forward slash (/). The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.   This is an example: app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d. To find the ARN for an Application Load Balancer, use the DescribeLoadBalancers API operation. To find the ARN for the target group, use the DescribeTargetGroups API operation.
    */
  var ResourceLabel: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.ResourceLabel] = js.undefined
}
object PredefinedLoadMetricSpecification {
  
  inline def apply(PredefinedLoadMetricType: LoadMetricType): PredefinedLoadMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedLoadMetricType = PredefinedLoadMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedLoadMetricSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredefinedLoadMetricSpecification] (val x: Self) extends AnyVal {
    
    inline def setPredefinedLoadMetricType(value: LoadMetricType): Self = StObject.set(x, "PredefinedLoadMetricType", value.asInstanceOf[js.Any])
    
    inline def setResourceLabel(value: ResourceLabel): Self = StObject.set(x, "ResourceLabel", value.asInstanceOf[js.Any])
    
    inline def setResourceLabelUndefined: Self = StObject.set(x, "ResourceLabel", js.undefined)
  }
}
