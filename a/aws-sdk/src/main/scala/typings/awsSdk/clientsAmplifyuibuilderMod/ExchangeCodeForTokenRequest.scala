package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeCodeForTokenRequest extends StObject {
  
  /**
    * The third-party provider for the token. The only valid value is figma.
    */
  var provider: TokenProviders
  
  /**
    * Describes the configuration of the request.
    */
  var request: ExchangeCodeForTokenRequestBody
}
object ExchangeCodeForTokenRequest {
  
  inline def apply(provider: TokenProviders, request: ExchangeCodeForTokenRequestBody): ExchangeCodeForTokenRequest = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeCodeForTokenRequest]
  }
  
  extension [Self <: ExchangeCodeForTokenRequest](x: Self) {
    
    inline def setProvider(value: TokenProviders): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ExchangeCodeForTokenRequestBody): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
