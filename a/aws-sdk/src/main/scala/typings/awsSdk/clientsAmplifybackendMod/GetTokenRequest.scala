package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTokenRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
  
  /**
    * The session ID.
    */
  var SessionId: string
}
object GetTokenRequest {
  
  inline def apply(AppId: string, SessionId: string): GetTokenRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any], SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTokenRequest]
  }
  
  extension [Self <: GetTokenRequest](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: string): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
