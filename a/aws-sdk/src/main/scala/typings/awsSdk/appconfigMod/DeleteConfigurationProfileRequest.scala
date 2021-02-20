package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConfigurationProfileRequest extends StObject {
  
  /**
    * The application ID that includes the configuration profile you want to delete.
    */
  var ApplicationId: Id = js.native
  
  /**
    * The ID of the configuration profile you want to delete.
    */
  var ConfigurationProfileId: Id = js.native
}
object DeleteConfigurationProfileRequest {
  
  @scala.inline
  def apply(ApplicationId: Id, ConfigurationProfileId: Id): DeleteConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteConfigurationProfileRequestMutableBuilder[Self <: DeleteConfigurationProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
  }
}
