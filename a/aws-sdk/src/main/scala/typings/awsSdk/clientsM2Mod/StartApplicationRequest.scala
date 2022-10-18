package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartApplicationRequest extends StObject {
  
  /**
    * The unique identifier of the application you want to start.
    */
  var applicationId: Identifier
}
object StartApplicationRequest {
  
  inline def apply(applicationId: Identifier): StartApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartApplicationRequest]
  }
  
  extension [Self <: StartApplicationRequest](x: Self) {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
  }
}
