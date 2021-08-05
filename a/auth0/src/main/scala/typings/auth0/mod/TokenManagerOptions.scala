package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenManagerOptions
  extends StObject
     with BaseClientOptions {
  
  var headers: js.UndefOr[js.Any] = js.undefined
}
object TokenManagerOptions {
  
  inline def apply(baseUrl: String): TokenManagerOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenManagerOptions]
  }
  
  extension [Self <: TokenManagerOptions](x: Self) {
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
