package typings.auth0Lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://auth0.com/docs/libraries/lock/v10/sending-authentication-parameters
@js.native
trait Auth0LockAuthParamsOptions extends StObject {
  
  var access_token: js.UndefOr[js.Any] = js.native
  
  var connection_scope: js.UndefOr[js.Any] = js.native
  
  var device: js.UndefOr[js.Any] = js.native
  
  var nonce: js.UndefOr[js.Any] = js.native
  
  var protocol: js.UndefOr[js.Any] = js.native
  
  var request_id: js.UndefOr[js.Any] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object Auth0LockAuthParamsOptions {
  
  @scala.inline
  def apply(): Auth0LockAuthParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockAuthParamsOptions]
  }
  
  @scala.inline
  implicit class Auth0LockAuthParamsOptionsMutableBuilder[Self <: Auth0LockAuthParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: js.Any): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setConnection_scope(value: js.Any): Self = StObject.set(x, "connection_scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_scopeUndefined: Self = StObject.set(x, "connection_scope", js.undefined)
    
    @scala.inline
    def setDevice(value: js.Any): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setNonce(value: js.Any): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setProtocol(value: js.Any): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setRequest_id(value: js.Any): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
