package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredefinedMetricSpecification extends StObject {
  
  /**
    * The metric type. The following predefined metrics are available:    ASGAverageCPUUtilization - Average CPU utilization of the Auto Scaling group.    ASGAverageNetworkIn - Average number of bytes received on all network interfaces by the Auto Scaling group.    ASGAverageNetworkOut - Average number of bytes sent out on all network interfaces by the Auto Scaling group.    ALBRequestCountPerTarget - Number of requests completed per target in an Application Load Balancer target group.  
    */
  var PredefinedMetricType: MetricType = js.native
  
  /**
    * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group attached to the Auto Scaling group. You create the resource label by appending the final portion of the load balancer ARN and the final portion of the target group ARN into a single value, separated by a forward slash (/). The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.   This is an example: app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d. To find the ARN for an Application Load Balancer, use the DescribeLoadBalancers API operation. To find the ARN for the target group, use the DescribeTargetGroups API operation.
    */
  var ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.native
}
object PredefinedMetricSpecification {
  
  @scala.inline
  def apply(PredefinedMetricType: MetricType): PredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedMetricType = PredefinedMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedMetricSpecification]
  }
  
  @scala.inline
  implicit class PredefinedMetricSpecificationMutableBuilder[Self <: PredefinedMetricSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredefinedMetricType(value: MetricType): Self = StObject.set(x, "PredefinedMetricType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabel(value: XmlStringMaxLen1023): Self = StObject.set(x, "ResourceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabelUndefined: Self = StObject.set(x, "ResourceLabel", js.undefined)
  }
}
