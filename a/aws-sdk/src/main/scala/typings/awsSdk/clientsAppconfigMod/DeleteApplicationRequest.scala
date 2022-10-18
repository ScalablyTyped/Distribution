package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationRequest extends StObject {
  
  /**
    * The ID of the application to delete.
    */
  var ApplicationId: Id
}
object DeleteApplicationRequest {
  
  inline def apply(ApplicationId: Id): DeleteApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationRequest]
  }
  
  extension [Self <: DeleteApplicationRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
