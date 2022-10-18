package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionRequest extends StObject {
  
  /**
    * The ID of the session. 
    */
  var Id: NameString
  
  /**
    * The origin of the request. 
    */
  var RequestOrigin: js.UndefOr[OrchestrationNameString] = js.undefined
}
object GetSessionRequest {
  
  inline def apply(Id: NameString): GetSessionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSessionRequest]
  }
  
  extension [Self <: GetSessionRequest](x: Self) {
    
    inline def setId(value: NameString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setRequestOrigin(value: OrchestrationNameString): Self = StObject.set(x, "RequestOrigin", value.asInstanceOf[js.Any])
    
    inline def setRequestOriginUndefined: Self = StObject.set(x, "RequestOrigin", js.undefined)
  }
}
