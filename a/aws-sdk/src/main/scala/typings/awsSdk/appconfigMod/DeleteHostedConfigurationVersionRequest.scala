package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHostedConfigurationVersionRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: Id = js.native
  
  /**
    * The versions number to delete.
    */
  var VersionNumber: Integer = js.native
}
object DeleteHostedConfigurationVersionRequest {
  
  @scala.inline
  def apply(ApplicationId: Id, ConfigurationProfileId: Id, VersionNumber: Integer): DeleteHostedConfigurationVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHostedConfigurationVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteHostedConfigurationVersionRequestMutableBuilder[Self <: DeleteHostedConfigurationVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumber(value: Integer): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
  }
}
