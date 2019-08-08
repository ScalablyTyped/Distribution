package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerDetail extends js.Object {
  /**
    * The command that is passed to the container. 
    */
  var command: js.UndefOr[StringList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the container instance on which the container is running.
    */
  var containerInstanceArn: js.UndefOr[String] = js.undefined
  /**
    * The environment variables to pass to a container.  Environment variables must not start with AWS_BATCH; this naming convention is reserved for variables that are set by the AWS Batch service. 
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.undefined
  /**
    * The exit code to return upon completion.
    */
  var exitCode: js.UndefOr[Integer] = js.undefined
  /**
    * The image used to start the container.
    */
  var image: js.UndefOr[String] = js.undefined
  /**
    * The instance type of the underlying host infrastructure of a multi-node parallel job.
    */
  var instanceType: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) associated with the job upon execution. 
    */
  var jobRoleArn: js.UndefOr[String] = js.undefined
  /**
    * Linux-specific modifications that are applied to the container, such as details for device mappings.
    */
  var linuxParameters: js.UndefOr[LinuxParameters] = js.undefined
  /**
    * The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs is /aws/batch/job. Each container attempt receives a log stream name when they reach the RUNNING status.
    */
  var logStreamName: js.UndefOr[String] = js.undefined
  /**
    * The number of MiB of memory reserved for the job.
    */
  var memory: js.UndefOr[Integer] = js.undefined
  /**
    * The mount points for data volumes in your container.
    */
  var mountPoints: js.UndefOr[MountPoints] = js.undefined
  /**
    * The network interfaces associated with the job.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined
  /**
    * When this parameter is true, the container is given elevated privileges on the host container instance (similar to the root user).
    */
  var privileged: js.UndefOr[Boolean] = js.undefined
  /**
    * When this parameter is true, the container is given read-only access to its root file system.
    */
  var readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined
  /**
    * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.undefined
  /**
    * The type and amount of a resource to assign to a container. Currently, the only supported resource is GPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the container job. Each container attempt receives a task ARN when they reach the STARTING status.
    */
  var taskArn: js.UndefOr[String] = js.undefined
  /**
    * A list of ulimit values to set in the container.
    */
  var ulimits: js.UndefOr[Ulimits] = js.undefined
  /**
    * The user name to use inside the container.
    */
  var user: js.UndefOr[String] = js.undefined
  /**
    * The number of VCPUs allocated for the job. 
    */
  var vcpus: js.UndefOr[Integer] = js.undefined
  /**
    * A list of volumes associated with the job.
    */
  var volumes: js.UndefOr[Volumes] = js.undefined
}

object ContainerDetail {
  @scala.inline
  def apply(
    command: StringList = null,
    containerInstanceArn: String = null,
    environment: EnvironmentVariables = null,
    exitCode: js.UndefOr[Integer] = js.undefined,
    image: String = null,
    instanceType: String = null,
    jobRoleArn: String = null,
    linuxParameters: LinuxParameters = null,
    logStreamName: String = null,
    memory: js.UndefOr[Integer] = js.undefined,
    mountPoints: MountPoints = null,
    networkInterfaces: NetworkInterfaceList = null,
    privileged: js.UndefOr[Boolean] = js.undefined,
    readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
    reason: String = null,
    resourceRequirements: ResourceRequirements = null,
    taskArn: String = null,
    ulimits: Ulimits = null,
    user: String = null,
    vcpus: js.UndefOr[Integer] = js.undefined,
    volumes: Volumes = null
  ): ContainerDetail = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command)
    if (containerInstanceArn != null) __obj.updateDynamic("containerInstanceArn")(containerInstanceArn)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (!js.isUndefined(exitCode)) __obj.updateDynamic("exitCode")(exitCode)
    if (image != null) __obj.updateDynamic("image")(image)
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType)
    if (jobRoleArn != null) __obj.updateDynamic("jobRoleArn")(jobRoleArn)
    if (linuxParameters != null) __obj.updateDynamic("linuxParameters")(linuxParameters)
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName)
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory)
    if (mountPoints != null) __obj.updateDynamic("mountPoints")(mountPoints)
    if (networkInterfaces != null) __obj.updateDynamic("networkInterfaces")(networkInterfaces)
    if (!js.isUndefined(privileged)) __obj.updateDynamic("privileged")(privileged)
    if (!js.isUndefined(readonlyRootFilesystem)) __obj.updateDynamic("readonlyRootFilesystem")(readonlyRootFilesystem)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (resourceRequirements != null) __obj.updateDynamic("resourceRequirements")(resourceRequirements)
    if (taskArn != null) __obj.updateDynamic("taskArn")(taskArn)
    if (ulimits != null) __obj.updateDynamic("ulimits")(ulimits)
    if (user != null) __obj.updateDynamic("user")(user)
    if (!js.isUndefined(vcpus)) __obj.updateDynamic("vcpus")(vcpus)
    if (volumes != null) __obj.updateDynamic("volumes")(volumes)
    __obj.asInstanceOf[ContainerDetail]
  }
}

