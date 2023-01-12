package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSessionResponse extends StObject {
  
  /**
    * The ID of the session.
    */
  var SessionId: js.UndefOr[typings.awsSdk.clientsSsmMod.SessionId] = js.undefined
  
  /**
    * A URL back to SSM Agent on the managed node that the Session Manager client uses to send commands and receive output from the node. Format: wss://ssmmessages.region.amazonaws.com/v1/data-channel/session-id?stream=(input|output)   region represents the Region identifier for an Amazon Web Services Region supported by Amazon Web Services Systems Manager, such as us-east-2 for the US East (Ohio) Region. For a list of supported region values, see the Region column in Systems Manager service endpoints in the Amazon Web Services General Reference.  session-id represents the ID of a Session Manager session, such as 1a2b3c4dEXAMPLE.
    */
  var StreamUrl: js.UndefOr[typings.awsSdk.clientsSsmMod.StreamUrl] = js.undefined
  
  /**
    * An encrypted token value containing session and caller information. This token is used to authenticate the connection to the managed node, and is valid only long enough to ensure the connection is successful. Never share your session's token.
    */
  var TokenValue: js.UndefOr[typings.awsSdk.clientsSsmMod.TokenValue] = js.undefined
}
object StartSessionResponse {
  
  inline def apply(): StartSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    inline def setStreamUrl(value: StreamUrl): Self = StObject.set(x, "StreamUrl", value.asInstanceOf[js.Any])
    
    inline def setStreamUrlUndefined: Self = StObject.set(x, "StreamUrl", js.undefined)
    
    inline def setTokenValue(value: TokenValue): Self = StObject.set(x, "TokenValue", value.asInstanceOf[js.Any])
    
    inline def setTokenValueUndefined: Self = StObject.set(x, "TokenValue", js.undefined)
  }
}
