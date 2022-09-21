package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigurationProfileRequest extends StObject {
  
  /**
    * The ID of the application that includes the configuration profile you want to get.
    */
  var ApplicationId: Id
  
  /**
    * The ID of the configuration profile that you want to get.
    */
  var ConfigurationProfileId: Id
}
object GetConfigurationProfileRequest {
  
  inline def apply(ApplicationId: Id, ConfigurationProfileId: Id): GetConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationProfileRequest]
  }
  
  extension [Self <: GetConfigurationProfileRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
  }
}
