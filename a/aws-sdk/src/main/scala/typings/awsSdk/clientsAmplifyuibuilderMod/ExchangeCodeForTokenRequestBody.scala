package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeCodeForTokenRequestBody extends StObject {
  
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
  
  extension [Self <: ExchangeCodeForTokenRequestBody](x: Self) {
    
    inline def setCode(value: SensitiveString): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
  }
}
