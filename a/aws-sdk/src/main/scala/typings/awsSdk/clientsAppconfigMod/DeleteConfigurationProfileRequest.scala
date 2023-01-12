package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationProfileRequest extends StObject {
  
  /**
    * The application ID that includes the configuration profile you want to delete.
    */
  var ApplicationId: Id
  
  /**
    * The ID of the configuration profile you want to delete.
    */
  var ConfigurationProfileId: Id
}
object DeleteConfigurationProfileRequest {
  
  inline def apply(ApplicationId: Id, ConfigurationProfileId: Id): DeleteConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConfigurationProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
  }
}
