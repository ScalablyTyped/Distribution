package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSessionRequest extends StObject {
  
  /**
    * The ID of the session to be stopped.
    */
  var Id: NameString
  
  /**
    * The origin of the request.
    */
  var RequestOrigin: js.UndefOr[OrchestrationNameString] = js.undefined
}
object StopSessionRequest {
  
  inline def apply(Id: NameString): StopSessionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSessionRequest]
  }
  
  extension [Self <: StopSessionRequest](x: Self) {
    
    inline def setId(value: NameString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setRequestOrigin(value: OrchestrationNameString): Self = StObject.set(x, "RequestOrigin", value.asInstanceOf[js.Any])
    
    inline def setRequestOriginUndefined: Self = StObject.set(x, "RequestOrigin", js.undefined)
  }
}
