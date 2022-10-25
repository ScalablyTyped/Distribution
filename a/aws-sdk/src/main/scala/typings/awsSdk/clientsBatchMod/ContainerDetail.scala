package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerDetail extends StObject {
  
  /**
    * The command that's passed to the container.
    */
  var command: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the container instance that the container is running on.
    */
  var containerInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The environment variables to pass to a container.  Environment variables cannot start with "AWS_BATCH". This naming convention is reserved for variables that Batch sets. 
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the execution role that Batch can assume. For more information, see Batch execution IAM role in the Batch User Guide.
    */
  var executionRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The exit code to return upon completion.
    */
  var exitCode: js.UndefOr[Integer] = js.undefined
  
  /**
    * The platform configuration for jobs that are running on Fargate resources. Jobs that are running on EC2 resources must not specify this parameter.
    */
  var fargatePlatformConfiguration: js.UndefOr[FargatePlatformConfiguration] = js.undefined
  
  /**
    * The image used to start the container.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * The instance type of the underlying host infrastructure of a multi-node parallel job.  This parameter isn't applicable to jobs that are running on Fargate resources. 
    */
  var instanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that's associated with the job when run.
    */
  var jobRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Linux-specific modifications that are applied to the container, such as details for device mappings.
    */
  var linuxParameters: js.UndefOr[LinuxParameters] = js.undefined
  
  /**
    * The log configuration specification for the container. This parameter maps to LogConfig in the Create a container section of the Docker Remote API and the --log-driver option to docker run. By default, containers use the same logging driver that the Docker daemon uses. However, the container might use a different logging driver than the Docker daemon by specifying a log driver with this parameter in the container definition. To use a different logging driver for a container, the log system must be configured properly on the container instance. Or, alternatively, it must be configured on a different log server for remote logging options. For more information on the options for different supported log drivers, see Configure logging drivers in the Docker documentation.  Batch currently supports a subset of the logging drivers available to the Docker daemon (shown in the LogConfiguration data type). Additional log drivers might be available in future releases of the Amazon ECS container agent.  This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log in to your container instance and run the following command: sudo docker version | grep "Server API version"   The Amazon ECS container agent running on a container instance must register the logging drivers available on that instance with the ECS_AVAILABLE_LOGGING_DRIVERS environment variable before containers placed on that instance can use these log configuration options. For more information, see Amazon ECS container agent configuration in the Amazon Elastic Container Service Developer Guide. 
    */
  var logConfiguration: js.UndefOr[LogConfiguration] = js.undefined
  
  /**
    * The name of the Amazon CloudWatch Logs log stream that's associated with the container. The log group for Batch jobs is /aws/batch/job. Each container attempt receives a log stream name when they reach the RUNNING status.
    */
  var logStreamName: js.UndefOr[String] = js.undefined
  
  /**
    * For jobs running on EC2 resources that didn't specify memory requirements using resourceRequirements, the number of MiB of memory reserved for the job. For other jobs, including all run on Fargate resources, see resourceRequirements.
    */
  var memory: js.UndefOr[Integer] = js.undefined
  
  /**
    * The mount points for data volumes in your container.
    */
  var mountPoints: js.UndefOr[MountPoints] = js.undefined
  
  /**
    * The network configuration for jobs that are running on Fargate resources. Jobs that are running on EC2 resources must not specify this parameter.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  
  /**
    * The network interfaces that are associated with the job.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined
  
  /**
    * When this parameter is true, the container is given elevated permissions on the host container instance (similar to the root user). The default value is false.  This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't be provided, or specified as false. 
    */
  var privileged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When this parameter is true, the container is given read-only access to its root file system. This parameter maps to ReadonlyRootfs in the Create a container section of the Docker Remote API and the --read-only option to  docker run .
    */
  var readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A short (255 max characters) human-readable string to provide additional details for a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The type and amount of resources to assign to a container. The supported resources include GPU, MEMORY, and VCPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.undefined
  
  /**
    * The secrets to pass to the container. For more information, see Specifying sensitive data in the Batch User Guide.
    */
  var secrets: js.UndefOr[SecretList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon ECS task that's associated with the container job. Each container attempt receives a task ARN when they reach the STARTING status.
    */
  var taskArn: js.UndefOr[String] = js.undefined
  
  /**
    * A list of ulimit values to set in the container. This parameter maps to Ulimits in the Create a container section of the Docker Remote API and the --ulimit option to docker run.  This parameter isn't applicable to jobs that are running on Fargate resources. 
    */
  var ulimits: js.UndefOr[Ulimits] = js.undefined
  
  /**
    * The user name to use inside the container. This parameter maps to User in the Create a container section of the Docker Remote API and the --user option to docker run.
    */
  var user: js.UndefOr[String] = js.undefined
  
  /**
    * The number of vCPUs reserved for the container. For jobs that run on EC2 resources, you can specify the vCPU requirement for the job using resourceRequirements, but you can't specify the vCPU requirements in both the vcpus and resourceRequirements object. This parameter maps to CpuShares in the Create a container section of the Docker Remote API and the --cpu-shares option to docker run. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU. This is required but can be specified in several places. It must be specified for each node at least once.  This parameter isn't applicable to jobs that run on Fargate resources. For jobs that run on Fargate resources, you must specify the vCPU requirement for the job using resourceRequirements. 
    */
  var vcpus: js.UndefOr[Integer] = js.undefined
  
  /**
    * A list of volumes that are associated with the job.
    */
  var volumes: js.UndefOr[Volumes] = js.undefined
}
object ContainerDetail {
  
  inline def apply(): ContainerDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerDetail]
  }
  
  extension [Self <: ContainerDetail](x: Self) {
    
    inline def setCommand(value: StringList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value*))
    
    inline def setContainerInstanceArn(value: String): Self = StObject.set(x, "containerInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setContainerInstanceArnUndefined: Self = StObject.set(x, "containerInstanceArn", js.undefined)
    
    inline def setEnvironment(value: EnvironmentVariables): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setEnvironmentVarargs(value: KeyValuePair*): Self = StObject.set(x, "environment", js.Array(value*))
    
    inline def setExecutionRoleArn(value: String): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "executionRoleArn", js.undefined)
    
    inline def setExitCode(value: Integer): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    inline def setFargatePlatformConfiguration(value: FargatePlatformConfiguration): Self = StObject.set(x, "fargatePlatformConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFargatePlatformConfigurationUndefined: Self = StObject.set(x, "fargatePlatformConfiguration", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setJobRoleArn(value: String): Self = StObject.set(x, "jobRoleArn", value.asInstanceOf[js.Any])
    
    inline def setJobRoleArnUndefined: Self = StObject.set(x, "jobRoleArn", js.undefined)
    
    inline def setLinuxParameters(value: LinuxParameters): Self = StObject.set(x, "linuxParameters", value.asInstanceOf[js.Any])
    
    inline def setLinuxParametersUndefined: Self = StObject.set(x, "linuxParameters", js.undefined)
    
    inline def setLogConfiguration(value: LogConfiguration): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
    
    inline def setLogStreamName(value: String): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNameUndefined: Self = StObject.set(x, "logStreamName", js.undefined)
    
    inline def setMemory(value: Integer): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setMountPoints(value: MountPoints): Self = StObject.set(x, "mountPoints", value.asInstanceOf[js.Any])
    
    inline def setMountPointsUndefined: Self = StObject.set(x, "mountPoints", js.undefined)
    
    inline def setMountPointsVarargs(value: MountPoint*): Self = StObject.set(x, "mountPoints", js.Array(value*))
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    inline def setNetworkInterfaces(value: NetworkInterfaceList): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value*))
    
    inline def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedUndefined: Self = StObject.set(x, "privileged", js.undefined)
    
    inline def setReadonlyRootFilesystem(value: Boolean): Self = StObject.set(x, "readonlyRootFilesystem", value.asInstanceOf[js.Any])
    
    inline def setReadonlyRootFilesystemUndefined: Self = StObject.set(x, "readonlyRootFilesystem", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setResourceRequirements(value: ResourceRequirements): Self = StObject.set(x, "resourceRequirements", value.asInstanceOf[js.Any])
    
    inline def setResourceRequirementsUndefined: Self = StObject.set(x, "resourceRequirements", js.undefined)
    
    inline def setResourceRequirementsVarargs(value: ResourceRequirement*): Self = StObject.set(x, "resourceRequirements", js.Array(value*))
    
    inline def setSecrets(value: SecretList): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    inline def setSecretsVarargs(value: Secret*): Self = StObject.set(x, "secrets", js.Array(value*))
    
    inline def setTaskArn(value: String): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
    
    inline def setUlimits(value: Ulimits): Self = StObject.set(x, "ulimits", value.asInstanceOf[js.Any])
    
    inline def setUlimitsUndefined: Self = StObject.set(x, "ulimits", js.undefined)
    
    inline def setUlimitsVarargs(value: Ulimit*): Self = StObject.set(x, "ulimits", js.Array(value*))
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setVcpus(value: Integer): Self = StObject.set(x, "vcpus", value.asInstanceOf[js.Any])
    
    inline def setVcpusUndefined: Self = StObject.set(x, "vcpus", js.undefined)
    
    inline def setVolumes(value: Volumes): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
