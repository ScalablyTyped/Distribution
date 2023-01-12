package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeSessionRequest extends StObject {
  
  /**
    * The ID of the disconnected session to resume.
    */
  var SessionId: typings.awsSdk.clientsSsmMod.SessionId
}
object ResumeSessionRequest {
  
  inline def apply(SessionId: SessionId): ResumeSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResumeSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
