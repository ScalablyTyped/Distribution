package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionRequest extends StObject {
  
  /**
    * The session ID.
    */
  var SessionId: typings.awsSdk.clientsAthenaMod.SessionId
}
object GetSessionRequest {
  
  inline def apply(SessionId: SessionId): GetSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
