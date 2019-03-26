package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/opsworks", "OpsWorks")
@js.native
object OpsWorksNs extends js.Object {
  trait AgentVersion extends js.Object {
    /**
      * The configuration manager.
      */
    var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
    /**
      * The agent version.
      */
    var Version: js.UndefOr[String] = js.undefined
  }
  
  trait App extends js.Object {
    /**
      * The app ID.
      */
    var AppId: js.UndefOr[String] = js.undefined
    /**
      * A Source object that describes the app repository.
      */
    var AppSource: js.UndefOr[Source] = js.undefined
    /**
      * The stack attributes.
      */
    var Attributes: js.UndefOr[AppAttributes] = js.undefined
    /**
      * When the app was created.
      */
    var CreatedAt: js.UndefOr[String] = js.undefined
    /**
      * The app's data sources.
      */
    var DataSources: js.UndefOr[DataSources] = js.undefined
    /**
      * A description of the app.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The app vhost settings with multiple domains separated by commas. For example: 'www.example.com, example.com' 
      */
    var Domains: js.UndefOr[Strings] = js.undefined
    /**
      * Whether to enable SSL for the app.
      */
    var EnableSsl: js.UndefOr[Boolean] = js.undefined
    /**
      * An array of EnvironmentVariable objects that specify environment variables to be associated with the app. After you deploy the app, these variables are defined on the associated app server instances. For more information, see  Environment Variables.   There is no specific limit on the number of environment variables. However, the size of the associated data structure - which includes the variable names, values, and protected flag values - cannot exceed 10 KB (10240 Bytes). This limit should accommodate most if not all use cases, but if you do exceed it, you will cause an exception (API) with an "Environment: is too large (maximum is 10KB)" message. 
      */
    var Environment: js.UndefOr[EnvironmentVariables] = js.undefined
    /**
      * The app name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The app's short name.
      */
    var Shortname: js.UndefOr[String] = js.undefined
    /**
      * An SslConfiguration object with the SSL configuration.
      */
    var SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined
    /**
      * The app stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
    /**
      * The app type.
      */
    var Type: js.UndefOr[AppType] = js.undefined
  }
  
  trait AppAttributes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait AssignInstanceRequest extends js.Object {
    /**
      * The instance ID.
      */
    var InstanceId: String
    /**
      * The layer ID, which must correspond to a custom layer. You cannot assign a registered instance to a built-in layer.
      */
    var LayerIds: Strings
  }
  
  trait AssignVolumeRequest extends js.Object {
    /**
      * The instance ID.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
    /**
      * The volume ID.
      */
    var VolumeId: String
  }
  
  trait AssociateElasticIpRequest extends js.Object {
    /**
      * The Elastic IP address.
      */
    var ElasticIp: String
    /**
      * The instance ID.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
  }
  
  trait AttachElasticLoadBalancerRequest extends js.Object {
    /**
      * The Elastic Load Balancing instance's name.
      */
    var ElasticLoadBalancerName: String
    /**
      * The ID of the layer to which the Elastic Load Balancing instance is to be attached.
      */
    var LayerId: String
  }
  
  trait AutoScalingThresholds extends js.Object {
    /**
      * Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to five alarm names, which are case sensitive and must be in the same region as the stack.  To use custom alarms, you must update your service role to allow cloudwatch:DescribeAlarms. You can either have AWS OpsWorks Stacks update the role for you when you first use this feature or you can edit the role manually. For more information, see Allowing AWS OpsWorks Stacks to Act on Your Behalf. 
      */
    var Alarms: js.UndefOr[Strings] = js.undefined
    /**
      * The CPU utilization threshold, as a percent of the available CPU. A value of -1 disables the threshold.
      */
    var CpuThreshold: js.UndefOr[Double] = js.undefined
    /**
      * The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks should ignore metrics and suppress additional scaling events. For example, AWS OpsWorks Stacks adds new instances following an upscaling event but the instances won't start reducing the load until they have been booted and configured. There is no point in raising additional scaling events during that operation, which typically takes several minutes. IgnoreMetricsTime allows you to direct AWS OpsWorks Stacks to suppress scaling events long enough to get the new instances online.
      */
    var IgnoreMetricsTime: js.UndefOr[Minute] = js.undefined
    /**
      * The number of instances to add or remove when the load exceeds a threshold.
      */
    var InstanceCount: js.UndefOr[Integer] = js.undefined
    /**
      * The load threshold. A value of -1 disables the threshold. For more information about how load is computed, see Load (computing).
      */
    var LoadThreshold: js.UndefOr[Double] = js.undefined
    /**
      * The memory utilization threshold, as a percent of the available memory. A value of -1 disables the threshold.
      */
    var MemoryThreshold: js.UndefOr[Double] = js.undefined
    /**
      * The amount of time, in minutes, that the load must exceed a threshold before more instances are added or removed.
      */
    var ThresholdsWaitTime: js.UndefOr[Minute] = js.undefined
  }
  
  trait BlockDeviceMapping extends js.Object {
    /**
      * The device name that is exposed to the instance, such as /dev/sdh. For the root device, you can use the explicit device name or you can set this parameter to ROOT_DEVICE and AWS OpsWorks Stacks will provide the correct device name.
      */
    var DeviceName: js.UndefOr[String] = js.undefined
    /**
      * An EBSBlockDevice that defines how to configure an Amazon EBS volume when the instance is launched.
      */
    var Ebs: js.UndefOr[EbsBlockDevice] = js.undefined
    /**
      * Suppresses the specified device included in the AMI's block device mapping.
      */
    var NoDevice: js.UndefOr[String] = js.undefined
    /**
      * The virtual device name. For more information, see BlockDeviceMapping.
      */
    var VirtualName: js.UndefOr[String] = js.undefined
  }
  
  trait ChefConfiguration extends js.Object {
    /**
      * The Berkshelf version.
      */
    var BerkshelfVersion: js.UndefOr[String] = js.undefined
    /**
      * Whether to enable Berkshelf.
      */
    var ManageBerkshelf: js.UndefOr[Boolean] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloneStackRequest extends js.Object {
    /**
      * The default AWS OpsWorks Stacks agent version. You have the following options:   Auto-update - Set this parameter to LATEST. AWS OpsWorks Stacks automatically installs new agent versions on the stack's instances as soon as they are available.   Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version on the stack's instances.   The default setting is LATEST. To specify an agent version, you must use the complete version number, not the abbreviated number shown on the console. For a list of available agent version numbers, call DescribeAgentVersions. AgentVersion cannot be set to Chef 12.2.  You can also specify an agent version when you create or update an instance, which overrides the stack's default setting. 
      */
    var AgentVersion: js.UndefOr[String] = js.undefined
    /**
      * A list of stack attributes and values as key/value pairs to be added to the cloned stack.
      */
    var Attributes: js.UndefOr[StackAttributes] = js.undefined
    /**
      * A ChefConfiguration object that specifies whether to enable Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see Create a New Stack.
      */
    var ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined
    /**
      * A list of source stack app IDs to be included in the cloned stack.
      */
    var CloneAppIds: js.UndefOr[Strings] = js.undefined
    /**
      * Whether to clone the source stack's permissions.
      */
    var ClonePermissions: js.UndefOr[Boolean] = js.undefined
    /**
      * The configuration manager. When you clone a stack we recommend that you use the configuration manager to specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for Linux stacks is currently 12.
      */
    var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
    var CustomCookbooksSource: js.UndefOr[Source] = js.undefined
    /**
      * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack configuration JSON values. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information about custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes 
      */
    var CustomJson: js.UndefOr[String] = js.undefined
    /**
      * The cloned stack's default Availability Zone, which must be in the specified region. For more information, see Regions and Endpoints. If you also specify a value for DefaultSubnetId, the subnet must be in the same zone. For more information, see the VpcId parameter description. 
      */
    var DefaultAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
      */
    var DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined
    /**
      * The stack's operating system, which must be set to one of the following.   A supported Linux operating system: An Amazon Linux version, such as Amazon Linux 2017.09, Amazon Linux 2017.03, Amazon Linux 2016.09, Amazon Linux 2016.03, Amazon Linux 2015.09, or Amazon Linux 2015.03.   A supported Ubuntu operating system, such as Ubuntu 16.04 LTS, Ubuntu 14.04 LTS, or Ubuntu 12.04 LTS.    CentOS Linux 7     Red Hat Enterprise Linux 7     Microsoft Windows Server 2012 R2 Base, Microsoft Windows Server 2012 R2 with SQL Server Express, Microsoft Windows Server 2012 R2 with SQL Server Standard, or Microsoft Windows Server 2012 R2 with SQL Server Web.   A custom AMI: Custom. You specify the custom AMI you want to use when you create instances. For more information about how to use custom AMIs with OpsWorks, see Using Custom AMIs.   The default option is the parent stack's operating system. For more information about supported operating systems, see AWS OpsWorks Stacks Operating Systems.  You can specify a different Linux operating system for the cloned stack, but you cannot change from Linux to Windows or Windows to Linux. 
      */
    var DefaultOs: js.UndefOr[String] = js.undefined
    /**
      * The default root device type. This value is used by default for all instances in the cloned stack, but you can override it when you create an instance. For more information, see Storage for the Root Device.
      */
    var DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined
    /**
      * A default Amazon EC2 key pair name. The default value is none. If you specify a key pair name, AWS OpsWorks installs the public key on the instance and you can use the private key with an SSH client to log in to the instance. For more information, see  Using SSH to Communicate with an Instance and  Managing SSH Access. You can override this setting by specifying a different key pair, or no key pair, when you  create an instance. 
      */
    var DefaultSshKeyName: js.UndefOr[String] = js.undefined
    /**
      * The stack's default VPC subnet ID. This parameter is required if you specify a value for the VpcId parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance. If you also specify a value for DefaultAvailabilityZone, the subnet must be in that zone. For information on default values and when this parameter is required, see the VpcId parameter description. 
      */
    var DefaultSubnetId: js.UndefOr[String] = js.undefined
    /**
      * The stack's host name theme, with spaces are replaced by underscores. The theme is used to generate host names for the stack's instances. By default, HostnameTheme is set to Layer_Dependent, which creates host names by appending integers to the layer's short name. The other themes are:    Baked_Goods     Clouds     Europe_Cities     Fruits     Greek_Deities     Legendary_creatures_from_Japan     Planets_and_Moons     Roman_Deities     Scottish_Islands     US_Cities     Wild_Cats    To obtain a generated host name, call GetHostNameSuggestion, which returns a host name based on the current theme.
      */
    var HostnameTheme: js.UndefOr[String] = js.undefined
    /**
      * The cloned stack name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The cloned stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see Regions and Endpoints.
      */
    var Region: js.UndefOr[String] = js.undefined
    /**
      * The stack AWS Identity and Access Management (IAM) role, which allows AWS OpsWorks Stacks to work with AWS resources on your behalf. You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. If you create a stack by using the AWS OpsWorks Stacks console, it creates the role for you. You can obtain an existing stack's IAM ARN programmatically by calling DescribePermissions. For more information about IAM ARNs, see Using Identifiers.  You must set this parameter to a valid service role ARN or the action will fail; there is no default value. You can specify the source stack's service role ARN, if you prefer, but you must do so explicitly. 
      */
    var ServiceRoleArn: String
    /**
      * The source stack ID.
      */
    var SourceStackId: String
    /**
      * Whether to use custom cookbooks.
      */
    var UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers. AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are associated with layers by default. With UseOpsworksSecurityGroups you can instead provide your own custom security groups. UseOpsworksSecurityGroups has the following settings:    True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each layer (default setting). You can associate additional security groups with a layer after you create it but you cannot delete the built-in security group.   False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create appropriate Amazon Elastic Compute Cloud (Amazon EC2) security groups and associate a security group with each layer that you create. However, you can still manually associate a built-in security group with a layer on creation; custom security groups are required only for those layers that need custom settings.   For more information, see Create a New Stack.
      */
    var UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined
    /**
      * The ID of the VPC that the cloned stack is to be launched into. It must be in the specified region. All instances are launched into this VPC, and you cannot change the ID later.   If your account supports EC2 Classic, the default value is no VPC.   If your account does not support EC2 Classic, the default value is the default VPC for the specified region.   If the VPC ID corresponds to a default VPC and you have specified either the DefaultAvailabilityZone or the DefaultSubnetId parameter only, AWS OpsWorks Stacks infers the value of the other parameter. If you specify neither parameter, AWS OpsWorks Stacks sets these parameters to the first valid Availability Zone for the specified region and the corresponding default VPC subnet ID, respectively.  If you specify a nondefault VPC ID, note the following:   It must belong to a VPC in your account that is in the specified region.   You must specify a value for DefaultSubnetId.   For more information about how to use AWS OpsWorks Stacks with a VPC, see Running a Stack in a VPC. For more information about default VPC and EC2 Classic, see Supported Platforms. 
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  trait CloneStackResult extends js.Object {
    /**
      * The cloned stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait CloudWatchLogsConfiguration extends js.Object {
    /**
      * Whether CloudWatch Logs is enabled for a layer.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of configuration options for CloudWatch Logs.
      */
    var LogStreams: js.UndefOr[CloudWatchLogsLogStreams] = js.undefined
  }
  
  trait CloudWatchLogsLogStream extends js.Object {
    /**
      * Specifies the max number of log events in a batch, up to 10000. The default value is 1000.
      */
    var BatchCount: js.UndefOr[Integer] = js.undefined
    /**
      * Specifies the maximum size of log events in a batch, in bytes, up to 1048576 bytes. The default value is 32768 bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.
      */
    var BatchSize: js.UndefOr[Integer] = js.undefined
    /**
      * Specifies the time duration for the batching of log events. The minimum value is 5000ms and default value is 5000ms.
      */
    var BufferDuration: js.UndefOr[Integer] = js.undefined
    /**
      * Specifies how the time stamp is extracted from logs. For more information, see the CloudWatch Logs Agent Reference.
      */
    var DatetimeFormat: js.UndefOr[String] = js.undefined
    /**
      * Specifies the encoding of the log file so that the file can be read correctly. The default is utf_8. Encodings supported by Python codecs.decode() can be used here.
      */
    var Encoding: js.UndefOr[CloudWatchLogsEncoding] = js.undefined
    /**
      * Specifies log files that you want to push to CloudWatch Logs.  File can point to a specific file or multiple files (by using wild card characters such as /var/log/system.log*). Only the latest file is pushed to CloudWatch Logs, based on file modification time. We recommend that you use wild card characters to specify a series of files of the same type, such as access_log.2014-06-01-01, access_log.2014-06-01-02, and so on by using a pattern like access_log.*. Don't use a wildcard to match multiple file types, such as access_log_80 and access_log_443. To specify multiple, different file types, add another log stream entry to the configuration file, so that each log file type is stored in a different log group. Zipped files are not supported.
      */
    var File: js.UndefOr[String] = js.undefined
    /**
      * Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited numbers, such as '1', '2-5'. The default value is '1', meaning the first line is used to calculate the fingerprint. Fingerprint lines are not sent to CloudWatch Logs unless all specified lines are available.
      */
    var FileFingerprintLines: js.UndefOr[String] = js.undefined
    /**
      * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This setting is only used if there is no state persisted for that log stream.
      */
    var InitialPosition: js.UndefOr[CloudWatchLogsInitialPosition] = js.undefined
    /**
      * Specifies the destination log group. A log group is created automatically if it doesn't already exist. Log group names can be between 1 and 512 characters long. Allowed characters include a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).
      */
    var LogGroupName: js.UndefOr[String] = js.undefined
    /**
      * Specifies the pattern for identifying the start of a log message.
      */
    var MultiLineStartPattern: js.UndefOr[String] = js.undefined
    /**
      * Specifies the time zone of log event time stamps.
      */
    var TimeZone: js.UndefOr[CloudWatchLogsTimeZone] = js.undefined
  }
  
  trait Command extends js.Object {
    /**
      * Date and time when the command was acknowledged.
      */
    var AcknowledgedAt: js.UndefOr[DateTime] = js.undefined
    /**
      * The command ID.
      */
    var CommandId: js.UndefOr[String] = js.undefined
    /**
      * Date when the command completed.
      */
    var CompletedAt: js.UndefOr[DateTime] = js.undefined
    /**
      * Date and time when the command was run.
      */
    var CreatedAt: js.UndefOr[DateTime] = js.undefined
    /**
      * The command deployment ID.
      */
    var DeploymentId: js.UndefOr[String] = js.undefined
    /**
      * The command exit code.
      */
    var ExitCode: js.UndefOr[Integer] = js.undefined
    /**
      * The ID of the instance where the command was executed.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
    /**
      * The URL of the command log.
      */
    var LogUrl: js.UndefOr[String] = js.undefined
    /**
      * The command status:   failed   successful   skipped   pending  
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The command type:    configure     deploy     execute_recipes     install_dependencies     restart     rollback     setup     start     stop     undeploy     update_custom_cookbooks     update_dependencies   
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  
  trait CreateAppRequest extends js.Object {
    /**
      * A Source object that specifies the app repository.
      */
    var AppSource: js.UndefOr[Source] = js.undefined
    /**
      * One or more user-defined key/value pairs to be added to the stack attributes.
      */
    var Attributes: js.UndefOr[AppAttributes] = js.undefined
    /**
      * The app's data source.
      */
    var DataSources: js.UndefOr[DataSources] = js.undefined
    /**
      * A description of the app.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The app virtual host settings, with multiple domains separated by commas. For example: 'www.example.com, example.com' 
      */
    var Domains: js.UndefOr[Strings] = js.undefined
    /**
      * Whether to enable SSL for the app.
      */
    var EnableSsl: js.UndefOr[Boolean] = js.undefined
    /**
      * An array of EnvironmentVariable objects that specify environment variables to be associated with the app. After you deploy the app, these variables are defined on the associated app server instance. For more information, see  Environment Variables. There is no specific limit on the number of environment variables. However, the size of the associated data structure - which includes the variables' names, values, and protected flag values - cannot exceed 10 KB (10240 Bytes). This limit should accommodate most if not all use cases. Exceeding it will cause an exception with the message, "Environment: is too large (maximum is 10KB)."  This parameter is supported only by Chef 11.10 stacks. If you have specified one or more environment variables, you cannot modify the stack's Chef version. 
      */
    var Environment: js.UndefOr[EnvironmentVariables] = js.undefined
    /**
      * The app name.
      */
    var Name: String
    /**
      * The app's short name.
      */
    var Shortname: js.UndefOr[String] = js.undefined
    /**
      * An SslConfiguration object with the SSL configuration.
      */
    var SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: String
    /**
      * The app type. Each supported type is associated with a particular layer. For example, PHP applications are associated with a PHP layer. AWS OpsWorks Stacks deploys an application to those instances that are members of the corresponding layer. If your app isn't one of the standard types, or you prefer to implement your own Deploy recipes, specify other.
      */
    var Type: AppType
  }
  
  trait CreateAppResult extends js.Object {
    /**
      * The app ID.
      */
    var AppId: js.UndefOr[String] = js.undefined
  }
  
  trait CreateDeploymentRequest extends js.Object {
    /**
      * The app ID. This parameter is required for app deployments, but not for other deployment commands.
      */
    var AppId: js.UndefOr[String] = js.undefined
    /**
      * A DeploymentCommand object that specifies the deployment command and any associated arguments.
      */
    var Command: DeploymentCommand
    /**
      * A user-defined comment.
      */
    var Comment: js.UndefOr[String] = js.undefined
    /**
      * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack configuration JSON values. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information about custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes.
      */
    var CustomJson: js.UndefOr[String] = js.undefined
    /**
      * The instance IDs for the deployment targets.
      */
    var InstanceIds: js.UndefOr[Strings] = js.undefined
    /**
      * The layer IDs for the deployment targets.
      */
    var LayerIds: js.UndefOr[Strings] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: String
  }
  
  trait CreateDeploymentResult extends js.Object {
    /**
      * The deployment ID, which can be used with other requests to identify the deployment.
      */
    var DeploymentId: js.UndefOr[String] = js.undefined
  }
  
  trait CreateInstanceRequest extends js.Object {
    /**
      * The default AWS OpsWorks Stacks agent version. You have the following options:    INHERIT - Use the stack's default agent version setting.    version_number - Use the specified agent version. This value overrides the stack's default setting. To update the agent version, edit the instance configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version on the instance.   The default setting is INHERIT. To specify an agent version, you must use the complete version number, not the abbreviated number shown on the console. For a list of available agent version numbers, call DescribeAgentVersions. AgentVersion cannot be set to Chef 12.2.
      */
    var AgentVersion: js.UndefOr[String] = js.undefined
    /**
      * A custom AMI ID to be used to create the instance. The AMI should be based on one of the supported operating systems. For more information, see Using Custom AMIs.  If you specify a custom AMI, you must set Os to Custom. 
      */
    var AmiId: js.UndefOr[String] = js.undefined
    /**
      * The instance architecture. The default option is x86_64. Instance types do not necessarily support both architectures. For a list of the architectures that are supported by the different instance types, see Instance Families and Types.
      */
    var Architecture: js.UndefOr[Architecture] = js.undefined
    /**
      * For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
      */
    var AutoScalingType: js.UndefOr[AutoScalingType] = js.undefined
    /**
      * The instance Availability Zone. For more information, see Regions and Endpoints.
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * An array of BlockDeviceMapping objects that specify the instance's block devices. For more information, see Block Device Mapping. Note that block device mappings are not supported for custom AMIs.
      */
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined
    /**
      * Whether to create an Amazon EBS-optimized instance.
      */
    var EbsOptimized: js.UndefOr[Boolean] = js.undefined
    /**
      * The instance host name.
      */
    var Hostname: js.UndefOr[String] = js.undefined
    /**
      * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true to ensure that your instances have the latest security updates. 
      */
    var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
    /**
      * The instance type, such as t2.micro. For a list of supported instance types, open the stack in the console, choose Instances, and choose + Instance. The Size list contains the currently supported types. For more information, see Instance Families and Types. The parameter values that you use to specify the various types are in the API Name column of the Available Instance Types table.
      */
    var InstanceType: String
    /**
      * An array that contains the instance's layer IDs.
      */
    var LayerIds: Strings
    /**
      * The instance's operating system, which must be set to one of the following.   A supported Linux operating system: An Amazon Linux version, such as Amazon Linux 2017.09, Amazon Linux 2017.03, Amazon Linux 2016.09, Amazon Linux 2016.03, Amazon Linux 2015.09, or Amazon Linux 2015.03.   A supported Ubuntu operating system, such as Ubuntu 16.04 LTS, Ubuntu 14.04 LTS, or Ubuntu 12.04 LTS.    CentOS Linux 7     Red Hat Enterprise Linux 7    A supported Windows operating system, such as Microsoft Windows Server 2012 R2 Base, Microsoft Windows Server 2012 R2 with SQL Server Express, Microsoft Windows Server 2012 R2 with SQL Server Standard, or Microsoft Windows Server 2012 R2 with SQL Server Web.   A custom AMI: Custom.   For more information about the supported operating systems, see AWS OpsWorks Stacks Operating Systems. The default option is the current Amazon Linux version. If you set this parameter to Custom, you must use the CreateInstance action's AmiId parameter to specify the custom AMI that you want to use. Block device mappings are not supported if the value is Custom. For more information about supported operating systems, see Operating SystemsFor more information about how to use custom AMIs with AWS OpsWorks Stacks, see Using Custom AMIs.
      */
    var Os: js.UndefOr[String] = js.undefined
    /**
      * The instance root device type. For more information, see Storage for the Root Device.
      */
    var RootDeviceType: js.UndefOr[RootDeviceType] = js.undefined
    /**
      * The instance's Amazon EC2 key-pair name.
      */
    var SshKeyName: js.UndefOr[String] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: String
    /**
      * The ID of the instance's subnet. If the stack is running in a VPC, you can use this parameter to override the stack's default subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different subnet.
      */
    var SubnetId: js.UndefOr[String] = js.undefined
    /**
      * The instance's tenancy option. The default option is no tenancy, or if the instance is running in a VPC, inherit tenancy settings from the VPC. The following are valid values for this parameter: dedicated, default, or host. Because there are costs associated with changes in tenancy options, we recommend that you research tenancy options before choosing them for your instances. For more information about dedicated hosts, see Dedicated Hosts Overview and Amazon EC2 Dedicated Hosts. For more information about dedicated instances, see Dedicated Instances and Amazon EC2 Dedicated Instances.
      */
    var Tenancy: js.UndefOr[String] = js.undefined
    /**
      * The instance's virtualization type, paravirtual or hvm.
      */
    var VirtualizationType: js.UndefOr[String] = js.undefined
  }
  
  trait CreateInstanceResult extends js.Object {
    /**
      * The instance ID.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
  }
  
  trait CreateLayerRequest extends js.Object {
    /**
      * One or more user-defined key-value pairs to be added to the stack attributes. To create a cluster layer, set the EcsClusterArn attribute to the cluster's ARN.
      */
    var Attributes: js.UndefOr[LayerAttributes] = js.undefined
    /**
      * Whether to automatically assign an Elastic IP address to the layer's instances. For more information, see How to Edit a Layer.
      */
    var AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined
    /**
      * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's instances. For more information, see How to Edit a Layer.
      */
    var AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies CloudWatch Logs configuration options for the layer. For more information, see CloudWatchLogsLogStream.
      */
    var CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration] = js.undefined
    /**
      * The ARN of an IAM profile to be used for the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
      */
    var CustomInstanceProfileArn: js.UndefOr[String] = js.undefined
    /**
      * A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on the layer's instances. For more information, see  Using Custom JSON. This feature is supported as of version 1.7.42 of the AWS CLI. 
      */
    var CustomJson: js.UndefOr[String] = js.undefined
    /**
      * A LayerCustomRecipes object that specifies the layer custom recipes.
      */
    var CustomRecipes: js.UndefOr[Recipes] = js.undefined
    /**
      * An array containing the layer custom security group IDs.
      */
    var CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined
    /**
      * Whether to disable auto healing for the layer.
      */
    var EnableAutoHealing: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   To ensure that your instances have the latest security updates, we strongly recommend using the default value of true. 
      */
    var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
    /**
      * A LifeCycleEventConfiguration object that you can use to configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
      */
    var LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined
    /**
      * The layer name, which is used by the console.
      */
    var Name: String
    /**
      * An array of Package objects that describes the layer packages.
      */
    var Packages: js.UndefOr[Strings] = js.undefined
    /**
      * For custom layers only, use this parameter to specify the layer's short name, which is used internally by AWS OpsWorks Stacks and by Chef recipes. The short name is also used as the name for the directory where your app files are installed. It can have a maximum of 200 characters, which are limited to the alphanumeric characters, '-', '_', and '.'. The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the Layer Reference.
      */
    var Shortname: String
    /**
      * The layer stack ID.
      */
    var StackId: String
    /**
      * The layer type. A stack cannot have more than one built-in layer of the same type. It can have any number of custom layers. Built-in layers are not available in Chef 12 stacks.
      */
    var Type: LayerType
    /**
      * Whether to use Amazon EBS-optimized instances.
      */
    var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined
    /**
      * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
      */
    var VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined
  }
  
  trait CreateLayerResult extends js.Object {
    /**
      * The layer ID.
      */
    var LayerId: js.UndefOr[String] = js.undefined
  }
  
  trait CreateStackRequest extends js.Object {
    /**
      * The default AWS OpsWorks Stacks agent version. You have the following options:   Auto-update - Set this parameter to LATEST. AWS OpsWorks Stacks automatically installs new agent versions on the stack's instances as soon as they are available.   Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version on the stack's instances.   The default setting is the most recent release of the agent. To specify an agent version, you must use the complete version number, not the abbreviated number shown on the console. For a list of available agent version numbers, call DescribeAgentVersions. AgentVersion cannot be set to Chef 12.2.  You can also specify an agent version when you create or update an instance, which overrides the stack's default setting. 
      */
    var AgentVersion: js.UndefOr[String] = js.undefined
    /**
      * One or more user-defined key-value pairs to be added to the stack attributes.
      */
    var Attributes: js.UndefOr[StackAttributes] = js.undefined
    /**
      * A ChefConfiguration object that specifies whether to enable Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see Create a New Stack.
      */
    var ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined
    /**
      * The configuration manager. When you create a stack we recommend that you use the configuration manager to specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for Linux stacks is currently 12.
      */
    var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
    var CustomCookbooksSource: js.UndefOr[Source] = js.undefined
    /**
      * A string that contains user-defined, custom JSON. It can be used to override the corresponding default stack configuration attribute values or to pass data to recipes. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information about custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes.
      */
    var CustomJson: js.UndefOr[String] = js.undefined
    /**
      * The stack's default Availability Zone, which must be in the specified region. For more information, see Regions and Endpoints. If you also specify a value for DefaultSubnetId, the subnet must be in the same zone. For more information, see the VpcId parameter description. 
      */
    var DefaultAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
      */
    var DefaultInstanceProfileArn: String
    /**
      * The stack's default operating system, which is installed on every instance unless you specify a different operating system when you create the instance. You can specify one of the following.   A supported Linux operating system: An Amazon Linux version, such as Amazon Linux 2017.09, Amazon Linux 2017.03, Amazon Linux 2016.09, Amazon Linux 2016.03, Amazon Linux 2015.09, or Amazon Linux 2015.03.   A supported Ubuntu operating system, such as Ubuntu 16.04 LTS, Ubuntu 14.04 LTS, or Ubuntu 12.04 LTS.    CentOS Linux 7     Red Hat Enterprise Linux 7    A supported Windows operating system, such as Microsoft Windows Server 2012 R2 Base, Microsoft Windows Server 2012 R2 with SQL Server Express, Microsoft Windows Server 2012 R2 with SQL Server Standard, or Microsoft Windows Server 2012 R2 with SQL Server Web.   A custom AMI: Custom. You specify the custom AMI you want to use when you create instances. For more information, see  Using Custom AMIs.   The default option is the current Amazon Linux version. For more information about supported operating systems, see AWS OpsWorks Stacks Operating Systems.
      */
    var DefaultOs: js.UndefOr[String] = js.undefined
    /**
      * The default root device type. This value is the default for all instances in the stack, but you can override it when you create an instance. The default option is instance-store. For more information, see Storage for the Root Device.
      */
    var DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined
    /**
      * A default Amazon EC2 key pair name. The default value is none. If you specify a key pair name, AWS OpsWorks installs the public key on the instance and you can use the private key with an SSH client to log in to the instance. For more information, see  Using SSH to Communicate with an Instance and  Managing SSH Access. You can override this setting by specifying a different key pair, or no key pair, when you  create an instance. 
      */
    var DefaultSshKeyName: js.UndefOr[String] = js.undefined
    /**
      * The stack's default VPC subnet ID. This parameter is required if you specify a value for the VpcId parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance. If you also specify a value for DefaultAvailabilityZone, the subnet must be in that zone. For information on default values and when this parameter is required, see the VpcId parameter description. 
      */
    var DefaultSubnetId: js.UndefOr[String] = js.undefined
    /**
      * The stack's host name theme, with spaces replaced by underscores. The theme is used to generate host names for the stack's instances. By default, HostnameTheme is set to Layer_Dependent, which creates host names by appending integers to the layer's short name. The other themes are:    Baked_Goods     Clouds     Europe_Cities     Fruits     Greek_Deities     Legendary_creatures_from_Japan     Planets_and_Moons     Roman_Deities     Scottish_Islands     US_Cities     Wild_Cats    To obtain a generated host name, call GetHostNameSuggestion, which returns a host name based on the current theme.
      */
    var HostnameTheme: js.UndefOr[String] = js.undefined
    /**
      * The stack name.
      */
    var Name: String
    /**
      * The stack's AWS region, such as ap-south-1. For more information about Amazon regions, see Regions and Endpoints.  In the AWS CLI, this API maps to the --stack-region parameter. If the --stack-region parameter and the AWS CLI common parameter --region are set to the same value, the stack uses a regional endpoint. If the --stack-region parameter is not set, but the AWS CLI --region parameter is, this also results in a stack with a regional endpoint. However, if the --region parameter is set to us-east-1, and the --stack-region parameter is set to one of the following, then the stack uses a legacy or classic region: us-west-1, us-west-2, sa-east-1, eu-central-1, eu-west-1, ap-northeast-1, ap-southeast-1, ap-southeast-2. In this case, the actual API endpoint of the stack is in us-east-1. Only the preceding regions are supported as classic regions in the us-east-1 API endpoint. Because it is a best practice to choose the regional endpoint that is closest to where you manage AWS, we recommend that you use regional endpoints for new stacks. The AWS CLI common --region parameter always specifies a regional API endpoint; it cannot be used to specify a classic AWS OpsWorks Stacks region. 
      */
    var Region: String
    /**
      * The stack's AWS Identity and Access Management (IAM) role, which allows AWS OpsWorks Stacks to work with AWS resources on your behalf. You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. For more information about IAM ARNs, see Using Identifiers.
      */
    var ServiceRoleArn: String
    /**
      * Whether the stack uses custom cookbooks.
      */
    var UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers. AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are associated with layers by default. With UseOpsworksSecurityGroups you can instead provide your own custom security groups. UseOpsworksSecurityGroups has the following settings:    True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each layer (default setting). You can associate additional security groups with a layer after you create it, but you cannot delete the built-in security group.   False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create appropriate EC2 security groups and associate a security group with each layer that you create. However, you can still manually associate a built-in security group with a layer on creation; custom security groups are required only for those layers that need custom settings.   For more information, see Create a New Stack.
      */
    var UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined
    /**
      * The ID of the VPC that the stack is to be launched into. The VPC must be in the stack's region. All instances are launched into this VPC. You cannot change the ID later.   If your account supports EC2-Classic, the default value is no VPC.   If your account does not support EC2-Classic, the default value is the default VPC for the specified region.   If the VPC ID corresponds to a default VPC and you have specified either the DefaultAvailabilityZone or the DefaultSubnetId parameter only, AWS OpsWorks Stacks infers the value of the other parameter. If you specify neither parameter, AWS OpsWorks Stacks sets these parameters to the first valid Availability Zone for the specified region and the corresponding default VPC subnet ID, respectively. If you specify a nondefault VPC ID, note the following:   It must belong to a VPC in your account that is in the specified region.   You must specify a value for DefaultSubnetId.   For more information about how to use AWS OpsWorks Stacks with a VPC, see Running a Stack in a VPC. For more information about default VPC and EC2-Classic, see Supported Platforms. 
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  trait CreateStackResult extends js.Object {
    /**
      * The stack ID, which is an opaque string that you use to identify the stack when performing actions such as DescribeStacks.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait CreateUserProfileRequest extends js.Object {
    /**
      * Whether users can specify their own SSH public key through the My Settings page. For more information, see Setting an IAM User's Public SSH Key.
      */
    var AllowSelfManagement: js.UndefOr[Boolean] = js.undefined
    /**
      * The user's IAM ARN; this can also be a federated user's ARN.
      */
    var IamUserArn: String
    /**
      * The user's public SSH key.
      */
    var SshPublicKey: js.UndefOr[String] = js.undefined
    /**
      * The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified name includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, my.name will be changed to myname. If you do not specify an SSH user name, AWS OpsWorks Stacks generates one from the IAM user name. 
      */
    var SshUsername: js.UndefOr[String] = js.undefined
  }
  
  trait CreateUserProfileResult extends js.Object {
    /**
      * The user's IAM ARN.
      */
    var IamUserArn: js.UndefOr[String] = js.undefined
  }
  
  trait DailyAutoScalingSchedule
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Switch]
  
  trait DataSource extends js.Object {
    /**
      * The data source's ARN.
      */
    var Arn: js.UndefOr[String] = js.undefined
    /**
      * The database name.
      */
    var DatabaseName: js.UndefOr[String] = js.undefined
    /**
      * The data source's type, AutoSelectOpsworksMysqlInstance, OpsworksMysqlInstance, RdsDbInstance, or None.
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  
  trait DeleteAppRequest extends js.Object {
    /**
      * The app ID.
      */
    var AppId: String
  }
  
  trait DeleteInstanceRequest extends js.Object {
    /**
      * Whether to delete the instance Elastic IP address.
      */
    var DeleteElasticIp: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether to delete the instance's Amazon EBS volumes.
      */
    var DeleteVolumes: js.UndefOr[Boolean] = js.undefined
    /**
      * The instance ID.
      */
    var InstanceId: String
  }
  
  trait DeleteLayerRequest extends js.Object {
    /**
      * The layer ID.
      */
    var LayerId: String
  }
  
  trait DeleteStackRequest extends js.Object {
    /**
      * The stack ID.
      */
    var StackId: String
  }
  
  trait DeleteUserProfileRequest extends js.Object {
    /**
      * The user's IAM ARN. This can also be a federated user's ARN.
      */
    var IamUserArn: String
  }
  
  trait Deployment extends js.Object {
    /**
      * The app ID.
      */
    var AppId: js.UndefOr[String] = js.undefined
    var Command: js.UndefOr[DeploymentCommand] = js.undefined
    /**
      * A user-defined comment.
      */
    var Comment: js.UndefOr[String] = js.undefined
    /**
      * Date when the deployment completed.
      */
    var CompletedAt: js.UndefOr[DateTime] = js.undefined
    /**
      * Date when the deployment was created.
      */
    var CreatedAt: js.UndefOr[DateTime] = js.undefined
    /**
      * A string that contains user-defined custom JSON. It can be used to override the corresponding default stack configuration attribute values for stack or to pass data to recipes. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information on custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes.
      */
    var CustomJson: js.UndefOr[String] = js.undefined
    /**
      * The deployment ID.
      */
    var DeploymentId: js.UndefOr[String] = js.undefined
    /**
      * The deployment duration.
      */
    var Duration: js.UndefOr[Integer] = js.undefined
    /**
      * The user's IAM ARN.
      */
    var IamUserArn: js.UndefOr[String] = js.undefined
    /**
      * The IDs of the target instances.
      */
    var InstanceIds: js.UndefOr[Strings] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
    /**
      * The deployment status:   running   successful   failed  
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait DeploymentCommand extends js.Object {
    /**
      * The arguments of those commands that take arguments. It should be set to a JSON object with the following format:  {"arg_name1" : ["value1", "value2", ...], "arg_name2" : ["value1", "value2", ...], ...}  The update_dependencies command takes two arguments:    upgrade_os_to - Specifies the desired Amazon Linux version for instances whose OS you want to upgrade, such as Amazon Linux 2016.09. You must also set the allow_reboot argument to true.    allow_reboot - Specifies whether to allow AWS OpsWorks Stacks to reboot the instances if necessary, after installing the updates. This argument can be set to either true or false. The default value is false.   For example, to upgrade an instance to Amazon Linux 2016.09, set Args to the following.   { "upgrade_os_to":["Amazon Linux 2016.09"], "allow_reboot":["true"] }  
      */
    var Args: js.UndefOr[DeploymentCommandArgs] = js.undefined
    /**
      * Specifies the operation. You can specify only one command. For stacks, the following commands are available:    execute_recipes: Execute one or more recipes. To specify the recipes, set an Args parameter named recipes to the list of recipes to be executed. For example, to execute phpapp::appsetup, set Args to {"recipes":["phpapp::appsetup"]}.    install_dependencies: Install the stack's dependencies.    update_custom_cookbooks: Update the stack's custom cookbooks.    update_dependencies: Update the stack's dependencies.    The update_dependencies and install_dependencies commands are supported only for Linux instances. You can run the commands successfully on Windows instances, but they do nothing.  For apps, the following commands are available:    deploy: Deploy an app. Ruby on Rails apps have an optional Args parameter named migrate. Set Args to {"migrate":["true"]} to migrate the database. The default setting is {"migrate":["false"]}.    rollback Roll the app back to the previous version. When you update an app, AWS OpsWorks Stacks stores the previous version, up to a maximum of five versions. You can use this command to roll an app back as many as four versions.    start: Start the app's web or application server.    stop: Stop the app's web or application server.    restart: Restart the app's web or application server.    undeploy: Undeploy the app.  
      */
    var Name: DeploymentCommandName
  }
  
  trait DeploymentCommandArgs
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Strings]
  
  trait DeregisterEcsClusterRequest extends js.Object {
    /**
      * The cluster's Amazon Resource Number (ARN).
      */
    var EcsClusterArn: String
  }
  
  trait DeregisterElasticIpRequest extends js.Object {
    /**
      * The Elastic IP address.
      */
    var ElasticIp: String
  }
  
  trait DeregisterInstanceRequest extends js.Object {
    /**
      * The instance ID.
      */
    var InstanceId: String
  }
  
  trait DeregisterRdsDbInstanceRequest extends js.Object {
    /**
      * The Amazon RDS instance's ARN.
      */
    var RdsDbInstanceArn: String
  }
  
  trait DeregisterVolumeRequest extends js.Object {
    /**
      * The AWS OpsWorks Stacks volume ID, which is the GUID that AWS OpsWorks Stacks assigned to the instance when you registered the volume with the stack, not the Amazon EC2 volume ID.
      */
    var VolumeId: String
  }
  
  trait DescribeAgentVersionsRequest extends js.Object {
    /**
      * The configuration manager.
      */
    var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeAgentVersionsResult extends js.Object {
    /**
      * The agent versions for the specified stack or configuration manager. Note that this value is the complete version number, not the abbreviated number used by the console.
      */
    var AgentVersions: js.UndefOr[AgentVersions] = js.undefined
  }
  
  trait DescribeAppsRequest extends js.Object {
    /**
      * An array of app IDs for the apps to be described. If you use this parameter, DescribeApps returns a description of the specified apps. Otherwise, it returns a description of every app.
      */
    var AppIds: js.UndefOr[Strings] = js.undefined
    /**
      * The app stack ID. If you use this parameter, DescribeApps returns a description of the apps in the specified stack.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeAppsResult extends js.Object {
    /**
      * An array of App objects that describe the specified apps. 
      */
    var Apps: js.UndefOr[Apps] = js.undefined
  }
  
  trait DescribeCommandsRequest extends js.Object {
    /**
      * An array of command IDs. If you include this parameter, DescribeCommands returns a description of the specified commands. Otherwise, it returns a description of every command.
      */
    var CommandIds: js.UndefOr[Strings] = js.undefined
    /**
      * The deployment ID. If you include this parameter, DescribeCommands returns a description of the commands associated with the specified deployment.
      */
    var DeploymentId: js.UndefOr[String] = js.undefined
    /**
      * The instance ID. If you include this parameter, DescribeCommands returns a description of the commands associated with the specified instance.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeCommandsResult extends js.Object {
    /**
      * An array of Command objects that describe each of the specified commands.
      */
    var Commands: js.UndefOr[Commands] = js.undefined
  }
  
  trait DescribeDeploymentsRequest extends js.Object {
    /**
      * The app ID. If you include this parameter, the command returns a description of the commands associated with the specified app.
      */
    var AppId: js.UndefOr[String] = js.undefined
    /**
      * An array of deployment IDs to be described. If you include this parameter, the command returns a description of the specified deployments. Otherwise, it returns a description of every deployment.
      */
    var DeploymentIds: js.UndefOr[Strings] = js.undefined
    /**
      * The stack ID. If you include this parameter, the command returns a description of the commands associated with the specified stack.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeDeploymentsResult extends js.Object {
    /**
      * An array of Deployment objects that describe the deployments.
      */
    var Deployments: js.UndefOr[Deployments] = js.undefined
  }
  
  trait DescribeEcsClustersRequest extends js.Object {
    /**
      * A list of ARNs, one for each cluster to be described.
      */
    var EcsClusterArns: js.UndefOr[Strings] = js.undefined
    /**
      * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
      */
    var MaxResults: js.UndefOr[Integer] = js.undefined
    /**
      * If the previous paginated request did not return all of the remaining results, the response object'sNextToken parameter value is set to a token. To retrieve the next set of results, call DescribeEcsClusters again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * A stack ID. DescribeEcsClusters returns a description of the cluster that is registered with the stack.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeEcsClustersResult extends js.Object {
    /**
      * A list of EcsCluster objects containing the cluster descriptions.
      */
    var EcsClusters: js.UndefOr[EcsClusters] = js.undefined
    /**
      * If a paginated request does not return all of the remaining results, this parameter is set to a token that you can assign to the request object's NextToken parameter to retrieve the next set of results. If the previous paginated request returned all of the remaining results, this parameter is set to null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeElasticIpsRequest extends js.Object {
    /**
      * The instance ID. If you include this parameter, DescribeElasticIps returns a description of the Elastic IP addresses associated with the specified instance.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
    /**
      * An array of Elastic IP addresses to be described. If you include this parameter, DescribeElasticIps returns a description of the specified Elastic IP addresses. Otherwise, it returns a description of every Elastic IP address.
      */
    var Ips: js.UndefOr[Strings] = js.undefined
    /**
      * A stack ID. If you include this parameter, DescribeElasticIps returns a description of the Elastic IP addresses that are registered with the specified stack.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeElasticIpsResult extends js.Object {
    /**
      * An ElasticIps object that describes the specified Elastic IP addresses.
      */
    var ElasticIps: js.UndefOr[ElasticIps] = js.undefined
  }
  
  trait DescribeElasticLoadBalancersRequest extends js.Object {
    /**
      * A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
      */
    var LayerIds: js.UndefOr[Strings] = js.undefined
    /**
      * A stack ID. The action describes the stack's Elastic Load Balancing instances.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeElasticLoadBalancersResult extends js.Object {
    /**
      * A list of ElasticLoadBalancer objects that describe the specified Elastic Load Balancing instances.
      */
    var ElasticLoadBalancers: js.UndefOr[ElasticLoadBalancers] = js.undefined
  }
  
  trait DescribeInstancesRequest extends js.Object {
    /**
      * An array of instance IDs to be described. If you use this parameter, DescribeInstances returns a description of the specified instances. Otherwise, it returns a description of every instance.
      */
    var InstanceIds: js.UndefOr[Strings] = js.undefined
    /**
      * A layer ID. If you use this parameter, DescribeInstances returns descriptions of the instances associated with the specified layer.
      */
    var LayerId: js.UndefOr[String] = js.undefined
    /**
      * A stack ID. If you use this parameter, DescribeInstances returns descriptions of the instances associated with the specified stack.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeInstancesResult extends js.Object {
    /**
      * An array of Instance objects that describe the instances.
      */
    var Instances: js.UndefOr[Instances] = js.undefined
  }
  
  trait DescribeLayersRequest extends js.Object {
    /**
      * An array of layer IDs that specify the layers to be described. If you omit this parameter, DescribeLayers returns a description of every layer in the specified stack.
      */
    var LayerIds: js.UndefOr[Strings] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeLayersResult extends js.Object {
    /**
      * An array of Layer objects that describe the layers.
      */
    var Layers: js.UndefOr[Layers] = js.undefined
  }
  
  trait DescribeLoadBasedAutoScalingRequest extends js.Object {
    /**
      * An array of layer IDs.
      */
    var LayerIds: Strings
  }
  
  trait DescribeLoadBasedAutoScalingResult extends js.Object {
    /**
      * An array of LoadBasedAutoScalingConfiguration objects that describe each layer's configuration.
      */
    var LoadBasedAutoScalingConfigurations: js.UndefOr[LoadBasedAutoScalingConfigurations] = js.undefined
  }
  
  trait DescribeMyUserProfileResult extends js.Object {
    /**
      * A UserProfile object that describes the user's SSH information.
      */
    var UserProfile: js.UndefOr[SelfUserProfile] = js.undefined
  }
  
  trait DescribeOperatingSystemsResponse extends js.Object {
    /**
      * Contains information in response to a DescribeOperatingSystems request.
      */
    var OperatingSystems: js.UndefOr[OperatingSystems] = js.undefined
  }
  
  trait DescribePermissionsRequest extends js.Object {
    /**
      * The user's IAM ARN. This can also be a federated user's ARN. For more information about IAM ARNs, see Using Identifiers.
      */
    var IamUserArn: js.UndefOr[String] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribePermissionsResult extends js.Object {
    /**
      * An array of Permission objects that describe the stack permissions.   If the request object contains only a stack ID, the array contains a Permission object with permissions for each of the stack IAM ARNs.   If the request object contains only an IAM ARN, the array contains a Permission object with permissions for each of the user's stack IDs.   If the request contains a stack ID and an IAM ARN, the array contains a single Permission object with permissions for the specified stack and IAM ARN.  
      */
    var Permissions: js.UndefOr[Permissions] = js.undefined
  }
  
  trait DescribeRaidArraysRequest extends js.Object {
    /**
      * The instance ID. If you use this parameter, DescribeRaidArrays returns descriptions of the RAID arrays associated with the specified instance. 
      */
    var InstanceId: js.UndefOr[String] = js.undefined
    /**
      * An array of RAID array IDs. If you use this parameter, DescribeRaidArrays returns descriptions of the specified arrays. Otherwise, it returns a description of every array.
      */
    var RaidArrayIds: js.UndefOr[Strings] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeRaidArraysResult extends js.Object {
    /**
      * A RaidArrays object that describes the specified RAID arrays.
      */
    var RaidArrays: js.UndefOr[RaidArrays] = js.undefined
  }
  
  trait DescribeRdsDbInstancesRequest extends js.Object {
    /**
      * An array containing the ARNs of the instances to be described.
      */
    var RdsDbInstanceArns: js.UndefOr[Strings] = js.undefined
    /**
      * The ID of the stack with which the instances are registered. The operation returns descriptions of all registered Amazon RDS instances.
      */
    var StackId: String
  }
  
  trait DescribeRdsDbInstancesResult extends js.Object {
    /**
      * An a array of RdsDbInstance objects that describe the instances.
      */
    var RdsDbInstances: js.UndefOr[RdsDbInstances] = js.undefined
  }
  
  trait DescribeServiceErrorsRequest extends js.Object {
    /**
      * The instance ID. If you use this parameter, DescribeServiceErrors returns descriptions of the errors associated with the specified instance.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
    /**
      * An array of service error IDs. If you use this parameter, DescribeServiceErrors returns descriptions of the specified errors. Otherwise, it returns a description of every error.
      */
    var ServiceErrorIds: js.UndefOr[Strings] = js.undefined
    /**
      * The stack ID. If you use this parameter, DescribeServiceErrors returns descriptions of the errors associated with the specified stack.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeServiceErrorsResult extends js.Object {
    /**
      * An array of ServiceError objects that describe the specified service errors.
      */
    var ServiceErrors: js.UndefOr[ServiceErrors] = js.undefined
  }
  
  trait DescribeStackProvisioningParametersRequest extends js.Object {
    /**
      * The stack ID.
      */
    var StackId: String
  }
  
  trait DescribeStackProvisioningParametersResult extends js.Object {
    /**
      * The AWS OpsWorks Stacks agent installer's URL.
      */
    var AgentInstallerUrl: js.UndefOr[String] = js.undefined
    /**
      * An embedded object that contains the provisioning parameters.
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
  }
  
  trait DescribeStackSummaryRequest extends js.Object {
    /**
      * The stack ID.
      */
    var StackId: String
  }
  
  trait DescribeStackSummaryResult extends js.Object {
    /**
      * A StackSummary object that contains the results.
      */
    var StackSummary: js.UndefOr[StackSummary] = js.undefined
  }
  
  trait DescribeStacksRequest extends js.Object {
    /**
      * An array of stack IDs that specify the stacks to be described. If you omit this parameter, DescribeStacks returns a description of every stack.
      */
    var StackIds: js.UndefOr[Strings] = js.undefined
  }
  
  trait DescribeStacksResult extends js.Object {
    /**
      * An array of Stack objects that describe the stacks.
      */
    var Stacks: js.UndefOr[Stacks] = js.undefined
  }
  
  trait DescribeTimeBasedAutoScalingRequest extends js.Object {
    /**
      * An array of instance IDs.
      */
    var InstanceIds: Strings
  }
  
  trait DescribeTimeBasedAutoScalingResult extends js.Object {
    /**
      * An array of TimeBasedAutoScalingConfiguration objects that describe the configuration for the specified instances.
      */
    var TimeBasedAutoScalingConfigurations: js.UndefOr[TimeBasedAutoScalingConfigurations] = js.undefined
  }
  
  trait DescribeUserProfilesRequest extends js.Object {
    /**
      * An array of IAM or federated user ARNs that identify the users to be described.
      */
    var IamUserArns: js.UndefOr[Strings] = js.undefined
  }
  
  trait DescribeUserProfilesResult extends js.Object {
    /**
      * A Users object that describes the specified users.
      */
    var UserProfiles: js.UndefOr[UserProfiles] = js.undefined
  }
  
  trait DescribeVolumesRequest extends js.Object {
    /**
      * The instance ID. If you use this parameter, DescribeVolumes returns descriptions of the volumes associated with the specified instance.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
    /**
      * The RAID array ID. If you use this parameter, DescribeVolumes returns descriptions of the volumes associated with the specified RAID array.
      */
    var RaidArrayId: js.UndefOr[String] = js.undefined
    /**
      * A stack ID. The action describes the stack's registered Amazon EBS volumes.
      */
    var StackId: js.UndefOr[String] = js.undefined
    /**
      * Am array of volume IDs. If you use this parameter, DescribeVolumes returns descriptions of the specified volumes. Otherwise, it returns a description of every volume.
      */
    var VolumeIds: js.UndefOr[Strings] = js.undefined
  }
  
  trait DescribeVolumesResult extends js.Object {
    /**
      * An array of volume IDs.
      */
    var Volumes: js.UndefOr[Volumes] = js.undefined
  }
  
  trait DetachElasticLoadBalancerRequest extends js.Object {
    /**
      * The Elastic Load Balancing instance's name.
      */
    var ElasticLoadBalancerName: String
    /**
      * The ID of the layer that the Elastic Load Balancing instance is attached to.
      */
    var LayerId: String
  }
  
  trait DisassociateElasticIpRequest extends js.Object {
    /**
      * The Elastic IP address.
      */
    var ElasticIp: String
  }
  
  trait EbsBlockDevice extends js.Object {
    /**
      * Whether the volume is deleted on instance termination.
      */
    var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
    /**
      * The number of I/O operations per second (IOPS) that the volume supports. For more information, see EbsBlockDevice.
      */
    var Iops: js.UndefOr[Integer] = js.undefined
    /**
      * The snapshot ID.
      */
    var SnapshotId: js.UndefOr[String] = js.undefined
    /**
      * The volume size, in GiB. For more information, see EbsBlockDevice.
      */
    var VolumeSize: js.UndefOr[Integer] = js.undefined
    /**
      * The volume type. gp2 for General Purpose (SSD) volumes, io1 for Provisioned IOPS (SSD) volumes, st1 for Throughput Optimized hard disk drives (HDD), sc1 for Cold HDD,and standard for Magnetic volumes. If you specify the io1 volume type, you must also specify a value for the Iops attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the default volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
      */
    var VolumeType: js.UndefOr[VolumeType] = js.undefined
  }
  
  trait EcsCluster extends js.Object {
    /**
      * The cluster's ARN.
      */
    var EcsClusterArn: js.UndefOr[String] = js.undefined
    /**
      * The cluster name.
      */
    var EcsClusterName: js.UndefOr[String] = js.undefined
    /**
      * The time and date that the cluster was registered with the stack.
      */
    var RegisteredAt: js.UndefOr[DateTime] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait ElasticIp extends js.Object {
    /**
      * The domain.
      */
    var Domain: js.UndefOr[String] = js.undefined
    /**
      * The ID of the instance that the address is attached to.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
    /**
      * The IP address.
      */
    var Ip: js.UndefOr[String] = js.undefined
    /**
      * The name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The AWS region. For more information, see Regions and Endpoints.
      */
    var Region: js.UndefOr[String] = js.undefined
  }
  
  trait ElasticLoadBalancer extends js.Object {
    /**
      * A list of Availability Zones.
      */
    var AvailabilityZones: js.UndefOr[Strings] = js.undefined
    /**
      * The instance's public DNS name.
      */
    var DnsName: js.UndefOr[String] = js.undefined
    /**
      * A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
      */
    var Ec2InstanceIds: js.UndefOr[Strings] = js.undefined
    /**
      * The Elastic Load Balancing instance's name.
      */
    var ElasticLoadBalancerName: js.UndefOr[String] = js.undefined
    /**
      * The ID of the layer that the instance is attached to.
      */
    var LayerId: js.UndefOr[String] = js.undefined
    /**
      * The instance's AWS region.
      */
    var Region: js.UndefOr[String] = js.undefined
    /**
      * The ID of the stack that the instance is associated with.
      */
    var StackId: js.UndefOr[String] = js.undefined
    /**
      * A list of subnet IDs, if the stack is running in a VPC.
      */
    var SubnetIds: js.UndefOr[Strings] = js.undefined
    /**
      * The VPC ID.
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  trait EnvironmentVariable extends js.Object {
    /**
      * (Required) The environment variable's name, which can consist of up to 64 characters and must be specified. The name can contain upper- and lowercase letters, numbers, and underscores (_), but it must start with a letter or underscore.
      */
    var Key: String
    /**
      * (Optional) Whether the variable's value will be returned by the DescribeApps action. To conceal an environment variable's value, set Secure to true. DescribeApps then returns *****FILTERED***** instead of the actual value. The default value for Secure is false. 
      */
    var Secure: js.UndefOr[Boolean] = js.undefined
    /**
      * (Optional) The environment variable's value, which can be left empty. If you specify a value, it can contain up to 256 characters, which must all be printable.
      */
    var Value: String
  }
  
  trait GetHostnameSuggestionRequest extends js.Object {
    /**
      * The layer ID.
      */
    var LayerId: String
  }
  
  trait GetHostnameSuggestionResult extends js.Object {
    /**
      * The generated host name.
      */
    var Hostname: js.UndefOr[String] = js.undefined
    /**
      * The layer ID.
      */
    var LayerId: js.UndefOr[String] = js.undefined
  }
  
  trait GrantAccessRequest extends js.Object {
    /**
      * The instance's AWS OpsWorks Stacks ID.
      */
    var InstanceId: String
    /**
      * The length of time (in minutes) that the grant is valid. When the grant expires at the end of this period, the user will no longer be able to use the credentials to log in. If the user is logged in at the time, he or she automatically will be logged out.
      */
    var ValidForInMinutes: js.UndefOr[ValidForInMinutes] = js.undefined
  }
  
  trait GrantAccessResult extends js.Object {
    /**
      * A TemporaryCredential object that contains the data needed to log in to the instance by RDP clients, such as the Microsoft Remote Desktop Connection.
      */
    var TemporaryCredential: js.UndefOr[TemporaryCredential] = js.undefined
  }
  
  trait Instance extends js.Object {
    /**
      * The agent version. This parameter is set to INHERIT if the instance inherits the default stack setting or to a a version number for a fixed agent version.
      */
    var AgentVersion: js.UndefOr[String] = js.undefined
    /**
      * A custom AMI ID to be used to create the instance. For more information, see Instances 
      */
    var AmiId: js.UndefOr[String] = js.undefined
    /**
      * The instance architecture: "i386" or "x86_64".
      */
    var Architecture: js.UndefOr[Architecture] = js.undefined
    /**
      * The instance's Amazon Resource Number (ARN).
      */
    var Arn: js.UndefOr[String] = js.undefined
    /**
      * For load-based or time-based instances, the type.
      */
    var AutoScalingType: js.UndefOr[AutoScalingType] = js.undefined
    /**
      * The instance Availability Zone. For more information, see Regions and Endpoints.
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * An array of BlockDeviceMapping objects that specify the instance's block device mappings.
      */
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined
    /**
      * The time that the instance was created.
      */
    var CreatedAt: js.UndefOr[DateTime] = js.undefined
    /**
      * Whether this is an Amazon EBS-optimized instance.
      */
    var EbsOptimized: js.UndefOr[Boolean] = js.undefined
    /**
      * The ID of the associated Amazon EC2 instance.
      */
    var Ec2InstanceId: js.UndefOr[String] = js.undefined
    /**
      * For container instances, the Amazon ECS cluster's ARN.
      */
    var EcsClusterArn: js.UndefOr[String] = js.undefined
    /**
      * For container instances, the instance's ARN.
      */
    var EcsContainerInstanceArn: js.UndefOr[String] = js.undefined
    /**
      * The instance Elastic IP address .
      */
    var ElasticIp: js.UndefOr[String] = js.undefined
    /**
      * The instance host name.
      */
    var Hostname: js.UndefOr[String] = js.undefined
    /**
      * For registered instances, the infrastructure class: ec2 or on-premises.
      */
    var InfrastructureClass: js.UndefOr[String] = js.undefined
    /**
      * Whether to install operating system and package updates when the instance boots. The default value is true. If this value is set to false, you must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
      */
    var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
    /**
      * The instance ID.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
    /**
      * The ARN of the instance's IAM profile. For more information about IAM ARNs, see Using Identifiers.
      */
    var InstanceProfileArn: js.UndefOr[String] = js.undefined
    /**
      * The instance type, such as t2.micro.
      */
    var InstanceType: js.UndefOr[String] = js.undefined
    /**
      * The ID of the last service error. For more information, call DescribeServiceErrors.
      */
    var LastServiceErrorId: js.UndefOr[String] = js.undefined
    /**
      * An array containing the instance layer IDs.
      */
    var LayerIds: js.UndefOr[Strings] = js.undefined
    /**
      * The instance's operating system.
      */
    var Os: js.UndefOr[String] = js.undefined
    /**
      * The instance's platform.
      */
    var Platform: js.UndefOr[String] = js.undefined
    /**
      * The instance's private DNS name.
      */
    var PrivateDns: js.UndefOr[String] = js.undefined
    /**
      * The instance's private IP address.
      */
    var PrivateIp: js.UndefOr[String] = js.undefined
    /**
      * The instance public DNS name.
      */
    var PublicDns: js.UndefOr[String] = js.undefined
    /**
      * The instance public IP address.
      */
    var PublicIp: js.UndefOr[String] = js.undefined
    /**
      * For registered instances, who performed the registration.
      */
    var RegisteredBy: js.UndefOr[String] = js.undefined
    /**
      * The instance's reported AWS OpsWorks Stacks agent version.
      */
    var ReportedAgentVersion: js.UndefOr[String] = js.undefined
    /**
      * For registered instances, the reported operating system.
      */
    var ReportedOs: js.UndefOr[ReportedOs] = js.undefined
    /**
      * The instance's root device type. For more information, see Storage for the Root Device.
      */
    var RootDeviceType: js.UndefOr[RootDeviceType] = js.undefined
    /**
      * The root device volume ID.
      */
    var RootDeviceVolumeId: js.UndefOr[String] = js.undefined
    /**
      * An array containing the instance security group IDs.
      */
    var SecurityGroupIds: js.UndefOr[Strings] = js.undefined
    /**
      * The SSH key's Deep Security Agent (DSA) fingerprint.
      */
    var SshHostDsaKeyFingerprint: js.UndefOr[String] = js.undefined
    /**
      * The SSH key's RSA fingerprint.
      */
    var SshHostRsaKeyFingerprint: js.UndefOr[String] = js.undefined
    /**
      * The instance's Amazon EC2 key-pair name.
      */
    var SshKeyName: js.UndefOr[String] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
    /**
      * The instance status:    booting     connection_lost     online     pending     rebooting     requested     running_setup     setup_failed     shutting_down     start_failed     stop_failed     stopped     stopping     terminated     terminating   
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The instance's subnet ID; applicable only if the stack is running in a VPC.
      */
    var SubnetId: js.UndefOr[String] = js.undefined
    /**
      * The instance's tenancy option, such as dedicated or host.
      */
    var Tenancy: js.UndefOr[String] = js.undefined
    /**
      * The instance's virtualization type: paravirtual or hvm.
      */
    var VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined
  }
  
  trait InstanceIdentity extends js.Object {
    /**
      * A JSON document that contains the metadata.
      */
    var Document: js.UndefOr[String] = js.undefined
    /**
      * A signature that can be used to verify the document's accuracy and authenticity.
      */
    var Signature: js.UndefOr[String] = js.undefined
  }
  
  trait InstancesCount extends js.Object {
    /**
      * The number of instances in the Assigning state.
      */
    var Assigning: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with booting status.
      */
    var Booting: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with connection_lost status.
      */
    var ConnectionLost: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances in the Deregistering state.
      */
    var Deregistering: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with online status.
      */
    var Online: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with pending status.
      */
    var Pending: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with rebooting status.
      */
    var Rebooting: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances in the Registered state.
      */
    var Registered: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances in the Registering state.
      */
    var Registering: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with requested status.
      */
    var Requested: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with running_setup status.
      */
    var RunningSetup: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with setup_failed status.
      */
    var SetupFailed: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with shutting_down status.
      */
    var ShuttingDown: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with start_failed status.
      */
    var StartFailed: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with stop_failed status.
      */
    var StopFailed: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with stopped status.
      */
    var Stopped: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with stopping status.
      */
    var Stopping: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with terminated status.
      */
    var Terminated: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances with terminating status.
      */
    var Terminating: js.UndefOr[Integer] = js.undefined
    /**
      * The number of instances in the Unassigning state.
      */
    var Unassigning: js.UndefOr[Integer] = js.undefined
  }
  
  trait Layer extends js.Object {
    /**
      * The Amazon Resource Number (ARN) of a layer.
      */
    var Arn: js.UndefOr[String] = js.undefined
    /**
      * The layer attributes. For the HaproxyStatsPassword, MysqlRootPassword, and GangliaPassword attributes, AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value For an ECS Cluster layer, AWS OpsWorks Stacks the EcsClusterArn attribute is set to the cluster's ARN.
      */
    var Attributes: js.UndefOr[LayerAttributes] = js.undefined
    /**
      * Whether to automatically assign an Elastic IP address to the layer's instances. For more information, see How to Edit a Layer.
      */
    var AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined
    /**
      * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's instances. For more information, see How to Edit a Layer.
      */
    var AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon CloudWatch Logs configuration settings for the layer.
      */
    var CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration] = js.undefined
    /**
      * Date when the layer was created.
      */
    var CreatedAt: js.UndefOr[DateTime] = js.undefined
    /**
      * The ARN of the default IAM profile to be used for the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
      */
    var CustomInstanceProfileArn: js.UndefOr[String] = js.undefined
    /**
      * A JSON formatted string containing the layer's custom stack configuration and deployment attributes.
      */
    var CustomJson: js.UndefOr[String] = js.undefined
    /**
      * A LayerCustomRecipes object that specifies the layer's custom recipes.
      */
    var CustomRecipes: js.UndefOr[Recipes] = js.undefined
    /**
      * An array containing the layer's custom security group IDs.
      */
    var CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined
    var DefaultRecipes: js.UndefOr[Recipes] = js.undefined
    /**
      * An array containing the layer's security group names.
      */
    var DefaultSecurityGroupNames: js.UndefOr[Strings] = js.undefined
    /**
      * Whether auto healing is disabled for the layer.
      */
    var EnableAutoHealing: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether to install operating system and package updates when the instance boots. The default value is true. If this value is set to false, you must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
      */
    var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
    /**
      * The layer ID.
      */
    var LayerId: js.UndefOr[String] = js.undefined
    /**
      * A LifeCycleEventConfiguration object that specifies the Shutdown event configuration.
      */
    var LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined
    /**
      * The layer name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * An array of Package objects that describe the layer's packages.
      */
    var Packages: js.UndefOr[Strings] = js.undefined
    /**
      * The layer short name.
      */
    var Shortname: js.UndefOr[String] = js.undefined
    /**
      * The layer stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
    /**
      * The layer type.
      */
    var Type: js.UndefOr[LayerType] = js.undefined
    /**
      * Whether the layer uses Amazon EBS-optimized instances.
      */
    var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined
    /**
      * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
      */
    var VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined
  }
  
  trait LayerAttributes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait LifecycleEventConfiguration extends js.Object {
    /**
      * A ShutdownEventConfiguration object that specifies the Shutdown event configuration.
      */
    var Shutdown: js.UndefOr[ShutdownEventConfiguration] = js.undefined
  }
  
  trait ListTagsRequest extends js.Object {
    /**
      * Do not use. A validation exception occurs if you add a MaxResults parameter to a ListTagsRequest call. 
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * Do not use. A validation exception occurs if you add a NextToken parameter to a ListTagsRequest call. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The stack or layer's Amazon Resource Number (ARN).
      */
    var ResourceArn: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.ResourceArn
  }
  
  trait ListTagsResult extends js.Object {
    /**
      * If a paginated request does not return all of the remaining results, this parameter is set to a token that you can assign to the request object's NextToken parameter to get the next set of results. If the previous paginated request returned all of the remaining results, this parameter is set to null. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A set of key-value pairs that contain tag keys and tag values that are attached to a stack or layer.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait LoadBasedAutoScalingConfiguration extends js.Object {
    /**
      * An AutoScalingThresholds object that describes the downscaling configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
      */
    var DownScaling: js.UndefOr[AutoScalingThresholds] = js.undefined
    /**
      * Whether load-based auto scaling is enabled for the layer.
      */
    var Enable: js.UndefOr[Boolean] = js.undefined
    /**
      * The layer ID.
      */
    var LayerId: js.UndefOr[String] = js.undefined
    /**
      * An AutoScalingThresholds object that describes the upscaling configuration, which defines how and when AWS OpsWorks Stacks increases the number of instances.
      */
    var UpScaling: js.UndefOr[AutoScalingThresholds] = js.undefined
  }
  
  trait OperatingSystem extends js.Object {
    /**
      * Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
      */
    var ConfigurationManagers: js.UndefOr[OperatingSystemConfigurationManagers] = js.undefined
    /**
      * The ID of a supported operating system, such as Amazon Linux 2017.09.
      */
    var Id: js.UndefOr[String] = js.undefined
    /**
      * The name of the operating system, such as Amazon Linux 2017.09.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * A short name for the operating system manufacturer.
      */
    var ReportedName: js.UndefOr[String] = js.undefined
    /**
      * The version of the operating system, including the release and edition, if applicable.
      */
    var ReportedVersion: js.UndefOr[String] = js.undefined
    /**
      * Indicates that an operating system is not supported for new instances.
      */
    var Supported: js.UndefOr[Boolean] = js.undefined
    /**
      * The type of a supported operating system, either Linux or Windows.
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  
  trait OperatingSystemConfigurationManager extends js.Object {
    /**
      * The name of the configuration manager, which is Chef.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The versions of the configuration manager that are supported by an operating system.
      */
    var Version: js.UndefOr[String] = js.undefined
  }
  
  trait Parameters
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait Permission extends js.Object {
    /**
      * Whether the user can use SSH.
      */
    var AllowSsh: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the user can use sudo.
      */
    var AllowSudo: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for an AWS Identity and Access Management (IAM) role. For more information about IAM ARNs, see Using Identifiers.
      */
    var IamUserArn: js.UndefOr[String] = js.undefined
    /**
      * The user's permission level, which must be the following:    deny     show     deploy     manage     iam_only    For more information on the permissions associated with these levels, see Managing User Permissions 
      */
    var Level: js.UndefOr[String] = js.undefined
    /**
      * A stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait RaidArray extends js.Object {
    /**
      * The array's Availability Zone. For more information, see Regions and Endpoints.
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * When the RAID array was created.
      */
    var CreatedAt: js.UndefOr[DateTime] = js.undefined
    /**
      * The array's Linux device. For example /dev/mdadm0.
      */
    var Device: js.UndefOr[String] = js.undefined
    /**
      * The instance ID.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
    /**
      * For PIOPS volumes, the IOPS per disk.
      */
    var Iops: js.UndefOr[Integer] = js.undefined
    /**
      * The array's mount point.
      */
    var MountPoint: js.UndefOr[String] = js.undefined
    /**
      * The array name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The number of disks in the array.
      */
    var NumberOfDisks: js.UndefOr[Integer] = js.undefined
    /**
      * The array ID.
      */
    var RaidArrayId: js.UndefOr[String] = js.undefined
    /**
      * The RAID level.
      */
    var RaidLevel: js.UndefOr[Integer] = js.undefined
    /**
      * The array's size.
      */
    var Size: js.UndefOr[Integer] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
    /**
      * The volume type, standard or PIOPS.
      */
    var VolumeType: js.UndefOr[String] = js.undefined
  }
  
  trait RdsDbInstance extends js.Object {
    /**
      * The instance's address.
      */
    var Address: js.UndefOr[String] = js.undefined
    /**
      * The DB instance identifier.
      */
    var DbInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value.
      */
    var DbPassword: js.UndefOr[String] = js.undefined
    /**
      * The master user name.
      */
    var DbUser: js.UndefOr[String] = js.undefined
    /**
      * The instance's database engine.
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * Set to true if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS OpsWorks Stacks attempts to discover the instance only once. If this value is set to true, you must deregister the instance, and then register it again.
      */
    var MissingOnRds: js.UndefOr[Boolean] = js.undefined
    /**
      * The instance's ARN.
      */
    var RdsDbInstanceArn: js.UndefOr[String] = js.undefined
    /**
      * The instance's AWS region.
      */
    var Region: js.UndefOr[String] = js.undefined
    /**
      * The ID of the stack with which the instance is registered.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait RebootInstanceRequest extends js.Object {
    /**
      * The instance ID.
      */
    var InstanceId: String
  }
  
  trait Recipes extends js.Object {
    /**
      * An array of custom recipe names to be run following a configure event.
      */
    var Configure: js.UndefOr[Strings] = js.undefined
    /**
      * An array of custom recipe names to be run following a deploy event.
      */
    var Deploy: js.UndefOr[Strings] = js.undefined
    /**
      * An array of custom recipe names to be run following a setup event.
      */
    var Setup: js.UndefOr[Strings] = js.undefined
    /**
      * An array of custom recipe names to be run following a shutdown event.
      */
    var Shutdown: js.UndefOr[Strings] = js.undefined
    /**
      * An array of custom recipe names to be run following a undeploy event.
      */
    var Undeploy: js.UndefOr[Strings] = js.undefined
  }
  
  trait RegisterEcsClusterRequest extends js.Object {
    /**
      * The cluster's ARN.
      */
    var EcsClusterArn: String
    /**
      * The stack ID.
      */
    var StackId: String
  }
  
  trait RegisterEcsClusterResult extends js.Object {
    /**
      * The cluster's ARN.
      */
    var EcsClusterArn: js.UndefOr[String] = js.undefined
  }
  
  trait RegisterElasticIpRequest extends js.Object {
    /**
      * The Elastic IP address.
      */
    var ElasticIp: String
    /**
      * The stack ID.
      */
    var StackId: String
  }
  
  trait RegisterElasticIpResult extends js.Object {
    /**
      * The Elastic IP address.
      */
    var ElasticIp: js.UndefOr[String] = js.undefined
  }
  
  trait RegisterInstanceRequest extends js.Object {
    /**
      * The instance's hostname.
      */
    var Hostname: js.UndefOr[String] = js.undefined
    /**
      * An InstanceIdentity object that contains the instance's identity.
      */
    var InstanceIdentity: js.UndefOr[InstanceIdentity] = js.undefined
    /**
      * The instance's private IP address.
      */
    var PrivateIp: js.UndefOr[String] = js.undefined
    /**
      * The instance's public IP address.
      */
    var PublicIp: js.UndefOr[String] = js.undefined
    /**
      * The instances public RSA key. This key is used to encrypt communication between the instance and the service.
      */
    var RsaPublicKey: js.UndefOr[String] = js.undefined
    /**
      * The instances public RSA key fingerprint.
      */
    var RsaPublicKeyFingerprint: js.UndefOr[String] = js.undefined
    /**
      * The ID of the stack that the instance is to be registered with.
      */
    var StackId: String
  }
  
  trait RegisterInstanceResult extends js.Object {
    /**
      * The registered instance's AWS OpsWorks Stacks ID.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
  }
  
  trait RegisterRdsDbInstanceRequest extends js.Object {
    /**
      * The database password.
      */
    var DbPassword: String
    /**
      * The database's master user name.
      */
    var DbUser: String
    /**
      * The Amazon RDS instance's ARN.
      */
    var RdsDbInstanceArn: String
    /**
      * The stack ID.
      */
    var StackId: String
  }
  
  trait RegisterVolumeRequest extends js.Object {
    /**
      * The Amazon EBS volume ID.
      */
    var Ec2VolumeId: js.UndefOr[String] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: String
  }
  
  trait RegisterVolumeResult extends js.Object {
    /**
      * The volume ID.
      */
    var VolumeId: js.UndefOr[String] = js.undefined
  }
  
  trait ReportedOs extends js.Object {
    /**
      * The operating system family.
      */
    var Family: js.UndefOr[String] = js.undefined
    /**
      * The operating system name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The operating system version.
      */
    var Version: js.UndefOr[String] = js.undefined
  }
  
  trait SelfUserProfile extends js.Object {
    /**
      * The user's IAM ARN.
      */
    var IamUserArn: js.UndefOr[String] = js.undefined
    /**
      * The user's name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The user's SSH public key.
      */
    var SshPublicKey: js.UndefOr[String] = js.undefined
    /**
      * The user's SSH user name.
      */
    var SshUsername: js.UndefOr[String] = js.undefined
  }
  
  trait ServiceError extends js.Object {
    /**
      * When the error occurred.
      */
    var CreatedAt: js.UndefOr[DateTime] = js.undefined
    /**
      * The instance ID.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
    /**
      * A message that describes the error.
      */
    var Message: js.UndefOr[String] = js.undefined
    /**
      * The error ID.
      */
    var ServiceErrorId: js.UndefOr[String] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
    /**
      * The error type.
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  
  trait SetLoadBasedAutoScalingRequest extends js.Object {
    /**
      * An AutoScalingThresholds object with the downscaling threshold configuration. If the load falls below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number of instances.
      */
    var DownScaling: js.UndefOr[AutoScalingThresholds] = js.undefined
    /**
      * Enables load-based auto scaling for the layer.
      */
    var Enable: js.UndefOr[Boolean] = js.undefined
    /**
      * The layer ID.
      */
    var LayerId: String
    /**
      * An AutoScalingThresholds object with the upscaling threshold configuration. If the load exceeds these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of instances.
      */
    var UpScaling: js.UndefOr[AutoScalingThresholds] = js.undefined
  }
  
  trait SetPermissionRequest extends js.Object {
    /**
      * The user is allowed to use SSH to communicate with the instance.
      */
    var AllowSsh: js.UndefOr[Boolean] = js.undefined
    /**
      * The user is allowed to use sudo to elevate privileges.
      */
    var AllowSudo: js.UndefOr[Boolean] = js.undefined
    /**
      * The user's IAM ARN. This can also be a federated user's ARN.
      */
    var IamUserArn: String
    /**
      * The user's permission level, which must be set to one of the following strings. You cannot set your own permissions level.    deny     show     deploy     manage     iam_only    For more information about the permissions associated with these levels, see Managing User Permissions.
      */
    var Level: js.UndefOr[String] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: String
  }
  
  trait SetTimeBasedAutoScalingRequest extends js.Object {
    /**
      * An AutoScalingSchedule with the instance schedule.
      */
    var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.undefined
    /**
      * The instance ID.
      */
    var InstanceId: String
  }
  
  trait ShutdownEventConfiguration extends js.Object {
    /**
      * Whether to enable Elastic Load Balancing connection draining. For more information, see Connection Draining 
      */
    var DelayUntilElbConnectionsDrained: js.UndefOr[Boolean] = js.undefined
    /**
      * The time, in seconds, that AWS OpsWorks Stacks will wait after triggering a Shutdown event before shutting down an instance.
      */
    var ExecutionTimeout: js.UndefOr[Integer] = js.undefined
  }
  
  trait Source extends js.Object {
    /**
      * When included in a request, the parameter depends on the repository type.   For Amazon S3 bundles, set Password to the appropriate IAM secret access key.   For HTTP bundles and Subversion repositories, set Password to the password.   For more information on how to safely handle IAM credentials, see http://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html. In responses, AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value.
      */
    var Password: js.UndefOr[String] = js.undefined
    /**
      * The application's version. AWS OpsWorks Stacks enables you to easily deploy new versions of an application. One of the simplest approaches is to have branches or revisions in your repository that represent different versions that can potentially be deployed.
      */
    var Revision: js.UndefOr[String] = js.undefined
    /**
      * In requests, the repository's SSH key. In responses, AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value.
      */
    var SshKey: js.UndefOr[String] = js.undefined
    /**
      * The repository type.
      */
    var Type: js.UndefOr[SourceType] = js.undefined
    /**
      * The source URL. The following is an example of an Amazon S3 source URL: https://s3.amazonaws.com/opsworks-demo-bucket/opsworks_cookbook_demo.tar.gz.
      */
    var Url: js.UndefOr[String] = js.undefined
    /**
      * This parameter depends on the repository type.   For Amazon S3 bundles, set Username to the appropriate IAM access key ID.   For HTTP bundles, Git repositories, and Subversion repositories, set Username to the user name.  
      */
    var Username: js.UndefOr[String] = js.undefined
  }
  
  trait SslConfiguration extends js.Object {
    /**
      * The contents of the certificate's domain.crt file.
      */
    var Certificate: String
    /**
      * Optional. Can be used to specify an intermediate certificate authority key or client authentication.
      */
    var Chain: js.UndefOr[String] = js.undefined
    /**
      * The private key; the contents of the certificate's domain.kex file.
      */
    var PrivateKey: String
  }
  
  trait Stack extends js.Object {
    /**
      * The agent version. This parameter is set to LATEST for auto-update. or a version number for a fixed agent version.
      */
    var AgentVersion: js.UndefOr[String] = js.undefined
    /**
      * The stack's ARN.
      */
    var Arn: js.UndefOr[String] = js.undefined
    /**
      * The stack's attributes.
      */
    var Attributes: js.UndefOr[StackAttributes] = js.undefined
    /**
      * A ChefConfiguration object that specifies whether to enable Berkshelf and the Berkshelf version. For more information, see Create a New Stack.
      */
    var ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined
    /**
      * The configuration manager.
      */
    var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
    /**
      * The date when the stack was created.
      */
    var CreatedAt: js.UndefOr[DateTime] = js.undefined
    var CustomCookbooksSource: js.UndefOr[Source] = js.undefined
    /**
      * A JSON object that contains user-defined attributes to be added to the stack configuration and deployment attributes. You can use custom JSON to override the corresponding default stack configuration attribute values or to pass data to recipes. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information on custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes.
      */
    var CustomJson: js.UndefOr[String] = js.undefined
    /**
      * The stack's default Availability Zone. For more information, see Regions and Endpoints.
      */
    var DefaultAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
      */
    var DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined
    /**
      * The stack's default operating system.
      */
    var DefaultOs: js.UndefOr[String] = js.undefined
    /**
      * The default root device type. This value is used by default for all instances in the stack, but you can override it when you create an instance. For more information, see Storage for the Root Device.
      */
    var DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined
    /**
      * A default Amazon EC2 key pair for the stack's instances. You can override this value when you create or update an instance.
      */
    var DefaultSshKeyName: js.UndefOr[String] = js.undefined
    /**
      * The default subnet ID; applicable only if the stack is running in a VPC.
      */
    var DefaultSubnetId: js.UndefOr[String] = js.undefined
    /**
      * The stack host name theme, with spaces replaced by underscores.
      */
    var HostnameTheme: js.UndefOr[String] = js.undefined
    /**
      * The stack name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see Regions and Endpoints.
      */
    var Region: js.UndefOr[String] = js.undefined
    /**
      * The stack AWS Identity and Access Management (IAM) role.
      */
    var ServiceRoleArn: js.UndefOr[String] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
    /**
      * Whether the stack uses custom cookbooks.
      */
    var UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the stack automatically associates the AWS OpsWorks Stacks built-in security groups with the stack's layers.
      */
    var UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined
    /**
      * The VPC ID; applicable only if the stack is running in a VPC.
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  trait StackAttributes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait StackConfigurationManager extends js.Object {
    /**
      * The name. This parameter must be set to "Chef".
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The Chef version. This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows stacks. The default value for Linux stacks is 11.4.
      */
    var Version: js.UndefOr[String] = js.undefined
  }
  
  trait StackSummary extends js.Object {
    /**
      * The number of apps.
      */
    var AppsCount: js.UndefOr[Integer] = js.undefined
    /**
      * The stack's ARN.
      */
    var Arn: js.UndefOr[String] = js.undefined
    /**
      * An InstancesCount object with the number of instances in each status.
      */
    var InstancesCount: js.UndefOr[InstancesCount] = js.undefined
    /**
      * The number of layers.
      */
    var LayersCount: js.UndefOr[Integer] = js.undefined
    /**
      * The stack name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: js.UndefOr[String] = js.undefined
  }
  
  trait StartInstanceRequest extends js.Object {
    /**
      * The instance ID.
      */
    var InstanceId: String
  }
  
  trait StartStackRequest extends js.Object {
    /**
      * The stack ID.
      */
    var StackId: String
  }
  
  trait StopInstanceRequest extends js.Object {
    /**
      * Specifies whether to force an instance to stop.
      */
    var Force: js.UndefOr[Boolean] = js.undefined
    /**
      * The instance ID.
      */
    var InstanceId: String
  }
  
  trait StopStackRequest extends js.Object {
    /**
      * The stack ID.
      */
    var StackId: String
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The stack or layer's Amazon Resource Number (ARN).
      */
    var ResourceArn: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.ResourceArn
    /**
      * A map that contains tag keys and tag values that are attached to a stack or layer.   The key cannot be empty.   The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : /    The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : /    Leading and trailing white spaces are trimmed from both the key and value.   A maximum of 40 tags is allowed for any resource.  
      */
    var Tags: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.Tags
  }
  
  trait Tags
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValue]
  
  trait TemporaryCredential extends js.Object {
    /**
      * The instance's AWS OpsWorks Stacks ID.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
    /**
      * The password.
      */
    var Password: js.UndefOr[String] = js.undefined
    /**
      * The user name.
      */
    var Username: js.UndefOr[String] = js.undefined
    /**
      * The length of time (in minutes) that the grant is valid. When the grant expires, at the end of this period, the user will no longer be able to use the credentials to log in. If they are logged in at the time, they will be automatically logged out.
      */
    var ValidForInMinutes: js.UndefOr[Integer] = js.undefined
  }
  
  trait TimeBasedAutoScalingConfiguration extends js.Object {
    /**
      * A WeeklyAutoScalingSchedule object with the instance schedule.
      */
    var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.undefined
    /**
      * The instance ID.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Assign a registered instance to a layer.   You can assign registered on-premises instances to any layer type.   You can assign registered Amazon EC2 instances only to custom layers.   You cannot use this action with instances that were created with AWS OpsWorks Stacks.    Required Permissions: To use this action, an AWS Identity and Access Management (IAM) user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def assignInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def assignInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assign a registered instance to a layer.   You can assign registered on-premises instances to any layer type.   You can assign registered Amazon EC2 instances only to custom layers.   You cannot use this action with instances that were created with AWS OpsWorks Stacks.    Required Permissions: To use this action, an AWS Identity and Access Management (IAM) user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def assignInstance(params: AssignInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def assignInstance(
      params: AssignInstanceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be registered with the stack by calling RegisterVolume. After you register the volume, you must call UpdateVolume to specify a mount point before calling AssignVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def assignVolume(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def assignVolume(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be registered with the stack by calling RegisterVolume. After you register the volume, you must call UpdateVolume to specify a mount point before calling AssignVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def assignVolume(params: AssignVolumeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def assignVolume(
      params: AssignVolumeRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first be registered with the stack by calling RegisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def associateElasticIp(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateElasticIp(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first be registered with the stack by calling RegisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def associateElasticIp(params: AssociateElasticIpRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateElasticIp(
      params: AssociateElasticIpRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches an Elastic Load Balancing load balancer to a specified layer. AWS OpsWorks Stacks does not support Application Load Balancer. You can only use Classic Load Balancer with AWS OpsWorks Stacks. For more information, see Elastic Load Balancing.  You must create the Elastic Load Balancing instance separately, by using the Elastic Load Balancing console, API, or CLI. For more information, see  Elastic Load Balancing Developer Guide.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def attachElasticLoadBalancer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachElasticLoadBalancer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches an Elastic Load Balancing load balancer to a specified layer. AWS OpsWorks Stacks does not support Application Load Balancer. You can only use Classic Load Balancer with AWS OpsWorks Stacks. For more information, see Elastic Load Balancing.  You must create the Elastic Load Balancing instance separately, by using the Elastic Load Balancing console, API, or CLI. For more information, see  Elastic Load Balancing Developer Guide.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def attachElasticLoadBalancer(params: AttachElasticLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachElasticLoadBalancer(
      params: AttachElasticLoadBalancerRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a clone of a specified stack. For more information, see Clone a Stack. By default, all parameters are set to the values used by the parent stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def cloneStack(): awsDashSdkLib.libRequestMod.Request[CloneStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cloneStack(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CloneStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CloneStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a clone of a specified stack. For more information, see Clone a Stack. By default, all parameters are set to the values used by the parent stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def cloneStack(params: CloneStackRequest): awsDashSdkLib.libRequestMod.Request[CloneStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cloneStack(
      params: CloneStackRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CloneStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CloneStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an app for a specified stack. For more information, see Creating Apps.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def createApp(): awsDashSdkLib.libRequestMod.Request[CreateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApp(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateAppResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[CreateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an app for a specified stack. For more information, see Creating Apps.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def createApp(params: CreateAppRequest): awsDashSdkLib.libRequestMod.Request[CreateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApp(
      params: CreateAppRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateAppResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[CreateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Runs deployment or stack commands. For more information, see Deploying Apps and Run Stack Commands.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def createDeployment(): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDeployment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeploymentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Runs deployment or stack commands. For more information, see Deploying Apps and Run Stack Commands.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def createDeployment(params: CreateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDeployment(
      params: CreateDeploymentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeploymentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an instance in a specified stack. For more information, see Adding an Instance to a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def createInstance(): awsDashSdkLib.libRequestMod.Request[CreateInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an instance in a specified stack. For more information, see Adding an Instance to a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def createInstance(params: CreateInstanceRequest): awsDashSdkLib.libRequestMod.Request[CreateInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createInstance(
      params: CreateInstanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a layer. For more information, see How to Create a Layer.  You should use CreateLayer for noncustom layer types such as PHP App Server only if the stack does not have an existing layer of that type. A stack can have at most one instance of each noncustom layer; if you attempt to create a second instance, CreateLayer fails. A stack can have an arbitrary number of custom layers, so you can call CreateLayer as many times as you like for that layer type.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def createLayer(): awsDashSdkLib.libRequestMod.Request[CreateLayerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLayer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLayerResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLayerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a layer. For more information, see How to Create a Layer.  You should use CreateLayer for noncustom layer types such as PHP App Server only if the stack does not have an existing layer of that type. A stack can have at most one instance of each noncustom layer; if you attempt to create a second instance, CreateLayer fails. A stack can have an arbitrary number of custom layers, so you can call CreateLayer as many times as you like for that layer type.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def createLayer(params: CreateLayerRequest): awsDashSdkLib.libRequestMod.Request[CreateLayerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLayer(
      params: CreateLayerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLayerResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLayerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new stack. For more information, see Create a New Stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def createStack(): awsDashSdkLib.libRequestMod.Request[CreateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStack(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new stack. For more information, see Create a New Stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def createStack(params: CreateStackRequest): awsDashSdkLib.libRequestMod.Request[CreateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStack(
      params: CreateStackRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def createUserProfile(): awsDashSdkLib.libRequestMod.Request[CreateUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUserProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def createUserProfile(params: CreateUserProfileRequest): awsDashSdkLib.libRequestMod.Request[CreateUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUserProfile(
      params: CreateUserProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified app.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deleteApp(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApp(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified app.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deleteApp(params: DeleteAppRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApp(
      params: DeleteAppRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance before you can delete it. For more information, see Deleting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deleteInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance before you can delete it. For more information, see Deleting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deleteInstance(params: DeleteInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteInstance(
      params: DeleteInstanceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered instances. For more information, see How to Delete a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deleteLayer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLayer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered instances. For more information, see How to Delete a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deleteLayer(params: DeleteLayerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLayer(
      params: DeleteLayerRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered instances. For more information, see Shut Down a Stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deleteStack(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStack(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered instances. For more information, see Shut Down a Stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deleteStack(params: DeleteStackRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStack(
      params: DeleteStackRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def deleteUserProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUserProfile(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def deleteUserProfile(params: DeleteUserProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUserProfile(
      params: DeleteUserProfileRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters a specified Amazon ECS cluster from a stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html.
      */
    def deregisterEcsCluster(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterEcsCluster(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters a specified Amazon ECS cluster from a stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html.
      */
    def deregisterEcsCluster(params: DeregisterEcsClusterRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterEcsCluster(
      params: DeregisterEcsClusterRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deregisterElasticIp(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterElasticIp(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deregisterElasticIp(params: DeregisterElasticIpRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterElasticIp(
      params: DeregisterElasticIpRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deregisterInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deregisterInstance(params: DeregisterInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterInstance(
      params: DeregisterInstanceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deregisterRdsDbInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterRdsDbInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deregisterRdsDbInstance(params: DeregisterRdsDbInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterRdsDbInstance(
      params: DeregisterRdsDbInstanceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deregisterVolume(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterVolume(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def deregisterVolume(params: DeregisterVolumeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterVolume(
      params: DeregisterVolumeRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration manager. DescribeAgentVersions returns a list of available agent versions for the specified stack or configuration manager.
      */
    def describeAgentVersions(): awsDashSdkLib.libRequestMod.Request[DescribeAgentVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAgentVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAgentVersionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAgentVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration manager. DescribeAgentVersions returns a list of available agent versions for the specified stack or configuration manager.
      */
    def describeAgentVersions(params: DescribeAgentVersionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAgentVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAgentVersions(
      params: DescribeAgentVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAgentVersionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAgentVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a description of a specified set of apps.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeApps(): awsDashSdkLib.libRequestMod.Request[DescribeAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeApps(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAppsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a description of a specified set of apps.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeApps(params: DescribeAppsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeApps(
      params: DescribeAppsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAppsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the results of specified commands.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeCommands(): awsDashSdkLib.libRequestMod.Request[DescribeCommandsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCommands(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCommandsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCommandsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the results of specified commands.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeCommands(params: DescribeCommandsRequest): awsDashSdkLib.libRequestMod.Request[DescribeCommandsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCommands(
      params: DescribeCommandsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCommandsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCommandsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a description of a specified set of deployments.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeDeployments(): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDeployments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeploymentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a description of a specified set of deployments.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeDeployments(params: DescribeDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDeployments(
      params: DescribeDeploymentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeploymentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the MaxResults and NextToken parameters to paginate the response. However, AWS OpsWorks Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permission. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
      */
    def describeEcsClusters(): awsDashSdkLib.libRequestMod.Request[DescribeEcsClustersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEcsClusters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEcsClustersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEcsClustersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the MaxResults and NextToken parameters to paginate the response. However, AWS OpsWorks Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permission. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
      */
    def describeEcsClusters(params: DescribeEcsClustersRequest): awsDashSdkLib.libRequestMod.Request[DescribeEcsClustersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEcsClusters(
      params: DescribeEcsClustersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEcsClustersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEcsClustersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes Elastic IP addresses.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeElasticIps(): awsDashSdkLib.libRequestMod.Request[DescribeElasticIpsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeElasticIps(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeElasticIpsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeElasticIpsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes Elastic IP addresses.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeElasticIps(params: DescribeElasticIpsRequest): awsDashSdkLib.libRequestMod.Request[DescribeElasticIpsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeElasticIps(
      params: DescribeElasticIpsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeElasticIpsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeElasticIpsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a stack's Elastic Load Balancing instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeElasticLoadBalancers(): awsDashSdkLib.libRequestMod.Request[DescribeElasticLoadBalancersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeElasticLoadBalancers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeElasticLoadBalancersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeElasticLoadBalancersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a stack's Elastic Load Balancing instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeElasticLoadBalancers(params: DescribeElasticLoadBalancersRequest): awsDashSdkLib.libRequestMod.Request[DescribeElasticLoadBalancersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeElasticLoadBalancers(
      params: DescribeElasticLoadBalancersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeElasticLoadBalancersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeElasticLoadBalancersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a description of a set of instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeInstances(): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a description of a set of instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeInstances(params: DescribeInstancesRequest): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstances(
      params: DescribeInstancesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a description of one or more layers in a specified stack.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeLayers(): awsDashSdkLib.libRequestMod.Request[DescribeLayersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLayers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLayersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLayersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a description of one or more layers in a specified stack.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeLayers(params: DescribeLayersRequest): awsDashSdkLib.libRequestMod.Request[DescribeLayersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLayers(
      params: DescribeLayersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLayersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLayersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes load-based auto scaling configurations for specified layers.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeLoadBasedAutoScaling(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBasedAutoScalingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoadBasedAutoScaling(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBasedAutoScalingResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBasedAutoScalingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes load-based auto scaling configurations for specified layers.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeLoadBasedAutoScaling(params: DescribeLoadBasedAutoScalingRequest): awsDashSdkLib.libRequestMod.Request[DescribeLoadBasedAutoScalingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoadBasedAutoScaling(
      params: DescribeLoadBasedAutoScalingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBasedAutoScalingResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBasedAutoScalingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a user's SSH information.  Required Permissions: To use this action, an IAM user must have self-management enabled or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeMyUserProfile(): awsDashSdkLib.libRequestMod.Request[DescribeMyUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMyUserProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMyUserProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMyUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the operating systems that are supported by AWS OpsWorks Stacks.
      */
    def describeOperatingSystems(): awsDashSdkLib.libRequestMod.Request[DescribeOperatingSystemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeOperatingSystems(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeOperatingSystemsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeOperatingSystemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the permissions for a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def describePermissions(): awsDashSdkLib.libRequestMod.Request[DescribePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePermissions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePermissionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the permissions for a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def describePermissions(params: DescribePermissionsRequest): awsDashSdkLib.libRequestMod.Request[DescribePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePermissions(
      params: DescribePermissionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePermissionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describe an instance's RAID arrays.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeRaidArrays(): awsDashSdkLib.libRequestMod.Request[DescribeRaidArraysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRaidArrays(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRaidArraysResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRaidArraysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describe an instance's RAID arrays.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeRaidArrays(params: DescribeRaidArraysRequest): awsDashSdkLib.libRequestMod.Request[DescribeRaidArraysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRaidArrays(
      params: DescribeRaidArraysRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRaidArraysResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRaidArraysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes Amazon RDS instances.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
      */
    def describeRdsDbInstances(): awsDashSdkLib.libRequestMod.Request[DescribeRdsDbInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRdsDbInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRdsDbInstancesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRdsDbInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes Amazon RDS instances.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
      */
    def describeRdsDbInstances(params: DescribeRdsDbInstancesRequest): awsDashSdkLib.libRequestMod.Request[DescribeRdsDbInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRdsDbInstances(
      params: DescribeRdsDbInstancesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRdsDbInstancesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRdsDbInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes AWS OpsWorks Stacks service errors.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
      */
    def describeServiceErrors(): awsDashSdkLib.libRequestMod.Request[DescribeServiceErrorsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeServiceErrors(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeServiceErrorsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeServiceErrorsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes AWS OpsWorks Stacks service errors.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
      */
    def describeServiceErrors(params: DescribeServiceErrorsRequest): awsDashSdkLib.libRequestMod.Request[DescribeServiceErrorsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeServiceErrors(
      params: DescribeServiceErrorsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeServiceErrorsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeServiceErrorsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a description of a stack's provisioning parameters.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeStackProvisioningParameters(): awsDashSdkLib.libRequestMod.Request[DescribeStackProvisioningParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackProvisioningParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackProvisioningParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackProvisioningParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a description of a stack's provisioning parameters.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeStackProvisioningParameters(params: DescribeStackProvisioningParametersRequest): awsDashSdkLib.libRequestMod.Request[DescribeStackProvisioningParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackProvisioningParameters(
      params: DescribeStackProvisioningParametersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackProvisioningParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackProvisioningParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as running_setup or online.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeStackSummary(): awsDashSdkLib.libRequestMod.Request[DescribeStackSummaryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackSummary(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackSummaryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackSummaryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as running_setup or online.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeStackSummary(params: DescribeStackSummaryRequest): awsDashSdkLib.libRequestMod.Request[DescribeStackSummaryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackSummary(
      params: DescribeStackSummaryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackSummaryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackSummaryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a description of one or more stacks.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeStacks(): awsDashSdkLib.libRequestMod.Request[DescribeStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStacks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a description of one or more stacks.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeStacks(params: DescribeStacksRequest): awsDashSdkLib.libRequestMod.Request[DescribeStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStacks(
      params: DescribeStacksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes time-based auto scaling configurations for specified instances.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeTimeBasedAutoScaling(): awsDashSdkLib.libRequestMod.Request[DescribeTimeBasedAutoScalingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTimeBasedAutoScaling(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTimeBasedAutoScalingResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTimeBasedAutoScalingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes time-based auto scaling configurations for specified instances.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeTimeBasedAutoScaling(params: DescribeTimeBasedAutoScalingRequest): awsDashSdkLib.libRequestMod.Request[DescribeTimeBasedAutoScalingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTimeBasedAutoScaling(
      params: DescribeTimeBasedAutoScalingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTimeBasedAutoScalingResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTimeBasedAutoScalingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describe specified users.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeUserProfiles(): awsDashSdkLib.libRequestMod.Request[DescribeUserProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUserProfiles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserProfilesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describe specified users.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeUserProfiles(params: DescribeUserProfilesRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUserProfiles(
      params: DescribeUserProfilesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserProfilesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an instance's Amazon EBS volumes.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeVolumes(): awsDashSdkLib.libRequestMod.Request[DescribeVolumesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeVolumes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVolumesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVolumesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an instance's Amazon EBS volumes.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def describeVolumes(params: DescribeVolumesRequest): awsDashSdkLib.libRequestMod.Request[DescribeVolumesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeVolumes(
      params: DescribeVolumesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVolumesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVolumesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detaches a specified Elastic Load Balancing instance from its layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def detachElasticLoadBalancer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachElasticLoadBalancer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detaches a specified Elastic Load Balancing instance from its layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def detachElasticLoadBalancer(params: DetachElasticLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachElasticLoadBalancer(
      params: DetachElasticLoadBalancerRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def disassociateElasticIp(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateElasticIp(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def disassociateElasticIp(params: DisassociateElasticIpRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateElasticIp(
      params: DisassociateElasticIpRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a generated host name for the specified layer, based on the current host name theme.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def getHostnameSuggestion(): awsDashSdkLib.libRequestMod.Request[GetHostnameSuggestionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHostnameSuggestion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHostnameSuggestionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHostnameSuggestionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a generated host name for the specified layer, based on the current host name theme.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def getHostnameSuggestion(params: GetHostnameSuggestionRequest): awsDashSdkLib.libRequestMod.Request[GetHostnameSuggestionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHostnameSuggestion(
      params: GetHostnameSuggestionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetHostnameSuggestionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetHostnameSuggestionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  This action can be used only with Windows stacks.  Grants RDP access to a Windows instance for a specified time period.
      */
    def grantAccess(): awsDashSdkLib.libRequestMod.Request[GrantAccessResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def grantAccess(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GrantAccessResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GrantAccessResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  This action can be used only with Windows stacks.  Grants RDP access to a Windows instance for a specified time period.
      */
    def grantAccess(params: GrantAccessRequest): awsDashSdkLib.libRequestMod.Request[GrantAccessResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def grantAccess(
      params: GrantAccessRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GrantAccessResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GrantAccessResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of tags that are applied to the specified stack or layer.
      */
    def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTagsResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of tags that are applied to the specified stack or layer.
      */
    def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      params: ListTagsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTagsResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reboots a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def rebootInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reboots a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def rebootInstance(params: RebootInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootInstance(
      params: RebootInstanceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster can be registered with only one stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see  Managing User Permissions.
      */
    def registerEcsCluster(): awsDashSdkLib.libRequestMod.Request[RegisterEcsClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerEcsCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterEcsClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterEcsClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster can be registered with only one stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see  Managing User Permissions.
      */
    def registerEcsCluster(params: RegisterEcsClusterRequest): awsDashSdkLib.libRequestMod.Request[RegisterEcsClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerEcsCluster(
      params: RegisterEcsClusterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterEcsClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterEcsClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a time. If the address is already registered, you must first deregister it by calling DeregisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def registerElasticIp(): awsDashSdkLib.libRequestMod.Request[RegisterElasticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerElasticIp(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterElasticIpResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterElasticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a time. If the address is already registered, you must first deregister it by calling DeregisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def registerElasticIp(params: RegisterElasticIpRequest): awsDashSdkLib.libRequestMod.Request[RegisterElasticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerElasticIp(
      params: RegisterElasticIpRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterElasticIpResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterElasticIpResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers instances that were created outside of AWS OpsWorks Stacks with a specified stack.  We do not recommend using this action to register instances. The complete registration operation includes two tasks: installing the AWS OpsWorks Stacks agent on the instance, and registering the instance with the stack. RegisterInstance handles only the second step. You should instead use the AWS CLI register command, which performs the entire registration operation. For more information, see  Registering an Instance with an AWS OpsWorks Stacks Stack.  Registered instances have the same requirements as instances that are created by using the CreateInstance API. For example, registered instances must be running a supported Linux-based operating system, and they must have a supported instance type. For more information about requirements for instances that you want to register, see  Preparing the Instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def registerInstance(): awsDashSdkLib.libRequestMod.Request[RegisterInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers instances that were created outside of AWS OpsWorks Stacks with a specified stack.  We do not recommend using this action to register instances. The complete registration operation includes two tasks: installing the AWS OpsWorks Stacks agent on the instance, and registering the instance with the stack. RegisterInstance handles only the second step. You should instead use the AWS CLI register command, which performs the entire registration operation. For more information, see  Registering an Instance with an AWS OpsWorks Stacks Stack.  Registered instances have the same requirements as instances that are created by using the CreateInstance API. For example, registered instances must be running a supported Linux-based operating system, and they must have a supported instance type. For more information about requirements for instances that you want to register, see  Preparing the Instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def registerInstance(params: RegisterInstanceRequest): awsDashSdkLib.libRequestMod.Request[RegisterInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerInstance(
      params: RegisterInstanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterInstanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers an Amazon RDS instance with a stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def registerRdsDbInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerRdsDbInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers an Amazon RDS instance with a stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def registerRdsDbInstance(params: RegisterRdsDbInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerRdsDbInstance(
      params: RegisterRdsDbInstanceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time. If the volume is already registered, you must first deregister it by calling DeregisterVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def registerVolume(): awsDashSdkLib.libRequestMod.Request[RegisterVolumeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerVolume(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterVolumeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterVolumeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time. If the volume is already registered, you must first deregister it by calling DeregisterVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def registerVolume(params: RegisterVolumeRequest): awsDashSdkLib.libRequestMod.Request[RegisterVolumeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerVolume(
      params: RegisterVolumeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterVolumeResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterVolumeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Specify the load-based auto scaling configuration for a specified layer. For more information, see Managing Load with Time-based and Load-based Instances.  To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto scaling operates only on the instances from that set, so you must ensure that you have created enough instances to handle the maximum anticipated load.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def setLoadBasedAutoScaling(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setLoadBasedAutoScaling(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Specify the load-based auto scaling configuration for a specified layer. For more information, see Managing Load with Time-based and Load-based Instances.  To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto scaling operates only on the instances from that set, so you must ensure that you have created enough instances to handle the maximum anticipated load.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def setLoadBasedAutoScaling(params: SetLoadBasedAutoScalingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setLoadBasedAutoScaling(
      params: SetLoadBasedAutoScalingRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Specifies a user's permissions. For more information, see Security and Permissions.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def setPermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setPermission(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Specifies a user's permissions. For more information, see Security and Permissions.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def setPermission(params: SetPermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setPermission(
      params: SetPermissionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Specify the time-based auto scaling configuration for a specified instance. For more information, see Managing Load with Time-based and Load-based Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def setTimeBasedAutoScaling(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setTimeBasedAutoScaling(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Specify the time-based auto scaling configuration for a specified instance. For more information, see Managing Load with Time-based and Load-based Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def setTimeBasedAutoScaling(params: SetTimeBasedAutoScalingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setTimeBasedAutoScaling(
      params: SetTimeBasedAutoScalingRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def startInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def startInstance(params: StartInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startInstance(
      params: StartInstanceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a stack's instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def startStack(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startStack(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a stack's instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def startStack(params: StartStackRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startStack(
      params: StartStackRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def stopInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def stopInstance(params: StopInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopInstance(
      params: StopInstanceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def stopStack(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopStack(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def stopStack(params: StopStackRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopStack(
      params: StopStackRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how tagging works, see Tags in the AWS OpsWorks User Guide.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how tagging works, see Tags in the AWS OpsWorks User Guide.
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def unassignInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def unassignInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def unassignInstance(params: UnassignInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def unassignInstance(
      params: UnassignInstanceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def unassignVolume(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def unassignVolume(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def unassignVolume(params: UnassignVolumeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def unassignVolume(
      params: UnassignVolumeRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes tags from a specified stack or layer.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes tags from a specified stack or layer.
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a specified app.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateApp(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApp(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a specified app.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateApp(params: UpdateAppRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApp(
      params: UpdateAppRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a registered Elastic IP address's name. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateElasticIp(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateElasticIp(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a registered Elastic IP address's name. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateElasticIp(params: UpdateElasticIpRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateElasticIp(
      params: UpdateElasticIpRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a specified instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a specified instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateInstance(params: UpdateInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateInstance(
      params: UpdateInstanceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a specified layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateLayer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateLayer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a specified layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateLayer(params: UpdateLayerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateLayer(
      params: UpdateLayerRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a user's SSH public key.  Required Permissions: To use this action, an IAM user must have self-management enabled or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def updateMyUserProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMyUserProfile(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a user's SSH public key.  Required Permissions: To use this action, an IAM user must have self-management enabled or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def updateMyUserProfile(params: UpdateMyUserProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMyUserProfile(
      params: UpdateMyUserProfileRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateRdsDbInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRdsDbInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateRdsDbInstance(params: UpdateRdsDbInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRdsDbInstance(
      params: UpdateRdsDbInstanceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateStack(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStack(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateStack(params: UpdateStackRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStack(
      params: UpdateStackRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a specified user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def updateUserProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserProfile(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a specified user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
      */
    def updateUserProfile(params: UpdateUserProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserProfile(
      params: UpdateUserProfileRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an Amazon EBS volume's name or mount point. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateVolume(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateVolume(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an Amazon EBS volume's name or mount point. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
      */
    def updateVolume(params: UpdateVolumeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateVolume(
      params: UpdateVolumeRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the appExists state by periodically calling the underlying OpsWorks.describeAppsoperation every 1 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_appExists(state: awsDashSdkLib.awsDashSdkLibStrings.appExists): awsDashSdkLib.libRequestMod.Request[DescribeAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_appExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.appExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAppsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the appExists state by periodically calling the underlying OpsWorks.describeAppsoperation every 1 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_appExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.appExists,
      params: DescribeAppsRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_appExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.appExists,
      params: DescribeAppsRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAppsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the deploymentSuccessful state by periodically calling the underlying OpsWorks.describeDeploymentsoperation every 15 seconds (at most 40 times). Wait until a deployment has completed successfully.
      */
    @JSName("waitFor")
    def waitFor_deploymentSuccessful(state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_deploymentSuccessful(
      state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeploymentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the deploymentSuccessful state by periodically calling the underlying OpsWorks.describeDeploymentsoperation every 15 seconds (at most 40 times). Wait until a deployment has completed successfully.
      */
    @JSName("waitFor")
    def waitFor_deploymentSuccessful(
      state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
      params: DescribeDeploymentsRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_deploymentSuccessful(
      state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
      params: DescribeDeploymentsRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeploymentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceOnline state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is online.
      */
    @JSName("waitFor")
    def waitFor_instanceOnline(state: awsDashSdkLib.awsDashSdkLibStrings.instanceOnline): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceOnline(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceOnline,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceOnline state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is online.
      */
    @JSName("waitFor")
    def waitFor_instanceOnline(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceOnline,
      params: DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceOnline(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceOnline,
      params: DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceRegistered state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is registered.
      */
    @JSName("waitFor")
    def waitFor_instanceRegistered(state: awsDashSdkLib.awsDashSdkLibStrings.instanceRegistered): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceRegistered(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceRegistered,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceRegistered state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is registered.
      */
    @JSName("waitFor")
    def waitFor_instanceRegistered(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceRegistered,
      params: DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceRegistered(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceRegistered,
      params: DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceStopped state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is stopped.
      */
    @JSName("waitFor")
    def waitFor_instanceStopped(state: awsDashSdkLib.awsDashSdkLibStrings.instanceStopped): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceStopped(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceStopped,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceStopped state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is stopped.
      */
    @JSName("waitFor")
    def waitFor_instanceStopped(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceStopped,
      params: DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceStopped(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceStopped,
      params: DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceTerminated state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is terminated.
      */
    @JSName("waitFor")
    def waitFor_instanceTerminated(state: awsDashSdkLib.awsDashSdkLibStrings.instanceTerminated): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceTerminated(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceTerminated,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceTerminated state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is terminated.
      */
    @JSName("waitFor")
    def waitFor_instanceTerminated(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceTerminated,
      params: DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceTerminated(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceTerminated,
      params: DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UnassignInstanceRequest extends js.Object {
    /**
      * The instance ID.
      */
    var InstanceId: String
  }
  
  trait UnassignVolumeRequest extends js.Object {
    /**
      * The volume ID.
      */
    var VolumeId: String
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The stack or layer's Amazon Resource Number (ARN).
      */
    var ResourceArn: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.ResourceArn
    /**
      * A list of the keys of tags to be removed from a stack or layer.
      */
    var TagKeys: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.TagKeys
  }
  
  trait UpdateAppRequest extends js.Object {
    /**
      * The app ID.
      */
    var AppId: String
    /**
      * A Source object that specifies the app repository.
      */
    var AppSource: js.UndefOr[Source] = js.undefined
    /**
      * One or more user-defined key/value pairs to be added to the stack attributes.
      */
    var Attributes: js.UndefOr[AppAttributes] = js.undefined
    /**
      * The app's data sources.
      */
    var DataSources: js.UndefOr[DataSources] = js.undefined
    /**
      * A description of the app.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The app's virtual host settings, with multiple domains separated by commas. For example: 'www.example.com, example.com' 
      */
    var Domains: js.UndefOr[Strings] = js.undefined
    /**
      * Whether SSL is enabled for the app.
      */
    var EnableSsl: js.UndefOr[Boolean] = js.undefined
    /**
      * An array of EnvironmentVariable objects that specify environment variables to be associated with the app. After you deploy the app, these variables are defined on the associated app server instances.For more information, see  Environment Variables. There is no specific limit on the number of environment variables. However, the size of the associated data structure - which includes the variables' names, values, and protected flag values - cannot exceed 10 KB (10240 Bytes). This limit should accommodate most if not all use cases. Exceeding it will cause an exception with the message, "Environment: is too large (maximum is 10KB)."  This parameter is supported only by Chef 11.10 stacks. If you have specified one or more environment variables, you cannot modify the stack's Chef version. 
      */
    var Environment: js.UndefOr[EnvironmentVariables] = js.undefined
    /**
      * The app name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * An SslConfiguration object with the SSL configuration.
      */
    var SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined
    /**
      * The app type.
      */
    var Type: js.UndefOr[AppType] = js.undefined
  }
  
  trait UpdateElasticIpRequest extends js.Object {
    /**
      * The IP address for which you want to update the name.
      */
    var ElasticIp: String
    /**
      * The new name.
      */
    var Name: js.UndefOr[String] = js.undefined
  }
  
  trait UpdateInstanceRequest extends js.Object {
    /**
      * The default AWS OpsWorks Stacks agent version. You have the following options:    INHERIT - Use the stack's default agent version setting.    version_number - Use the specified agent version. This value overrides the stack's default setting. To update the agent version, you must edit the instance configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version on the instance.   The default setting is INHERIT. To specify an agent version, you must use the complete version number, not the abbreviated number shown on the console. For a list of available agent version numbers, call DescribeAgentVersions. AgentVersion cannot be set to Chef 12.2.
      */
    var AgentVersion: js.UndefOr[String] = js.undefined
    /**
      * The ID of the AMI that was used to create the instance. The value of this parameter must be the same AMI ID that the instance is already using. You cannot apply a new AMI to an instance by running UpdateInstance. UpdateInstance does not work on instances that are using custom AMIs. 
      */
    var AmiId: js.UndefOr[String] = js.undefined
    /**
      * The instance architecture. Instance types do not necessarily support both architectures. For a list of the architectures that are supported by the different instance types, see Instance Families and Types.
      */
    var Architecture: js.UndefOr[Architecture] = js.undefined
    /**
      * For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
      */
    var AutoScalingType: js.UndefOr[AutoScalingType] = js.undefined
    /**
      * This property cannot be updated.
      */
    var EbsOptimized: js.UndefOr[Boolean] = js.undefined
    /**
      * The instance host name.
      */
    var Hostname: js.UndefOr[String] = js.undefined
    /**
      * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
      */
    var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
    /**
      * The instance ID.
      */
    var InstanceId: String
    /**
      * The instance type, such as t2.micro. For a list of supported instance types, open the stack in the console, choose Instances, and choose + Instance. The Size list contains the currently supported types. For more information, see Instance Families and Types. The parameter values that you use to specify the various types are in the API Name column of the Available Instance Types table.
      */
    var InstanceType: js.UndefOr[String] = js.undefined
    /**
      * The instance's layer IDs.
      */
    var LayerIds: js.UndefOr[Strings] = js.undefined
    /**
      * The instance's operating system, which must be set to one of the following. You cannot update an instance that is using a custom AMI.   A supported Linux operating system: An Amazon Linux version, such as Amazon Linux 2017.09, Amazon Linux 2017.03, Amazon Linux 2016.09, Amazon Linux 2016.03, Amazon Linux 2015.09, or Amazon Linux 2015.03.   A supported Ubuntu operating system, such as Ubuntu 16.04 LTS, Ubuntu 14.04 LTS, or Ubuntu 12.04 LTS.    CentOS Linux 7     Red Hat Enterprise Linux 7    A supported Windows operating system, such as Microsoft Windows Server 2012 R2 Base, Microsoft Windows Server 2012 R2 with SQL Server Express, Microsoft Windows Server 2012 R2 with SQL Server Standard, or Microsoft Windows Server 2012 R2 with SQL Server Web.   For more information about supported operating systems, see AWS OpsWorks Stacks Operating Systems. The default option is the current Amazon Linux version. If you set this parameter to Custom, you must use the AmiId parameter to specify the custom AMI that you want to use. For more information about supported operating systems, see Operating Systems. For more information about how to use custom AMIs with OpsWorks, see Using Custom AMIs.  You can specify a different Linux operating system for the updated stack, but you cannot change from Linux to Windows or Windows to Linux. 
      */
    var Os: js.UndefOr[String] = js.undefined
    /**
      * The instance's Amazon EC2 key name.
      */
    var SshKeyName: js.UndefOr[String] = js.undefined
  }
  
  trait UpdateLayerRequest extends js.Object {
    /**
      * One or more user-defined key/value pairs to be added to the stack attributes.
      */
    var Attributes: js.UndefOr[LayerAttributes] = js.undefined
    /**
      * Whether to automatically assign an Elastic IP address to the layer's instances. For more information, see How to Edit a Layer.
      */
    var AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined
    /**
      * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's instances. For more information, see How to Edit a Layer.
      */
    var AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies CloudWatch Logs configuration options for the layer. For more information, see CloudWatchLogsLogStream.
      */
    var CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration] = js.undefined
    /**
      * The ARN of an IAM profile to be used for all of the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
      */
    var CustomInstanceProfileArn: js.UndefOr[String] = js.undefined
    /**
      * A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on the layer's instances. For more information, see  Using Custom JSON. 
      */
    var CustomJson: js.UndefOr[String] = js.undefined
    /**
      * A LayerCustomRecipes object that specifies the layer's custom recipes.
      */
    var CustomRecipes: js.UndefOr[Recipes] = js.undefined
    /**
      * An array containing the layer's custom security group IDs.
      */
    var CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined
    /**
      * Whether to disable auto healing for the layer.
      */
    var EnableAutoHealing: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
      */
    var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
    /**
      * The layer ID.
      */
    var LayerId: String
    /**
      * 
      */
    var LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined
    /**
      * The layer name, which is used by the console.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * An array of Package objects that describe the layer's packages.
      */
    var Packages: js.UndefOr[Strings] = js.undefined
    /**
      * For custom layers only, use this parameter to specify the layer's short name, which is used internally by AWS OpsWorks Stacks and by Chef. The short name is also used as the name for the directory where your app files are installed. It can have a maximum of 200 characters and must be in the following format: /\A[a-z0-9\-\_\.]+\Z/. The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the Layer Reference 
      */
    var Shortname: js.UndefOr[String] = js.undefined
    /**
      * Whether to use Amazon EBS-optimized instances.
      */
    var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined
    /**
      * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
      */
    var VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined
  }
  
  trait UpdateMyUserProfileRequest extends js.Object {
    /**
      * The user's SSH public key.
      */
    var SshPublicKey: js.UndefOr[String] = js.undefined
  }
  
  trait UpdateRdsDbInstanceRequest extends js.Object {
    /**
      * The database password.
      */
    var DbPassword: js.UndefOr[String] = js.undefined
    /**
      * The master user name.
      */
    var DbUser: js.UndefOr[String] = js.undefined
    /**
      * The Amazon RDS instance's ARN.
      */
    var RdsDbInstanceArn: String
  }
  
  trait UpdateStackRequest extends js.Object {
    /**
      * The default AWS OpsWorks Stacks agent version. You have the following options:   Auto-update - Set this parameter to LATEST. AWS OpsWorks Stacks automatically installs new agent versions on the stack's instances as soon as they are available.   Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version on the stack's instances.   The default setting is LATEST. To specify an agent version, you must use the complete version number, not the abbreviated number shown on the console. For a list of available agent version numbers, call DescribeAgentVersions. AgentVersion cannot be set to Chef 12.2.  You can also specify an agent version when you create or update an instance, which overrides the stack's default setting. 
      */
    var AgentVersion: js.UndefOr[String] = js.undefined
    /**
      * One or more user-defined key-value pairs to be added to the stack attributes.
      */
    var Attributes: js.UndefOr[StackAttributes] = js.undefined
    /**
      * A ChefConfiguration object that specifies whether to enable Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see Create a New Stack.
      */
    var ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined
    /**
      * The configuration manager. When you update a stack, we recommend that you use the configuration manager to specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for Linux stacks is currently 12.
      */
    var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
    var CustomCookbooksSource: js.UndefOr[Source] = js.undefined
    /**
      * A string that contains user-defined, custom JSON. It can be used to override the corresponding default stack configuration JSON values or to pass data to recipes. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information about custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes.
      */
    var CustomJson: js.UndefOr[String] = js.undefined
    /**
      * The stack's default Availability Zone, which must be in the stack's region. For more information, see Regions and Endpoints. If you also specify a value for DefaultSubnetId, the subnet must be in the same zone. For more information, see CreateStack. 
      */
    var DefaultAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
      */
    var DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined
    /**
      * The stack's operating system, which must be set to one of the following:   A supported Linux operating system: An Amazon Linux version, such as Amazon Linux 2017.09, Amazon Linux 2017.03, Amazon Linux 2016.09, Amazon Linux 2016.03, Amazon Linux 2015.09, or Amazon Linux 2015.03.   A supported Ubuntu operating system, such as Ubuntu 16.04 LTS, Ubuntu 14.04 LTS, or Ubuntu 12.04 LTS.    CentOS Linux 7     Red Hat Enterprise Linux 7    A supported Windows operating system, such as Microsoft Windows Server 2012 R2 Base, Microsoft Windows Server 2012 R2 with SQL Server Express, Microsoft Windows Server 2012 R2 with SQL Server Standard, or Microsoft Windows Server 2012 R2 with SQL Server Web.   A custom AMI: Custom. You specify the custom AMI you want to use when you create instances. For more information about how to use custom AMIs with OpsWorks, see Using Custom AMIs.   The default option is the stack's current operating system. For more information about supported operating systems, see AWS OpsWorks Stacks Operating Systems.
      */
    var DefaultOs: js.UndefOr[String] = js.undefined
    /**
      * The default root device type. This value is used by default for all instances in the stack, but you can override it when you create an instance. For more information, see Storage for the Root Device.
      */
    var DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined
    /**
      * A default Amazon EC2 key-pair name. The default value is none. If you specify a key-pair name, AWS OpsWorks Stacks installs the public key on the instance and you can use the private key with an SSH client to log in to the instance. For more information, see  Using SSH to Communicate with an Instance and  Managing SSH Access. You can override this setting by specifying a different key pair, or no key pair, when you  create an instance. 
      */
    var DefaultSshKeyName: js.UndefOr[String] = js.undefined
    /**
      * The stack's default VPC subnet ID. This parameter is required if you specify a value for the VpcId parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance. If you also specify a value for DefaultAvailabilityZone, the subnet must be in that zone. For information on default values and when this parameter is required, see the VpcId parameter description. 
      */
    var DefaultSubnetId: js.UndefOr[String] = js.undefined
    /**
      * The stack's new host name theme, with spaces replaced by underscores. The theme is used to generate host names for the stack's instances. By default, HostnameTheme is set to Layer_Dependent, which creates host names by appending integers to the layer's short name. The other themes are:    Baked_Goods     Clouds     Europe_Cities     Fruits     Greek_Deities     Legendary_creatures_from_Japan     Planets_and_Moons     Roman_Deities     Scottish_Islands     US_Cities     Wild_Cats    To obtain a generated host name, call GetHostNameSuggestion, which returns a host name based on the current theme.
      */
    var HostnameTheme: js.UndefOr[String] = js.undefined
    /**
      * The stack's new name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * Do not use this parameter. You cannot update a stack's service role.
      */
    var ServiceRoleArn: js.UndefOr[String] = js.undefined
    /**
      * The stack ID.
      */
    var StackId: String
    /**
      * Whether the stack uses custom cookbooks.
      */
    var UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers. AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are associated with layers by default. UseOpsworksSecurityGroups allows you to provide your own custom security groups instead of using the built-in groups. UseOpsworksSecurityGroups has the following settings:    True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each layer (default setting). You can associate additional security groups with a layer after you create it, but you cannot delete the built-in security group.   False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create appropriate EC2 security groups and associate a security group with each layer that you create. However, you can still manually associate a built-in security group with a layer on. Custom security groups are required only for those layers that need custom settings.   For more information, see Create a New Stack.
      */
    var UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined
  }
  
  trait UpdateUserProfileRequest extends js.Object {
    /**
      * Whether users can specify their own SSH public key through the My Settings page. For more information, see Managing User Permissions.
      */
    var AllowSelfManagement: js.UndefOr[Boolean] = js.undefined
    /**
      * The user IAM ARN. This can also be a federated user's ARN.
      */
    var IamUserArn: String
    /**
      * The user's new SSH public key.
      */
    var SshPublicKey: js.UndefOr[String] = js.undefined
    /**
      * The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified name includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, my.name will be changed to myname. If you do not specify an SSH user name, AWS OpsWorks Stacks generates one from the IAM user name. 
      */
    var SshUsername: js.UndefOr[String] = js.undefined
  }
  
  trait UpdateVolumeRequest extends js.Object {
    /**
      * The new mount point.
      */
    var MountPoint: js.UndefOr[String] = js.undefined
    /**
      * The new name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The volume ID.
      */
    var VolumeId: String
  }
  
  trait UserProfile extends js.Object {
    /**
      * Whether users can specify their own SSH public key through the My Settings page. For more information, see Managing User Permissions.
      */
    var AllowSelfManagement: js.UndefOr[Boolean] = js.undefined
    /**
      * The user's IAM ARN.
      */
    var IamUserArn: js.UndefOr[String] = js.undefined
    /**
      * The user's name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The user's SSH public key.
      */
    var SshPublicKey: js.UndefOr[String] = js.undefined
    /**
      * The user's SSH user name.
      */
    var SshUsername: js.UndefOr[String] = js.undefined
  }
  
  trait Volume extends js.Object {
    /**
      * The volume Availability Zone. For more information, see Regions and Endpoints.
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The device name.
      */
    var Device: js.UndefOr[String] = js.undefined
    /**
      * The Amazon EC2 volume ID.
      */
    var Ec2VolumeId: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether an Amazon EBS volume is encrypted. For more information, see Amazon EBS Encryption.
      */
    var Encrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * The instance ID.
      */
    var InstanceId: js.UndefOr[String] = js.undefined
    /**
      * For PIOPS volumes, the IOPS per disk.
      */
    var Iops: js.UndefOr[Integer] = js.undefined
    /**
      * The volume mount point. For example, "/mnt/disk1".
      */
    var MountPoint: js.UndefOr[String] = js.undefined
    /**
      * The volume name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The RAID array ID.
      */
    var RaidArrayId: js.UndefOr[String] = js.undefined
    /**
      * The AWS region. For more information about AWS regions, see Regions and Endpoints.
      */
    var Region: js.UndefOr[String] = js.undefined
    /**
      * The volume size.
      */
    var Size: js.UndefOr[Integer] = js.undefined
    /**
      * The value returned by DescribeVolumes.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The volume ID.
      */
    var VolumeId: js.UndefOr[String] = js.undefined
    /**
      * The volume type. For more information, see  Amazon EBS Volume Types.    standard - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of 1024 GiB.    io1 - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum size of 16384 GiB.    gp2 - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a maximum size of 16384 GiB.    st1 - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.    sc1 - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.  
      */
    var VolumeType: js.UndefOr[String] = js.undefined
  }
  
  trait VolumeConfiguration extends js.Object {
    /**
      * Specifies whether an Amazon EBS volume is encrypted. For more information, see Amazon EBS Encryption.
      */
    var Encrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * For PIOPS volumes, the IOPS per disk.
      */
    var Iops: js.UndefOr[Integer] = js.undefined
    /**
      * The volume mount point. For example "/dev/sdh".
      */
    var MountPoint: String
    /**
      * The number of disks in the volume.
      */
    var NumberOfDisks: Integer
    /**
      * The volume RAID level.
      */
    var RaidLevel: js.UndefOr[Integer] = js.undefined
    /**
      * The volume size.
      */
    var Size: Integer
    /**
      * The volume type. For more information, see  Amazon EBS Volume Types.    standard - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of 1024 GiB.    io1 - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum size of 16384 GiB.    gp2 - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a maximum size of 16384 GiB.    st1 - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.    sc1 - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.  
      */
    var VolumeType: js.UndefOr[String] = js.undefined
  }
  
  trait WeeklyAutoScalingSchedule extends js.Object {
    /**
      * The schedule for Friday.
      */
    var Friday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
    /**
      * The schedule for Monday.
      */
    var Monday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
    /**
      * The schedule for Saturday.
      */
    var Saturday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
    /**
      * The schedule for Sunday.
      */
    var Sunday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
    /**
      * The schedule for Thursday.
      */
    var Thursday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
    /**
      * The schedule for Tuesday.
      */
    var Tuesday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
    /**
      * The schedule for Wednesday.
      */
    var Wednesday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  }
  
  trait _AppAttributesKeys extends js.Object
  
  trait _AppType extends js.Object
  
  trait _Architecture extends js.Object
  
  trait _AutoScalingType extends js.Object
  
  trait _CloudWatchLogsEncoding extends js.Object
  
  trait _CloudWatchLogsInitialPosition extends js.Object
  
  trait _CloudWatchLogsTimeZone extends js.Object
  
  trait _DeploymentCommandName extends js.Object
  
  trait _LayerAttributesKeys extends js.Object
  
  trait _LayerType extends js.Object
  
  trait _RootDeviceType extends js.Object
  
  trait _SourceType extends js.Object
  
  trait _VirtualizationType extends js.Object
  
  trait _VolumeType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AgentVersions = js.Array[AgentVersion]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DocumentRoot
    - awsDashSdkLib.awsDashSdkLibStrings.RailsEnv
    - awsDashSdkLib.awsDashSdkLibStrings.AutoBundleOnDeploy
    - awsDashSdkLib.awsDashSdkLibStrings.AwsFlowRubySettings
    - java.lang.String
  */
  type AppAttributesKeys = _AppAttributesKeys | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-flow-ruby`
    - awsDashSdkLib.awsDashSdkLibStrings.java
    - awsDashSdkLib.awsDashSdkLibStrings.rails
    - awsDashSdkLib.awsDashSdkLibStrings.php
    - awsDashSdkLib.awsDashSdkLibStrings.nodejs
    - awsDashSdkLib.awsDashSdkLibStrings.static
    - awsDashSdkLib.awsDashSdkLibStrings.other
    - java.lang.String
  */
  type AppType = _AppType | java.lang.String
  type Apps = js.Array[App]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.x86_64
    - awsDashSdkLib.awsDashSdkLibStrings.i386
    - java.lang.String
  */
  type Architecture = _Architecture | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.load
    - awsDashSdkLib.awsDashSdkLibStrings.timer
    - java.lang.String
  */
  type AutoScalingType = _AutoScalingType | java.lang.String
  type BlockDeviceMappings = js.Array[BlockDeviceMapping]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ascii
    - awsDashSdkLib.awsDashSdkLibStrings.big5
    - awsDashSdkLib.awsDashSdkLibStrings.big5hkscs
    - awsDashSdkLib.awsDashSdkLibStrings.cp037
    - awsDashSdkLib.awsDashSdkLibStrings.cp424
    - awsDashSdkLib.awsDashSdkLibStrings.cp437
    - awsDashSdkLib.awsDashSdkLibStrings.cp500
    - awsDashSdkLib.awsDashSdkLibStrings.cp720
    - awsDashSdkLib.awsDashSdkLibStrings.cp737
    - awsDashSdkLib.awsDashSdkLibStrings.cp775
    - awsDashSdkLib.awsDashSdkLibStrings.cp850
    - awsDashSdkLib.awsDashSdkLibStrings.cp852
    - awsDashSdkLib.awsDashSdkLibStrings.cp855
    - awsDashSdkLib.awsDashSdkLibStrings.cp856
    - awsDashSdkLib.awsDashSdkLibStrings.cp857
    - awsDashSdkLib.awsDashSdkLibStrings.cp858
    - awsDashSdkLib.awsDashSdkLibStrings.cp860
    - awsDashSdkLib.awsDashSdkLibStrings.cp861
    - awsDashSdkLib.awsDashSdkLibStrings.cp862
    - awsDashSdkLib.awsDashSdkLibStrings.cp863
    - awsDashSdkLib.awsDashSdkLibStrings.cp864
    - awsDashSdkLib.awsDashSdkLibStrings.cp865
    - awsDashSdkLib.awsDashSdkLibStrings.cp866
    - awsDashSdkLib.awsDashSdkLibStrings.cp869
    - awsDashSdkLib.awsDashSdkLibStrings.cp874
    - awsDashSdkLib.awsDashSdkLibStrings.cp875
    - awsDashSdkLib.awsDashSdkLibStrings.cp932
    - awsDashSdkLib.awsDashSdkLibStrings.cp949
    - awsDashSdkLib.awsDashSdkLibStrings.cp950
    - awsDashSdkLib.awsDashSdkLibStrings.cp1006
    - awsDashSdkLib.awsDashSdkLibStrings.cp1026
    - awsDashSdkLib.awsDashSdkLibStrings.cp1140
    - awsDashSdkLib.awsDashSdkLibStrings.cp1250
    - awsDashSdkLib.awsDashSdkLibStrings.cp1251
    - awsDashSdkLib.awsDashSdkLibStrings.cp1252
    - awsDashSdkLib.awsDashSdkLibStrings.cp1253
    - awsDashSdkLib.awsDashSdkLibStrings.cp1254
    - awsDashSdkLib.awsDashSdkLibStrings.cp1255
    - awsDashSdkLib.awsDashSdkLibStrings.cp1256
    - awsDashSdkLib.awsDashSdkLibStrings.cp1257
    - awsDashSdkLib.awsDashSdkLibStrings.cp1258
    - awsDashSdkLib.awsDashSdkLibStrings.euc_jp
    - awsDashSdkLib.awsDashSdkLibStrings.euc_jis_2004
    - awsDashSdkLib.awsDashSdkLibStrings.euc_jisx0213
    - awsDashSdkLib.awsDashSdkLibStrings.euc_kr
    - awsDashSdkLib.awsDashSdkLibStrings.gb2312
    - awsDashSdkLib.awsDashSdkLibStrings.gbk
    - awsDashSdkLib.awsDashSdkLibStrings.gb18030
    - awsDashSdkLib.awsDashSdkLibStrings.hz
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_jp
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_jp_1
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_jp_2
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_jp_2004
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_jp_3
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_jp_ext
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_kr
    - awsDashSdkLib.awsDashSdkLibStrings.latin_1
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_2
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_3
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_4
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_5
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_6
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_7
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_8
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_9
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_10
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_13
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_14
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_15
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_16
    - awsDashSdkLib.awsDashSdkLibStrings.johab
    - awsDashSdkLib.awsDashSdkLibStrings.koi8_r
    - awsDashSdkLib.awsDashSdkLibStrings.koi8_u
    - awsDashSdkLib.awsDashSdkLibStrings.mac_cyrillic
    - awsDashSdkLib.awsDashSdkLibStrings.mac_greek
    - awsDashSdkLib.awsDashSdkLibStrings.mac_iceland
    - awsDashSdkLib.awsDashSdkLibStrings.mac_latin2
    - awsDashSdkLib.awsDashSdkLibStrings.mac_roman
    - awsDashSdkLib.awsDashSdkLibStrings.mac_turkish
    - awsDashSdkLib.awsDashSdkLibStrings.ptcp154
    - awsDashSdkLib.awsDashSdkLibStrings.shift_jis
    - awsDashSdkLib.awsDashSdkLibStrings.shift_jis_2004
    - awsDashSdkLib.awsDashSdkLibStrings.shift_jisx0213
    - awsDashSdkLib.awsDashSdkLibStrings.utf_32
    - awsDashSdkLib.awsDashSdkLibStrings.utf_32_be
    - awsDashSdkLib.awsDashSdkLibStrings.utf_32_le
    - awsDashSdkLib.awsDashSdkLibStrings.utf_16
    - awsDashSdkLib.awsDashSdkLibStrings.utf_16_be
    - awsDashSdkLib.awsDashSdkLibStrings.utf_16_le
    - awsDashSdkLib.awsDashSdkLibStrings.utf_7
    - awsDashSdkLib.awsDashSdkLibStrings.utf_8
    - awsDashSdkLib.awsDashSdkLibStrings.utf_8_sig
    - java.lang.String
  */
  type CloudWatchLogsEncoding = _CloudWatchLogsEncoding | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.start_of_file
    - awsDashSdkLib.awsDashSdkLibStrings.end_of_file
    - java.lang.String
  */
  type CloudWatchLogsInitialPosition = _CloudWatchLogsInitialPosition | java.lang.String
  type CloudWatchLogsLogStreams = js.Array[CloudWatchLogsLogStream]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LOCAL
    - awsDashSdkLib.awsDashSdkLibStrings.UTC
    - java.lang.String
  */
  type CloudWatchLogsTimeZone = _CloudWatchLogsTimeZone | java.lang.String
  type Commands = js.Array[Command]
  type DataSources = js.Array[DataSource]
  type DateTime = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.install_dependencies
    - awsDashSdkLib.awsDashSdkLibStrings.update_dependencies
    - awsDashSdkLib.awsDashSdkLibStrings.update_custom_cookbooks
    - awsDashSdkLib.awsDashSdkLibStrings.execute_recipes
    - awsDashSdkLib.awsDashSdkLibStrings.configure
    - awsDashSdkLib.awsDashSdkLibStrings.setup
    - awsDashSdkLib.awsDashSdkLibStrings.deploy
    - awsDashSdkLib.awsDashSdkLibStrings.rollback
    - awsDashSdkLib.awsDashSdkLibStrings.start
    - awsDashSdkLib.awsDashSdkLibStrings.stop
    - awsDashSdkLib.awsDashSdkLibStrings.restart
    - awsDashSdkLib.awsDashSdkLibStrings.undeploy
    - java.lang.String
  */
  type DeploymentCommandName = _DeploymentCommandName | java.lang.String
  type Deployments = js.Array[Deployment]
  type Double = scala.Double
  type EcsClusters = js.Array[EcsCluster]
  type ElasticIps = js.Array[ElasticIp]
  type ElasticLoadBalancers = js.Array[ElasticLoadBalancer]
  type EnvironmentVariables = js.Array[EnvironmentVariable]
  type Hour = java.lang.String
  type Instances = js.Array[Instance]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EcsClusterArn
    - awsDashSdkLib.awsDashSdkLibStrings.EnableHaproxyStats
    - awsDashSdkLib.awsDashSdkLibStrings.HaproxyStatsUrl
    - awsDashSdkLib.awsDashSdkLibStrings.HaproxyStatsUser
    - awsDashSdkLib.awsDashSdkLibStrings.HaproxyStatsPassword
    - awsDashSdkLib.awsDashSdkLibStrings.HaproxyHealthCheckUrl
    - awsDashSdkLib.awsDashSdkLibStrings.HaproxyHealthCheckMethod
    - awsDashSdkLib.awsDashSdkLibStrings.MysqlRootPassword
    - awsDashSdkLib.awsDashSdkLibStrings.MysqlRootPasswordUbiquitous
    - awsDashSdkLib.awsDashSdkLibStrings.GangliaUrl
    - awsDashSdkLib.awsDashSdkLibStrings.GangliaUser
    - awsDashSdkLib.awsDashSdkLibStrings.GangliaPassword
    - awsDashSdkLib.awsDashSdkLibStrings.MemcachedMemory
    - awsDashSdkLib.awsDashSdkLibStrings.NodejsVersion
    - awsDashSdkLib.awsDashSdkLibStrings.RubyVersion
    - awsDashSdkLib.awsDashSdkLibStrings.RubygemsVersion
    - awsDashSdkLib.awsDashSdkLibStrings.ManageBundler
    - awsDashSdkLib.awsDashSdkLibStrings.BundlerVersion
    - awsDashSdkLib.awsDashSdkLibStrings.RailsStack
    - awsDashSdkLib.awsDashSdkLibStrings.PassengerVersion
    - awsDashSdkLib.awsDashSdkLibStrings.Jvm
    - awsDashSdkLib.awsDashSdkLibStrings.JvmVersion
    - awsDashSdkLib.awsDashSdkLibStrings.JvmOptions
    - awsDashSdkLib.awsDashSdkLibStrings.JavaAppServer
    - awsDashSdkLib.awsDashSdkLibStrings.JavaAppServerVersion
    - java.lang.String
  */
  type LayerAttributesKeys = _LayerAttributesKeys | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-flow-ruby`
    - awsDashSdkLib.awsDashSdkLibStrings.`ecs-cluster`
    - awsDashSdkLib.awsDashSdkLibStrings.`java-app`
    - awsDashSdkLib.awsDashSdkLibStrings.lb
    - awsDashSdkLib.awsDashSdkLibStrings.web
    - awsDashSdkLib.awsDashSdkLibStrings.`php-app`
    - awsDashSdkLib.awsDashSdkLibStrings.`rails-app`
    - awsDashSdkLib.awsDashSdkLibStrings.`nodejs-app`
    - awsDashSdkLib.awsDashSdkLibStrings.memcached
    - awsDashSdkLib.awsDashSdkLibStrings.`db-master`
    - awsDashSdkLib.awsDashSdkLibStrings.`monitoring-master`
    - awsDashSdkLib.awsDashSdkLibStrings.custom
    - java.lang.String
  */
  type LayerType = _LayerType | java.lang.String
  type Layers = js.Array[Layer]
  type LoadBasedAutoScalingConfigurations = js.Array[LoadBasedAutoScalingConfiguration]
  type MaxResults = scala.Double
  type Minute = scala.Double
  type NextToken = java.lang.String
  type OperatingSystemConfigurationManagers = js.Array[OperatingSystemConfigurationManager]
  type OperatingSystems = js.Array[OperatingSystem]
  type Permissions = js.Array[Permission]
  type RaidArrays = js.Array[RaidArray]
  type RdsDbInstances = js.Array[RdsDbInstance]
  type ResourceArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ebs
    - awsDashSdkLib.awsDashSdkLibStrings.`instance-store`
    - java.lang.String
  */
  type RootDeviceType = _RootDeviceType | java.lang.String
  type ServiceErrors = js.Array[ServiceError]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.git
    - awsDashSdkLib.awsDashSdkLibStrings.svn
    - awsDashSdkLib.awsDashSdkLibStrings.archive
    - awsDashSdkLib.awsDashSdkLibStrings.s3
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type StackAttributesKeys = awsDashSdkLib.awsDashSdkLibStrings.Color | java.lang.String
  type Stacks = js.Array[Stack]
  type String = java.lang.String
  type Strings = js.Array[String]
  type Switch = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type TimeBasedAutoScalingConfigurations = js.Array[TimeBasedAutoScalingConfiguration]
  type UserProfiles = js.Array[UserProfile]
  type ValidForInMinutes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.paravirtual
    - awsDashSdkLib.awsDashSdkLibStrings.hvm
    - java.lang.String
  */
  type VirtualizationType = _VirtualizationType | java.lang.String
  type VolumeConfigurations = js.Array[VolumeConfiguration]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.gp2
    - awsDashSdkLib.awsDashSdkLibStrings.io1
    - awsDashSdkLib.awsDashSdkLibStrings.standard
    - java.lang.String
  */
  type VolumeType = _VolumeType | java.lang.String
  type Volumes = js.Array[Volume]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-02-18`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

