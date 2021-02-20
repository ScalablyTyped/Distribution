package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthAuthenticatorOptions extends StObject {
  
  var credentials: js.UndefOr[Credentials | String] = js.native
  
  var flowType: js.UndefOr[FlowType] = js.native
}
object OauthAuthenticatorOptions {
  
  @scala.inline
  def apply(): OauthAuthenticatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OauthAuthenticatorOptions]
  }
  
  @scala.inline
  implicit class OauthAuthenticatorOptionsMutableBuilder[Self <: OauthAuthenticatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: Credentials | String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setFlowType(value: FlowType): Self = StObject.set(x, "flowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowTypeUndefined: Self = StObject.set(x, "flowType", js.undefined)
  }
}
