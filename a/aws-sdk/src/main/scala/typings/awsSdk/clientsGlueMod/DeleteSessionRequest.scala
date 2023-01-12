package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSessionRequest extends StObject {
  
  /**
    * The ID of the session to be deleted.
    */
  var Id: NameString
  
  /**
    * The name of the origin of the delete session request.
    */
  var RequestOrigin: js.UndefOr[OrchestrationNameString] = js.undefined
}
object DeleteSessionRequest {
  
  inline def apply(Id: NameString): DeleteSessionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: NameString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setRequestOrigin(value: OrchestrationNameString): Self = StObject.set(x, "RequestOrigin", value.asInstanceOf[js.Any])
    
    inline def setRequestOriginUndefined: Self = StObject.set(x, "RequestOrigin", js.undefined)
  }
}
