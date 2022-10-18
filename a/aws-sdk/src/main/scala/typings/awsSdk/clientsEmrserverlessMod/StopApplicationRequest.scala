package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopApplicationRequest extends StObject {
  
  /**
    * The ID of the application to stop.
    */
  var applicationId: ApplicationId
}
object StopApplicationRequest {
  
  inline def apply(applicationId: ApplicationId): StopApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopApplicationRequest]
  }
  
  extension [Self <: StopApplicationRequest](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
  }
}
