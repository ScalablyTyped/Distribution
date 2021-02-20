package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerDetail extends StObject {
  
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
    * The Amazon Resource Name (ARN) of the execution role that AWS Batch can assume. For more information, see AWS Batch execution IAM role.
    */
  var executionRoleArn: js.UndefOr[String] = js.native
  
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
    * The log configuration specification for the container. This parameter maps to LogConfig in the Create a container section of the Docker Remote API and the --log-driver option to docker run. By default, containers use the same logging driver that the Docker daemon uses. However the container may use a different logging driver than the Docker daemon by specifying a log driver with this parameter in the container definition. To use a different logging driver for a container, the log system must be configured properly on the container instance (or on a different log server for remote logging options). For more information on the options for different supported log drivers, see Configure logging drivers in the Docker documentation.  AWS Batch currently supports a subset of the logging drivers available to the Docker daemon (shown in the LogConfiguration data type). Additional log drivers may be available in future releases of the Amazon ECS container agent.  This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log into your container instance and run the following command: sudo docker version | grep "Server API version"   The Amazon ECS container agent running on a container instance must register the logging drivers available on that instance with the ECS_AVAILABLE_LOGGING_DRIVERS environment variable before containers placed on that instance can use these log configuration options. For more information, see Amazon ECS Container Agent Configuration in the Amazon Elastic Container Service Developer Guide. 
    */
  var logConfiguration: js.UndefOr[LogConfiguration] = js.native
  
  /**
    * The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs is /aws/batch/job. Each container attempt receives a log stream name when they reach the RUNNING status.
    */
  var logStreamName: js.UndefOr[String] = js.native
  
  /**
    * The number of MiB of memory reserved for the job. This is a required parameter.
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
    * The secrets to pass to the container. For more information, see Specifying Sensitive Data in the Amazon Elastic Container Service Developer Guide.
    */
  var secrets: js.UndefOr[SecretList] = js.native
  
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
    * The number of VCPUs allocated for the job. This is a required parameter.
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
  implicit class ContainerDetailMutableBuilder[Self <: ContainerDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: StringList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setContainerInstanceArn(value: String): Self = StObject.set(x, "containerInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerInstanceArnUndefined: Self = StObject.set(x, "containerInstanceArn", js.undefined)
    
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
    def setExitCode(value: Integer): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
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
    def setLogStreamName(value: String): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamNameUndefined: Self = StObject.set(x, "logStreamName", js.undefined)
    
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
    def setNetworkInterfaces(value: NetworkInterfaceList): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegedUndefined: Self = StObject.set(x, "privileged", js.undefined)
    
    @scala.inline
    def setReadonlyRootFilesystem(value: Boolean): Self = StObject.set(x, "readonlyRootFilesystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyRootFilesystemUndefined: Self = StObject.set(x, "readonlyRootFilesystem", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
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
    def setTaskArn(value: String): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
    
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
