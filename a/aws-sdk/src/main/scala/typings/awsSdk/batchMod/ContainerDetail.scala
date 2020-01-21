package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerDetail extends js.Object {
  /**
    * The command that is passed to the container.
    */
  var command: js.UndefOr[StringList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the container instance on which the container is running.
    */
  var containerInstanceArn: js.UndefOr[String] = js.native
  /**
    * The environment variables to pass to a container.  Environment variables must not start with AWS_BATCH; this naming convention is reserved for variables that are set by the AWS Batch service. 
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.native
  /**
    * The exit code to return upon completion.
    */
  var exitCode: js.UndefOr[Integer] = js.native
  /**
    * The image used to start the container.
    */
  var image: js.UndefOr[String] = js.native
  /**
    * The instance type of the underlying host infrastructure of a multi-node parallel job.
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) associated with the job upon execution.
    */
  var jobRoleArn: js.UndefOr[String] = js.native
  /**
    * Linux-specific modifications that are applied to the container, such as details for device mappings.
    */
  var linuxParameters: js.UndefOr[LinuxParameters] = js.native
  /**
    * The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs is /aws/batch/job. Each container attempt receives a log stream name when they reach the RUNNING status.
    */
  var logStreamName: js.UndefOr[String] = js.native
  /**
    * The number of MiB of memory reserved for the job.
    */
  var memory: js.UndefOr[Integer] = js.native
  /**
    * The mount points for data volumes in your container.
    */
  var mountPoints: js.UndefOr[MountPoints] = js.native
  /**
    * The network interfaces associated with the job.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.native
  /**
    * When this parameter is true, the container is given elevated privileges on the host container instance (similar to the root user).
    */
  var privileged: js.UndefOr[Boolean] = js.native
  /**
    * When this parameter is true, the container is given read-only access to its root file system.
    */
  var readonlyRootFilesystem: js.UndefOr[Boolean] = js.native
  /**
    * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The type and amount of a resource to assign to a container. Currently, the only supported resource is GPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the container job. Each container attempt receives a task ARN when they reach the STARTING status.
    */
  var taskArn: js.UndefOr[String] = js.native
  /**
    * A list of ulimit values to set in the container.
    */
  var ulimits: js.UndefOr[Ulimits] = js.native
  /**
    * The user name to use inside the container.
    */
  var user: js.UndefOr[String] = js.native
  /**
    * The number of VCPUs allocated for the job.
    */
  var vcpus: js.UndefOr[Integer] = js.native
  /**
    * A list of volumes associated with the job.
    */
  var volumes: js.UndefOr[Volumes] = js.native
}

object ContainerDetail {
  @scala.inline
  def apply(
    command: StringList = null,
    containerInstanceArn: String = null,
    environment: EnvironmentVariables = null,
    exitCode: Int | Double = null,
    image: String = null,
    instanceType: String = null,
    jobRoleArn: String = null,
    linuxParameters: LinuxParameters = null,
    logStreamName: String = null,
    memory: Int | Double = null,
    mountPoints: MountPoints = null,
    networkInterfaces: NetworkInterfaceList = null,
    privileged: js.UndefOr[scala.Boolean] = js.undefined,
    readonlyRootFilesystem: js.UndefOr[scala.Boolean] = js.undefined,
    reason: String = null,
    resourceRequirements: ResourceRequirements = null,
    taskArn: String = null,
    ulimits: Ulimits = null,
    user: String = null,
    vcpus: Int | Double = null,
    volumes: Volumes = null
  ): ContainerDetail = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (containerInstanceArn != null) __obj.updateDynamic("containerInstanceArn")(containerInstanceArn.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (jobRoleArn != null) __obj.updateDynamic("jobRoleArn")(jobRoleArn.asInstanceOf[js.Any])
    if (linuxParameters != null) __obj.updateDynamic("linuxParameters")(linuxParameters.asInstanceOf[js.Any])
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (mountPoints != null) __obj.updateDynamic("mountPoints")(mountPoints.asInstanceOf[js.Any])
    if (networkInterfaces != null) __obj.updateDynamic("networkInterfaces")(networkInterfaces.asInstanceOf[js.Any])
    if (!js.isUndefined(privileged)) __obj.updateDynamic("privileged")(privileged.asInstanceOf[js.Any])
    if (!js.isUndefined(readonlyRootFilesystem)) __obj.updateDynamic("readonlyRootFilesystem")(readonlyRootFilesystem.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (resourceRequirements != null) __obj.updateDynamic("resourceRequirements")(resourceRequirements.asInstanceOf[js.Any])
    if (taskArn != null) __obj.updateDynamic("taskArn")(taskArn.asInstanceOf[js.Any])
    if (ulimits != null) __obj.updateDynamic("ulimits")(ulimits.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (vcpus != null) __obj.updateDynamic("vcpus")(vcpus.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDetail]
  }
}

