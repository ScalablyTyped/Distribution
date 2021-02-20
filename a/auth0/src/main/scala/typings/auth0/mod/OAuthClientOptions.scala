package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthClientOptions extends BaseClientOptions {
  
  var clientSecret: js.UndefOr[String] = js.native
}
object OAuthClientOptions {
  
  @scala.inline
  def apply(baseUrl: String): OAuthClientOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthClientOptions]
  }
  
  @scala.inline
  implicit class OAuthClientOptionsMutableBuilder[Self <: OAuthClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
  }
}
