package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateConfigurationRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id
  
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: Id
  
  /**
    * The version of the configuration to validate.
    */
  var ConfigurationVersion: Version
}
object ValidateConfigurationRequest {
  
  inline def apply(ApplicationId: Id, ConfigurationProfileId: Id, ConfigurationVersion: Version): ValidateConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any], ConfigurationVersion = ConfigurationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateConfigurationRequest]
  }
  
  extension [Self <: ValidateConfigurationRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVersion(value: Version): Self = StObject.set(x, "ConfigurationVersion", value.asInstanceOf[js.Any])
  }
}
