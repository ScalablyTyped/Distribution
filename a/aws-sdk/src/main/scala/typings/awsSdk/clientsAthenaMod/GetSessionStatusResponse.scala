package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionStatusResponse extends StObject {
  
  /**
    * The session ID.
    */
  var SessionId: js.UndefOr[typings.awsSdk.clientsAthenaMod.SessionId] = js.undefined
  
  /**
    * Contains information about the status of the session.
    */
  var Status: js.UndefOr[SessionStatus] = js.undefined
}
object GetSessionStatusResponse {
  
  inline def apply(): GetSessionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSessionStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSessionStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    inline def setStatus(value: SessionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
