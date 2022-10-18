package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStreamingSessionResponse extends StObject {
  
  /**
    * The session.
    */
  var session: js.UndefOr[StreamingSession] = js.undefined
}
object DeleteStreamingSessionResponse {
  
  inline def apply(): DeleteStreamingSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteStreamingSessionResponse]
  }
  
  extension [Self <: DeleteStreamingSessionResponse](x: Self) {
    
    inline def setSession(value: StreamingSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
