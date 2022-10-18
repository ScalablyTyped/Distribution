package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateConfigurationSettingsMessage extends StObject {
  
  /**
    * The name of the application that the configuration template or environment belongs to.
    */
  var ApplicationName: typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName
  
  /**
    * The name of the environment to validate the settings against. Condition: You cannot specify both this and a configuration template name.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  
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
  
  inline def apply(ApplicationName: ApplicationName, OptionSettings: ConfigurationOptionSettingsList): ValidateConfigurationSettingsMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], OptionSettings = OptionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateConfigurationSettingsMessage]
  }
  
  extension [Self <: ValidateConfigurationSettingsMessage](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setOptionSettings(value: ConfigurationOptionSettingsList): Self = StObject.set(x, "OptionSettings", value.asInstanceOf[js.Any])
    
    inline def setOptionSettingsVarargs(value: ConfigurationOptionSetting*): Self = StObject.set(x, "OptionSettings", js.Array(value*))
    
    inline def setTemplateName(value: ConfigurationTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
  }
}
