package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogoutOptions extends StObject {
  
  var clientID: js.UndefOr[String] = js.native
  
  var federated: js.UndefOr[Boolean] = js.native
  
  var returnTo: js.UndefOr[String] = js.native
}
object LogoutOptions {
  
  @scala.inline
  def apply(): LogoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogoutOptions]
  }
  
  @scala.inline
  implicit class LogoutOptionsMutableBuilder[Self <: LogoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
    
    @scala.inline
    def setFederated(value: Boolean): Self = StObject.set(x, "federated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFederatedUndefined: Self = StObject.set(x, "federated", js.undefined)
    
    @scala.inline
    def setReturnTo(value: String): Self = StObject.set(x, "returnTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnToUndefined: Self = StObject.set(x, "returnTo", js.undefined)
  }
}
