package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEnvironmentMessage extends js.Object {
  /**
    * The name of the application that contains the version to be deployed.  If no application is found with this name, CreateEnvironment returns an InvalidParameterValue error. 
    */
  var ApplicationName: typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName
  /**
    * If specified, the environment attempts to use this value as the prefix for the CNAME. If not specified, the CNAME is generated automatically by appending a random alphanumeric string to the environment name.
    */
  var CNAMEPrefix: js.UndefOr[DNSCnamePrefix] = js.undefined
  /**
    * Describes this environment.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Description] = js.undefined
  /**
    * A unique name for the deployment environment. Used in the application URL. Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and hyphens. It cannot start or end with a hyphen. This name must be unique within a region in your account. If the specified name already exists in the region, AWS Elastic Beanstalk returns an InvalidParameterValue error.  Default: If the CNAME parameter is not specified, the environment name becomes part of the CNAME, and therefore part of the visible URL for your application.
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  /**
    * The name of the group to which the target environment belongs. Specify a group name only if the environment's name is specified in an environment manifest and not with the environment name parameter. See Environment Manifest (env.yaml) for details.
    */
  var GroupName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.GroupName] = js.undefined
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
  var PlatformArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  /**
    * This is an alternative to specifying a template name. If specified, AWS Elastic Beanstalk sets the configuration values to the default values associated with the specified solution stack. For a list of current solution stacks, see Elastic Beanstalk Supported Platforms.
    */
  var SolutionStackName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.SolutionStackName] = js.undefined
  /**
    * Specifies the tags applied to resources in the environment.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Tags] = js.undefined
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
  var VersionLabel: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.VersionLabel] = js.undefined
}

object CreateEnvironmentMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CNAMEPrefix: DNSCnamePrefix = null,
    Description: Description = null,
    EnvironmentName: EnvironmentName = null,
    GroupName: GroupName = null,
    OptionSettings: ConfigurationOptionSettingsList = null,
    OptionsToRemove: OptionsSpecifierList = null,
    PlatformArn: PlatformArn = null,
    SolutionStackName: SolutionStackName = null,
    Tags: Tags = null,
    TemplateName: ConfigurationTemplateName = null,
    Tier: EnvironmentTier = null,
    VersionLabel: VersionLabel = null
  ): CreateEnvironmentMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName)
    if (CNAMEPrefix != null) __obj.updateDynamic("CNAMEPrefix")(CNAMEPrefix)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings)
    if (OptionsToRemove != null) __obj.updateDynamic("OptionsToRemove")(OptionsToRemove)
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn)
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName)
    if (Tier != null) __obj.updateDynamic("Tier")(Tier)
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel)
    __obj.asInstanceOf[CreateEnvironmentMessage]
  }
}

