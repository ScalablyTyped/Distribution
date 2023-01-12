package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeConfiguration extends StObject {
  
  /**
    * The basic configuration for building and running the App Runner service. Use it to quickly launch an App Runner service without providing a apprunner.yaml file in the source code repository (or ignoring the file if it exists).
    */
  var CodeConfigurationValues: js.UndefOr[typings.awsSdk.clientsApprunnerMod.CodeConfigurationValues] = js.undefined
  
  /**
    * The source of the App Runner configuration. Values are interpreted as follows:    REPOSITORY – App Runner reads configuration values from the apprunner.yaml file in the source code repository and ignores CodeConfigurationValues.    API – App Runner uses configuration values provided in CodeConfigurationValues and ignores the apprunner.yaml file in the source code repository.  
    */
  var ConfigurationSource: typings.awsSdk.clientsApprunnerMod.ConfigurationSource
}
object CodeConfiguration {
  
  inline def apply(ConfigurationSource: ConfigurationSource): CodeConfiguration = {
    val __obj = js.Dynamic.literal(ConfigurationSource = ConfigurationSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCodeConfigurationValues(value: CodeConfigurationValues): Self = StObject.set(x, "CodeConfigurationValues", value.asInstanceOf[js.Any])
    
    inline def setCodeConfigurationValuesUndefined: Self = StObject.set(x, "CodeConfigurationValues", js.undefined)
    
    inline def setConfigurationSource(value: ConfigurationSource): Self = StObject.set(x, "ConfigurationSource", value.asInstanceOf[js.Any])
  }
}
