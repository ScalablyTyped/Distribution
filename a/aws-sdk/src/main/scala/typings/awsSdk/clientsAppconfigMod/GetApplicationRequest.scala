package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationRequest extends StObject {
  
  /**
    * The ID of the application you want to get.
    */
  var ApplicationId: Id
}
object GetApplicationRequest {
  
  inline def apply(ApplicationId: Id): GetApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationRequest]
  }
  
  extension [Self <: GetApplicationRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
