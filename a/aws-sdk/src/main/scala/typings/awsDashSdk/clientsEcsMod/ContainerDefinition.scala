package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerDefinition extends js.Object {
  /**
    * The command that is passed to the container. This parameter maps to Cmd in the Create a container section of the Docker Remote API and the COMMAND parameter to docker run. For more information, see https://docs.docker.com/engine/reference/builder/#cmd. If there are multiple arguments, each argument should be a separated string in the array.
    */
  var command: js.UndefOr[StringList] = js.undefined
  /**
    * The number of cpu units reserved for the container. This parameter maps to CpuShares in the Create a container section of the Docker Remote API and the --cpu-shares option to docker run. This field is optional for tasks using the Fargate launch type, and the only requirement is that the total amount of CPU reserved for all containers within a task be lower than the task-level cpu value.  You can determine the number of CPU units that are available per EC2 instance type by multiplying the vCPUs listed for that instance type on the Amazon EC2 Instances detail page by 1,024.  For example, if you run a single-container task on a single-core instance type with 512 CPU units specified for that container, and that is the only task running on the container instance, that container could use the full 1,024 CPU unit share at any given time. However, if you launched another copy of the same task on that container instance, each task would be guaranteed a minimum of 512 CPU units when needed, and each container could float to higher CPU usage if the other container was not using it, but if both tasks were 100% active all of the time, they would be limited to 512 CPU units. Linux containers share unallocated CPU units with other containers on the container instance with the same ratio as their allocated amount. For example, if you run a single-container task on a single-core instance type with 512 CPU units specified for that container, and that is the only task running on the container instance, that container could use the full 1,024 CPU unit share at any given time. However, if you launched another copy of the same task on that container instance, each task would be guaranteed a minimum of 512 CPU units when needed, and each container could float to higher CPU usage if the other container was not using it, but if both tasks were 100% active all of the time, they would be limited to 512 CPU units. On Linux container instances, the Docker daemon on the container instance uses the CPU value to calculate the relative CPU share ratios for running containers. For more information, see CPU share constraint in the Docker documentation. The minimum valid CPU share value that the Linux kernel allows is 2. However, the CPU parameter is not required, and you can use CPU values below 2 in your container definitions. For CPU values below 2 (including null), the behavior varies based on your Amazon ECS container agent version:    Agent versions less than or equal to 1.1.0: Null and zero CPU values are passed to Docker as 0, which Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the Linux kernel converts to two CPU shares.    Agent versions greater than or equal to 1.2.0: Null, zero, and CPU values of 1 are passed to Docker as 2.   On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota. Windows containers only have access to the specified amount of CPU that is described in the task definition.
    */
  var cpu: js.UndefOr[Integer] = js.undefined
  /**
    * The dependencies defined for container startup and shutdown. A container can contain multiple dependencies. When a dependency is defined for container startup, for container shutdown it is reversed. For tasks using the EC2 launch type, the container instances require at least version 1.26.0 of the container agent to enable container dependencies. However, we recommend using the latest container agent version. For information about checking your agent version and updating to the latest version, see Updating the Amazon ECS Container Agent in the Amazon Elastic Container Service Developer Guide. If you are using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the ecs-init package. If your container instances are launched from version 20190301 or later, then they contain the required versions of the container agent and ecs-init. For more information, see Amazon ECS-optimized Linux AMI in the Amazon Elastic Container Service Developer Guide. This parameter is available for tasks using the Fargate launch type in the Ohio (us-east-2) region only and the task or service requires platform version 1.3.0 or later.
    */
  var dependsOn: js.UndefOr[ContainerDependencies] = js.undefined
  /**
    * When this parameter is true, networking is disabled within the container. This parameter maps to NetworkDisabled in the Create a container section of the Docker Remote API.  This parameter is not supported for Windows containers. 
    */
  var disableNetworking: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * A list of DNS search domains that are presented to the container. This parameter maps to DnsSearch in the Create a container section of the Docker Remote API and the --dns-search option to docker run.  This parameter is not supported for Windows containers. 
    */
  var dnsSearchDomains: js.UndefOr[StringList] = js.undefined
  /**
    * A list of DNS servers that are presented to the container. This parameter maps to Dns in the Create a container section of the Docker Remote API and the --dns option to docker run.  This parameter is not supported for Windows containers. 
    */
  var dnsServers: js.UndefOr[StringList] = js.undefined
  /**
    * A key/value map of labels to add to the container. This parameter maps to Labels in the Create a container section of the Docker Remote API and the --label option to docker run. This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log in to your container instance and run the following command: sudo docker version --format '{{.Server.APIVersion}}' 
    */
  var dockerLabels: js.UndefOr[DockerLabelsMap] = js.undefined
  /**
    * A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems. This field is not valid for containers in tasks using the Fargate launch type. This parameter maps to SecurityOpt in the Create a container section of the Docker Remote API and the --security-opt option to docker run.  The Amazon ECS container agent running on a container instance must register with the ECS_SELINUX_CAPABLE=true or ECS_APPARMOR_CAPABLE=true environment variables before containers placed on that instance can use these security options. For more information, see Amazon ECS Container Agent Configuration in the Amazon Elastic Container Service Developer Guide.   This parameter is not supported for Windows containers. 
    */
  var dockerSecurityOptions: js.UndefOr[StringList] = js.undefined
  /**
    *  Early versions of the Amazon ECS container agent do not properly handle entryPoint parameters. If you have problems using entryPoint, update your container agent or enter your commands and arguments as command array items instead.  The entry point that is passed to the container. This parameter maps to Entrypoint in the Create a container section of the Docker Remote API and the --entrypoint option to docker run. For more information, see https://docs.docker.com/engine/reference/builder/#entrypoint.
    */
  var entryPoint: js.UndefOr[StringList] = js.undefined
  /**
    * The environment variables to pass to a container. This parameter maps to Env in the Create a container section of the Docker Remote API and the --env option to docker run.  We do not recommend using plaintext environment variables for sensitive information, such as credential data. 
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.undefined
  /**
    * If the essential parameter of a container is marked as true, and that container fails or stops for any reason, all other containers that are part of the task are stopped. If the essential parameter of a container is marked as false, then its failure does not affect the rest of the containers in a task. If this parameter is omitted, a container is assumed to be essential. All tasks must have at least one essential container. If you have an application that is composed of multiple containers, you should group containers that are used for a common purpose into components, and separate the different components into multiple task definitions. For more information, see Application Architecture in the Amazon Elastic Container Service Developer Guide.
    */
  var essential: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * A list of hostnames and IP address mappings to append to the /etc/hosts file on the container. This parameter maps to ExtraHosts in the Create a container section of the Docker Remote API and the --add-host option to docker run.  This parameter is not supported for Windows containers or tasks that use the awsvpc network mode. 
    */
  var extraHosts: js.UndefOr[HostEntryList] = js.undefined
  /**
    * The health check command and associated configuration parameters for the container. This parameter maps to HealthCheck in the Create a container section of the Docker Remote API and the HEALTHCHECK parameter of docker run.
    */
  var healthCheck: js.UndefOr[HealthCheck] = js.undefined
  /**
    * The hostname to use for your container. This parameter maps to Hostname in the Create a container section of the Docker Remote API and the --hostname option to docker run.  The hostname parameter is not supported if you are using the awsvpc network mode. 
    */
  var hostname: js.UndefOr[String] = js.undefined
  /**
    * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker Hub registry are available by default. Other repositories are specified with either  repository-url/image:tag  or  repository-url/image@digest . Up to 255 letters (uppercase and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter maps to Image in the Create a container section of the Docker Remote API and the IMAGE parameter of docker run.   When a new task starts, the Amazon ECS container agent pulls the latest version of the specified image and tag for the container to use. However, subsequent updates to a repository image are not propagated to already running tasks.   Images in Amazon ECR repositories can be specified by either using the full registry/repository:tag or registry/repository@digest. For example, 012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest or 012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;@sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE.    Images in official repositories on Docker Hub use a single name (for example, ubuntu or mongo).   Images in other repositories on Docker Hub are qualified with an organization name (for example, amazon/amazon-ecs-agent).   Images in other online repositories are qualified further by a domain name (for example, quay.io/assemblyline/ubuntu).  
    */
  var image: js.UndefOr[String] = js.undefined
  /**
    * When this parameter is true, this allows you to deploy containerized applications that require stdin or a tty to be allocated. This parameter maps to OpenStdin in the Create a container section of the Docker Remote API and the --interactive option to docker run.
    */
  var interactive: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * The links parameter allows containers to communicate with each other without the need for port mappings. This parameter is only supported if the network mode of a task definition is bridge. The name:internalName construct is analogous to name:alias in Docker links. Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed. For more information about linking Docker containers, go to Legacy container links in the Docker documentation. This parameter maps to Links in the Create a container section of the Docker Remote API and the --link option to docker run.  This parameter is not supported for Windows containers.   Containers that are collocated on a single container instance may be able to communicate with each other without requiring links or host port mappings. Network isolation is achieved on the container instance using security groups and VPC settings. 
    */
  var links: js.UndefOr[StringList] = js.undefined
  /**
    * Linux-specific modifications that are applied to the container, such as Linux kernel capabilities. For more information see KernelCapabilities.  This parameter is not supported for Windows containers. 
    */
  var linuxParameters: js.UndefOr[LinuxParameters] = js.undefined
  /**
    * The log configuration specification for the container. For tasks using the Fargate launch type, the supported log drivers are awslogs and splunk. For tasks using the EC2 launch type, the supported log drivers are awslogs, syslog, gelf, fluentd, splunk, journald, and json-file. This parameter maps to LogConfig in the Create a container section of the Docker Remote API and the --log-driver option to docker run. By default, containers use the same logging driver that the Docker daemon uses. However the container may use a different logging driver than the Docker daemon by specifying a log driver with this parameter in the container definition. To use a different logging driver for a container, the log system must be configured properly on the container instance (or on a different log server for remote logging options). For more information on the options for different supported log drivers, see Configure logging drivers in the Docker documentation.  Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the LogConfiguration data type). Additional log drivers may be available in future releases of the Amazon ECS container agent.  This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log in to your container instance and run the following command: sudo docker version --format '{{.Server.APIVersion}}'   The Amazon ECS container agent running on a container instance must register the logging drivers available on that instance with the ECS_AVAILABLE_LOGGING_DRIVERS environment variable before containers placed on that instance can use these log configuration options. For more information, see Amazon ECS Container Agent Configuration in the Amazon Elastic Container Service Developer Guide. 
    */
  var logConfiguration: js.UndefOr[LogConfiguration] = js.undefined
  /**
    * The amount (in MiB) of memory to present to the container. If your container attempts to exceed the memory specified here, the container is killed. The total amount of memory reserved for all containers within a task must be lower than the task memory value, if one is specified. This parameter maps to Memory in the Create a container section of the Docker Remote API and the --memory option to docker run. If your containers are part of a task using the Fargate launch type, this field is optional. For containers that are part of a task using the EC2 launch type, you must specify a non-zero integer for one or both of memory or memoryReservation in container definitions. If you specify both, memory must be greater than memoryReservation. If you specify memoryReservation, then that value is subtracted from the available memory resources for the container instance on which the container is placed. Otherwise, the value of memory is used. The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer than 4 MiB of memory for your containers.
    */
  var memory: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The soft limit (in MiB) of memory to reserve for the container. When system memory is under heavy contention, Docker attempts to keep the container memory to this soft limit. However, your container can consume more memory when it needs to, up to either the hard limit specified with the memory parameter (if applicable), or all of the available memory on the container instance, whichever comes first. This parameter maps to MemoryReservation in the Create a container section of the Docker Remote API and the --memory-reservation option to docker run. You must specify a non-zero integer for one or both of memory or memoryReservation in container definitions. If you specify both, memory must be greater than memoryReservation. If you specify memoryReservation, then that value is subtracted from the available memory resources for the container instance on which the container is placed. Otherwise, the value of memory is used. For example, if your container normally uses 128 MiB of memory, but occasionally bursts to 256 MiB of memory for short periods of time, you can set a memoryReservation of 128 MiB, and a memory hard limit of 300 MiB. This configuration would allow the container to only reserve 128 MiB of memory from the remaining resources on the container instance, but also allow the container to consume more memory resources when needed. The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer than 4 MiB of memory for your containers. 
    */
  var memoryReservation: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The mount points for data volumes in your container. This parameter maps to Volumes in the Create a container section of the Docker Remote API and the --volume option to docker run. Windows containers can mount whole directories on the same drive as $env:ProgramData. Windows containers cannot mount directories on a different drive, and mount point cannot be across drives.
    */
  var mountPoints: js.UndefOr[MountPointList] = js.undefined
  /**
    * The name of a container. If you are linking multiple containers together in a task definition, the name of one container can be entered in the links of another container to connect the containers. Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed. This parameter maps to name in the Create a container section of the Docker Remote API and the --name option to docker run. 
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The list of port mappings for the container. Port mappings allow containers to access ports on the host container instance to send or receive traffic. For task definitions that use the awsvpc network mode, you should only specify the containerPort. The hostPort can be left blank or it must be the same value as the containerPort. Port mappings on Windows use the NetNAT gateway address rather than localhost. There is no loopback for port mappings on Windows, so you cannot access a container's mapped port from the host itself.  This parameter maps to PortBindings in the Create a container section of the Docker Remote API and the --publish option to docker run. If the network mode of a task definition is set to none, then you can't specify port mappings. If the network mode of a task definition is set to host, then host ports must either be undefined or they must match the container port in the port mapping.  After a task reaches the RUNNING status, manual and automatic host and container port assignments are visible in the Network Bindings section of a container description for a selected task in the Amazon ECS console. The assignments are also visible in the networkBindings section DescribeTasks responses. 
    */
  var portMappings: js.UndefOr[PortMappingList] = js.undefined
  /**
    * When this parameter is true, the container is given elevated privileges on the host container instance (similar to the root user). This parameter maps to Privileged in the Create a container section of the Docker Remote API and the --privileged option to docker run.  This parameter is not supported for Windows containers or tasks using the Fargate launch type. 
    */
  var privileged: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * When this parameter is true, a TTY is allocated. This parameter maps to Tty in the Create a container section of the Docker Remote API and the --tty option to docker run.
    */
  var pseudoTerminal: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * When this parameter is true, the container is given read-only access to its root file system. This parameter maps to ReadonlyRootfs in the Create a container section of the Docker Remote API and the --read-only option to docker run.  This parameter is not supported for Windows containers. 
    */
  var readonlyRootFilesystem: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * The private repository authentication credentials to use.
    */
  var repositoryCredentials: js.UndefOr[RepositoryCredentials] = js.undefined
  /**
    * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.undefined
  /**
    * The secrets to pass to the container. For more information, see Specifying Sensitive Data in the Amazon Elastic Container Service Developer Guide.
    */
  var secrets: js.UndefOr[SecretList] = js.undefined
  /**
    * Time duration to wait before giving up on resolving dependencies for a container. For example, you specify two containers in a task definition with containerA having a dependency on containerB reaching a COMPLETE, SUCCESS, or HEALTHY status. If a startTimeout value is specified for containerB and it does not reach the desired status within that time then containerA will give up and not start. This results in the task transitioning to a STOPPED state. For tasks using the EC2 launch type, the container instances require at least version 1.26.0 of the container agent to enable a container start timeout value. However, we recommend using the latest container agent version. For information about checking your agent version and updating to the latest version, see Updating the Amazon ECS Container Agent in the Amazon Elastic Container Service Developer Guide. If you are using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the ecs-init package. If your container instances are launched from version 20190301 or later, then they contain the required versions of the container agent and ecs-init. For more information, see Amazon ECS-optimized Linux AMI in the Amazon Elastic Container Service Developer Guide. This parameter is available for tasks using the Fargate launch type in the Ohio (us-east-2) region only and the task or service requires platform version 1.3.0 or later.
    */
  var startTimeout: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * Time duration to wait before the container is forcefully killed if it doesn't exit normally on its own. For tasks using the Fargate launch type, the max stopTimeout value is 2 minutes. This parameter is available for tasks using the Fargate launch type in the Ohio (us-east-2) region only and the task or service requires platform version 1.3.0 or later. For tasks using the EC2 launch type, the stop timeout value for the container takes precedence over the ECS_CONTAINER_STOP_TIMEOUT container agent configuration parameter, if used. Container instances require at least version 1.26.0 of the container agent to enable a container stop timeout value. However, we recommend using the latest container agent version. For information about checking your agent version and updating to the latest version, see Updating the Amazon ECS Container Agent in the Amazon Elastic Container Service Developer Guide. If you are using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the ecs-init package. If your container instances are launched from version 20190301 or later, then they contain the required versions of the container agent and ecs-init. For more information, see Amazon ECS-optimized Linux AMI in the Amazon Elastic Container Service Developer Guide.
    */
  var stopTimeout: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * A list of namespaced kernel parameters to set in the container. This parameter maps to Sysctls in the Create a container section of the Docker Remote API and the --sysctl option to docker run.  It is not recommended that you specify network-related systemControls parameters for multiple containers in a single task that also uses either the awsvpc or host network modes. For tasks that use the awsvpc network mode, the container that is started last determines which systemControls parameters take effect. For tasks that use the host network mode, it changes the container instance's namespaced kernel parameters as well as the containers. 
    */
  var systemControls: js.UndefOr[SystemControls] = js.undefined
  /**
    * A list of ulimits to set in the container. This parameter maps to Ulimits in the Create a container section of the Docker Remote API and the --ulimit option to docker run. Valid naming values are displayed in the Ulimit data type. This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log in to your container instance and run the following command: sudo docker version --format '{{.Server.APIVersion}}'   This parameter is not supported for Windows containers. 
    */
  var ulimits: js.UndefOr[UlimitList] = js.undefined
  /**
    * The user name to use inside the container. This parameter maps to User in the Create a container section of the Docker Remote API and the --user option to docker run. You can use the following formats. If specifying a UID or GID, you must specify it as a positive integer.    user     user:group     uid     uid:gid     user:gid     uid:group     This parameter is not supported for Windows containers. 
    */
  var user: js.UndefOr[String] = js.undefined
  /**
    * Data volumes to mount from another container. This parameter maps to VolumesFrom in the Create a container section of the Docker Remote API and the --volumes-from option to docker run.
    */
  var volumesFrom: js.UndefOr[VolumeFromList] = js.undefined
  /**
    * The working directory in which to run commands inside the container. This parameter maps to WorkingDir in the Create a container section of the Docker Remote API and the --workdir option to docker run.
    */
  var workingDirectory: js.UndefOr[String] = js.undefined
}

object ContainerDefinition {
  @scala.inline
  def apply(
    command: StringList = null,
    cpu: js.UndefOr[Integer] = js.undefined,
    dependsOn: ContainerDependencies = null,
    disableNetworking: js.UndefOr[BoxedBoolean] = js.undefined,
    dnsSearchDomains: StringList = null,
    dnsServers: StringList = null,
    dockerLabels: DockerLabelsMap = null,
    dockerSecurityOptions: StringList = null,
    entryPoint: StringList = null,
    environment: EnvironmentVariables = null,
    essential: js.UndefOr[BoxedBoolean] = js.undefined,
    extraHosts: HostEntryList = null,
    healthCheck: HealthCheck = null,
    hostname: String = null,
    image: String = null,
    interactive: js.UndefOr[BoxedBoolean] = js.undefined,
    links: StringList = null,
    linuxParameters: LinuxParameters = null,
    logConfiguration: LogConfiguration = null,
    memory: js.UndefOr[BoxedInteger] = js.undefined,
    memoryReservation: js.UndefOr[BoxedInteger] = js.undefined,
    mountPoints: MountPointList = null,
    name: String = null,
    portMappings: PortMappingList = null,
    privileged: js.UndefOr[BoxedBoolean] = js.undefined,
    pseudoTerminal: js.UndefOr[BoxedBoolean] = js.undefined,
    readonlyRootFilesystem: js.UndefOr[BoxedBoolean] = js.undefined,
    repositoryCredentials: RepositoryCredentials = null,
    resourceRequirements: ResourceRequirements = null,
    secrets: SecretList = null,
    startTimeout: js.UndefOr[BoxedInteger] = js.undefined,
    stopTimeout: js.UndefOr[BoxedInteger] = js.undefined,
    systemControls: SystemControls = null,
    ulimits: UlimitList = null,
    user: String = null,
    volumesFrom: VolumeFromList = null,
    workingDirectory: String = null
  ): ContainerDefinition = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command)
    if (!js.isUndefined(cpu)) __obj.updateDynamic("cpu")(cpu)
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn)
    if (!js.isUndefined(disableNetworking)) __obj.updateDynamic("disableNetworking")(disableNetworking)
    if (dnsSearchDomains != null) __obj.updateDynamic("dnsSearchDomains")(dnsSearchDomains)
    if (dnsServers != null) __obj.updateDynamic("dnsServers")(dnsServers)
    if (dockerLabels != null) __obj.updateDynamic("dockerLabels")(dockerLabels)
    if (dockerSecurityOptions != null) __obj.updateDynamic("dockerSecurityOptions")(dockerSecurityOptions)
    if (entryPoint != null) __obj.updateDynamic("entryPoint")(entryPoint)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (!js.isUndefined(essential)) __obj.updateDynamic("essential")(essential)
    if (extraHosts != null) __obj.updateDynamic("extraHosts")(extraHosts)
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (links != null) __obj.updateDynamic("links")(links)
    if (linuxParameters != null) __obj.updateDynamic("linuxParameters")(linuxParameters)
    if (logConfiguration != null) __obj.updateDynamic("logConfiguration")(logConfiguration)
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory)
    if (!js.isUndefined(memoryReservation)) __obj.updateDynamic("memoryReservation")(memoryReservation)
    if (mountPoints != null) __obj.updateDynamic("mountPoints")(mountPoints)
    if (name != null) __obj.updateDynamic("name")(name)
    if (portMappings != null) __obj.updateDynamic("portMappings")(portMappings)
    if (!js.isUndefined(privileged)) __obj.updateDynamic("privileged")(privileged)
    if (!js.isUndefined(pseudoTerminal)) __obj.updateDynamic("pseudoTerminal")(pseudoTerminal)
    if (!js.isUndefined(readonlyRootFilesystem)) __obj.updateDynamic("readonlyRootFilesystem")(readonlyRootFilesystem)
    if (repositoryCredentials != null) __obj.updateDynamic("repositoryCredentials")(repositoryCredentials)
    if (resourceRequirements != null) __obj.updateDynamic("resourceRequirements")(resourceRequirements)
    if (secrets != null) __obj.updateDynamic("secrets")(secrets)
    if (!js.isUndefined(startTimeout)) __obj.updateDynamic("startTimeout")(startTimeout)
    if (!js.isUndefined(stopTimeout)) __obj.updateDynamic("stopTimeout")(stopTimeout)
    if (systemControls != null) __obj.updateDynamic("systemControls")(systemControls)
    if (ulimits != null) __obj.updateDynamic("ulimits")(ulimits)
    if (user != null) __obj.updateDynamic("user")(user)
    if (volumesFrom != null) __obj.updateDynamic("volumesFrom")(volumesFrom)
    if (workingDirectory != null) __obj.updateDynamic("workingDirectory")(workingDirectory)
    __obj.asInstanceOf[ContainerDefinition]
  }
}

