package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object ConfigurationSettingsDescription {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    DateCreated: CreationDate = null,
    DateUpdated: UpdateDate = null,
    DeploymentStatus: ConfigurationDeploymentStatus = null,
    Description: Description = null,
    EnvironmentName: EnvironmentName = null,
    OptionSettings: ConfigurationOptionSettingsList = null,
    PlatformArn: PlatformArn = null,
    SolutionStackName: SolutionStackName = null,
    TemplateName: ConfigurationTemplateName = null
  ): ConfigurationSettingsDescription = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated)
    if (DateUpdated != null) __obj.updateDynamic("DateUpdated")(DateUpdated)
    if (DeploymentStatus != null) __obj.updateDynamic("DeploymentStatus")(DeploymentStatus.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings)
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn)
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName)
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName)
    __obj.asInstanceOf[ConfigurationSettingsDescription]
  }
}

