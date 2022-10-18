package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancer extends StObject {
  
  /**
    * The name of the container (as it appears in a container definition) to associate with the load balancer.
    */
  var containerName: js.UndefOr[String] = js.undefined
  
  /**
    * The port on the container to associate with the load balancer. This port must correspond to a containerPort in the task definition the tasks in the service are using. For tasks that use the EC2 launch type, the container instance they're launched on must allow ingress traffic on the hostPort of the port mapping.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The name of the load balancer to associate with the Amazon ECS service or task set. A load balancer name is only specified when using a Classic Load Balancer. If you are using an Application Load Balancer or a Network Load Balancer the load balancer name parameter should be omitted.
    */
  var loadBalancerName: js.UndefOr[String] = js.undefined
  
  /**
    * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a service or task set. A target group ARN is only specified when using an Application Load Balancer or Network Load Balancer. If you're using a Classic Load Balancer, omit the target group ARN. For services using the ECS deployment controller, you can specify one or multiple target groups. For more information, see Registering multiple target groups with a service in the Amazon Elastic Container Service Developer Guide. For services using the CODE_DEPLOY deployment controller, you're required to define two target groups for the load balancer. For more information, see Blue/green deployment with CodeDeploy in the Amazon Elastic Container Service Developer Guide.  If your service's task definition uses the awsvpc network mode, you must choose ip as the target type, not instance. Do this when creating your target groups because tasks that use the awsvpc network mode are associated with an elastic network interface, not an Amazon EC2 instance. This network mode is required for the Fargate launch type. 
    */
  var targetGroupArn: js.UndefOr[String] = js.undefined
}
object LoadBalancer {
  
  inline def apply(): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancer]
  }
  
  extension [Self <: LoadBalancer](x: Self) {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setContainerPort(value: BoxedInteger): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    inline def setLoadBalancerName(value: String): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNameUndefined: Self = StObject.set(x, "loadBalancerName", js.undefined)
    
    inline def setTargetGroupArn(value: String): Self = StObject.set(x, "targetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupArnUndefined: Self = StObject.set(x, "targetGroupArn", js.undefined)
  }
}
