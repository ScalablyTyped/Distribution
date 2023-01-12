package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationSettingsDescriptions extends StObject {
  
  /**
    *  A list of ConfigurationSettingsDescription. 
    */
  var ConfigurationSettings: js.UndefOr[ConfigurationSettingsDescriptionList] = js.undefined
}
object ConfigurationSettingsDescriptions {
  
  inline def apply(): ConfigurationSettingsDescriptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationSettingsDescriptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationSettingsDescriptions] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSettings(value: ConfigurationSettingsDescriptionList): Self = StObject.set(x, "ConfigurationSettings", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSettingsUndefined: Self = StObject.set(x, "ConfigurationSettings", js.undefined)
    
    inline def setConfigurationSettingsVarargs(value: ConfigurationSettingsDescription*): Self = StObject.set(x, "ConfigurationSettings", js.Array(value*))
  }
}
