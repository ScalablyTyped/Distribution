package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCredentialsGrantOptions extends StObject {
  
  var audience: String
  
  var scope: js.UndefOr[String] = js.undefined
}
object ClientCredentialsGrantOptions {
  
  inline def apply(audience: String): ClientCredentialsGrantOptions = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCredentialsGrantOptions]
  }
  
  extension [Self <: ClientCredentialsGrantOptions](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
