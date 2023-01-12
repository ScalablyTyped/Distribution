package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTokenRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
  
  /**
    * The session ID.
    */
  var SessionId: string
}
object DeleteTokenRequest {
  
  inline def apply(AppId: string, SessionId: string): DeleteTokenRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any], SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTokenRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTokenRequest] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: string): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
