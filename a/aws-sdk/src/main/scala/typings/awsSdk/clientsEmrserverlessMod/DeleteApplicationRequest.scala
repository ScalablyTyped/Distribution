package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationRequest extends StObject {
  
  /**
    * The ID of the application that will be deleted.
    */
  var applicationId: ApplicationId
}
object DeleteApplicationRequest {
  
  inline def apply(applicationId: ApplicationId): DeleteApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationRequest]
  }
  
  extension [Self <: DeleteApplicationRequest](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
  }
}
