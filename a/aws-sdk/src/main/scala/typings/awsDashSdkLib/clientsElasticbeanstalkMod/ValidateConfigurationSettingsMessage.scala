package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateConfigurationSettingsMessage extends js.Object {
  /**
    * The name of the application that the configuration template or environment belongs to.
    */
  var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ApplicationName
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

object ValidateConfigurationSettingsMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    OptionSettings: ConfigurationOptionSettingsList,
    EnvironmentName: EnvironmentName = null,
    TemplateName: ConfigurationTemplateName = null
  ): ValidateConfigurationSettingsMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, OptionSettings = OptionSettings)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName)
    __obj.asInstanceOf[ValidateConfigurationSettingsMessage]
  }
}

