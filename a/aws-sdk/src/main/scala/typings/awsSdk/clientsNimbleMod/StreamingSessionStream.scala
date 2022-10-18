package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingSessionStream extends StObject {
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user ID of the user that created the streaming session stream.
    */
  var createdBy: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the resource expires.
    */
  var expiresAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user ID of the user that owns the streaming session. The user that owns the session will be logging into the session and interacting with the virtual workstation.
    */
  var ownedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The current state.
    */
  var state: js.UndefOr[StreamingSessionStreamState] = js.undefined
  
  /**
    * The streaming session stream status code.
    */
  var statusCode: js.UndefOr[StreamingSessionStreamStatusCode] = js.undefined
  
  /**
    * The stream ID.
    */
  var streamId: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to connect to this stream using the DCV client.
    */
  var url: js.UndefOr[SensitiveString] = js.undefined
}
object StreamingSessionStream {
  
  inline def apply(): StreamingSessionStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingSessionStream]
  }
  
  extension [Self <: StreamingSessionStream](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setExpiresAt(value: js.Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
    
    inline def setOwnedBy(value: String): Self = StObject.set(x, "ownedBy", value.asInstanceOf[js.Any])
    
    inline def setOwnedByUndefined: Self = StObject.set(x, "ownedBy", js.undefined)
    
    inline def setState(value: StreamingSessionStreamState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusCode(value: StreamingSessionStreamStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setUrl(value: SensitiveString): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
