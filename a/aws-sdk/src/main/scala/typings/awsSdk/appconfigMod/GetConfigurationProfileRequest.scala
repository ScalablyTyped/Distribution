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
    * The ID of the configuration profile you want to get.
    */
  var ConfigurationProfileId: Id
}
object GetConfigurationProfileRequest {
  
  @scala.inline
  def apply(ApplicationId: Id, ConfigurationProfileId: Id): GetConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationProfileRequest]
  }
  
  @scala.inline
  implicit class GetConfigurationProfileRequestMutableBuilder[Self <: GetConfigurationProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
  }
}
