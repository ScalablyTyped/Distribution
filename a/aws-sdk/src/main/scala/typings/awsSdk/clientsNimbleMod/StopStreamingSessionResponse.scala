package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopStreamingSessionResponse extends StObject {
  
  var session: js.UndefOr[StreamingSession] = js.undefined
}
object StopStreamingSessionResponse {
  
  inline def apply(): StopStreamingSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopStreamingSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopStreamingSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setSession(value: StreamingSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
