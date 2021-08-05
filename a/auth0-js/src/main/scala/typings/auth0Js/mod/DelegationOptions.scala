package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegationOptions extends StObject {
  
  var api_type: js.UndefOr[String] = js.undefined
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var grant_type: String
  
  var id_token: js.UndefOr[String] = js.undefined
  
  var refresh_token: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object DelegationOptions {
  
  inline def apply(grant_type: String): DelegationOptions = {
    val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationOptions]
  }
  
  extension [Self <: DelegationOptions](x: Self) {
    
    inline def setApi_type(value: String): Self = StObject.set(x, "api_type", value.asInstanceOf[js.Any])
    
    inline def setApi_typeUndefined: Self = StObject.set(x, "api_type", js.undefined)
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setGrant_type(value: String): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
    
    inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
    
    inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
