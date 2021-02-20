package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateConfigurationRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: Id = js.native
  
  /**
    * The version of the configuration to validate.
    */
  var ConfigurationVersion: Version = js.native
}
object ValidateConfigurationRequest {
  
  @scala.inline
  def apply(ApplicationId: Id, ConfigurationProfileId: Id, ConfigurationVersion: Version): ValidateConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any], ConfigurationVersion = ConfigurationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateConfigurationRequest]
  }
  
  @scala.inline
  implicit class ValidateConfigurationRequestMutableBuilder[Self <: ValidateConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationVersion(value: Version): Self = StObject.set(x, "ConfigurationVersion", value.asInstanceOf[js.Any])
  }
}
