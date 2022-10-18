package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfigurationTemplateMessage extends StObject {
  
  /**
    * The name of the application associated with the configuration template to update.  If no application is found with this name, UpdateConfigurationTemplate returns an InvalidParameterValue error. 
    */
  var ApplicationName: typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName
  
  /**
    * A new description for the configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.Description] = js.undefined
  
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
  
  inline def apply(ApplicationName: ApplicationName, TemplateName: ConfigurationTemplateName): UpdateConfigurationTemplateMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationTemplateMessage]
  }
  
  extension [Self <: UpdateConfigurationTemplateMessage](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setOptionSettings(value: ConfigurationOptionSettingsList): Self = StObject.set(x, "OptionSettings", value.asInstanceOf[js.Any])
    
    inline def setOptionSettingsUndefined: Self = StObject.set(x, "OptionSettings", js.undefined)
    
    inline def setOptionSettingsVarargs(value: ConfigurationOptionSetting*): Self = StObject.set(x, "OptionSettings", js.Array(value*))
    
    inline def setOptionsToRemove(value: OptionsSpecifierList): Self = StObject.set(x, "OptionsToRemove", value.asInstanceOf[js.Any])
    
    inline def setOptionsToRemoveUndefined: Self = StObject.set(x, "OptionsToRemove", js.undefined)
    
    inline def setOptionsToRemoveVarargs(value: OptionSpecification*): Self = StObject.set(x, "OptionsToRemove", js.Array(value*))
    
    inline def setTemplateName(value: ConfigurationTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
