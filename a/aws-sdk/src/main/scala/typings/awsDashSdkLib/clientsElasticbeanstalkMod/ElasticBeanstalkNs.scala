package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/elasticbeanstalk", "ElasticBeanstalk")
@js.native
object ElasticBeanstalkNs extends js.Object {
  trait AbortEnvironmentUpdateMessage extends js.Object {
    /**
      * This specifies the ID of the environment with the in-progress update that you want to cancel.
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * This specifies the name of the environment with the in-progress update that you want to cancel.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
  }
  
  trait ApplicationDescription extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the application.
      */
    var ApplicationArn: js.UndefOr[ApplicationArn] = js.undefined
    /**
      * The name of the application.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * The names of the configuration templates associated with this application.
      */
    var ConfigurationTemplates: js.UndefOr[ConfigurationTemplateNamesList] = js.undefined
    /**
      * The date when the application was created.
      */
    var DateCreated: js.UndefOr[CreationDate] = js.undefined
    /**
      * The date when the application was last modified.
      */
    var DateUpdated: js.UndefOr[UpdateDate] = js.undefined
    /**
      * User-defined description of the application.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The lifecycle settings for the application.
      */
    var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined
    /**
      * The names of the versions for this application.
      */
    var Versions: js.UndefOr[VersionLabelsList] = js.undefined
  }
  
  trait ApplicationDescriptionMessage extends js.Object {
    /**
      *  The ApplicationDescription of the application. 
      */
    var Application: js.UndefOr[ApplicationDescription] = js.undefined
  }
  
  trait ApplicationDescriptionsMessage extends js.Object {
    /**
      * This parameter contains a list of ApplicationDescription.
      */
    var Applications: js.UndefOr[ApplicationDescriptionList] = js.undefined
  }
  
  trait ApplicationMetrics extends js.Object {
    /**
      * The amount of time that the metrics cover (usually 10 seconds). For example, you might have 5 requests (request_count) within the most recent time slice of 10 seconds (duration).
      */
    var Duration: js.UndefOr[NullableInteger] = js.undefined
    /**
      * Represents the average latency for the slowest X percent of requests over the last 10 seconds. Latencies are in seconds with one millisecond resolution.
      */
    var Latency: js.UndefOr[Latency] = js.undefined
    /**
      * Average number of requests handled by the web server per second over the last 10 seconds.
      */
    var RequestCount: js.UndefOr[RequestCount] = js.undefined
    /**
      * Represents the percentage of requests over the last 10 seconds that resulted in each type of status code response.
      */
    var StatusCodes: js.UndefOr[StatusCodes] = js.undefined
  }
  
  trait ApplicationResourceLifecycleConfig extends js.Object {
    /**
      * The ARN of an IAM service role that Elastic Beanstalk has permission to assume. The ServiceRole property is required the first time that you provide a VersionLifecycleConfig for the application in one of the supporting calls (CreateApplication or UpdateApplicationResourceLifecycle). After you provide it once, in either one of the calls, Elastic Beanstalk persists the Service Role with the application, and you don't need to specify it again in subsequent UpdateApplicationResourceLifecycle calls. You can, however, specify it in subsequent calls to change the Service Role to another value.
      */
    var ServiceRole: js.UndefOr[String] = js.undefined
    /**
      * The application version lifecycle configuration.
      */
    var VersionLifecycleConfig: js.UndefOr[ApplicationVersionLifecycleConfig] = js.undefined
  }
  
  trait ApplicationResourceLifecycleDescriptionMessage extends js.Object {
    /**
      * The name of the application.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * The lifecycle configuration.
      */
    var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined
  }
  
  trait ApplicationVersionDescription extends js.Object {
    /**
      * The name of the application to which the application version belongs.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the application version.
      */
    var ApplicationVersionArn: js.UndefOr[ApplicationVersionArn] = js.undefined
    /**
      * Reference to the artifact from the AWS CodeBuild build.
      */
    var BuildArn: js.UndefOr[String] = js.undefined
    /**
      * The creation date of the application version.
      */
    var DateCreated: js.UndefOr[CreationDate] = js.undefined
    /**
      * The last modified date of the application version.
      */
    var DateUpdated: js.UndefOr[UpdateDate] = js.undefined
    /**
      * The description of the application version.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * If the version's source code was retrieved from AWS CodeCommit, the location of the source code for the application version.
      */
    var SourceBuildInformation: js.UndefOr[SourceBuildInformation] = js.undefined
    /**
      * The storage location of the application version's source bundle in Amazon S3.
      */
    var SourceBundle: js.UndefOr[S3Location] = js.undefined
    /**
      * The processing status of the application version. Reflects the state of the application version during its creation. Many of the values are only applicable if you specified True for the Process parameter of the CreateApplicationVersion action. The following list describes the possible values.    Unprocessed – Application version wasn't pre-processed or validated. Elastic Beanstalk will validate configuration files during deployment of the application version to an environment.    Processing – Elastic Beanstalk is currently processing the application version.    Building – Application version is currently undergoing an AWS CodeBuild build.    Processed – Elastic Beanstalk was successfully pre-processed and validated.    Failed – Either the AWS CodeBuild build failed or configuration files didn't pass validation. This application version isn't usable.  
      */
    var Status: js.UndefOr[ApplicationVersionStatus] = js.undefined
    /**
      * A unique identifier for the application version.
      */
    var VersionLabel: js.UndefOr[VersionLabel] = js.undefined
  }
  
  trait ApplicationVersionDescriptionMessage extends js.Object {
    /**
      *  The ApplicationVersionDescription of the application version. 
      */
    var ApplicationVersion: js.UndefOr[ApplicationVersionDescription] = js.undefined
  }
  
  trait ApplicationVersionDescriptionsMessage extends js.Object {
    /**
      * List of ApplicationVersionDescription objects sorted in order of creation.
      */
    var ApplicationVersions: js.UndefOr[ApplicationVersionDescriptionList] = js.undefined
    /**
      * In a paginated request, the token that you can pass in a subsequent request to get the next response page.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  trait ApplicationVersionLifecycleConfig extends js.Object {
    /**
      * Specify a max age rule to restrict the length of time that application versions are retained for an application.
      */
    var MaxAgeRule: js.UndefOr[MaxAgeRule] = js.undefined
    /**
      * Specify a max count rule to restrict the number of application versions that are retained for an application.
      */
    var MaxCountRule: js.UndefOr[MaxCountRule] = js.undefined
  }
  
  trait ApplyEnvironmentManagedActionRequest extends js.Object {
    /**
      * The action ID of the scheduled managed action to execute.
      */
    var ActionId: String
    /**
      * The environment ID of the target environment.
      */
    var EnvironmentId: js.UndefOr[String] = js.undefined
    /**
      * The name of the target environment.
      */
    var EnvironmentName: js.UndefOr[String] = js.undefined
  }
  
  trait ApplyEnvironmentManagedActionResult extends js.Object {
    /**
      * A description of the managed action.
      */
    var ActionDescription: js.UndefOr[String] = js.undefined
    /**
      * The action ID of the managed action.
      */
    var ActionId: js.UndefOr[String] = js.undefined
    /**
      * The type of managed action.
      */
    var ActionType: js.UndefOr[ActionType] = js.undefined
    /**
      * The status of the managed action.
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait AutoScalingGroup extends js.Object {
    /**
      * The name of the AutoScalingGroup . 
      */
    var Name: js.UndefOr[ResourceId] = js.undefined
  }
  
  trait BuildConfiguration extends js.Object {
    /**
      * The name of the artifact of the CodeBuild build. If provided, Elastic Beanstalk stores the build artifact in the S3 location S3-bucket/resources/application-name/codebuild/codebuild-version-label-artifact-name.zip. If not provided, Elastic Beanstalk stores the build artifact in the S3 location S3-bucket/resources/application-name/codebuild/codebuild-version-label.zip. 
      */
    var ArtifactName: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
      */
    var CodeBuildServiceRole: NonEmptyString
    /**
      * Information about the compute resources the build project will use.    BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds     BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds     BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds   
      */
    var ComputeType: js.UndefOr[ComputeType] = js.undefined
    /**
      * The ID of the Docker image to use for this build project.
      */
    var Image: NonEmptyString
    /**
      * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
      */
    var TimeoutInMinutes: js.UndefOr[BoxedInt] = js.undefined
  }
  
  trait Builder extends js.Object {
    /**
      * The ARN of the builder.
      */
    var ARN: js.UndefOr[ARN] = js.undefined
  }
  
  trait CPUUtilization extends js.Object {
    /**
      * Available on Linux environments only. Percentage of time that the CPU has spent in the I/O Wait state over the last 10 seconds.
      */
    var IOWait: js.UndefOr[NullableDouble] = js.undefined
    /**
      * Available on Linux environments only. Percentage of time that the CPU has spent in the IRQ state over the last 10 seconds.
      */
    var IRQ: js.UndefOr[NullableDouble] = js.undefined
    /**
      * Percentage of time that the CPU has spent in the Idle state over the last 10 seconds.
      */
    var Idle: js.UndefOr[NullableDouble] = js.undefined
    /**
      * Available on Linux environments only. Percentage of time that the CPU has spent in the Nice state over the last 10 seconds.
      */
    var Nice: js.UndefOr[NullableDouble] = js.undefined
    /**
      * Available on Windows environments only. Percentage of time that the CPU has spent in the Privileged state over the last 10 seconds.
      */
    var Privileged: js.UndefOr[NullableDouble] = js.undefined
    /**
      * Available on Linux environments only. Percentage of time that the CPU has spent in the SoftIRQ state over the last 10 seconds.
      */
    var SoftIRQ: js.UndefOr[NullableDouble] = js.undefined
    /**
      * Available on Linux environments only. Percentage of time that the CPU has spent in the System state over the last 10 seconds.
      */
    var System: js.UndefOr[NullableDouble] = js.undefined
    /**
      * Percentage of time that the CPU has spent in the User state over the last 10 seconds.
      */
    var User: js.UndefOr[NullableDouble] = js.undefined
  }
  
  trait CheckDNSAvailabilityMessage extends js.Object {
    /**
      * The prefix used when this CNAME is reserved.
      */
    var CNAMEPrefix: DNSCnamePrefix
  }
  
  trait CheckDNSAvailabilityResultMessage extends js.Object {
    /**
      * Indicates if the specified CNAME is available:    true : The CNAME is available.    false : The CNAME is not available.  
      */
    var Available: js.UndefOr[CnameAvailability] = js.undefined
    /**
      * The fully qualified CNAME to reserve when CreateEnvironment is called with the provided prefix.
      */
    var FullyQualifiedCNAME: js.UndefOr[DNSCname] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ComposeEnvironmentsMessage extends js.Object {
    /**
      * The name of the application to which the specified source bundles belong.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * The name of the group to which the target environments belong. Specify a group name only if the environment name defined in each target environment's manifest ends with a + (plus) character. See Environment Manifest (env.yaml) for details.
      */
    var GroupName: js.UndefOr[GroupName] = js.undefined
    /**
      * A list of version labels, specifying one or more application source bundles that belong to the target application. Each source bundle must include an environment manifest that specifies the name of the environment and the name of the solution stack to use, and optionally can specify environment links to create.
      */
    var VersionLabels: js.UndefOr[VersionLabels] = js.undefined
  }
  
  trait ConfigurationOptionDescription extends js.Object {
    /**
      * An indication of which action is required if the value for this configuration option changes:    NoInterruption : There is no interruption to the environment or application availability.    RestartEnvironment : The environment is entirely restarted, all AWS resources are deleted and recreated, and the environment is unavailable during the process.    RestartApplicationServer : The environment is available the entire time. However, a short application outage occurs when the application servers on the running Amazon EC2 instances are restarted.  
      */
    var ChangeSeverity: js.UndefOr[ConfigurationOptionSeverity] = js.undefined
    /**
      * The default value for this configuration option.
      */
    var DefaultValue: js.UndefOr[ConfigurationOptionDefaultValue] = js.undefined
    /**
      * If specified, the configuration option must be a string value no longer than this value.
      */
    var MaxLength: js.UndefOr[OptionRestrictionMaxLength] = js.undefined
    /**
      * If specified, the configuration option must be a numeric value less than this value.
      */
    var MaxValue: js.UndefOr[OptionRestrictionMaxValue] = js.undefined
    /**
      * If specified, the configuration option must be a numeric value greater than this value.
      */
    var MinValue: js.UndefOr[OptionRestrictionMinValue] = js.undefined
    /**
      * The name of the configuration option.
      */
    var Name: js.UndefOr[ConfigurationOptionName] = js.undefined
    /**
      * A unique namespace identifying the option's associated AWS resource.
      */
    var Namespace: js.UndefOr[OptionNamespace] = js.undefined
    /**
      * If specified, the configuration option must be a string value that satisfies this regular expression.
      */
    var Regex: js.UndefOr[OptionRestrictionRegex] = js.undefined
    /**
      * An indication of whether the user defined this configuration option:    true : This configuration option was defined by the user. It is a valid choice for specifying if this as an Option to Remove when updating configuration settings.     false : This configuration was not defined by the user.    Constraint: You can remove only UserDefined options from a configuration.   Valid Values: true | false 
      */
    var UserDefined: js.UndefOr[UserDefinedOption] = js.undefined
    /**
      * If specified, values for the configuration option are selected from this list.
      */
    var ValueOptions: js.UndefOr[ConfigurationOptionPossibleValues] = js.undefined
    /**
      * An indication of which type of values this option has and whether it is allowable to select one or more than one of the possible values:    Scalar : Values for this option are a single selection from the possible values, or an unformatted string, or numeric value governed by the MIN/MAX/Regex constraints.    List : Values for this option are multiple selections from the possible values.    Boolean : Values for this option are either true or false .    Json : Values for this option are a JSON representation of a ConfigDocument.  
      */
    var ValueType: js.UndefOr[ConfigurationOptionValueType] = js.undefined
  }
  
  trait ConfigurationOptionSetting extends js.Object {
    /**
      * A unique namespace identifying the option's associated AWS resource.
      */
    var Namespace: js.UndefOr[OptionNamespace] = js.undefined
    /**
      * The name of the configuration option.
      */
    var OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined
    /**
      * A unique resource name for a time-based scaling configuration option.
      */
    var ResourceName: js.UndefOr[ResourceName] = js.undefined
    /**
      * The current value for the configuration option.
      */
    var Value: js.UndefOr[ConfigurationOptionValue] = js.undefined
  }
  
  trait ConfigurationOptionsDescription extends js.Object {
    /**
      *  A list of ConfigurationOptionDescription. 
      */
    var Options: js.UndefOr[ConfigurationOptionDescriptionsList] = js.undefined
    /**
      * The ARN of the platform.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    /**
      * The name of the solution stack these configuration options belong to.
      */
    var SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
  }
  
  trait ConfigurationSettingsDescription extends js.Object {
    /**
      * The name of the application associated with this configuration set.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * The date (in UTC time) when this configuration set was created.
      */
    var DateCreated: js.UndefOr[CreationDate] = js.undefined
    /**
      * The date (in UTC time) when this configuration set was last modified.
      */
    var DateUpdated: js.UndefOr[UpdateDate] = js.undefined
    /**
      *  If this configuration set is associated with an environment, the DeploymentStatus parameter indicates the deployment status of this configuration set:     null: This configuration is not associated with a running environment.    pending: This is a draft configuration that is not deployed to the associated environment but is in the process of deploying.    deployed: This is the configuration that is currently deployed to the associated running environment.    failed: This is a draft configuration that failed to successfully deploy.  
      */
    var DeploymentStatus: js.UndefOr[ConfigurationDeploymentStatus] = js.undefined
    /**
      * Describes this configuration set.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      *  If not null, the name of the environment for this configuration set. 
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * A list of the configuration options and their values in this configuration set.
      */
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined
    /**
      * The ARN of the platform.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    /**
      * The name of the solution stack this configuration set uses.
      */
    var SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
    /**
      *  If not null, the name of the configuration template for this configuration set. 
      */
    var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
  }
  
  trait ConfigurationSettingsDescriptions extends js.Object {
    /**
      *  A list of ConfigurationSettingsDescription. 
      */
    var ConfigurationSettings: js.UndefOr[ConfigurationSettingsDescriptionList] = js.undefined
  }
  
  trait ConfigurationSettingsValidationMessages extends js.Object {
    /**
      *  A list of ValidationMessage. 
      */
    var Messages: js.UndefOr[ValidationMessagesList] = js.undefined
  }
  
  trait CreateApplicationMessage extends js.Object {
    /**
      * The name of the application. Constraint: This name must be unique within your account. If the specified name already exists, the action returns an InvalidParameterValue error.
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * Describes the application.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * Specify an application resource lifecycle configuration to prevent your application from accumulating too many versions.
      */
    var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined
    /**
      * Specifies the tags applied to the application. Elastic Beanstalk applies these tags only to the application. Environments that you create in the application don't inherit the tags.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait CreateApplicationVersionMessage extends js.Object {
    /**
      *  The name of the application. If no application is found with this name, and AutoCreateApplication is false, returns an InvalidParameterValue error. 
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * Set to true to create an application with the specified name if it doesn't already exist.
      */
    var AutoCreateApplication: js.UndefOr[AutoCreateApplication] = js.undefined
    /**
      * Settings for an AWS CodeBuild build.
      */
    var BuildConfiguration: js.UndefOr[BuildConfiguration] = js.undefined
    /**
      * Describes this version.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * Pre-processes and validates the environment manifest (env.yaml) and configuration files (*.config files in the .ebextensions folder) in the source bundle. Validating configuration files can identify issues prior to deploying the application version to an environment. You must turn processing on for application versions that you create using AWS CodeBuild or AWS CodeCommit. For application versions built from a source bundle in Amazon S3, processing is optional.  The Process option validates Elastic Beanstalk configuration files. It doesn't validate your application's configuration files, like proxy server or Docker configuration. 
      */
    var Process: js.UndefOr[ApplicationVersionProccess] = js.undefined
    /**
      * Specify a commit in an AWS CodeCommit Git repository to use as the source code for the application version.
      */
    var SourceBuildInformation: js.UndefOr[SourceBuildInformation] = js.undefined
    /**
      * The Amazon S3 bucket and key that identify the location of the source bundle for this version.  The Amazon S3 bucket must be in the same region as the environment.  Specify a source bundle in S3 or a commit in an AWS CodeCommit repository (with SourceBuildInformation), but not both. If neither SourceBundle nor SourceBuildInformation are provided, Elastic Beanstalk uses a sample application.
      */
    var SourceBundle: js.UndefOr[S3Location] = js.undefined
    /**
      * Specifies the tags applied to the application version. Elastic Beanstalk applies these tags only to the application version. Environments that use the application version don't inherit the tags.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * A label identifying this version. Constraint: Must be unique per application. If an application version already exists with this label for the specified application, AWS Elastic Beanstalk returns an InvalidParameterValue error. 
      */
    var VersionLabel: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.VersionLabel
  }
  
  trait CreateConfigurationTemplateMessage extends js.Object {
    /**
      * The name of the application to associate with this configuration template. If no application is found with this name, AWS Elastic Beanstalk returns an InvalidParameterValue error. 
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * Describes this configuration.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The ID of the environment used with this configuration template.
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk sets the specified configuration option to the requested value. The new value overrides the value obtained from the solution stack or the source configuration template.
      */
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined
    /**
      * The ARN of the custom platform.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    /**
      * The name of the solution stack used by this configuration. The solution stack specifies the operating system, architecture, and application server for a configuration template. It determines the set of configuration options as well as the possible and default values.  Use ListAvailableSolutionStacks to obtain a list of available solution stacks.   A solution stack name or a source configuration parameter must be specified, otherwise AWS Elastic Beanstalk returns an InvalidParameterValue error.  If a solution stack name is not specified and the source configuration parameter is specified, AWS Elastic Beanstalk uses the same solution stack as the source configuration template.
      */
    var SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk uses the configuration values from the specified configuration template to create a new configuration.  Values specified in the OptionSettings parameter of this call overrides any values obtained from the SourceConfiguration.   If no configuration template is found, returns an InvalidParameterValue error.   Constraint: If both the solution stack name parameter and the source configuration parameters are specified, the solution stack of the source configuration template must match the specified solution stack name or else AWS Elastic Beanstalk returns an InvalidParameterCombination error. 
      */
    var SourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined
    /**
      * Specifies the tags applied to the configuration template.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The name of the configuration template. Constraint: This name must be unique per application. Default: If a configuration template already exists with this name, AWS Elastic Beanstalk returns an InvalidParameterValue error. 
      */
    var TemplateName: ConfigurationTemplateName
  }
  
  trait CreateEnvironmentMessage extends js.Object {
    /**
      * The name of the application that contains the version to be deployed.  If no application is found with this name, CreateEnvironment returns an InvalidParameterValue error. 
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * If specified, the environment attempts to use this value as the prefix for the CNAME. If not specified, the CNAME is generated automatically by appending a random alphanumeric string to the environment name.
      */
    var CNAMEPrefix: js.UndefOr[DNSCnamePrefix] = js.undefined
    /**
      * Describes this environment.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * A unique name for the deployment environment. Used in the application URL. Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and hyphens. It cannot start or end with a hyphen. This name must be unique within a region in your account. If the specified name already exists in the region, AWS Elastic Beanstalk returns an InvalidParameterValue error.  Default: If the CNAME parameter is not specified, the environment name becomes part of the CNAME, and therefore part of the visible URL for your application.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * The name of the group to which the target environment belongs. Specify a group name only if the environment's name is specified in an environment manifest and not with the environment name parameter. See Environment Manifest (env.yaml) for details.
      */
    var GroupName: js.UndefOr[GroupName] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in the configuration set for the new environment. These override the values obtained from the solution stack or the configuration template.
      */
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined
    /**
      * A list of custom user-defined configuration options to remove from the configuration set for this new environment.
      */
    var OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.undefined
    /**
      * The ARN of the platform.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    /**
      * This is an alternative to specifying a template name. If specified, AWS Elastic Beanstalk sets the configuration values to the default values associated with the specified solution stack. For a list of current solution stacks, see Elastic Beanstalk Supported Platforms.
      */
    var SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
    /**
      * Specifies the tags applied to resources in the environment.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      *  The name of the configuration template to use in deployment. If no configuration template is found with this name, AWS Elastic Beanstalk returns an InvalidParameterValue error. 
      */
    var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    /**
      * This specifies the tier to use for creating this environment.
      */
    var Tier: js.UndefOr[EnvironmentTier] = js.undefined
    /**
      * The name of the application version to deploy.  If the specified application has no associated application versions, AWS Elastic Beanstalk UpdateEnvironment returns an InvalidParameterValue error.  Default: If not specified, AWS Elastic Beanstalk attempts to launch the sample application in the container.
      */
    var VersionLabel: js.UndefOr[VersionLabel] = js.undefined
  }
  
  trait CreatePlatformVersionRequest extends js.Object {
    /**
      * The name of the builder environment.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * The configuration option settings to apply to the builder environment.
      */
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined
    /**
      * The location of the platform definition archive in Amazon S3.
      */
    var PlatformDefinitionBundle: S3Location
    /**
      * The name of your custom platform.
      */
    var PlatformName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.PlatformName
    /**
      * The number, such as 1.0.2, for the new platform version.
      */
    var PlatformVersion: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.PlatformVersion
    /**
      * Specifies the tags applied to the new platform version. Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the platform version don't inherit the tags.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait CreatePlatformVersionResult extends js.Object {
    /**
      * The builder used to create the custom platform.
      */
    var Builder: js.UndefOr[Builder] = js.undefined
    /**
      * Detailed information about the new version of the custom platform.
      */
    var PlatformSummary: js.UndefOr[PlatformSummary] = js.undefined
  }
  
  trait CreateStorageLocationResultMessage extends js.Object {
    /**
      * The name of the Amazon S3 bucket created.
      */
    var S3Bucket: js.UndefOr[S3Bucket] = js.undefined
  }
  
  trait CustomAmi extends js.Object {
    /**
      * THe ID of the image used to create the custom AMI.
      */
    var ImageId: js.UndefOr[ImageId] = js.undefined
    /**
      * The type of virtualization used to create the custom AMI.
      */
    var VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined
  }
  
  trait DeleteApplicationMessage extends js.Object {
    /**
      * The name of the application to delete.
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * When set to true, running environments will be terminated before deleting the application.
      */
    var TerminateEnvByForce: js.UndefOr[TerminateEnvForce] = js.undefined
  }
  
  trait DeleteApplicationVersionMessage extends js.Object {
    /**
      * The name of the application to which the version belongs.
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * Set to true to delete the source bundle from your storage bucket. Otherwise, the application version is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
      */
    var DeleteSourceBundle: js.UndefOr[DeleteSourceBundle] = js.undefined
    /**
      * The label of the version to delete.
      */
    var VersionLabel: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.VersionLabel
  }
  
  trait DeleteConfigurationTemplateMessage extends js.Object {
    /**
      * The name of the application to delete the configuration template from.
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * The name of the configuration template to delete.
      */
    var TemplateName: ConfigurationTemplateName
  }
  
  trait DeleteEnvironmentConfigurationMessage extends js.Object {
    /**
      * The name of the application the environment is associated with.
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * The name of the environment to delete the draft configuration from.
      */
    var EnvironmentName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.EnvironmentName
  }
  
  trait DeletePlatformVersionRequest extends js.Object {
    /**
      * The ARN of the version of the custom platform.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
  }
  
  trait DeletePlatformVersionResult extends js.Object {
    /**
      * Detailed information about the version of the custom platform.
      */
    var PlatformSummary: js.UndefOr[PlatformSummary] = js.undefined
  }
  
  trait Deployment extends js.Object {
    /**
      * The ID of the deployment. This number increases by one each time that you deploy source code or change instance configuration settings.
      */
    var DeploymentId: js.UndefOr[NullableLong] = js.undefined
    /**
      * For in-progress deployments, the time that the deployment started. For completed deployments, the time that the deployment ended.
      */
    var DeploymentTime: js.UndefOr[DeploymentTimestamp] = js.undefined
    /**
      * The status of the deployment:    In Progress : The deployment is in progress.    Deployed : The deployment succeeded.    Failed : The deployment failed.  
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The version label of the application version in the deployment.
      */
    var VersionLabel: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeAccountAttributesResult extends js.Object {
    /**
      * The Elastic Beanstalk resource quotas associated with the calling AWS account.
      */
    var ResourceQuotas: js.UndefOr[ResourceQuotas] = js.undefined
  }
  
  trait DescribeApplicationVersionsMessage extends js.Object {
    /**
      * Specify an application name to show only application versions for that application.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * For a paginated request. Specify a maximum number of application versions to include in each response. If no MaxRecords is specified, all available application versions are retrieved in a single response.
      */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
      * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
      * Specify a version label to show a specific application version.
      */
    var VersionLabels: js.UndefOr[VersionLabelsList] = js.undefined
  }
  
  trait DescribeApplicationsMessage extends js.Object {
    /**
      * If specified, AWS Elastic Beanstalk restricts the returned descriptions to only include those with the specified names.
      */
    var ApplicationNames: js.UndefOr[ApplicationNamesList] = js.undefined
  }
  
  trait DescribeConfigurationOptionsMessage extends js.Object {
    /**
      * The name of the application associated with the configuration template or environment. Only needed if you want to describe the configuration options associated with either the configuration template or environment.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * The name of the environment whose configuration options you want to describe.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * If specified, restricts the descriptions to only the specified options.
      */
    var Options: js.UndefOr[OptionsSpecifierList] = js.undefined
    /**
      * The ARN of the custom platform.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    /**
      * The name of the solution stack whose configuration options you want to describe.
      */
    var SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
    /**
      * The name of the configuration template whose configuration options you want to describe.
      */
    var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
  }
  
  trait DescribeConfigurationSettingsMessage extends js.Object {
    /**
      * The application for the environment or configuration template.
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * The name of the environment to describe.  Condition: You must specify either this or a TemplateName, but not both. If you specify both, AWS Elastic Beanstalk returns an InvalidParameterCombination error. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * The name of the configuration template to describe.  Conditional: You must specify either this parameter or an EnvironmentName, but not both. If you specify both, AWS Elastic Beanstalk returns an InvalidParameterCombination error. If you do not specify either, AWS Elastic Beanstalk returns a MissingRequiredParameter error. 
      */
    var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
  }
  
  trait DescribeEnvironmentHealthRequest extends js.Object {
    /**
      * Specify the response elements to return. To retrieve all attributes, set to All. If no attribute names are specified, returns the name of the environment.
      */
    var AttributeNames: js.UndefOr[EnvironmentHealthAttributes] = js.undefined
    /**
      * Specify the environment by ID. You must specify either this or an EnvironmentName, or both.
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * Specify the environment by name. You must specify either this or an EnvironmentName, or both.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
  }
  
  trait DescribeEnvironmentHealthResult extends js.Object {
    /**
      * Application request metrics for the environment.
      */
    var ApplicationMetrics: js.UndefOr[ApplicationMetrics] = js.undefined
    /**
      * Descriptions of the data that contributed to the environment's current health status.
      */
    var Causes: js.UndefOr[Causes] = js.undefined
    /**
      * The health color of the environment.
      */
    var Color: js.UndefOr[String] = js.undefined
    /**
      * The environment's name.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * The health status of the environment. For example, Ok.
      */
    var HealthStatus: js.UndefOr[String] = js.undefined
    /**
      * Summary health information for the instances in the environment.
      */
    var InstancesHealth: js.UndefOr[InstanceHealthSummary] = js.undefined
    /**
      * The date and time that the health information was retrieved.
      */
    var RefreshedAt: js.UndefOr[RefreshedAt] = js.undefined
    /**
      * The environment's operational status. Ready, Launching, Updating, Terminating, or Terminated.
      */
    var Status: js.UndefOr[EnvironmentHealth] = js.undefined
  }
  
  trait DescribeEnvironmentManagedActionHistoryRequest extends js.Object {
    /**
      * The environment ID of the target environment.
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * The name of the target environment.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * The maximum number of items to return for a single request.
      */
    var MaxItems: js.UndefOr[Integer] = js.undefined
    /**
      * The pagination token returned by a previous request.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeEnvironmentManagedActionHistoryResult extends js.Object {
    /**
      * A list of completed and failed managed actions.
      */
    var ManagedActionHistoryItems: js.UndefOr[ManagedActionHistoryItems] = js.undefined
    /**
      * A pagination token that you pass to DescribeEnvironmentManagedActionHistory to get the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeEnvironmentManagedActionsRequest extends js.Object {
    /**
      * The environment ID of the target environment.
      */
    var EnvironmentId: js.UndefOr[String] = js.undefined
    /**
      * The name of the target environment.
      */
    var EnvironmentName: js.UndefOr[String] = js.undefined
    /**
      * To show only actions with a particular status, specify a status.
      */
    var Status: js.UndefOr[ActionStatus] = js.undefined
  }
  
  trait DescribeEnvironmentManagedActionsResult extends js.Object {
    /**
      * A list of upcoming and in-progress managed actions.
      */
    var ManagedActions: js.UndefOr[ManagedActions] = js.undefined
  }
  
  trait DescribeEnvironmentResourcesMessage extends js.Object {
    /**
      * The ID of the environment to retrieve AWS resource usage data.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * The name of the environment to retrieve AWS resource usage data.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
  }
  
  trait DescribeEnvironmentsMessage extends js.Object {
    /**
      * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated with this application.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the specified IDs.
      */
    var EnvironmentIds: js.UndefOr[EnvironmentIdList] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the specified names.
      */
    var EnvironmentNames: js.UndefOr[EnvironmentNamesList] = js.undefined
    /**
      * Indicates whether to include deleted environments:  true: Environments that have been deleted after IncludedDeletedBackTo are displayed.  false: Do not include deleted environments.
      */
    var IncludeDeleted: js.UndefOr[IncludeDeleted] = js.undefined
    /**
      *  If specified when IncludeDeleted is set to true, then environments deleted after this date are displayed. 
      */
    var IncludedDeletedBackTo: js.UndefOr[IncludeDeletedBackTo] = js.undefined
    /**
      * For a paginated request. Specify a maximum number of environments to include in each response. If no MaxRecords is specified, all available environments are retrieved in a single response.
      */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
      * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated with this application version.
      */
    var VersionLabel: js.UndefOr[VersionLabel] = js.undefined
  }
  
  trait DescribeEventsMessage extends js.Object {
    /**
      * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those associated with this application.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      *  If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur up to, but not including, the EndTime. 
      */
    var EndTime: js.UndefOr[TimeFilterEnd] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this environment.
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this environment.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * Specifies the maximum number of events that can be returned, beginning with the most recent event.
      */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
      * Pagination token. If specified, the events return the next batch of results.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
      * The ARN of the version of the custom platform.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk restricts the described events to include only those associated with this request ID.
      */
    var RequestId: js.UndefOr[RequestId] = js.undefined
    /**
      * If specified, limits the events returned from this call to include only those with the specified severity or higher.
      */
    var Severity: js.UndefOr[EventSeverity] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur on or after this time.
      */
    var StartTime: js.UndefOr[TimeFilterStart] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that are associated with this environment configuration.
      */
    var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this application version.
      */
    var VersionLabel: js.UndefOr[VersionLabel] = js.undefined
  }
  
  trait DescribeInstancesHealthRequest extends js.Object {
    /**
      * Specifies the response elements you wish to receive. To retrieve all attributes, set to All. If no attribute names are specified, returns a list of instances.
      */
    var AttributeNames: js.UndefOr[InstancesHealthAttributes] = js.undefined
    /**
      * Specify the AWS Elastic Beanstalk environment by ID.
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * Specify the AWS Elastic Beanstalk environment by name.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * Specify the pagination token returned by a previous call.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeInstancesHealthResult extends js.Object {
    /**
      * Detailed health information about each instance. The output differs slightly between Linux and Windows environments. There is a difference in the members that are supported under the &lt;CPUUtilization&gt; type.
      */
    var InstanceHealthList: js.UndefOr[InstanceHealthList] = js.undefined
    /**
      * Pagination token for the next page of results, if available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The date and time that the health information was retrieved.
      */
    var RefreshedAt: js.UndefOr[RefreshedAt] = js.undefined
  }
  
  trait DescribePlatformVersionRequest extends js.Object {
    /**
      * The ARN of the version of the platform.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
  }
  
  trait DescribePlatformVersionResult extends js.Object {
    /**
      * Detailed information about the version of the platform.
      */
    var PlatformDescription: js.UndefOr[PlatformDescription] = js.undefined
  }
  
  trait EnvironmentDescription extends js.Object {
    /**
      * Indicates if there is an in-progress environment configuration update or application version deployment that you can cancel.  true: There is an update in progress.   false: There are no updates currently in progress. 
      */
    var AbortableOperationInProgress: js.UndefOr[AbortableOperationInProgress] = js.undefined
    /**
      * The name of the application associated with this environment.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * The URL to the CNAME for this environment.
      */
    var CNAME: js.UndefOr[DNSCname] = js.undefined
    /**
      * The creation date for this environment.
      */
    var DateCreated: js.UndefOr[CreationDate] = js.undefined
    /**
      * The last modified date for this environment.
      */
    var DateUpdated: js.UndefOr[UpdateDate] = js.undefined
    /**
      * Describes this environment.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * For load-balanced, autoscaling environments, the URL to the LoadBalancer. For single-instance environments, the IP address of the instance.
      */
    var EndpointURL: js.UndefOr[EndpointURL] = js.undefined
    /**
      * The environment's Amazon Resource Name (ARN), which can be used in other API requests that require an ARN.
      */
    var EnvironmentArn: js.UndefOr[EnvironmentArn] = js.undefined
    /**
      * The ID of this environment.
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * A list of links to other environments in the same group.
      */
    var EnvironmentLinks: js.UndefOr[EnvironmentLinks] = js.undefined
    /**
      * The name of this environment.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * Describes the health status of the environment. AWS Elastic Beanstalk indicates the failure levels for a running environment:    Red: Indicates the environment is not responsive. Occurs when three or more consecutive failures occur for an environment.    Yellow: Indicates that something is wrong. Occurs when two consecutive failures occur for an environment.    Green: Indicates the environment is healthy and fully functional.    Grey: Default health for a new environment. The environment is not fully launched and health checks have not started or health checks are suspended during an UpdateEnvironment or RestartEnvironment request.    Default: Grey 
      */
    var Health: js.UndefOr[EnvironmentHealth] = js.undefined
    /**
      * Returns the health status of the application running in your environment. For more information, see Health Colors and Statuses.
      */
    var HealthStatus: js.UndefOr[EnvironmentHealthStatus] = js.undefined
    /**
      * The ARN of the platform.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    /**
      * The description of the AWS resources used by this environment.
      */
    var Resources: js.UndefOr[EnvironmentResourcesDescription] = js.undefined
    /**
      *  The name of the SolutionStack deployed with this environment. 
      */
    var SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
    /**
      * The current operational status of the environment:    Launching: Environment is in the process of initial deployment.    Updating: Environment is in the process of updating its configuration settings or application version.    Ready: Environment is available to have an action performed on it, such as update or terminate.    Terminating: Environment is in the shut-down process.    Terminated: Environment is not running.  
      */
    var Status: js.UndefOr[EnvironmentStatus] = js.undefined
    /**
      * The name of the configuration template used to originally launch this environment.
      */
    var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    /**
      * Describes the current tier of this environment.
      */
    var Tier: js.UndefOr[EnvironmentTier] = js.undefined
    /**
      * The application version deployed in this environment.
      */
    var VersionLabel: js.UndefOr[VersionLabel] = js.undefined
  }
  
  trait EnvironmentDescriptionsMessage extends js.Object {
    /**
      *  Returns an EnvironmentDescription list. 
      */
    var Environments: js.UndefOr[EnvironmentDescriptionsList] = js.undefined
    /**
      * In a paginated request, the token that you can pass in a subsequent request to get the next response page.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  trait EnvironmentInfoDescription extends js.Object {
    /**
      * The Amazon EC2 Instance ID for this information.
      */
    var Ec2InstanceId: js.UndefOr[Ec2InstanceId] = js.undefined
    /**
      * The type of information retrieved.
      */
    var InfoType: js.UndefOr[EnvironmentInfoType] = js.undefined
    /**
      * The retrieved information. Currently contains a presigned Amazon S3 URL. The files are deleted after 15 minutes. Anyone in possession of this URL can access the files before they are deleted. Make the URL available only to trusted parties.
      */
    var Message: js.UndefOr[Message] = js.undefined
    /**
      * The time stamp when this information was retrieved.
      */
    var SampleTimestamp: js.UndefOr[SampleTimestamp] = js.undefined
  }
  
  trait EnvironmentLink extends js.Object {
    /**
      * The name of the linked environment (the dependency).
      */
    var EnvironmentName: js.UndefOr[String] = js.undefined
    /**
      * The name of the link.
      */
    var LinkName: js.UndefOr[String] = js.undefined
  }
  
  trait EnvironmentResourceDescription extends js.Object {
    /**
      *  The AutoScalingGroups used by this environment. 
      */
    var AutoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined
    /**
      * The name of the environment.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * The Amazon EC2 instances used by this environment.
      */
    var Instances: js.UndefOr[InstanceList] = js.undefined
    /**
      * The Auto Scaling launch configurations in use by this environment.
      */
    var LaunchConfigurations: js.UndefOr[LaunchConfigurationList] = js.undefined
    /**
      * The Amazon EC2 launch templates in use by this environment.
      */
    var LaunchTemplates: js.UndefOr[LaunchTemplateList] = js.undefined
    /**
      * The LoadBalancers in use by this environment.
      */
    var LoadBalancers: js.UndefOr[LoadBalancerList] = js.undefined
    /**
      * The queues used by this environment.
      */
    var Queues: js.UndefOr[QueueList] = js.undefined
    /**
      * The AutoScaling triggers in use by this environment. 
      */
    var Triggers: js.UndefOr[TriggerList] = js.undefined
  }
  
  trait EnvironmentResourceDescriptionsMessage extends js.Object {
    /**
      *  A list of EnvironmentResourceDescription. 
      */
    var EnvironmentResources: js.UndefOr[EnvironmentResourceDescription] = js.undefined
  }
  
  trait EnvironmentResourcesDescription extends js.Object {
    /**
      * Describes the LoadBalancer.
      */
    var LoadBalancer: js.UndefOr[LoadBalancerDescription] = js.undefined
  }
  
  trait EnvironmentTier extends js.Object {
    /**
      * The name of this environment tier. Valid values:   For Web server tier – WebServer    For Worker tier – Worker   
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The type of this environment tier. Valid values:   For Web server tier – Standard    For Worker tier – SQS/HTTP   
      */
    var Type: js.UndefOr[String] = js.undefined
    /**
      * The version of this environment tier. When you don't set a value to it, Elastic Beanstalk uses the latest compatible worker tier version.  This member is deprecated. Any specific version that you set may become out of date. We recommend leaving it unspecified. 
      */
    var Version: js.UndefOr[String] = js.undefined
  }
  
  trait EventDescription extends js.Object {
    /**
      * The application associated with the event.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * The name of the environment associated with this event.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * The date when the event occurred.
      */
    var EventDate: js.UndefOr[EventDate] = js.undefined
    /**
      * The event message.
      */
    var Message: js.UndefOr[EventMessage] = js.undefined
    /**
      * The ARN of the platform.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    /**
      * The web service request ID for the activity of this event.
      */
    var RequestId: js.UndefOr[RequestId] = js.undefined
    /**
      * The severity level of this event.
      */
    var Severity: js.UndefOr[EventSeverity] = js.undefined
    /**
      * The name of the configuration associated with this event.
      */
    var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    /**
      * The release label for the application version associated with this event.
      */
    var VersionLabel: js.UndefOr[VersionLabel] = js.undefined
  }
  
  trait EventDescriptionsMessage extends js.Object {
    /**
      *  A list of EventDescription. 
      */
    var Events: js.UndefOr[EventDescriptionList] = js.undefined
    /**
      *  If returned, this indicates that there are more results to obtain. Use this token in the next DescribeEvents call to get the next batch of events. 
      */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  trait Instance extends js.Object {
    /**
      * The ID of the Amazon EC2 instance.
      */
    var Id: js.UndefOr[ResourceId] = js.undefined
  }
  
  trait InstanceHealthSummary extends js.Object {
    /**
      *  Red. The health agent is reporting a high number of request failures or other issues for an instance or environment.
      */
    var Degraded: js.UndefOr[NullableInteger] = js.undefined
    /**
      *  Green. An operation is in progress on an instance.
      */
    var Info: js.UndefOr[NullableInteger] = js.undefined
    /**
      *  Grey. AWS Elastic Beanstalk and the health agent are reporting no data on an instance.
      */
    var NoData: js.UndefOr[NullableInteger] = js.undefined
    /**
      *  Green. An instance is passing health checks and the health agent is not reporting any problems.
      */
    var Ok: js.UndefOr[NullableInteger] = js.undefined
    /**
      *  Grey. An operation is in progress on an instance within the command timeout.
      */
    var Pending: js.UndefOr[NullableInteger] = js.undefined
    /**
      *  Red. The health agent is reporting a very high number of request failures or other issues for an instance or environment.
      */
    var Severe: js.UndefOr[NullableInteger] = js.undefined
    /**
      *  Grey. AWS Elastic Beanstalk and the health agent are reporting an insufficient amount of data on an instance.
      */
    var Unknown: js.UndefOr[NullableInteger] = js.undefined
    /**
      *  Yellow. The health agent is reporting a moderate number of request failures or other issues for an instance or environment.
      */
    var Warning: js.UndefOr[NullableInteger] = js.undefined
  }
  
  trait Latency extends js.Object {
    /**
      * The average latency for the slowest 90 percent of requests over the last 10 seconds.
      */
    var P10: js.UndefOr[NullableDouble] = js.undefined
    /**
      * The average latency for the slowest 50 percent of requests over the last 10 seconds.
      */
    var P50: js.UndefOr[NullableDouble] = js.undefined
    /**
      * The average latency for the slowest 25 percent of requests over the last 10 seconds.
      */
    var P75: js.UndefOr[NullableDouble] = js.undefined
    /**
      * The average latency for the slowest 15 percent of requests over the last 10 seconds.
      */
    var P85: js.UndefOr[NullableDouble] = js.undefined
    /**
      * The average latency for the slowest 10 percent of requests over the last 10 seconds.
      */
    var P90: js.UndefOr[NullableDouble] = js.undefined
    /**
      * The average latency for the slowest 5 percent of requests over the last 10 seconds.
      */
    var P95: js.UndefOr[NullableDouble] = js.undefined
    /**
      * The average latency for the slowest 1 percent of requests over the last 10 seconds.
      */
    var P99: js.UndefOr[NullableDouble] = js.undefined
    /**
      * The average latency for the slowest 0.1 percent of requests over the last 10 seconds.
      */
    var P999: js.UndefOr[NullableDouble] = js.undefined
  }
  
  trait LaunchConfiguration extends js.Object {
    /**
      * The name of the launch configuration.
      */
    var Name: js.UndefOr[ResourceId] = js.undefined
  }
  
  trait LaunchTemplate extends js.Object {
    /**
      * The ID of the launch template.
      */
    var Id: js.UndefOr[ResourceId] = js.undefined
  }
  
  trait ListAvailableSolutionStacksResultMessage extends js.Object {
    /**
      *  A list of available solution stacks and their SolutionStackDescription. 
      */
    var SolutionStackDetails: js.UndefOr[AvailableSolutionStackDetailsList] = js.undefined
    /**
      * A list of available solution stacks.
      */
    var SolutionStacks: js.UndefOr[AvailableSolutionStackNamesList] = js.undefined
  }
  
  trait ListPlatformVersionsRequest extends js.Object {
    /**
      * List only the platforms where the platform member value relates to one of the supplied values.
      */
    var Filters: js.UndefOr[PlatformFilters] = js.undefined
    /**
      * The maximum number of platform values returned in one call.
      */
    var MaxRecords: js.UndefOr[PlatformMaxRecords] = js.undefined
    /**
      * The starting index into the remaining list of platforms. Use the NextToken value from a previous ListPlatformVersion call.
      */
    var NextToken: js.UndefOr[Token] = js.undefined
  }
  
  trait ListPlatformVersionsResult extends js.Object {
    /**
      * The starting index into the remaining list of platforms. if this value is not null, you can use it in a subsequent ListPlatformVersion call. 
      */
    var NextToken: js.UndefOr[Token] = js.undefined
    /**
      * Detailed information about the platforms.
      */
    var PlatformSummaryList: js.UndefOr[PlatformSummaryList] = js.undefined
  }
  
  trait ListTagsForResourceMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resouce for which a tag list is requested. Must be the ARN of an Elastic Beanstalk environment.
      */
    var ResourceArn: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ResourceArn
  }
  
  trait Listener extends js.Object {
    /**
      * The port that is used by the Listener.
      */
    var Port: js.UndefOr[Integer] = js.undefined
    /**
      * The protocol that is used by the Listener.
      */
    var Protocol: js.UndefOr[String] = js.undefined
  }
  
  trait LoadBalancer extends js.Object {
    /**
      * The name of the LoadBalancer.
      */
    var Name: js.UndefOr[ResourceId] = js.undefined
  }
  
  trait LoadBalancerDescription extends js.Object {
    /**
      * The domain name of the LoadBalancer.
      */
    var Domain: js.UndefOr[String] = js.undefined
    /**
      * A list of Listeners used by the LoadBalancer.
      */
    var Listeners: js.UndefOr[LoadBalancerListenersDescription] = js.undefined
    /**
      * The name of the LoadBalancer.
      */
    var LoadBalancerName: js.UndefOr[String] = js.undefined
  }
  
  trait ManagedAction extends js.Object {
    /**
      * A description of the managed action.
      */
    var ActionDescription: js.UndefOr[String] = js.undefined
    /**
      * A unique identifier for the managed action.
      */
    var ActionId: js.UndefOr[String] = js.undefined
    /**
      * The type of managed action.
      */
    var ActionType: js.UndefOr[ActionType] = js.undefined
    /**
      * The status of the managed action. If the action is Scheduled, you can apply it immediately with ApplyEnvironmentManagedAction.
      */
    var Status: js.UndefOr[ActionStatus] = js.undefined
    /**
      * The start time of the maintenance window in which the managed action will execute.
      */
    var WindowStartTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait ManagedActionHistoryItem extends js.Object {
    /**
      * A description of the managed action.
      */
    var ActionDescription: js.UndefOr[String] = js.undefined
    /**
      * A unique identifier for the managed action.
      */
    var ActionId: js.UndefOr[String] = js.undefined
    /**
      * The type of the managed action.
      */
    var ActionType: js.UndefOr[ActionType] = js.undefined
    /**
      * The date and time that the action started executing.
      */
    var ExecutedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * If the action failed, a description of the failure.
      */
    var FailureDescription: js.UndefOr[String] = js.undefined
    /**
      * If the action failed, the type of failure.
      */
    var FailureType: js.UndefOr[FailureType] = js.undefined
    /**
      * The date and time that the action finished executing.
      */
    var FinishedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The status of the action.
      */
    var Status: js.UndefOr[ActionHistoryStatus] = js.undefined
  }
  
  trait MaxAgeRule extends js.Object {
    /**
      * Set to true to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the application version.
      */
    var DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.undefined
    /**
      * Specify true to apply the rule, or false to disable it.
      */
    var Enabled: BoxedBoolean
    /**
      * Specify the number of days to retain an application versions.
      */
    var MaxAgeInDays: js.UndefOr[BoxedInt] = js.undefined
  }
  
  trait MaxCountRule extends js.Object {
    /**
      * Set to true to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the application version.
      */
    var DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.undefined
    /**
      * Specify true to apply the rule, or false to disable it.
      */
    var Enabled: BoxedBoolean
    /**
      * Specify the maximum number of application versions to retain.
      */
    var MaxCount: js.UndefOr[BoxedInt] = js.undefined
  }
  
  trait OptionRestrictionRegex extends js.Object {
    /**
      * A unique name representing this regular expression.
      */
    var Label: js.UndefOr[RegexLabel] = js.undefined
    /**
      * The regular expression pattern that a string configuration option value with this restriction must match.
      */
    var Pattern: js.UndefOr[RegexPattern] = js.undefined
  }
  
  trait OptionSpecification extends js.Object {
    /**
      * A unique namespace identifying the option's associated AWS resource.
      */
    var Namespace: js.UndefOr[OptionNamespace] = js.undefined
    /**
      * The name of the configuration option.
      */
    var OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined
    /**
      * A unique resource name for a time-based scaling configuration option.
      */
    var ResourceName: js.UndefOr[ResourceName] = js.undefined
  }
  
  trait PlatformDescription extends js.Object {
    /**
      * The custom AMIs supported by the platform.
      */
    var CustomAmiList: js.UndefOr[CustomAmiList] = js.undefined
    /**
      * The date when the platform was created.
      */
    var DateCreated: js.UndefOr[CreationDate] = js.undefined
    /**
      * The date when the platform was last updated.
      */
    var DateUpdated: js.UndefOr[UpdateDate] = js.undefined
    /**
      * The description of the platform.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The frameworks supported by the platform.
      */
    var Frameworks: js.UndefOr[PlatformFrameworks] = js.undefined
    /**
      * Information about the maintainer of the platform.
      */
    var Maintainer: js.UndefOr[Maintainer] = js.undefined
    /**
      * The operating system used by the platform.
      */
    var OperatingSystemName: js.UndefOr[OperatingSystemName] = js.undefined
    /**
      * The version of the operating system used by the platform.
      */
    var OperatingSystemVersion: js.UndefOr[OperatingSystemVersion] = js.undefined
    /**
      * The ARN of the platform.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    /**
      * The category of the platform.
      */
    var PlatformCategory: js.UndefOr[PlatformCategory] = js.undefined
    /**
      * The name of the platform.
      */
    var PlatformName: js.UndefOr[PlatformName] = js.undefined
    /**
      * The AWS account ID of the person who created the platform.
      */
    var PlatformOwner: js.UndefOr[PlatformOwner] = js.undefined
    /**
      * The status of the platform.
      */
    var PlatformStatus: js.UndefOr[PlatformStatus] = js.undefined
    /**
      * The version of the platform.
      */
    var PlatformVersion: js.UndefOr[PlatformVersion] = js.undefined
    /**
      * The programming languages supported by the platform.
      */
    var ProgrammingLanguages: js.UndefOr[PlatformProgrammingLanguages] = js.undefined
    /**
      * The name of the solution stack used by the platform.
      */
    var SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
    /**
      * The additions supported by the platform.
      */
    var SupportedAddonList: js.UndefOr[SupportedAddonList] = js.undefined
    /**
      * The tiers supported by the platform.
      */
    var SupportedTierList: js.UndefOr[SupportedTierList] = js.undefined
  }
  
  trait PlatformFilter extends js.Object {
    /**
      * The operator to apply to the Type with each of the Values.  Valid Values: = (equal to) | != (not equal to) | &lt; (less than) | &lt;= (less than or equal to) | &gt; (greater than) | &gt;= (greater than or equal to) | contains | begins_with | ends_with 
      */
    var Operator: js.UndefOr[PlatformFilterOperator] = js.undefined
    /**
      * The custom platform attribute to which the filter values are applied. Valid Values: PlatformName | PlatformVersion | PlatformStatus | PlatformOwner 
      */
    var Type: js.UndefOr[PlatformFilterType] = js.undefined
    /**
      * The list of values applied to the custom platform attribute.
      */
    var Values: js.UndefOr[PlatformFilterValueList] = js.undefined
  }
  
  trait PlatformFramework extends js.Object {
    /**
      * The name of the framework.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The version of the framework.
      */
    var Version: js.UndefOr[String] = js.undefined
  }
  
  trait PlatformProgrammingLanguage extends js.Object {
    /**
      * The name of the programming language.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The version of the programming language.
      */
    var Version: js.UndefOr[String] = js.undefined
  }
  
  trait PlatformSummary extends js.Object {
    /**
      * The operating system used by the platform.
      */
    var OperatingSystemName: js.UndefOr[OperatingSystemName] = js.undefined
    /**
      * The version of the operating system used by the platform.
      */
    var OperatingSystemVersion: js.UndefOr[OperatingSystemVersion] = js.undefined
    /**
      * The ARN of the platform.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    /**
      * The category of platform.
      */
    var PlatformCategory: js.UndefOr[PlatformCategory] = js.undefined
    /**
      * The AWS account ID of the person who created the platform.
      */
    var PlatformOwner: js.UndefOr[PlatformOwner] = js.undefined
    /**
      * The status of the platform. You can create an environment from the platform once it is ready.
      */
    var PlatformStatus: js.UndefOr[PlatformStatus] = js.undefined
    /**
      * The additions associated with the platform.
      */
    var SupportedAddonList: js.UndefOr[SupportedAddonList] = js.undefined
    /**
      * The tiers in which the platform runs.
      */
    var SupportedTierList: js.UndefOr[SupportedTierList] = js.undefined
  }
  
  trait Queue extends js.Object {
    /**
      * The name of the queue.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The URL of the queue.
      */
    var URL: js.UndefOr[String] = js.undefined
  }
  
  trait RebuildEnvironmentMessage extends js.Object {
    /**
      * The ID of the environment to rebuild.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * The name of the environment to rebuild.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
  }
  
  trait RequestEnvironmentInfoMessage extends js.Object {
    /**
      * The ID of the environment of the requested data. If no such environment is found, RequestEnvironmentInfo returns an InvalidParameterValue error.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * The name of the environment of the requested data. If no such environment is found, RequestEnvironmentInfo returns an InvalidParameterValue error.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * The type of information to request.
      */
    var InfoType: EnvironmentInfoType
  }
  
  trait ResourceQuota extends js.Object {
    /**
      * The maximum number of instances of this Elastic Beanstalk resource type that an AWS account can use.
      */
    var Maximum: js.UndefOr[BoxedInt] = js.undefined
  }
  
  trait ResourceQuotas extends js.Object {
    /**
      * The quota for applications in the AWS account.
      */
    var ApplicationQuota: js.UndefOr[ResourceQuota] = js.undefined
    /**
      * The quota for application versions in the AWS account.
      */
    var ApplicationVersionQuota: js.UndefOr[ResourceQuota] = js.undefined
    /**
      * The quota for configuration templates in the AWS account.
      */
    var ConfigurationTemplateQuota: js.UndefOr[ResourceQuota] = js.undefined
    /**
      * The quota for custom platforms in the AWS account.
      */
    var CustomPlatformQuota: js.UndefOr[ResourceQuota] = js.undefined
    /**
      * The quota for environments in the AWS account.
      */
    var EnvironmentQuota: js.UndefOr[ResourceQuota] = js.undefined
  }
  
  trait ResourceTagsDescriptionMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resouce for which a tag list was requested.
      */
    var ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    /**
      * A list of tag key-value pairs.
      */
    var ResourceTags: js.UndefOr[TagList] = js.undefined
  }
  
  trait RestartAppServerMessage extends js.Object {
    /**
      * The ID of the environment to restart the server for.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * The name of the environment to restart the server for.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
  }
  
  trait RetrieveEnvironmentInfoMessage extends js.Object {
    /**
      * The ID of the data's environment. If no such environment is found, returns an InvalidParameterValue error. Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error.
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * The name of the data's environment.  If no such environment is found, returns an InvalidParameterValue error.   Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * The type of information to retrieve.
      */
    var InfoType: EnvironmentInfoType
  }
  
  trait RetrieveEnvironmentInfoResultMessage extends js.Object {
    /**
      *  The EnvironmentInfoDescription of the environment. 
      */
    var EnvironmentInfo: js.UndefOr[EnvironmentInfoDescriptionList] = js.undefined
  }
  
  trait S3Location extends js.Object {
    /**
      * The Amazon S3 bucket where the data is located.
      */
    var S3Bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      * The Amazon S3 key where the data is located.
      */
    var S3Key: js.UndefOr[S3Key] = js.undefined
  }
  
  trait SingleInstanceHealth extends js.Object {
    /**
      * Request metrics from your application.
      */
    var ApplicationMetrics: js.UndefOr[ApplicationMetrics] = js.undefined
    /**
      * The availability zone in which the instance runs.
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * Represents the causes, which provide more information about the current health status.
      */
    var Causes: js.UndefOr[Causes] = js.undefined
    /**
      * Represents the color indicator that gives you information about the health of the EC2 instance. For more information, see Health Colors and Statuses.
      */
    var Color: js.UndefOr[String] = js.undefined
    /**
      * Information about the most recent deployment to an instance.
      */
    var Deployment: js.UndefOr[Deployment] = js.undefined
    /**
      * Returns the health status of the specified instance. For more information, see Health Colors and Statuses.
      */
    var HealthStatus: js.UndefOr[String] = js.undefined
    /**
      * The ID of the Amazon EC2 instance.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * The instance's type.
      */
    var InstanceType: js.UndefOr[String] = js.undefined
    /**
      * The time at which the EC2 instance was launched.
      */
    var LaunchedAt: js.UndefOr[LaunchedAt] = js.undefined
    /**
      * Operating system metrics from the instance.
      */
    var System: js.UndefOr[SystemStatus] = js.undefined
  }
  
  trait SolutionStackDescription extends js.Object {
    /**
      * The permitted file types allowed for a solution stack.
      */
    var PermittedFileTypes: js.UndefOr[SolutionStackFileTypeList] = js.undefined
    /**
      * The name of the solution stack.
      */
    var SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
  }
  
  trait SourceBuildInformation extends js.Object {
    /**
      * The location of the source code, as a formatted string, depending on the value of SourceRepository    For CodeCommit, the format is the repository name and commit ID, separated by a forward slash. For example, my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a.   For S3, the format is the S3 bucket name and object key, separated by a forward slash. For example, my-s3-bucket/Folders/my-source-file.  
      */
    var SourceLocation: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.SourceLocation
    /**
      * Location where the repository is stored.    CodeCommit     S3   
      */
    var SourceRepository: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.SourceRepository
    /**
      * The type of repository.    Git     Zip   
      */
    var SourceType: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.SourceType
  }
  
  trait SourceConfiguration extends js.Object {
    /**
      * The name of the application associated with the configuration.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * The name of the configuration template.
      */
    var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
  }
  
  trait StatusCodes extends js.Object {
    /**
      * The percentage of requests over the last 10 seconds that resulted in a 2xx (200, 201, etc.) status code.
      */
    var Status2xx: js.UndefOr[NullableInteger] = js.undefined
    /**
      * The percentage of requests over the last 10 seconds that resulted in a 3xx (300, 301, etc.) status code.
      */
    var Status3xx: js.UndefOr[NullableInteger] = js.undefined
    /**
      * The percentage of requests over the last 10 seconds that resulted in a 4xx (400, 401, etc.) status code.
      */
    var Status4xx: js.UndefOr[NullableInteger] = js.undefined
    /**
      * The percentage of requests over the last 10 seconds that resulted in a 5xx (500, 501, etc.) status code.
      */
    var Status5xx: js.UndefOr[NullableInteger] = js.undefined
  }
  
  trait SwapEnvironmentCNAMEsMessage extends js.Object {
    /**
      * The ID of the destination environment.  Condition: You must specify at least the DestinationEnvironmentID or the DestinationEnvironmentName. You may also specify both. You must specify the SourceEnvironmentId with the DestinationEnvironmentId. 
      */
    var DestinationEnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * The name of the destination environment.  Condition: You must specify at least the DestinationEnvironmentID or the DestinationEnvironmentName. You may also specify both. You must specify the SourceEnvironmentName with the DestinationEnvironmentName. 
      */
    var DestinationEnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * The ID of the source environment.  Condition: You must specify at least the SourceEnvironmentID or the SourceEnvironmentName. You may also specify both. If you specify the SourceEnvironmentId, you must specify the DestinationEnvironmentId. 
      */
    var SourceEnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * The name of the source environment.  Condition: You must specify at least the SourceEnvironmentID or the SourceEnvironmentName. You may also specify both. If you specify the SourceEnvironmentName, you must specify the DestinationEnvironmentName. 
      */
    var SourceEnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
  }
  
  trait SystemStatus extends js.Object {
    /**
      * CPU utilization metrics for the instance.
      */
    var CPUUtilization: js.UndefOr[CPUUtilization] = js.undefined
    /**
      * Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see Operating System Metrics.
      */
    var LoadAverage: js.UndefOr[LoadAverage] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The key of the tag.
      */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
      * The value of the tag.
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TerminateEnvironmentMessage extends js.Object {
    /**
      * The ID of the environment to terminate.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * The name of the environment to terminate.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * Terminates the target environment even if another environment in the same group is dependent on it.
      */
    var ForceTerminate: js.UndefOr[ForceTerminate] = js.undefined
    /**
      * Indicates whether the associated AWS resources should shut down when the environment is terminated:    true: The specified environment as well as the associated AWS resources, such as Auto Scaling group and LoadBalancer, are terminated.    false: AWS Elastic Beanstalk resource management is removed from the environment, but the AWS resources continue to operate.    For more information, see the  AWS Elastic Beanstalk User Guide.    Default: true   Valid Values: true | false 
      */
    var TerminateResources: js.UndefOr[TerminateEnvironmentResources] = js.undefined
  }
  
  trait Trigger extends js.Object {
    /**
      * The name of the trigger.
      */
    var Name: js.UndefOr[ResourceId] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Cancels in-progress environment configuration update or application version deployment.
      */
    def abortEnvironmentUpdate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def abortEnvironmentUpdate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels in-progress environment configuration update or application version deployment.
      */
    def abortEnvironmentUpdate(params: AbortEnvironmentUpdateMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def abortEnvironmentUpdate(
      params: AbortEnvironmentUpdateMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Applies a scheduled managed action immediately. A managed action can be applied only if its status is Scheduled. Get the status and action ID of a managed action with DescribeEnvironmentManagedActions.
      */
    def applyEnvironmentManagedAction(): awsDashSdkLib.libRequestMod.Request[ApplyEnvironmentManagedActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def applyEnvironmentManagedAction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplyEnvironmentManagedActionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplyEnvironmentManagedActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Applies a scheduled managed action immediately. A managed action can be applied only if its status is Scheduled. Get the status and action ID of a managed action with DescribeEnvironmentManagedActions.
      */
    def applyEnvironmentManagedAction(params: ApplyEnvironmentManagedActionRequest): awsDashSdkLib.libRequestMod.Request[ApplyEnvironmentManagedActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def applyEnvironmentManagedAction(
      params: ApplyEnvironmentManagedActionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplyEnvironmentManagedActionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplyEnvironmentManagedActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Checks if the specified CNAME is available.
      */
    def checkDNSAvailability(): awsDashSdkLib.libRequestMod.Request[CheckDNSAvailabilityResultMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def checkDNSAvailability(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CheckDNSAvailabilityResultMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CheckDNSAvailabilityResultMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Checks if the specified CNAME is available.
      */
    def checkDNSAvailability(params: CheckDNSAvailabilityMessage): awsDashSdkLib.libRequestMod.Request[CheckDNSAvailabilityResultMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def checkDNSAvailability(
      params: CheckDNSAvailabilityMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CheckDNSAvailabilityResultMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CheckDNSAvailabilityResultMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create or update a group of environments that each run a separate component of a single application. Takes a list of version labels that specify application source bundles for each of the environments to create or update. The name of each environment and other required information must be included in the source bundles in an environment manifest named env.yaml. See Compose Environments for details.
      */
    def composeEnvironments(): awsDashSdkLib.libRequestMod.Request[EnvironmentDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def composeEnvironments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnvironmentDescriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnvironmentDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create or update a group of environments that each run a separate component of a single application. Takes a list of version labels that specify application source bundles for each of the environments to create or update. The name of each environment and other required information must be included in the source bundles in an environment manifest named env.yaml. See Compose Environments for details.
      */
    def composeEnvironments(params: ComposeEnvironmentsMessage): awsDashSdkLib.libRequestMod.Request[EnvironmentDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def composeEnvironments(
      params: ComposeEnvironmentsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnvironmentDescriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnvironmentDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates an application that has one configuration template named default and no application versions. 
      */
    def createApplication(): awsDashSdkLib.libRequestMod.Request[ApplicationDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationDescriptionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates an application that has one configuration template named default and no application versions. 
      */
    def createApplication(params: CreateApplicationMessage): awsDashSdkLib.libRequestMod.Request[ApplicationDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApplication(
      params: CreateApplicationMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationDescriptionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an application version for the specified application. You can create an application version from a source bundle in Amazon S3, a commit in AWS CodeCommit, or the output of an AWS CodeBuild build as follows: Specify a commit in an AWS CodeCommit repository with SourceBuildInformation. Specify a build in an AWS CodeBuild with SourceBuildInformation and BuildConfiguration. Specify a source bundle in S3 with SourceBundle  Omit both SourceBuildInformation and SourceBundle to use the default sample application.  Once you create an application version with a specified Amazon S3 bucket and key location, you cannot change that Amazon S3 location. If you change the Amazon S3 location, you receive an exception when you attempt to launch an environment from the application version. 
      */
    def createApplicationVersion(): awsDashSdkLib.libRequestMod.Request[ApplicationVersionDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApplicationVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationVersionDescriptionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationVersionDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an application version for the specified application. You can create an application version from a source bundle in Amazon S3, a commit in AWS CodeCommit, or the output of an AWS CodeBuild build as follows: Specify a commit in an AWS CodeCommit repository with SourceBuildInformation. Specify a build in an AWS CodeBuild with SourceBuildInformation and BuildConfiguration. Specify a source bundle in S3 with SourceBundle  Omit both SourceBuildInformation and SourceBundle to use the default sample application.  Once you create an application version with a specified Amazon S3 bucket and key location, you cannot change that Amazon S3 location. If you change the Amazon S3 location, you receive an exception when you attempt to launch an environment from the application version. 
      */
    def createApplicationVersion(params: CreateApplicationVersionMessage): awsDashSdkLib.libRequestMod.Request[ApplicationVersionDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApplicationVersion(
      params: CreateApplicationVersionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationVersionDescriptionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationVersionDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a configuration template. Templates are associated with a specific application and are used to deploy different versions of the application with the same configuration settings. Templates aren't associated with any environment. The EnvironmentName response element is always null. Related Topics    DescribeConfigurationOptions     DescribeConfigurationSettings     ListAvailableSolutionStacks   
      */
    def createConfigurationTemplate(): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConfigurationTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfigurationSettingsDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a configuration template. Templates are associated with a specific application and are used to deploy different versions of the application with the same configuration settings. Templates aren't associated with any environment. The EnvironmentName response element is always null. Related Topics    DescribeConfigurationOptions     DescribeConfigurationSettings     ListAvailableSolutionStacks   
      */
    def createConfigurationTemplate(params: CreateConfigurationTemplateMessage): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConfigurationTemplate(
      params: CreateConfigurationTemplateMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfigurationSettingsDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Launches an environment for the specified application using the specified configuration.
      */
    def createEnvironment(): awsDashSdkLib.libRequestMod.Request[EnvironmentDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createEnvironment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnvironmentDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnvironmentDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Launches an environment for the specified application using the specified configuration.
      */
    def createEnvironment(params: CreateEnvironmentMessage): awsDashSdkLib.libRequestMod.Request[EnvironmentDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createEnvironment(
      params: CreateEnvironmentMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnvironmentDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnvironmentDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new version of your custom platform.
      */
    def createPlatformVersion(): awsDashSdkLib.libRequestMod.Request[CreatePlatformVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPlatformVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePlatformVersionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePlatformVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new version of your custom platform.
      */
    def createPlatformVersion(params: CreatePlatformVersionRequest): awsDashSdkLib.libRequestMod.Request[CreatePlatformVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPlatformVersion(
      params: CreatePlatformVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePlatformVersionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePlatformVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a bucket in Amazon S3 to store application versions, logs, and other files used by Elastic Beanstalk environments. The Elastic Beanstalk console and EB CLI call this API the first time you create an environment in a region. If the storage location already exists, CreateStorageLocation still returns the bucket name but does not create a new bucket.
      */
    def createStorageLocation(): awsDashSdkLib.libRequestMod.Request[CreateStorageLocationResultMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStorageLocation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStorageLocationResultMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStorageLocationResultMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified application along with all associated versions and configurations. The application versions will not be deleted from your Amazon S3 bucket.  You cannot delete an application that has a running environment. 
      */
    def deleteApplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplication(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified application along with all associated versions and configurations. The application versions will not be deleted from your Amazon S3 bucket.  You cannot delete an application that has a running environment. 
      */
    def deleteApplication(params: DeleteApplicationMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplication(
      params: DeleteApplicationMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified version from the specified application.  You cannot delete an application version that is associated with a running environment. 
      */
    def deleteApplicationVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplicationVersion(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified version from the specified application.  You cannot delete an application version that is associated with a running environment. 
      */
    def deleteApplicationVersion(params: DeleteApplicationVersionMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplicationVersion(
      params: DeleteApplicationVersionMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified configuration template.  When you launch an environment using a configuration template, the environment gets a copy of the template. You can delete or modify the environment's copy of the template without affecting the running environment. 
      */
    def deleteConfigurationTemplate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConfigurationTemplate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified configuration template.  When you launch an environment using a configuration template, the environment gets a copy of the template. You can delete or modify the environment's copy of the template without affecting the running environment. 
      */
    def deleteConfigurationTemplate(params: DeleteConfigurationTemplateMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConfigurationTemplate(
      params: DeleteConfigurationTemplateMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the draft configuration associated with the running environment. Updating a running environment with any configuration changes creates a draft configuration set. You can get the draft configuration using DescribeConfigurationSettings while the update is in progress or if the update fails. The DeploymentStatus for the draft configuration indicates whether the deployment is in process or has failed. The draft configuration remains in existence until it is deleted with this action.
      */
    def deleteEnvironmentConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEnvironmentConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the draft configuration associated with the running environment. Updating a running environment with any configuration changes creates a draft configuration set. You can get the draft configuration using DescribeConfigurationSettings while the update is in progress or if the update fails. The DeploymentStatus for the draft configuration indicates whether the deployment is in process or has failed. The draft configuration remains in existence until it is deleted with this action.
      */
    def deleteEnvironmentConfiguration(params: DeleteEnvironmentConfigurationMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEnvironmentConfiguration(
      params: DeleteEnvironmentConfigurationMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified version of a custom platform.
      */
    def deletePlatformVersion(): awsDashSdkLib.libRequestMod.Request[DeletePlatformVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePlatformVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeletePlatformVersionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeletePlatformVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified version of a custom platform.
      */
    def deletePlatformVersion(params: DeletePlatformVersionRequest): awsDashSdkLib.libRequestMod.Request[DeletePlatformVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePlatformVersion(
      params: DeletePlatformVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeletePlatformVersionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeletePlatformVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns attributes related to AWS Elastic Beanstalk that are associated with the calling AWS account. The result currently has one set of attributes—resource quotas.
      */
    def describeAccountAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountAttributesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve a list of application versions.
      */
    def describeApplicationVersions(): awsDashSdkLib.libRequestMod.Request[ApplicationVersionDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeApplicationVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationVersionDescriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationVersionDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieve a list of application versions.
      */
    def describeApplicationVersions(params: DescribeApplicationVersionsMessage): awsDashSdkLib.libRequestMod.Request[ApplicationVersionDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeApplicationVersions(
      params: DescribeApplicationVersionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationVersionDescriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationVersionDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the descriptions of existing applications.
      */
    def describeApplications(): awsDashSdkLib.libRequestMod.Request[ApplicationDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeApplications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationDescriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the descriptions of existing applications.
      */
    def describeApplications(params: DescribeApplicationsMessage): awsDashSdkLib.libRequestMod.Request[ApplicationDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeApplications(
      params: DescribeApplicationsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationDescriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the configuration options that are used in a particular configuration template or environment, or that a specified solution stack defines. The description includes the values the options, their default values, and an indication of the required action on a running environment if an option value is changed.
      */
    def describeConfigurationOptions(): awsDashSdkLib.libRequestMod.Request[ConfigurationOptionsDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeConfigurationOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfigurationOptionsDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfigurationOptionsDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the configuration options that are used in a particular configuration template or environment, or that a specified solution stack defines. The description includes the values the options, their default values, and an indication of the required action on a running environment if an option value is changed.
      */
    def describeConfigurationOptions(params: DescribeConfigurationOptionsMessage): awsDashSdkLib.libRequestMod.Request[ConfigurationOptionsDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeConfigurationOptions(
      params: DescribeConfigurationOptionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfigurationOptionsDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfigurationOptionsDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a description of the settings for the specified configuration set, that is, either a configuration template or the configuration set associated with a running environment. When describing the settings for the configuration set associated with a running environment, it is possible to receive two sets of setting descriptions. One is the deployed configuration set, and the other is a draft configuration of an environment that is either in the process of deployment or that failed to deploy. Related Topics    DeleteEnvironmentConfiguration   
      */
    def describeConfigurationSettings(): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsDescriptions, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeConfigurationSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfigurationSettingsDescriptions, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsDescriptions, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a description of the settings for the specified configuration set, that is, either a configuration template or the configuration set associated with a running environment. When describing the settings for the configuration set associated with a running environment, it is possible to receive two sets of setting descriptions. One is the deployed configuration set, and the other is a draft configuration of an environment that is either in the process of deployment or that failed to deploy. Related Topics    DeleteEnvironmentConfiguration   
      */
    def describeConfigurationSettings(params: DescribeConfigurationSettingsMessage): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsDescriptions, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeConfigurationSettings(
      params: DescribeConfigurationSettingsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfigurationSettingsDescriptions, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsDescriptions, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the overall health of the specified environment. The DescribeEnvironmentHealth operation is only available with AWS Elastic Beanstalk Enhanced Health.
      */
    def describeEnvironmentHealth(): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentHealthResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEnvironmentHealth(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEnvironmentHealthResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentHealthResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the overall health of the specified environment. The DescribeEnvironmentHealth operation is only available with AWS Elastic Beanstalk Enhanced Health.
      */
    def describeEnvironmentHealth(params: DescribeEnvironmentHealthRequest): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentHealthResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEnvironmentHealth(
      params: DescribeEnvironmentHealthRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEnvironmentHealthResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentHealthResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists an environment's completed and failed managed actions.
      */
    def describeEnvironmentManagedActionHistory(): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentManagedActionHistoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEnvironmentManagedActionHistory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEnvironmentManagedActionHistoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentManagedActionHistoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists an environment's completed and failed managed actions.
      */
    def describeEnvironmentManagedActionHistory(params: DescribeEnvironmentManagedActionHistoryRequest): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentManagedActionHistoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEnvironmentManagedActionHistory(
      params: DescribeEnvironmentManagedActionHistoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEnvironmentManagedActionHistoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentManagedActionHistoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists an environment's upcoming and in-progress managed actions.
      */
    def describeEnvironmentManagedActions(): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentManagedActionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEnvironmentManagedActions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEnvironmentManagedActionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentManagedActionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists an environment's upcoming and in-progress managed actions.
      */
    def describeEnvironmentManagedActions(params: DescribeEnvironmentManagedActionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentManagedActionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEnvironmentManagedActions(
      params: DescribeEnvironmentManagedActionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEnvironmentManagedActionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentManagedActionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns AWS resources for this environment.
      */
    def describeEnvironmentResources(): awsDashSdkLib.libRequestMod.Request[EnvironmentResourceDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEnvironmentResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnvironmentResourceDescriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnvironmentResourceDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns AWS resources for this environment.
      */
    def describeEnvironmentResources(params: DescribeEnvironmentResourcesMessage): awsDashSdkLib.libRequestMod.Request[EnvironmentResourceDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEnvironmentResources(
      params: DescribeEnvironmentResourcesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnvironmentResourceDescriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnvironmentResourceDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns descriptions for existing environments.
      */
    def describeEnvironments(): awsDashSdkLib.libRequestMod.Request[EnvironmentDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEnvironments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnvironmentDescriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnvironmentDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns descriptions for existing environments.
      */
    def describeEnvironments(params: DescribeEnvironmentsMessage): awsDashSdkLib.libRequestMod.Request[EnvironmentDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEnvironments(
      params: DescribeEnvironmentsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnvironmentDescriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnvironmentDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns list of event descriptions matching criteria up to the last 6 weeks.  This action returns the most recent 1,000 events from the specified NextToken. 
      */
    def describeEvents(): awsDashSdkLib.libRequestMod.Request[EventDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventDescriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns list of event descriptions matching criteria up to the last 6 weeks.  This action returns the most recent 1,000 events from the specified NextToken. 
      */
    def describeEvents(params: DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[EventDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      params: DescribeEventsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventDescriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventDescriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves detailed information about the health of instances in your AWS Elastic Beanstalk. This operation requires enhanced health reporting.
      */
    def describeInstancesHealth(): awsDashSdkLib.libRequestMod.Request[DescribeInstancesHealthResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstancesHealth(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesHealthResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesHealthResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves detailed information about the health of instances in your AWS Elastic Beanstalk. This operation requires enhanced health reporting.
      */
    def describeInstancesHealth(params: DescribeInstancesHealthRequest): awsDashSdkLib.libRequestMod.Request[DescribeInstancesHealthResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstancesHealth(
      params: DescribeInstancesHealthRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesHealthResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesHealthResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the version of the platform.
      */
    def describePlatformVersion(): awsDashSdkLib.libRequestMod.Request[DescribePlatformVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePlatformVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePlatformVersionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePlatformVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the version of the platform.
      */
    def describePlatformVersion(params: DescribePlatformVersionRequest): awsDashSdkLib.libRequestMod.Request[DescribePlatformVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePlatformVersion(
      params: DescribePlatformVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePlatformVersionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePlatformVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the available solution stack names, with the public version first and then in reverse chronological order.
      */
    def listAvailableSolutionStacks(): awsDashSdkLib.libRequestMod.Request[ListAvailableSolutionStacksResultMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAvailableSolutionStacks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAvailableSolutionStacksResultMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAvailableSolutionStacksResultMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the available platforms.
      */
    def listPlatformVersions(): awsDashSdkLib.libRequestMod.Request[ListPlatformVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPlatformVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPlatformVersionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPlatformVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the available platforms.
      */
    def listPlatformVersions(params: ListPlatformVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListPlatformVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPlatformVersions(
      params: ListPlatformVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPlatformVersionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPlatformVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the tags applied to an AWS Elastic Beanstalk resource. The response contains a list of tag key-value pairs. Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about environment tagging, see Tagging Resources in Your Elastic Beanstalk Environment.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ResourceTagsDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResourceTagsDescriptionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResourceTagsDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the tags applied to an AWS Elastic Beanstalk resource. The response contains a list of tag key-value pairs. Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about environment tagging, see Tagging Resources in Your Elastic Beanstalk Environment.
      */
    def listTagsForResource(params: ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[ResourceTagsDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResourceTagsDescriptionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResourceTagsDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.) for a specified environment and forces a restart.
      */
    def rebuildEnvironment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebuildEnvironment(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.) for a specified environment and forces a restart.
      */
    def rebuildEnvironment(params: RebuildEnvironmentMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebuildEnvironment(
      params: RebuildEnvironmentMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates a request to compile the specified type of information of the deployed environment.  Setting the InfoType to tail compiles the last lines from the application server log files of every Amazon EC2 instance in your environment.   Setting the InfoType to bundle compresses the application server log files for every Amazon EC2 instance into a .zip file. Legacy and .NET containers do not support bundle logs.   Use RetrieveEnvironmentInfo to obtain the set of logs.  Related Topics    RetrieveEnvironmentInfo   
      */
    def requestEnvironmentInfo(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def requestEnvironmentInfo(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates a request to compile the specified type of information of the deployed environment.  Setting the InfoType to tail compiles the last lines from the application server log files of every Amazon EC2 instance in your environment.   Setting the InfoType to bundle compresses the application server log files for every Amazon EC2 instance into a .zip file. Legacy and .NET containers do not support bundle logs.   Use RetrieveEnvironmentInfo to obtain the set of logs.  Related Topics    RetrieveEnvironmentInfo   
      */
    def requestEnvironmentInfo(params: RequestEnvironmentInfoMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def requestEnvironmentInfo(
      params: RequestEnvironmentInfoMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Causes the environment to restart the application container server running on each Amazon EC2 instance.
      */
    def restartAppServer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restartAppServer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Causes the environment to restart the application container server running on each Amazon EC2 instance.
      */
    def restartAppServer(params: RestartAppServerMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restartAppServer(
      params: RestartAppServerMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the compiled information from a RequestEnvironmentInfo request. Related Topics    RequestEnvironmentInfo   
      */
    def retrieveEnvironmentInfo(): awsDashSdkLib.libRequestMod.Request[RetrieveEnvironmentInfoResultMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def retrieveEnvironmentInfo(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RetrieveEnvironmentInfoResultMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RetrieveEnvironmentInfoResultMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the compiled information from a RequestEnvironmentInfo request. Related Topics    RequestEnvironmentInfo   
      */
    def retrieveEnvironmentInfo(params: RetrieveEnvironmentInfoMessage): awsDashSdkLib.libRequestMod.Request[RetrieveEnvironmentInfoResultMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def retrieveEnvironmentInfo(
      params: RetrieveEnvironmentInfoMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RetrieveEnvironmentInfoResultMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RetrieveEnvironmentInfoResultMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Swaps the CNAMEs of two environments.
      */
    def swapEnvironmentCNAMEs(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def swapEnvironmentCNAMEs(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Swaps the CNAMEs of two environments.
      */
    def swapEnvironmentCNAMEs(params: SwapEnvironmentCNAMEsMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def swapEnvironmentCNAMEs(
      params: SwapEnvironmentCNAMEsMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Terminates the specified environment.
      */
    def terminateEnvironment(): awsDashSdkLib.libRequestMod.Request[EnvironmentDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def terminateEnvironment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnvironmentDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnvironmentDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Terminates the specified environment.
      */
    def terminateEnvironment(params: TerminateEnvironmentMessage): awsDashSdkLib.libRequestMod.Request[EnvironmentDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def terminateEnvironment(
      params: TerminateEnvironmentMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnvironmentDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnvironmentDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified application to have the specified properties.  If a property (for example, description) is not provided, the value remains unchanged. To clear these properties, specify an empty string. 
      */
    def updateApplication(): awsDashSdkLib.libRequestMod.Request[ApplicationDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationDescriptionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified application to have the specified properties.  If a property (for example, description) is not provided, the value remains unchanged. To clear these properties, specify an empty string. 
      */
    def updateApplication(params: UpdateApplicationMessage): awsDashSdkLib.libRequestMod.Request[ApplicationDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplication(
      params: UpdateApplicationMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationDescriptionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies lifecycle settings for an application.
      */
    def updateApplicationResourceLifecycle(): awsDashSdkLib.libRequestMod.Request[ApplicationResourceLifecycleDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplicationResourceLifecycle(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationResourceLifecycleDescriptionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationResourceLifecycleDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies lifecycle settings for an application.
      */
    def updateApplicationResourceLifecycle(params: UpdateApplicationResourceLifecycleMessage): awsDashSdkLib.libRequestMod.Request[ApplicationResourceLifecycleDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplicationResourceLifecycle(
      params: UpdateApplicationResourceLifecycleMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationResourceLifecycleDescriptionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationResourceLifecycleDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified application version to have the specified properties.  If a property (for example, description) is not provided, the value remains unchanged. To clear properties, specify an empty string. 
      */
    def updateApplicationVersion(): awsDashSdkLib.libRequestMod.Request[ApplicationVersionDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplicationVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationVersionDescriptionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationVersionDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified application version to have the specified properties.  If a property (for example, description) is not provided, the value remains unchanged. To clear properties, specify an empty string. 
      */
    def updateApplicationVersion(params: UpdateApplicationVersionMessage): awsDashSdkLib.libRequestMod.Request[ApplicationVersionDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplicationVersion(
      params: UpdateApplicationVersionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplicationVersionDescriptionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplicationVersionDescriptionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified configuration template to have the specified properties or configuration option values.  If a property (for example, ApplicationName) is not provided, its value remains unchanged. To clear such properties, specify an empty string.  Related Topics    DescribeConfigurationOptions   
      */
    def updateConfigurationTemplate(): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConfigurationTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfigurationSettingsDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified configuration template to have the specified properties or configuration option values.  If a property (for example, ApplicationName) is not provided, its value remains unchanged. To clear such properties, specify an empty string.  Related Topics    DescribeConfigurationOptions   
      */
    def updateConfigurationTemplate(params: UpdateConfigurationTemplateMessage): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConfigurationTemplate(
      params: UpdateConfigurationTemplateMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfigurationSettingsDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the environment description, deploys a new application version, updates the configuration settings to an entirely new configuration template, or updates select configuration option values in the running environment.  Attempting to update both the release and configuration is not allowed and AWS Elastic Beanstalk returns an InvalidParameterCombination error.   When updating the configuration settings to a new template or individual settings, a draft configuration is created and DescribeConfigurationSettings for this environment returns two setting descriptions with different DeploymentStatus values. 
      */
    def updateEnvironment(): awsDashSdkLib.libRequestMod.Request[EnvironmentDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateEnvironment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnvironmentDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnvironmentDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the environment description, deploys a new application version, updates the configuration settings to an entirely new configuration template, or updates select configuration option values in the running environment.  Attempting to update both the release and configuration is not allowed and AWS Elastic Beanstalk returns an InvalidParameterCombination error.   When updating the configuration settings to a new template or individual settings, a draft configuration is created and DescribeConfigurationSettings for this environment returns two setting descriptions with different DeploymentStatus values. 
      */
    def updateEnvironment(params: UpdateEnvironmentMessage): awsDashSdkLib.libRequestMod.Request[EnvironmentDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateEnvironment(
      params: UpdateEnvironmentMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnvironmentDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnvironmentDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update the list of tags applied to an AWS Elastic Beanstalk resource. Two lists can be passed: TagsToAdd for tags to add or update, and TagsToRemove. Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about environment tagging, see Tagging Resources in Your Elastic Beanstalk Environment. If you create a custom IAM user policy to control permission to this operation, specify one of the following two virtual actions (or both) instead of the API operation name:  elasticbeanstalk:AddTags  Controls permission to call UpdateTagsForResource and pass a list of tags to add in the TagsToAdd parameter.  elasticbeanstalk:RemoveTags  Controls permission to call UpdateTagsForResource and pass a list of tag keys to remove in the TagsToRemove parameter.   For details about creating a custom user policy, see Creating a Custom User Policy.
      */
    def updateTagsForResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTagsForResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update the list of tags applied to an AWS Elastic Beanstalk resource. Two lists can be passed: TagsToAdd for tags to add or update, and TagsToRemove. Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about environment tagging, see Tagging Resources in Your Elastic Beanstalk Environment. If you create a custom IAM user policy to control permission to this operation, specify one of the following two virtual actions (or both) instead of the API operation name:  elasticbeanstalk:AddTags  Controls permission to call UpdateTagsForResource and pass a list of tags to add in the TagsToAdd parameter.  elasticbeanstalk:RemoveTags  Controls permission to call UpdateTagsForResource and pass a list of tag keys to remove in the TagsToRemove parameter.   For details about creating a custom user policy, see Creating a Custom User Policy.
      */
    def updateTagsForResource(params: UpdateTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTagsForResource(
      params: UpdateTagsForResourceMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Takes a set of configuration settings and either a configuration template or environment, and determines whether those values are valid. This action returns a list of messages indicating any errors or warnings associated with the selection of option values.
      */
    def validateConfigurationSettings(): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsValidationMessages, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def validateConfigurationSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfigurationSettingsValidationMessages, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsValidationMessages, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Takes a set of configuration settings and either a configuration template or environment, and determines whether those values are valid. This action returns a list of messages indicating any errors or warnings associated with the selection of option values.
      */
    def validateConfigurationSettings(params: ValidateConfigurationSettingsMessage): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsValidationMessages, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def validateConfigurationSettings(
      params: ValidateConfigurationSettingsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfigurationSettingsValidationMessages, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfigurationSettingsValidationMessages, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateApplicationMessage extends js.Object {
    /**
      * The name of the application to update. If no such application is found, UpdateApplication returns an InvalidParameterValue error. 
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * A new description for the application. Default: If not specified, AWS Elastic Beanstalk does not update the description.
      */
    var Description: js.UndefOr[Description] = js.undefined
  }
  
  trait UpdateApplicationResourceLifecycleMessage extends js.Object {
    /**
      * The name of the application.
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * The lifecycle configuration.
      */
    var ResourceLifecycleConfig: ApplicationResourceLifecycleConfig
  }
  
  trait UpdateApplicationVersionMessage extends js.Object {
    /**
      * The name of the application associated with this version.  If no application is found with this name, UpdateApplication returns an InvalidParameterValue error.
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * A new description for this version.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The name of the version to update. If no application version is found with this label, UpdateApplication returns an InvalidParameterValue error. 
      */
    var VersionLabel: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.VersionLabel
  }
  
  trait UpdateConfigurationTemplateMessage extends js.Object {
    /**
      * The name of the application associated with the configuration template to update.  If no application is found with this name, UpdateConfigurationTemplate returns an InvalidParameterValue error. 
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * A new description for the configuration.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * A list of configuration option settings to update with the new specified option value.
      */
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined
    /**
      * A list of configuration options to remove from the configuration set.  Constraint: You can remove only UserDefined configuration options. 
      */
    var OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.undefined
    /**
      * The name of the configuration template to update.  If no configuration template is found with this name, UpdateConfigurationTemplate returns an InvalidParameterValue error. 
      */
    var TemplateName: ConfigurationTemplateName
  }
  
  trait UpdateEnvironmentMessage extends js.Object {
    /**
      * The name of the application with which the environment is associated.
      */
    var ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * If this parameter is specified, AWS Elastic Beanstalk updates the description of this environment.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The ID of the environment to update. If no environment with this ID exists, AWS Elastic Beanstalk returns an InvalidParameterValue error. Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
      * The name of the environment to update. If no environment with this name exists, AWS Elastic Beanstalk returns an InvalidParameterValue error.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * The name of the group to which the target environment belongs. Specify a group name only if the environment's name is specified in an environment manifest and not with the environment name or environment ID parameters. See Environment Manifest (env.yaml) for details.
      */
    var GroupName: js.UndefOr[GroupName] = js.undefined
    /**
      * If specified, AWS Elastic Beanstalk updates the configuration set associated with the running environment and sets the specified configuration options to the requested value.
      */
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined
    /**
      * A list of custom user-defined configuration options to remove from the configuration set for this environment.
      */
    var OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.undefined
    /**
      * The ARN of the platform, if used.
      */
    var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    /**
      * This specifies the platform version that the environment will run after the environment is updated.
      */
    var SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
    /**
      * If this parameter is specified, AWS Elastic Beanstalk deploys this configuration template to the environment. If no such configuration template is found, AWS Elastic Beanstalk returns an InvalidParameterValue error. 
      */
    var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    /**
      * This specifies the tier to use to update the environment. Condition: At this time, if you change the tier version, name, or type, AWS Elastic Beanstalk returns InvalidParameterValue error. 
      */
    var Tier: js.UndefOr[EnvironmentTier] = js.undefined
    /**
      * If this parameter is specified, AWS Elastic Beanstalk deploys the named application version to the environment. If no such application version is found, returns an InvalidParameterValue error. 
      */
    var VersionLabel: js.UndefOr[VersionLabel] = js.undefined
  }
  
  trait UpdateTagsForResourceMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resouce to be updated. Must be the ARN of an Elastic Beanstalk environment.
      */
    var ResourceArn: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ResourceArn
    /**
      * A list of tags to add or update. If a key of an existing tag is added, the tag's value is updated.
      */
    var TagsToAdd: js.UndefOr[TagList] = js.undefined
    /**
      * A list of tag keys to remove. If a tag key doesn't exist, it is silently ignored.
      */
    var TagsToRemove: js.UndefOr[TagKeyList] = js.undefined
  }
  
  trait ValidateConfigurationSettingsMessage extends js.Object {
    /**
      * The name of the application that the configuration template or environment belongs to.
      */
    var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ElasticBeanstalkNs.ApplicationName
    /**
      * The name of the environment to validate the settings against. Condition: You cannot specify both this and a configuration template name.
      */
    var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    /**
      * A list of the options and desired values to evaluate.
      */
    var OptionSettings: ConfigurationOptionSettingsList
    /**
      * The name of the configuration template to validate the settings against. Condition: You cannot specify both this and an environment name.
      */
    var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
  }
  
  trait ValidationMessage extends js.Object {
    /**
      * A message describing the error or warning.
      */
    var Message: js.UndefOr[ValidationMessageString] = js.undefined
    /**
      * The namespace to which the option belongs.
      */
    var Namespace: js.UndefOr[OptionNamespace] = js.undefined
    /**
      * The name of the option.
      */
    var OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined
    /**
      * An indication of the severity of this message:    error: This message indicates that this is not a valid setting for an option.    warning: This message is providing information you should take into account.  
      */
    var Severity: js.UndefOr[ValidationSeverity] = js.undefined
  }
  
  trait _ActionHistoryStatus extends js.Object
  
  trait _ActionStatus extends js.Object
  
  trait _ActionType extends js.Object
  
  trait _ApplicationVersionStatus extends js.Object
  
  trait _ComputeType extends js.Object
  
  trait _ConfigurationDeploymentStatus extends js.Object
  
  trait _ConfigurationOptionValueType extends js.Object
  
  trait _EnvironmentHealth extends js.Object
  
  trait _EnvironmentHealthAttribute extends js.Object
  
  trait _EnvironmentHealthStatus extends js.Object
  
  trait _EnvironmentInfoType extends js.Object
  
  trait _EnvironmentStatus extends js.Object
  
  trait _EventSeverity extends js.Object
  
  trait _FailureType extends js.Object
  
  trait _InstancesHealthAttribute extends js.Object
  
  trait _PlatformStatus extends js.Object
  
  trait _SourceRepository extends js.Object
  
  trait _SourceType extends js.Object
  
  trait _ValidationSeverity extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ARN = java.lang.String
  type AbortableOperationInProgress = scala.Boolean
  type ActionHistoryStatus = _ActionHistoryStatus | java.lang.String
  type ActionStatus = _ActionStatus | java.lang.String
  type ActionType = _ActionType | java.lang.String
  type ApplicationArn = java.lang.String
  type ApplicationDescriptionList = js.Array[ApplicationDescription]
  type ApplicationName = java.lang.String
  type ApplicationNamesList = js.Array[ApplicationName]
  type ApplicationVersionArn = java.lang.String
  type ApplicationVersionDescriptionList = js.Array[ApplicationVersionDescription]
  type ApplicationVersionProccess = scala.Boolean
  type ApplicationVersionStatus = _ApplicationVersionStatus | java.lang.String
  type AutoCreateApplication = scala.Boolean
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type AvailableSolutionStackDetailsList = js.Array[SolutionStackDescription]
  type AvailableSolutionStackNamesList = js.Array[SolutionStackName]
  type BoxedBoolean = scala.Boolean
  type BoxedInt = scala.Double
  type Cause = java.lang.String
  type Causes = js.Array[Cause]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CnameAvailability = scala.Boolean
  type ComputeType = _ComputeType | java.lang.String
  type ConfigurationDeploymentStatus = _ConfigurationDeploymentStatus | java.lang.String
  type ConfigurationOptionDefaultValue = java.lang.String
  type ConfigurationOptionDescriptionsList = js.Array[ConfigurationOptionDescription]
  type ConfigurationOptionName = java.lang.String
  type ConfigurationOptionPossibleValue = java.lang.String
  type ConfigurationOptionPossibleValues = js.Array[ConfigurationOptionPossibleValue]
  type ConfigurationOptionSettingsList = js.Array[ConfigurationOptionSetting]
  type ConfigurationOptionSeverity = java.lang.String
  type ConfigurationOptionValue = java.lang.String
  type ConfigurationOptionValueType = _ConfigurationOptionValueType | java.lang.String
  type ConfigurationSettingsDescriptionList = js.Array[ConfigurationSettingsDescription]
  type ConfigurationTemplateName = java.lang.String
  type ConfigurationTemplateNamesList = js.Array[ConfigurationTemplateName]
  type CreationDate = stdLib.Date
  type CustomAmiList = js.Array[CustomAmi]
  type DNSCname = java.lang.String
  type DNSCnamePrefix = java.lang.String
  type DeleteSourceBundle = scala.Boolean
  type DeploymentTimestamp = stdLib.Date
  type Description = java.lang.String
  type Ec2InstanceId = java.lang.String
  type EndpointURL = java.lang.String
  type EnvironmentArn = java.lang.String
  type EnvironmentDescriptionsList = js.Array[EnvironmentDescription]
  type EnvironmentHealth = _EnvironmentHealth | java.lang.String
  type EnvironmentHealthAttribute = _EnvironmentHealthAttribute | java.lang.String
  type EnvironmentHealthAttributes = js.Array[EnvironmentHealthAttribute]
  type EnvironmentHealthStatus = _EnvironmentHealthStatus | java.lang.String
  type EnvironmentId = java.lang.String
  type EnvironmentIdList = js.Array[EnvironmentId]
  type EnvironmentInfoDescriptionList = js.Array[EnvironmentInfoDescription]
  type EnvironmentInfoType = _EnvironmentInfoType | java.lang.String
  type EnvironmentLinks = js.Array[EnvironmentLink]
  type EnvironmentName = java.lang.String
  type EnvironmentNamesList = js.Array[EnvironmentName]
  type EnvironmentStatus = _EnvironmentStatus | java.lang.String
  type EventDate = stdLib.Date
  type EventDescriptionList = js.Array[EventDescription]
  type EventMessage = java.lang.String
  type EventSeverity = _EventSeverity | java.lang.String
  type FailureType = _FailureType | java.lang.String
  type FileTypeExtension = java.lang.String
  type ForceTerminate = scala.Boolean
  type GroupName = java.lang.String
  type ImageId = java.lang.String
  type IncludeDeleted = scala.Boolean
  type IncludeDeletedBackTo = stdLib.Date
  type InstanceHealthList = js.Array[SingleInstanceHealth]
  type InstanceId = java.lang.String
  type InstanceList = js.Array[Instance]
  type InstancesHealthAttribute = _InstancesHealthAttribute | java.lang.String
  type InstancesHealthAttributes = js.Array[InstancesHealthAttribute]
  type Integer = scala.Double
  type LaunchConfigurationList = js.Array[LaunchConfiguration]
  type LaunchTemplateList = js.Array[LaunchTemplate]
  type LaunchedAt = stdLib.Date
  type LoadAverage = js.Array[LoadAverageValue]
  type LoadAverageValue = scala.Double
  type LoadBalancerList = js.Array[LoadBalancer]
  type LoadBalancerListenersDescription = js.Array[Listener]
  type Maintainer = java.lang.String
  type ManagedActionHistoryItems = js.Array[ManagedActionHistoryItem]
  type ManagedActions = js.Array[ManagedAction]
  type MaxRecords = scala.Double
  type Message = java.lang.String
  type NextToken = java.lang.String
  type NonEmptyString = java.lang.String
  type NullableDouble = scala.Double
  type NullableInteger = scala.Double
  type NullableLong = scala.Double
  type OperatingSystemName = java.lang.String
  type OperatingSystemVersion = java.lang.String
  type OptionNamespace = java.lang.String
  type OptionRestrictionMaxLength = scala.Double
  type OptionRestrictionMaxValue = scala.Double
  type OptionRestrictionMinValue = scala.Double
  type OptionsSpecifierList = js.Array[OptionSpecification]
  type PlatformArn = java.lang.String
  type PlatformCategory = java.lang.String
  type PlatformFilterOperator = java.lang.String
  type PlatformFilterType = java.lang.String
  type PlatformFilterValue = java.lang.String
  type PlatformFilterValueList = js.Array[PlatformFilterValue]
  type PlatformFilters = js.Array[PlatformFilter]
  type PlatformFrameworks = js.Array[PlatformFramework]
  type PlatformMaxRecords = scala.Double
  type PlatformName = java.lang.String
  type PlatformOwner = java.lang.String
  type PlatformProgrammingLanguages = js.Array[PlatformProgrammingLanguage]
  type PlatformStatus = _PlatformStatus | java.lang.String
  type PlatformSummaryList = js.Array[PlatformSummary]
  type PlatformVersion = java.lang.String
  type QueueList = js.Array[Queue]
  type RefreshedAt = stdLib.Date
  type RegexLabel = java.lang.String
  type RegexPattern = java.lang.String
  type RequestCount = scala.Double
  type RequestId = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type SampleTimestamp = stdLib.Date
  type SolutionStackFileTypeList = js.Array[FileTypeExtension]
  type SolutionStackName = java.lang.String
  type SourceLocation = java.lang.String
  type SourceRepository = _SourceRepository | java.lang.String
  type SourceType = _SourceType | java.lang.String
  type String = java.lang.String
  type SupportedAddon = java.lang.String
  type SupportedAddonList = js.Array[SupportedAddon]
  type SupportedTier = java.lang.String
  type SupportedTierList = js.Array[SupportedTier]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TerminateEnvForce = scala.Boolean
  type TerminateEnvironmentResources = scala.Boolean
  type TimeFilterEnd = stdLib.Date
  type TimeFilterStart = stdLib.Date
  type Timestamp = stdLib.Date
  type Token = java.lang.String
  type TriggerList = js.Array[Trigger]
  type UpdateDate = stdLib.Date
  type UserDefinedOption = scala.Boolean
  type ValidationMessageString = java.lang.String
  type ValidationMessagesList = js.Array[ValidationMessage]
  type ValidationSeverity = _ValidationSeverity | java.lang.String
  type VersionLabel = java.lang.String
  type VersionLabels = js.Array[VersionLabel]
  type VersionLabelsList = js.Array[VersionLabel]
  type VirtualizationType = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

