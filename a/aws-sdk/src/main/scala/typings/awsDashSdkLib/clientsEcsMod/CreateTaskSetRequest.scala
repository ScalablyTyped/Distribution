package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTaskSetRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32 ASCII characters are allowed.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
    */
  var cluster: String
  /**
    * An optional non-unique tag that identifies this task set in external systems. If the task set is associated with a service discovery registry, the tasks in this task set will have the ECS_TASK_SET_EXTERNAL_ID AWS Cloud Map attribute set to the provided value.
    */
  var externalId: js.UndefOr[String] = js.undefined
  /**
    * The launch type that new tasks in the task set will use. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  /**
    * A load balancer object representing the load balancer to use with the task set. The supported load balancer types are either an Application Load Balancer or a Network Load Balancer.
    */
  var loadBalancers: js.UndefOr[LoadBalancers] = js.undefined
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  /**
    * The platform version that the tasks in the task set should use. A platform version is specified only for tasks using the Fargate launch type. If one isn't specified, the LATEST platform version is used by default.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[Scale] = js.undefined
  /**
    * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
    */
  var service: String
  /**
    * The details of the service discovery registries to assign to this task set. For more information, see Service Discovery.
    */
  var serviceRegistries: js.UndefOr[ServiceRegistries] = js.undefined
  /**
    * The task definition for the tasks in the task set to use.
    */
  var taskDefinition: String
}

object CreateTaskSetRequest {
  @scala.inline
  def apply(
    cluster: String,
    service: String,
    taskDefinition: String,
    clientToken: String = null,
    externalId: String = null,
    launchType: LaunchType = null,
    loadBalancers: LoadBalancers = null,
    networkConfiguration: NetworkConfiguration = null,
    platformVersion: String = null,
    scale: Scale = null,
    serviceRegistries: ServiceRegistries = null
  ): CreateTaskSetRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster, service = service, taskDefinition = taskDefinition)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers)
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration)
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (serviceRegistries != null) __obj.updateDynamic("serviceRegistries")(serviceRegistries)
    __obj.asInstanceOf[CreateTaskSetRequest]
  }
}

