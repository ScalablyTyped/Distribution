package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationsRequest extends StObject {
  
  /**
    * Configuration ID of an application to be deleted.
    */
  var configurationIds: ApplicationIdsList
}
object DeleteApplicationsRequest {
  
  inline def apply(configurationIds: ApplicationIdsList): DeleteApplicationsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteApplicationsRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationIds(value: ApplicationIdsList): Self = StObject.set(x, "configurationIds", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIdsVarargs(value: ApplicationId*): Self = StObject.set(x, "configurationIds", js.Array(value*))
  }
}
