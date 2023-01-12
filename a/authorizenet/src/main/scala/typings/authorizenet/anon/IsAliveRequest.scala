package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAliveRequest extends StObject {
  
  var isAliveRequest: typings.authorizenet.mod.APIContracts.IsAliveRequest
}
object IsAliveRequest {
  
  inline def apply(isAliveRequest: typings.authorizenet.mod.APIContracts.IsAliveRequest): IsAliveRequest = {
    val __obj = js.Dynamic.literal(isAliveRequest = isAliveRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAliveRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsAliveRequest] (val x: Self) extends AnyVal {
    
    inline def setIsAliveRequest(value: typings.authorizenet.mod.APIContracts.IsAliveRequest): Self = StObject.set(x, "isAliveRequest", value.asInstanceOf[js.Any])
  }
}
