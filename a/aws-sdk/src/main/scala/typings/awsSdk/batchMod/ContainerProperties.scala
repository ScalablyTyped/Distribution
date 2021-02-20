package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerProperties extends StObject {
  
  /**
    * The command that is passed to the container. This parameter maps to Cmd in the Create a container section of the Docker Remote API and the COMMAND parameter to docker run. For more information, see https://docs.docker.com/engine/reference/builder/#cmd.
    */
  var command: js.UndefOr[StringList] = js.native
  
  /**
    * The environment variables to pass to a container. This parameter maps to Env in the Create a container section of the Docker Remote API and the --env option to docker run.  We do not recommend using plaintext environment variables for sensitive information, such as credential data.   Environment variables must not start with AWS_BATCH; this naming convention is reserved for variables that are set by the AWS Batch service. 
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the execution role that AWS Batch can assume. For more information, see AWS Batch execution IAM role.
    */
  var executionRoleArn: js.UndefOr[String] = js.native
  
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
    * The log configuration specification for the container. This parameter maps to LogConfig in the Create a container section of the Docker Remote API and the --log-driver option to docker run. By default, containers use the same logging driver that the Docker daemon uses. However the container may use a different logging driver than the Docker daemon by specifying a log driver with this parameter in the container definition. To use a different logging driver for a container, the log system must be configured properly on the container instance (or on a different log server for remote logging options). For more information on the options for different supported log drivers, see Configure logging drivers in the Docker documentation.  AWS Batch currently supports a subset of the logging drivers available to the Docker daemon (shown in the LogConfiguration data type).  This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log into your container instance and run the following command: sudo docker version | grep "Server API version"   The Amazon ECS container agent running on a container instance must register the logging drivers available on that instance with the ECS_AVAILABLE_LOGGING_DRIVERS environment variable before containers placed on that instance can use these log configuration options. For more information, see Amazon ECS Container Agent Configuration in the Amazon Elastic Container Service Developer Guide. 
    */
  var logConfiguration: js.UndefOr[LogConfiguration] = js.native
  
  /**
    * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory specified here, the container is killed. This parameter maps to Memory in the Create a container section of the Docker Remote API and the --memory option to docker run. You must specify at least 4 MiB of memory for a job. This is required but can be specified in several places for multi-node parallel (MNP) jobs; it must be specified for each node at least once.  If you are trying to maximize your resource utilization by providing your jobs as much memory as possible for a particular instance type, see Memory Management in the AWS Batch User Guide. 
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
    * The secrets for the container. For more information, see Specifying Sensitive Data in the Amazon Elastic Container Service Developer Guide.
    */
  var secrets: js.UndefOr[SecretList] = js.native
  
  /**
    * A list of ulimits to set in the container. This parameter maps to Ulimits in the Create a container section of the Docker Remote API and the --ulimit option to docker run.
    */
  var ulimits: js.UndefOr[Ulimits] = js.native
  
  /**
    * The user name to use inside the container. This parameter maps to User in the Create a container section of the Docker Remote API and the --user option to docker run.
    */
  var user: js.UndefOr[String] = js.native
  
  /**
    * The number of vCPUs reserved for the container. This parameter maps to CpuShares in the Create a container section of the Docker Remote API and the --cpu-shares option to docker run. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU. This is required but can be specified in several places for multi-node parallel (MNP) jobs; it must be specified for each node at least once.
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
  implicit class ContainerPropertiesMutableBuilder[Self <: ContainerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: StringList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setEnvironment(value: EnvironmentVariables): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setEnvironmentVarargs(value: KeyValuePair*): Self = StObject.set(x, "environment", js.Array(value :_*))
    
    @scala.inline
    def setExecutionRoleArn(value: String): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleArnUndefined: Self = StObject.set(x, "executionRoleArn", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    @scala.inline
    def setJobRoleArn(value: String): Self = StObject.set(x, "jobRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobRoleArnUndefined: Self = StObject.set(x, "jobRoleArn", js.undefined)
    
    @scala.inline
    def setLinuxParameters(value: LinuxParameters): Self = StObject.set(x, "linuxParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinuxParametersUndefined: Self = StObject.set(x, "linuxParameters", js.undefined)
    
    @scala.inline
    def setLogConfiguration(value: LogConfiguration): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
    
    @scala.inline
    def setMemory(value: Integer): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    @scala.inline
    def setMountPoints(value: MountPoints): Self = StObject.set(x, "mountPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountPointsUndefined: Self = StObject.set(x, "mountPoints", js.undefined)
    
    @scala.inline
    def setMountPointsVarargs(value: MountPoint*): Self = StObject.set(x, "mountPoints", js.Array(value :_*))
    
    @scala.inline
    def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegedUndefined: Self = StObject.set(x, "privileged", js.undefined)
    
    @scala.inline
    def setReadonlyRootFilesystem(value: Boolean): Self = StObject.set(x, "readonlyRootFilesystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyRootFilesystemUndefined: Self = StObject.set(x, "readonlyRootFilesystem", js.undefined)
    
    @scala.inline
    def setResourceRequirements(value: ResourceRequirements): Self = StObject.set(x, "resourceRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRequirementsUndefined: Self = StObject.set(x, "resourceRequirements", js.undefined)
    
    @scala.inline
    def setResourceRequirementsVarargs(value: ResourceRequirement*): Self = StObject.set(x, "resourceRequirements", js.Array(value :_*))
    
    @scala.inline
    def setSecrets(value: SecretList): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    @scala.inline
    def setSecretsVarargs(value: Secret*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    
    @scala.inline
    def setUlimits(value: Ulimits): Self = StObject.set(x, "ulimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUlimitsUndefined: Self = StObject.set(x, "ulimits", js.undefined)
    
    @scala.inline
    def setUlimitsVarargs(value: Ulimit*): Self = StObject.set(x, "ulimits", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setVcpus(value: Integer): Self = StObject.set(x, "vcpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcpusUndefined: Self = StObject.set(x, "vcpus", js.undefined)
    
    @scala.inline
    def setVolumes(value: Volumes): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "volumes", js.Array(value :_*))
  }
}
