package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamingSessionRequest extends StObject {
  
  /**
    * The streaming session ID.
    */
  var sessionId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetStreamingSessionRequest {
  
  inline def apply(sessionId: String, studioId: String): GetStreamingSessionRequest = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingSessionRequest]
  }
  
  extension [Self <: GetStreamingSessionRequest](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
