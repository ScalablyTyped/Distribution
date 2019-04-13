package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancer extends js.Object {
  /**
    * The name of the container (as it appears in a container definition) to associate with the load balancer.
    */
  var containerName: js.UndefOr[String] = js.undefined
  /**
    * The port on the container to associate with the load balancer. This port must correspond to a containerPort in the service's task definition. Your container instances must allow ingress traffic on the hostPort of the port mapping.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The name of a load balancer.
    */
  var loadBalancerName: js.UndefOr[String] = js.undefined
  /**
    * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a service. For services using the ECS deployment controller, you are limited to one target group. For services using the CODE_DEPLOY deployment controller, you are required to define two target groups for the load balancer.  If your service's task definition uses the awsvpc network mode (which is required for the Fargate launch type), you must choose ip as the target type, not instance, because tasks that use the awsvpc network mode are associated with an elastic network interface, not an Amazon EC2 instance. 
    */
  var targetGroupArn: js.UndefOr[String] = js.undefined
}

object LoadBalancer {
  @scala.inline
  def apply(
    containerName: String = null,
    containerPort: js.UndefOr[BoxedInteger] = js.undefined,
    loadBalancerName: String = null,
    targetGroupArn: String = null
  ): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    if (containerName != null) __obj.updateDynamic("containerName")(containerName)
    if (!js.isUndefined(containerPort)) __obj.updateDynamic("containerPort")(containerPort)
    if (loadBalancerName != null) __obj.updateDynamic("loadBalancerName")(loadBalancerName)
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn)
    __obj.asInstanceOf[LoadBalancer]
  }
}

