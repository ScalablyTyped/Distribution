package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancer extends js.Object {
  /**
    * The name of the container (as it appears in a container definition) to associate with the load balancer.
    */
  var containerName: js.UndefOr[String] = js.undefined
  /**
    * The port on the container to associate with the load balancer. This port must correspond to a containerPort in the task definition the tasks in the service are using. For tasks that use the EC2 launch type, the container instance they are launched on must allow ingress traffic on the hostPort of the port mapping.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The name of the load balancer to associate with the Amazon ECS service or task set. A load balancer name is only specified when using a Classic Load Balancer. If you are using an Application Load Balancer or a Network Load Balancer this should be omitted.
    */
  var loadBalancerName: js.UndefOr[String] = js.undefined
  /**
    * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a service or task set. A target group ARN is only specified when using an Application Load Balancer or Network Load Balancer. If you are using a Classic Load Balancer this should be omitted. For services using the ECS deployment controller, you can specify one or multiple target groups. For more information, see Registering Multiple Target Groups with a Service in the Amazon Elastic Container Service Developer Guide. For services using the CODE_DEPLOY deployment controller, you are required to define two target groups for the load balancer. For more information, see Blue/Green Deployment with CodeDeploy in the Amazon Elastic Container Service Developer Guide.  If your service's task definition uses the awsvpc network mode (which is required for the Fargate launch type), you must choose ip as the target type, not instance, when creating your target groups because tasks that use the awsvpc network mode are associated with an elastic network interface, not an Amazon EC2 instance. 
    */
  var targetGroupArn: js.UndefOr[String] = js.undefined
}

object LoadBalancer {
  @scala.inline
  def apply(
    containerName: String = null,
    containerPort: Int | scala.Double = null,
    loadBalancerName: String = null,
    targetGroupArn: String = null
  ): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    if (containerName != null) __obj.updateDynamic("containerName")(containerName)
    if (containerPort != null) __obj.updateDynamic("containerPort")(containerPort.asInstanceOf[js.Any])
    if (loadBalancerName != null) __obj.updateDynamic("loadBalancerName")(loadBalancerName)
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn)
    __obj.asInstanceOf[LoadBalancer]
  }
}

