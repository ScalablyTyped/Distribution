package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamingSessionResponse extends StObject {
  
  /**
    * The session.
    */
  var session: js.UndefOr[StreamingSession] = js.undefined
}
object GetStreamingSessionResponse {
  
  inline def apply(): GetStreamingSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamingSessionResponse]
  }
  
  extension [Self <: GetStreamingSessionResponse](x: Self) {
    
    inline def setSession(value: StreamingSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
