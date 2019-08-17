package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerInstance extends js.Object {
  /**
    * This parameter returns true if the agent is connected to Amazon ECS. Registered instances with an agent that may be unhealthy or stopped return false. Only instances connected to an agent can accept placement requests.
    */
  var agentConnected: js.UndefOr[Boolean] = js.undefined
  /**
    * The status of the most recent agent update. If an update has never been requested, this value is NULL.
    */
  var agentUpdateStatus: js.UndefOr[AgentUpdateStatus] = js.undefined
  /**
    * The resources attached to a container instance, such as elastic network interfaces.
    */
  var attachments: js.UndefOr[Attachments] = js.undefined
  /**
    * The attributes set for the container instance, either by the Amazon ECS container agent at instance registration or manually with the PutAttributes operation.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the container instance. The ARN contains the arn:aws:ecs namespace, followed by the Region of the container instance, the AWS account ID of the container instance owner, the container-instance namespace, and then the container instance ID. For example, arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID.
    */
  var containerInstanceArn: js.UndefOr[String] = js.undefined
  /**
    * The EC2 instance ID of the container instance.
    */
  var ec2InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The number of tasks on the container instance that are in the PENDING status.
    */
  var pendingTasksCount: js.UndefOr[Integer] = js.undefined
  /**
    * The Unix timestamp for when the container instance was registered.
    */
  var registeredAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * For CPU and memory resource types, this parameter describes the amount of each resource that was available on the container instance when the container agent registered it with Amazon ECS. This value represents the total amount of CPU and memory that can be allocated on this container instance to tasks. For port resource types, this parameter describes the ports that were reserved by the Amazon ECS container agent when it registered the container instance with Amazon ECS.
    */
  var registeredResources: js.UndefOr[Resources] = js.undefined
  /**
    * For CPU and memory resource types, this parameter describes the remaining CPU and memory that has not already been allocated to tasks and is therefore available for new tasks. For port resource types, this parameter describes the ports that were reserved by the Amazon ECS container agent (at instance registration time) and any task containers that have reserved port mappings on the host (with the host or bridge network mode). Any port that is not specified here is available for new tasks.
    */
  var remainingResources: js.UndefOr[Resources] = js.undefined
  /**
    * The number of tasks on the container instance that are in the RUNNING status.
    */
  var runningTasksCount: js.UndefOr[Integer] = js.undefined
  /**
    * The status of the container instance. The valid values are REGISTERING, REGISTRATION_FAILED, ACTIVE, INACTIVE, DEREGISTERING, or DRAINING. If your account has opted in to the awsvpcTrunking account setting, then any newly registered container instance will transition to a REGISTERING status while the trunk elastic network interface is provisioned for the instance. If the registration fails, the instance will transition to a REGISTRATION_FAILED status. You can describe the container instance and see the reason for failure in the statusReason parameter. Once the container instance is terminated, the instance transitions to a DEREGISTERING status while the trunk elastic network interface is deprovisioned. The instance then transitions to an INACTIVE status. The ACTIVE status indicates that the container instance can accept tasks. The DRAINING indicates that new tasks are not placed on the container instance and any service tasks running on the container instance are removed if possible. For more information, see Container Instance Draining in the Amazon Elastic Container Service Developer Guide.
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The reason that the container instance reached its current status.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  /**
    * The metadata that you apply to the container instance to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
  /**
    * The version counter for the container instance. Every time a container instance experiences a change that triggers a CloudWatch event, the version counter is incremented. If you are replicating your Amazon ECS container instance state with CloudWatch Events, you can compare the version of a container instance reported by the Amazon ECS APIs with the version reported in CloudWatch Events for the container instance (inside the detail object) to verify that the version in your event stream is current.
    */
  var version: js.UndefOr[Long] = js.undefined
  /**
    * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
    */
  var versionInfo: js.UndefOr[VersionInfo] = js.undefined
}

object ContainerInstance {
  @scala.inline
  def apply(
    agentConnected: js.UndefOr[Boolean] = js.undefined,
    agentUpdateStatus: AgentUpdateStatus = null,
    attachments: Attachments = null,
    attributes: Attributes = null,
    containerInstanceArn: String = null,
    ec2InstanceId: String = null,
    pendingTasksCount: js.UndefOr[Integer] = js.undefined,
    registeredAt: Timestamp = null,
    registeredResources: Resources = null,
    remainingResources: Resources = null,
    runningTasksCount: js.UndefOr[Integer] = js.undefined,
    status: String = null,
    statusReason: String = null,
    tags: Tags = null,
    version: js.UndefOr[Long] = js.undefined,
    versionInfo: VersionInfo = null
  ): ContainerInstance = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(agentConnected)) __obj.updateDynamic("agentConnected")(agentConnected)
    if (agentUpdateStatus != null) __obj.updateDynamic("agentUpdateStatus")(agentUpdateStatus.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (containerInstanceArn != null) __obj.updateDynamic("containerInstanceArn")(containerInstanceArn)
    if (ec2InstanceId != null) __obj.updateDynamic("ec2InstanceId")(ec2InstanceId)
    if (!js.isUndefined(pendingTasksCount)) __obj.updateDynamic("pendingTasksCount")(pendingTasksCount)
    if (registeredAt != null) __obj.updateDynamic("registeredAt")(registeredAt)
    if (registeredResources != null) __obj.updateDynamic("registeredResources")(registeredResources)
    if (remainingResources != null) __obj.updateDynamic("remainingResources")(remainingResources)
    if (!js.isUndefined(runningTasksCount)) __obj.updateDynamic("runningTasksCount")(runningTasksCount)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    if (versionInfo != null) __obj.updateDynamic("versionInfo")(versionInfo)
    __obj.asInstanceOf[ContainerInstance]
  }
}

