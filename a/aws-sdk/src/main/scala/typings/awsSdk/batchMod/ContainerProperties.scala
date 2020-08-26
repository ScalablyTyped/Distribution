package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerProperties extends js.Object {
  /**
    * The command that is passed to the container. This parameter maps to Cmd in the Create a container section of the Docker Remote API and the COMMAND parameter to docker run. For more information, see https://docs.docker.com/engine/reference/builder/#cmd.
    */
  var command: js.UndefOr[StringList] = js.native
  /**
    * The environment variables to pass to a container. This parameter maps to Env in the Create a container section of the Docker Remote API and the --env option to docker run.  We do not recommend using plaintext environment variables for sensitive information, such as credential data.   Environment variables must not start with AWS_BATCH; this naming convention is reserved for variables that are set by the AWS Batch service. 
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.native
  /**
    * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker Hub registry are available by default. Other repositories are specified with  repository-url/image:tag . Up to 255 letters (uppercase and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter maps to Image in the Create a container section of the Docker Remote API and the IMAGE parameter of docker run.   Images in Amazon ECR repositories use the full registry and repository URI (for example, 012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;).   Images in official repositories on Docker Hub use a single name (for example, ubuntu or mongo).   Images in other repositories on Docker Hub are qualified with an organization name (for example, amazon/amazon-ecs-agent).   Images in other online repositories are qualified further by a domain name (for example, quay.io/assemblyline/ubuntu).  
    */
  var image: js.UndefOr[String] = js.native
  /**
    * The instance type to use for a multi-node parallel job. Currently all node groups in a multi-node parallel job must use the same instance type. This parameter is not valid for single-node container jobs.
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS permissions.
    */
  var jobRoleArn: js.UndefOr[String] = js.native
  /**
    * Linux-specific modifications that are applied to the container, such as details for device mappings.
    */
  var linuxParameters: js.UndefOr[LinuxParameters] = js.native
  /**
    * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory specified here, the container is killed. This parameter maps to Memory in the Create a container section of the Docker Remote API and the --memory option to docker run. You must specify at least 4 MiB of memory for a job.  If you are trying to maximize your resource utilization by providing your jobs as much memory as possible for a particular instance type, see Memory Management in the AWS Batch User Guide. 
    */
  var memory: js.UndefOr[Integer] = js.native
  /**
    * The mount points for data volumes in your container. This parameter maps to Volumes in the Create a container section of the Docker Remote API and the --volume option to docker run.
    */
  var mountPoints: js.UndefOr[MountPoints] = js.native
  /**
    * When this parameter is true, the container is given elevated privileges on the host container instance (similar to the root user). This parameter maps to Privileged in the Create a container section of the Docker Remote API and the --privileged option to docker run.
    */
  var privileged: js.UndefOr[Boolean] = js.native
  /**
    * When this parameter is true, the container is given read-only access to its root file system. This parameter maps to ReadonlyRootfs in the Create a container section of the Docker Remote API and the --read-only option to docker run.
    */
  var readonlyRootFilesystem: js.UndefOr[Boolean] = js.native
  /**
    * The type and amount of a resource to assign to a container. Currently, the only supported resource is GPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.native
  /**
    * A list of ulimits to set in the container. This parameter maps to Ulimits in the Create a container section of the Docker Remote API and the --ulimit option to docker run.
    */
  var ulimits: js.UndefOr[Ulimits] = js.native
  /**
    * The user name to use inside the container. This parameter maps to User in the Create a container section of the Docker Remote API and the --user option to docker run.
    */
  var user: js.UndefOr[String] = js.native
  /**
    * The number of vCPUs reserved for the container. This parameter maps to CpuShares in the Create a container section of the Docker Remote API and the --cpu-shares option to docker run. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU.
    */
  var vcpus: js.UndefOr[Integer] = js.native
  /**
    * A list of data volumes used in a job.
    */
  var volumes: js.UndefOr[Volumes] = js.native
}

object ContainerProperties {
  @scala.inline
  def apply(): ContainerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProperties]
  }
  @scala.inline
  implicit class ContainerPropertiesOps[Self <: ContainerProperties] (val x: Self) extends AnyVal {
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
    def setEnvironmentVarargs(value: KeyValuePair*): Self = this.set("environment", js.Array(value :_*))
    @scala.inline
    def setEnvironment(value: EnvironmentVariables): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
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
    def setPrivileged(value: Boolean): Self = this.set("privileged", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivileged: Self = this.set("privileged", js.undefined)
    @scala.inline
    def setReadonlyRootFilesystem(value: Boolean): Self = this.set("readonlyRootFilesystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonlyRootFilesystem: Self = this.set("readonlyRootFilesystem", js.undefined)
    @scala.inline
    def setResourceRequirementsVarargs(value: ResourceRequirement*): Self = this.set("resourceRequirements", js.Array(value :_*))
    @scala.inline
    def setResourceRequirements(value: ResourceRequirements): Self = this.set("resourceRequirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceRequirements: Self = this.set("resourceRequirements", js.undefined)
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

