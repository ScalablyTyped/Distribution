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
  
  @scala.inline
  def apply(baseUrl: String): TokenManagerOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenManagerOptions]
  }
  
  @scala.inline
  implicit class TokenManagerOptionsMutableBuilder[Self <: TokenManagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
