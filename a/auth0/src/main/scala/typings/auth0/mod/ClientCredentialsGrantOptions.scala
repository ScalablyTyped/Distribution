package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientCredentialsGrantOptions extends StObject {
  
  var audience: String = js.native
  
  var scope: js.UndefOr[String] = js.native
}
object ClientCredentialsGrantOptions {
  
  @scala.inline
  def apply(audience: String): ClientCredentialsGrantOptions = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCredentialsGrantOptions]
  }
  
  @scala.inline
  implicit class ClientCredentialsGrantOptionsMutableBuilder[Self <: ClientCredentialsGrantOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
