package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopStreamingSessionRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The streaming session ID for the StopStreamingSessionRequest.
    */
  var sessionId: String
  
  /**
    * The studioId for the StopStreamingSessionRequest.
    */
  var studioId: String
  
  /**
    * Adds additional instructions to a streaming session stop action to either retain the EBS volumes or delete the EBS volumes.
    */
  var volumeRetentionMode: js.UndefOr[VolumeRetentionMode] = js.undefined
}
object StopStreamingSessionRequest {
  
  inline def apply(sessionId: String, studioId: String): StopStreamingSessionRequest = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopStreamingSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopStreamingSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
    
    inline def setVolumeRetentionMode(value: VolumeRetentionMode): Self = StObject.set(x, "volumeRetentionMode", value.asInstanceOf[js.Any])
    
    inline def setVolumeRetentionModeUndefined: Self = StObject.set(x, "volumeRetentionMode", js.undefined)
  }
}
