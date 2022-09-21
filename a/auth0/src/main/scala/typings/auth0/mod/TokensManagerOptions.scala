package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokensManagerOptions
  extends StObject
     with BaseClientOptions {
  
  var clientSecret: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[Any] = js.undefined
}
object TokensManagerOptions {
  
  inline def apply(baseUrl: String): TokensManagerOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokensManagerOptions]
  }
  
  extension [Self <: TokensManagerOptions](x: Self) {
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
