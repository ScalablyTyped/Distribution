package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEnvironmentMessage extends js.Object {
  /**
    * The name of the application with which the environment is associated.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  /**
    * If this parameter is specified, AWS Elastic Beanstalk updates the description of this environment.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Description] = js.undefined
  /**
    * The ID of the environment to update. If no environment with this ID exists, AWS Elastic Beanstalk returns an InvalidParameterValue error. Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.undefined
  /**
    * The name of the environment to update. If no environment with this name exists, AWS Elastic Beanstalk returns an InvalidParameterValue error.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  /**
    * The name of the group to which the target environment belongs. Specify a group name only if the environment's name is specified in an environment manifest and not with the environment name or environment ID parameters. See Environment Manifest (env.yaml) for details.
    */
  var GroupName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.GroupName] = js.undefined
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
  var PlatformArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  /**
    * This specifies the platform version that the environment will run after the environment is updated.
    */
  var SolutionStackName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.SolutionStackName] = js.undefined
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
  var VersionLabel: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.VersionLabel] = js.undefined
}

object UpdateEnvironmentMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    Description: Description = null,
    EnvironmentId: EnvironmentId = null,
    EnvironmentName: EnvironmentName = null,
    GroupName: GroupName = null,
    OptionSettings: ConfigurationOptionSettingsList = null,
    OptionsToRemove: OptionsSpecifierList = null,
    PlatformArn: PlatformArn = null,
    SolutionStackName: SolutionStackName = null,
    TemplateName: ConfigurationTemplateName = null,
    Tier: EnvironmentTier = null,
    VersionLabel: VersionLabel = null
  ): UpdateEnvironmentMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings)
    if (OptionsToRemove != null) __obj.updateDynamic("OptionsToRemove")(OptionsToRemove)
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn)
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName)
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName)
    if (Tier != null) __obj.updateDynamic("Tier")(Tier)
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel)
    __obj.asInstanceOf[UpdateEnvironmentMessage]
  }
}

