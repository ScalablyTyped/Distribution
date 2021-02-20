package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelegationOptions extends StObject {
  
  var api_type: js.UndefOr[String] = js.native
  
  var client_id: js.UndefOr[String] = js.native
  
  var grant_type: String = js.native
  
  var id_token: js.UndefOr[String] = js.native
  
  var refresh_token: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String] = js.native
}
object DelegationOptions {
  
  @scala.inline
  def apply(grant_type: String): DelegationOptions = {
    val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationOptions]
  }
  
  @scala.inline
  implicit class DelegationOptionsMutableBuilder[Self <: DelegationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_type(value: String): Self = StObject.set(x, "api_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_typeUndefined: Self = StObject.set(x, "api_type", js.undefined)
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    @scala.inline
    def setGrant_type(value: String): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
    
    @scala.inline
    def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
