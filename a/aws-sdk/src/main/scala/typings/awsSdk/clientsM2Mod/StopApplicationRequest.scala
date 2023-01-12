package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopApplicationRequest extends StObject {
  
  /**
    * The unique identifier of the application you want to stop.
    */
  var applicationId: Identifier
  
  /**
    * Stopping an application process can take a long time. Setting this parameter to true lets you force stop the application so you don't need to wait until the process finishes to apply another action on the application. The default value is false.
    */
  var forceStop: js.UndefOr[Boolean] = js.undefined
}
object StopApplicationRequest {
  
  inline def apply(applicationId: Identifier): StopApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setForceStop(value: Boolean): Self = StObject.set(x, "forceStop", value.asInstanceOf[js.Any])
    
    inline def setForceStopUndefined: Self = StObject.set(x, "forceStop", js.undefined)
  }
}
