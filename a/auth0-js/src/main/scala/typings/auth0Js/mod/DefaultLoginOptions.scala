package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultLoginOptions extends LoginOptions {
  
  var audience: js.UndefOr[String] = js.native
  
  var realm: String = js.native
}
object DefaultLoginOptions {
  
  @scala.inline
  def apply(password: String, realm: String, username: String): DefaultLoginOptions = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLoginOptions]
  }
  
  @scala.inline
  implicit class DefaultLoginOptionsMutableBuilder[Self <: DefaultLoginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
  }
}
