package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpireSessionRequest extends StObject {
  
  /**
    * The identifier of the streaming session.
    */
  var SessionId: String
}
object ExpireSessionRequest {
  
  inline def apply(SessionId: String): ExpireSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpireSessionRequest]
  }
  
  extension [Self <: ExpireSessionRequest](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
