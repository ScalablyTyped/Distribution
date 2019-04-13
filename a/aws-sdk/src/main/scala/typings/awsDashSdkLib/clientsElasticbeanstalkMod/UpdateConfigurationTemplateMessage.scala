package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConfigurationTemplateMessage extends js.Object {
  /**
    * The name of the application associated with the configuration template to update.  If no application is found with this name, UpdateConfigurationTemplate returns an InvalidParameterValue error. 
    */
  var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ApplicationName
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

object UpdateConfigurationTemplateMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    TemplateName: ConfigurationTemplateName,
    Description: Description = null,
    OptionSettings: ConfigurationOptionSettingsList = null,
    OptionsToRemove: OptionsSpecifierList = null
  ): UpdateConfigurationTemplateMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, TemplateName = TemplateName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings)
    if (OptionsToRemove != null) __obj.updateDynamic("OptionsToRemove")(OptionsToRemove)
    __obj.asInstanceOf[UpdateConfigurationTemplateMessage]
  }
}

