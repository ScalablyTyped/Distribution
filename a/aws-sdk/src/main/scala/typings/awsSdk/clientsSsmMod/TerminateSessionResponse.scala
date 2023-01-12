package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateSessionResponse extends StObject {
  
  /**
    * The ID of the session that has been terminated.
    */
  var SessionId: js.UndefOr[typings.awsSdk.clientsSsmMod.SessionId] = js.undefined
}
object TerminateSessionResponse {
  
  inline def apply(): TerminateSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminateSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
  }
}
