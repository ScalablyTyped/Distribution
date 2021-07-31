package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkAccountsParams extends StObject {
  
  var connection_id: js.UndefOr[String] = js.undefined
  
  var provider: js.UndefOr[String] = js.undefined
  
  var user_id: String
}
object LinkAccountsParams {
  
  @scala.inline
  def apply(user_id: String): LinkAccountsParams = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkAccountsParams]
  }
  
  @scala.inline
  implicit class LinkAccountsParamsMutableBuilder[Self <: LinkAccountsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_idUndefined: Self = StObject.set(x, "connection_id", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
