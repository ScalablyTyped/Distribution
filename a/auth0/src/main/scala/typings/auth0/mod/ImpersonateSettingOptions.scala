package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImpersonateSettingOptions extends StObject {
  
  var clientId: js.UndefOr[String] = js.native
  
  var impersonator_id: String = js.native
  
  var protocol: String = js.native
  
  var token: String = js.native
}
object ImpersonateSettingOptions {
  
  @scala.inline
  def apply(impersonator_id: String, protocol: String, token: String): ImpersonateSettingOptions = {
    val __obj = js.Dynamic.literal(impersonator_id = impersonator_id.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpersonateSettingOptions]
  }
  
  @scala.inline
  implicit class ImpersonateSettingOptionsMutableBuilder[Self <: ImpersonateSettingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setImpersonator_id(value: String): Self = StObject.set(x, "impersonator_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
