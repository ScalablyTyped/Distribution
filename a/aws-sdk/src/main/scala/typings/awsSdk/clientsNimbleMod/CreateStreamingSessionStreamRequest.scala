package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingSessionStreamRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The expiration time in seconds.
    */
  var expirationInSeconds: js.UndefOr[StreamingSessionStreamExpirationInSeconds] = js.undefined
  
  /**
    * The streaming session ID.
    */
  var sessionId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object CreateStreamingSessionStreamRequest {
  
  inline def apply(sessionId: String, studioId: String): CreateStreamingSessionStreamRequest = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingSessionStreamRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStreamingSessionStreamRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setExpirationInSeconds(value: StreamingSessionStreamExpirationInSeconds): Self = StObject.set(x, "expirationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setExpirationInSecondsUndefined: Self = StObject.set(x, "expirationInSeconds", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
