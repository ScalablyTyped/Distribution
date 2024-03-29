package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeCodeForTokenRequestBody extends StObject {
  
  /**
    * The ID of the client to request the token from.
    */
  var clientId: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * The access code to send in the request.
    */
  var code: SensitiveString
  
  /**
    * The location of the application that will receive the access code.
    */
  var redirectUri: String
}
object ExchangeCodeForTokenRequestBody {
  
  inline def apply(code: SensitiveString, redirectUri: String): ExchangeCodeForTokenRequestBody = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeCodeForTokenRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExchangeCodeForTokenRequestBody] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: SensitiveString): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setCode(value: SensitiveString): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
  }
}
