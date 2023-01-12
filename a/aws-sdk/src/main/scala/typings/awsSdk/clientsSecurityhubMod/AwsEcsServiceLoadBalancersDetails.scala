package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsServiceLoadBalancersDetails extends StObject {
  
  /**
    * The name of the container to associate with the load balancer.
    */
  var ContainerName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The port on the container to associate with the load balancer. This port must correspond to a containerPort in the task definition the tasks in the service are using. For tasks that use the EC2 launch type, the container instance they are launched on must allow ingress traffic on the hostPort of the port mapping.
    */
  var ContainerPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the load balancer to associate with the Amazon ECS service or task set. Only specified when using a Classic Load Balancer. For an Application Load Balancer or a Network Load Balancer, the load balancer name is omitted.
    */
  var LoadBalancerName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the Elastic Load Balancing target group or groups associated with a service or task set. Only specified when using an Application Load Balancer or a Network Load Balancer. For a Classic Load Balancer, the target group ARN is omitted.
    */
  var TargetGroupArn: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsServiceLoadBalancersDetails {
  
  inline def apply(): AwsEcsServiceLoadBalancersDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsServiceLoadBalancersDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsServiceLoadBalancersDetails] (val x: Self) extends AnyVal {
    
    inline def setContainerName(value: NonEmptyString): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "ContainerName", js.undefined)
    
    inline def setContainerPort(value: Integer): Self = StObject.set(x, "ContainerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "ContainerPort", js.undefined)
    
    inline def setLoadBalancerName(value: NonEmptyString): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNameUndefined: Self = StObject.set(x, "LoadBalancerName", js.undefined)
    
    inline def setTargetGroupArn(value: NonEmptyString): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupArnUndefined: Self = StObject.set(x, "TargetGroupArn", js.undefined)
  }
}
