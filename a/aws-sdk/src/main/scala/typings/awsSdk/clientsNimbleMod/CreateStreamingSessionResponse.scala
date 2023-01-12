package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingSessionResponse extends StObject {
  
  /**
    * The session.
    */
  var session: js.UndefOr[StreamingSession] = js.undefined
}
object CreateStreamingSessionResponse {
  
  inline def apply(): CreateStreamingSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamingSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStreamingSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setSession(value: StreamingSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
