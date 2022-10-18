package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  /**
    * The ID of the execute command session.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  
  /**
    * A URL to the managed agent on the container that the SSM Session Manager client uses to send commands and receive output from the container.
    */
  var streamUrl: js.UndefOr[String] = js.undefined
  
  /**
    * An encrypted token value containing session and caller information. It's used to authenticate the connection to the container.
    */
  var tokenValue: js.UndefOr[SensitiveString] = js.undefined
}
object Session {
  
  inline def apply(): Session = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Session]
  }
  
  extension [Self <: Session](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setStreamUrl(value: String): Self = StObject.set(x, "streamUrl", value.asInstanceOf[js.Any])
    
    inline def setStreamUrlUndefined: Self = StObject.set(x, "streamUrl", js.undefined)
    
    inline def setTokenValue(value: SensitiveString): Self = StObject.set(x, "tokenValue", value.asInstanceOf[js.Any])
    
    inline def setTokenValueUndefined: Self = StObject.set(x, "tokenValue", js.undefined)
  }
}
