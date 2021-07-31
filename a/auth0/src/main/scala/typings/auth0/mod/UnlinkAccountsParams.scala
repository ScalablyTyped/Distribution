package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlinkAccountsParams extends StObject {
  
  var id: String
  
  var provider: UnlinkAccountsParamsProvider
  
  var user_id: String
}
object UnlinkAccountsParams {
  
  @scala.inline
  def apply(id: String, provider: UnlinkAccountsParamsProvider, user_id: String): UnlinkAccountsParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlinkAccountsParams]
  }
  
  @scala.inline
  implicit class UnlinkAccountsParamsMutableBuilder[Self <: UnlinkAccountsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: UnlinkAccountsParamsProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
