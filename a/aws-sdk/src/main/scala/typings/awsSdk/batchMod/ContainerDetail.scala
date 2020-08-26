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
  def apply(): ContainerDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerDetail]
  }
  @scala.inline
  implicit class ContainerDetailOps[Self <: ContainerDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommandVarargs(value: String*): Self = this.set("command", js.Array(value :_*))
    @scala.inline
    def setCommand(value: StringList): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    @scala.inline
    def setContainerInstanceArn(value: String): Self = this.set("containerInstanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerInstanceArn: Self = this.set("containerInstanceArn", js.undefined)
    @scala.inline
    def setEnvironmentVarargs(value: KeyValuePair*): Self = this.set("environment", js.Array(value :_*))
    @scala.inline
    def setEnvironment(value: EnvironmentVariables): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setExitCode(value: Integer): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setJobRoleArn(value: String): Self = this.set("jobRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobRoleArn: Self = this.set("jobRoleArn", js.undefined)
    @scala.inline
    def setLinuxParameters(value: LinuxParameters): Self = this.set("linuxParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinuxParameters: Self = this.set("linuxParameters", js.undefined)
    @scala.inline
    def setLogStreamName(value: String): Self = this.set("logStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogStreamName: Self = this.set("logStreamName", js.undefined)
    @scala.inline
    def setMemory(value: Integer): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    @scala.inline
    def setMountPointsVarargs(value: MountPoint*): Self = this.set("mountPoints", js.Array(value :_*))
    @scala.inline
    def setMountPoints(value: MountPoints): Self = this.set("mountPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountPoints: Self = this.set("mountPoints", js.undefined)
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = this.set("networkInterfaces", js.Array(value :_*))
    @scala.inline
    def setNetworkInterfaces(value: NetworkInterfaceList): Self = this.set("networkInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("networkInterfaces", js.undefined)
    @scala.inline
    def setPrivileged(value: Boolean): Self = this.set("privileged", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivileged: Self = this.set("privileged", js.undefined)
    @scala.inline
    def setReadonlyRootFilesystem(value: Boolean): Self = this.set("readonlyRootFilesystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonlyRootFilesystem: Self = this.set("readonlyRootFilesystem", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setResourceRequirementsVarargs(value: ResourceRequirement*): Self = this.set("resourceRequirements", js.Array(value :_*))
    @scala.inline
    def setResourceRequirements(value: ResourceRequirements): Self = this.set("resourceRequirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceRequirements: Self = this.set("resourceRequirements", js.undefined)
    @scala.inline
    def setTaskArn(value: String): Self = this.set("taskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskArn: Self = this.set("taskArn", js.undefined)
    @scala.inline
    def setUlimitsVarargs(value: Ulimit*): Self = this.set("ulimits", js.Array(value :_*))
    @scala.inline
    def setUlimits(value: Ulimits): Self = this.set("ulimits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUlimits: Self = this.set("ulimits", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setVcpus(value: Integer): Self = this.set("vcpus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVcpus: Self = this.set("vcpus", js.undefined)
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = this.set("volumes", js.Array(value :_*))
    @scala.inline
    def setVolumes(value: Volumes): Self = this.set("volumes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumes: Self = this.set("volumes", js.undefined)
  }
  
}

